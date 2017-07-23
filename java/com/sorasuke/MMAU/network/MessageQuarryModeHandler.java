package com.sorasuke.MMAU.network;

import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by sora_suke on 2017/07/23.
 */
public class MessageQuarryModeHandler implements IMessageHandler<MessageQuarryMode, IMessage> {
    @Override
    public IMessage onMessage(MessageQuarryMode message, MessageContext ctx) {
        TileEntityQuarry tile = (TileEntityQuarry)ctx.getServerHandler().playerEntity.worldObj.getTileEntity(message.pos);
        tile.setMode(message.mode);
        return null;
    }
}
