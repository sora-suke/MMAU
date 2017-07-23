package com.sorasuke.MMAU.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by sora_suke on 2017/07/23.
 */
public class PacketHandler {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("MMAU");

    public static final int QuarryMode = 0;

    public static void init(){
        INSTANCE.registerMessage(MessageQuarryModeHandler.class, MessageQuarryMode.class, QuarryMode, Side.SERVER);
    }

}
