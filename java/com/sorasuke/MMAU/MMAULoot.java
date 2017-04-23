package com.sorasuke.MMAU;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.conditions.RandomChance;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.functions.SetDamage;
import net.minecraft.world.storage.loot.functions.SetMetadata;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

/**
 * Created by sora_suke on 2017/03/26.
 * LootTableの中身を追加するやつ
 * EnderIOのほぼマルパクリ
 */
public class MMAULoot {

    @SubscribeEvent
    public void mmauLoadLootTable(LootTableLoadEvent event) {
        LootTable lootTable = event.getTable();
        LootPool lootPool = new LootPool(new LootEntry[0], new LootCondition[0], rvr(1, 3), rvr(0), MMAU.MODID);

        if(event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)){
            //lootPool.addEntry(createLootEntry(MMAURegistry.SCP081JP, 0.01F));
        }
        lootTable.addPool(lootPool);
    }

    private LootEntry createLootEntry(Item item, float chance) {
        return createLootEntry(item, 1, 1, chance);
    }

    private LootEntry createLootEntry(Item item, int minSize, int maxSize, float chance) {
        return createLootEntry(item, 0, minSize, maxSize, chance);
    }

    private LootEntry createLootEntry(Item item, int ordinal, int minStackSize, int maxStackSize, float chance) {
        LootCondition[] lootConditions = new LootCondition[] { new RandomChance(chance) };
        if (item.isDamageable()) {
            return new LootEntryItem(item, 1, 1, new LootFunction[] { setCount(minStackSize, maxStackSize), setDamage(item, ordinal)}, lootConditions,
                    item.getRegistryName().toString() + ":" + ordinal);
        } else {
            return new LootEntryItem(item, 1, 1, new LootFunction[] { setCount(minStackSize, maxStackSize), setMetadata(ordinal) }, lootConditions,
                    item.getRegistryName().toString() + ":" + ordinal);
        }
    }

    private SetCount setCount(int min, int max){
        return new SetCount(new LootCondition[0], rvr(min, max));
    }

    private SetCount setCount(int value){
        return new SetCount(new LootCondition[0], rvr(value));
    }

    private SetDamage setDamage(Item item, int damage){
        return new SetDamage(new LootCondition[0], rvr(damage > 0 ? damage : 1, damage > 0 ? damage : item.getMaxDamage()));
    }

    private SetMetadata setMetadata(int meta){
        return new SetMetadata(new LootCondition[0], rvr(meta));
    }

    private RandomValueRange rvr(int min, int max){
        return new RandomValueRange(min, max);
    }

    private RandomValueRange rvr(int value){
        return new RandomValueRange(value, value);
    }

}
