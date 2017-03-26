package com.sorasuke.MMAU;

import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.conditions.RandomChance;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.functions.SetDamage;
import net.minecraft.world.storage.loot.functions.SetMetadata;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by sora_suke on 2017/03/26.
 * LootTableの中身を追加するやつ
 * EnderIOのほぼマルパクリ
 */
public class MMAULoot {

    @SubscribeEvent
    public void mmauLoadLootTable(LootTableLoadEvent event) {
        LootTable lootTable = event.getTable();
        LootPool lootPool = new LootPool(new LootEntry[0], new LootCondition[0], rvr(1, 3), rvr(0, 0), MMAU.MODID);

        if(event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)){

        }
    }

    public LootEntry createLootEntry(Item item, int ordinal, int minStackSize, int maxStackSize, float chance) {
        LootCondition[] lootConditions = new LootCondition[] { new RandomChance(chance) };
        if (item.isDamageable()) {
            return new LootEntryItem(item, 1, 1, new LootFunction[] { setCount(minStackSize, maxStackSize), setDamage(item, ordinal)}, lootConditions,
                    item.getRegistryName().toString() + ":" + ordinal);
        } else {
            return new LootEntryItem(item, 1, 1, new LootFunction[] { setCount(minStackSize, maxStackSize), setMetadata(ordinal) }, lootConditions,
                    item.getRegistryName().toString() + ":" + ordinal);
        }
    }

    public SetCount setCount(int min, int max){
        return new SetCount(new LootCondition[0], rvr(min, max));
    }

    public SetCount setCount(int value){
        return new SetCount(new LootCondition[0], rvr(value));
    }

    public SetDamage setDamage(Item item, int damage){
        return new SetDamage(new LootCondition[0], rvr(damage > 0 ? damage : 1, damage > 0 ? damage : item.getMaxDamage()));
    }

    public SetMetadata setMetadata(int meta){
        return new SetMetadata(new LootCondition[0], rvr(meta));
    }

    public RandomValueRange rvr(int min, int max){
        return new RandomValueRange(min, max);
    }

    public RandomValueRange rvr(int value){
        return new RandomValueRange(value, value);
    }

}
