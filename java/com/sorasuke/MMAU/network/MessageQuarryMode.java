package com.sorasuke.MMAU.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 * Created by sora_suke on 2017/07/23.
 */
public class MessageQuarryMode implements IMessage {

    public boolean mode;
    public BlockPos pos;

    public MessageQuarryMode(){}

    public MessageQuarryMode(boolean par1, BlockPos par2) {
        this.mode= par1;
        this.pos = par2;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        PacketBuffer packetBuffer = new PacketBuffer(buf);
        this.mode = packetBuffer.readBoolean();
        this.pos = packetBuffer.readBlockPos();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        PacketBuffer packetBuffer = new PacketBuffer(buf);
        packetBuffer.writeBoolean(this.mode);
        packetBuffer.writeBlockPos(this.pos);
    }
}
