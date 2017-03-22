package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.items.IMMAUBaseItem;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import com.sorasuke.MMAU.utils.MMAUPlaySound;
import net.minecraft.block.*;
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
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * ニワトリブロック
 * Created by sora_suke on 2016/11/26.
 */
public class ChickenBlock extends BlockHorizontal implements IMMAUBaseBlock, ITileEntityProvider {
    private String name;

    private Random rand = new Random();

    private ResourceLocation location;

    public ItemBlock itemBlock;

    private static boolean keepInventory;

    public ChickenBlock(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        isBlockContainer = true;
        this.itemBlock = new ItemBlock(this);
        setSoundType(SoundType.CLOTH);
    }

    /*@Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);
        this.setDefaultDirection(world, pos);

    }*/

    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
        //MMAULogger.log("onBlockClicked");
        this.chickenHurt(world, pos);
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entityPlayer, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            //FMLNetworkHandler.openGui(entityPlayer, MMAU.instance, MMAU.guiIdChickenBlock, world, x, y, z);
            entityPlayer.openGui(MMAU.instance, MMAU.guiIdChickenBlock, world, pos.getX(), pos.getY(), pos.getZ());
            //MMAULogger.log("onBlockActivated_openGUI");

        }
        return true;

    }


    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        //MMAULogger.log("createNewTileEntity");
        return new TileEntityChickenBlock();
    }

    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity tileentity = world.getTileEntity(pos);
        MMAULogger.log("breakBlock");
        this.chickenHurt(world, pos);

        if (tileentity instanceof IInventory)
        {
            InventoryHelper.dropInventoryItems(world, pos, (IInventory)tileentity);
            world.updateComparatorOutputLevel(pos, this);
        }

        super.breakBlock(world, pos, state);
    }

    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
        this.chickenHurt(world, pos);
    }

    public void onBlockDestroyedByExplosion(World world, BlockPos pos, Explosion explosionIn){
        this.chickenHurt(world, pos);
    }

    private void chickenHurt(World w, BlockPos p){
        MMAUPlaySound.playSound(w, p, "entity.chicken.hurt", SoundCategory.BLOCKS);
        MMAUPlaySound.playSound(w, p, "entity.generic.hurt", SoundCategory.BLOCKS);
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
