package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.tileentities.TileEntityChickenHead;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by sora_suke on 2016/12/22.
 */
public class ChickenHead extends BlockContainer implements IMMAUBaseBlock {

    String name;

    public ChickenHead(Material material, String name) {
        super(material);
        this.name = name;
        setBlockName("MMAU_" + name);
        setBlockTextureName("mmau:feather_block");
        this.setBlockBounds(5.5F / 16F, 0F, 5.5F / 16F, 10.5F / 16F, 6F / 16F, 10.5F / 16F);
    }

    public void onBlockAdded(World world, int i, int j, int k) {
        EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
        if (entity != null && world != null) {
            int le = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;//�v���C���[�̌�������0~3�̃��^�f�[�^�̐����ɕϊ����Ă�
            world.setBlockMetadataWithNotify(i, j, k, le, 2);
        }

        //world.scheduleBlockUpdate(i, j, k, this, this.tickRate(world));

    }

    public int getRenderType() {
        return -1;

    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityChickenHead();
    }

    @Override
    public String getName() {
        return this.name;
    }
}