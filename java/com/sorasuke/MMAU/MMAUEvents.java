package com.sorasuke.MMAU;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

/**
 * Created by sora_suke on 2016/12/23.
 */
public class MMAUEvents {
    @SubscribeEvent
    public void fallToFeatherBlock(LivingFallEvent event){
        MMAULogger.log("fall!");
        System.out.println("fall!");
        if(MMAURegistry.FeatherBlock.equals(event.entityLiving.worldObj.getBlock((int)event.entityLiving.posX, (int)event.entityLiving.posY-1, (int)event.entityLiving.posZ))){
            event.distance = 0;
        }
    }
}
