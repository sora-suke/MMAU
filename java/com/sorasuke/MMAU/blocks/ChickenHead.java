package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.tileentities.TileEntityChickenHead;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by sora_suke on 2016/12/22.
 */
public class ChickenHead extends BlockHorizontal implements IMMAUBaseBlock, ITileEntityProvider {

    String name;
    private ResourceLocation location;
    public ItemBlock itemBlock;

    public ChickenHead(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        this.itemBlock = new ItemBlock(this);
        //this.setBlockBounds(5.5F / 16F, 0F, 5.5F / 16F, 10.5F / 16F, 6F / 16F, 10.5F / 16F);
    }

    /*@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(5.5F / 16F, 0F, 5.5F / 16F, 10.5F / 16F, 6F / 16F, 10.5F / 16F);
    }*/

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityChickenHead();
    }

    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
    }

    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, ItemStack stack) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }

    @Override
    public ItemBlock getItemBlock() {
        return this.itemBlock;
    }
}