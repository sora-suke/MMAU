package com.sorasuke.MMAU;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
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
        if(MMAURegistry.FeatherBlock.equals(event.entityLiving.worldObj.getBlock((int)event.entityLiving.posX, (int)event.entityLiving.posY-1, (int)event.entityLiving.posZ))){
            event.distance = 0;
        }
    }

    @SubscribeEvent
    public void dropChickenHead(LivingDropsEvent event){
        MMAULogger.log("dropChickenHead!");
        if(!event.entityLiving.worldObj.isRemote){
            if(event.entityLiving instanceof EntityChicken){
                MMAULogger.log("chicken!");
                if(event.recentlyHit){
                    EntityItem entityItem = new EntityItem(event.entityLiving.worldObj);
                    entityItem.setEntityItemStack(new ItemStack(MMAURegistry.ChickenHead));
                    event.drops.add(entityItem);
                }
            }
        }
    }
}
