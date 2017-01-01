package com.sorasuke.MMAU;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

/**
 * Created by sora_suke on 2016/12/23.
 */
public class MMAUEvents {

    /**
     * 羽ブロックに落下した時にダメージを消すイベント
     * @param event
     */
    @SubscribeEvent
    public void fallToFeatherBlock(LivingFallEvent event){
        //MMAULogger.log("fall!");//普段コレをさせておくとすごくログが
        //System.out.println("fall!");
        int x = (int)event.entityLiving.posX-1;//なぜか取得できるX座標がずれてる なぜだ
        int y = (int)event.entityLiving.posY-1;
        int z = (int)event.entityLiving.posZ;
        Block b = event.entityLiving.worldObj.getBlock(x,y,z);
        //MMAULogger.log(String.valueOf(x)+","+String.valueOf(y)+","+String.valueOf(z)+","+b.getLocalizedName());
        if(MMAURegistry.FeatherBlock.equals(b)){
            event.distance = 0;
        }
    }

    @SubscribeEvent
    public void dropChickenHead(LivingDropsEvent event){
        //MMAULogger.log("dropChickenHead!");
        if(!event.entityLiving.worldObj.isRemote){
            if(event.entityLiving instanceof EntityChicken){
                //MMAULogger.log("chicken!");
                if(event.recentlyHit){
                    //MMAULogger.log("recentlyHit!");
                    EntityItem entityItem = new EntityItem(event.entity.worldObj, event.entity.posX,
                            event.entity.posY, event.entity.posZ, new ItemStack(MMAURegistry.ChickenHead));

                    //System.out.println(event.specialDropValue);
                    if(event.specialDropValue<5 && !event.entityLiving.isChild())
                    event.drops.add(entityItem);
                    //event.entity.dropItem(Item.getItemFromBlock(MMAURegistry.ChickenHead),0);
                }
            }
        }
    }
}
