package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.items.MMAUWand;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by sora_suke on 2017/03/05.
 */
public class QuarryBlock extends BlockHorizontal implements IMMAUBaseBlock, ITileEntityProvider {

    private String name;

    private ResourceLocation location;

    public ItemBlock itemBlock;

    public QuarryBlock(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        isBlockContainer = true;
        this.itemBlock = new ItemBlock(this);
        setSoundType(SoundType.METAL);
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entityPlayer, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        //MMAULogger.log("onBlockActivated");
        //MMAULogger.log("hogehoge1");
        if (!world.isRemote) {
            //MMAULogger.log("hogehoge2");
            if(heldItem != null) {
                //MMAULogger.log("hogehoge3");
                if (heldItem.getItem() instanceof MMAUWand) {
                    //MMAULogger.log("hogehoge4");
                    TileEntityQuarry tile = (TileEntityQuarry)world.getTileEntity(pos);
                    heldItem.setTagCompound(MMAUWand.checkNBT(heldItem.getTagCompound()));

                    if(heldItem.getTagCompound().getBoolean("isRemembering")) {
                        tile.setCoordinate(MMAUWand.getPos(heldItem));
                    }

                    return true;
                }
            }
            //MMAULogger.log("hogehoge5");
            entityPlayer.openGui(MMAU.instance, MMAU.guiIdQuarry, world, pos.getX(), pos.getY(), pos.getZ());
        }

        return true;

    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state){
        TileEntity tileentity = world.getTileEntity(pos);

        if (tileentity instanceof IInventory)
        {
            InventoryHelper.dropInventoryItems(world, pos, (IInventory)tileentity);
            world.updateComparatorOutputLevel(pos, this);
        }

        super.breakBlock(world, pos, state);
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

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityQuarry();
    }
}
