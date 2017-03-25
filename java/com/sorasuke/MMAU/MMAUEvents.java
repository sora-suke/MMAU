package com.sorasuke.MMAU;


import com.sorasuke.MMAU.items.SCP081JP;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

/**
 * Created by sora_suke on 2016/12/23.
 */
public class MMAUEvents {

    /**
     * 羽ブロックに落下した時にダメージを消すイベント
     *
     * @param event
     */
    @SubscribeEvent
    public void fallToFeatherBlock(LivingFallEvent event) {
        //MMAULogger.log("fall!");//普段コレをさせておくとすごくログが
        //System.out.println("fall!");

        int x = MathHelper.floor_double(event.getEntityLiving().posX);//なぜか取得できるX座標がずれてる なぜだ ←どうやら､Xの座標が+-で変わるらしい もうわけわからん キャストのさせかたが悪いっぽい いや､これもちがうっぽい? マイクラのMathHelper使えば良いっぽい
        int y = MathHelper.floor_double(event.getEntityLiving().posY - 1);
        int z = MathHelper.floor_double(event.getEntityLiving().posZ);
        BlockPos pos = new BlockPos(x, y, z);
        Block b = event.getEntityLiving().worldObj.getBlockState(pos).getBlock();
        //MMAULogger.log(String.valueOf(x)+","+String.valueOf(y)+","+String.valueOf(z)+","+b.getLocalizedName());
        if (MMAURegistry.FeatherBlock.equals(b)) {
            event.setDistance(0);
        }
    }

    @SubscribeEvent
    public void dropChickenHead(LivingDropsEvent event) {
        //MMAULogger.log("dropChickenHead!");
        if (!event.getEntityLiving().worldObj.isRemote) {
            if (event.getEntityLiving() instanceof EntityChicken) {
                //MMAULogger.log("chicken!");
                if (event.isRecentlyHit()) {
                    //MMAULogger.log("recentlyHit!");
                    EntityItem entityItem = new EntityItem(event.getEntityLiving().worldObj, event.getEntityLiving().posX,
                            event.getEntityLiving().posY, event.getEntityLiving().posZ, new ItemStack(MMAURegistry.ChickenHead));

                    //System.out.println(event.specialDropValue);
                    if (new Random().nextInt(200) - event.getLootingLevel() < 5 && !event.getEntityLiving().isChild())
                        event.getDrops().add(entityItem);
                    //event.entity.dropItem(Item.getItemFromBlock(MMAURegistry.ChickenHead),0);
                }
            }
        }
    }

    @SubscribeEvent
    public void wearSCP081JPTickEvent(LivingEvent.LivingUpdateEvent event){
        ItemStack i = event.getEntityLiving().getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if(i != null) {
            if (i.getItem().equals(MMAURegistry.SCP081JP)) {
                event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(12), 10, 10));
            }
        }
    }
}
