package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.items.IMMAUBaseItem;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import com.sorasuke.MMAU.utils.MMAUPlaySound;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
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
    }

    /*@Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);
        this.setDefaultDirection(world, pos);

    }*/

    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
        MMAUPlaySound.playSound(world, pos, "mob.chicken.hurt", SoundCategory.AMBIENT);
        MMAUPlaySound.playSound(world, pos, "game.player.hurt", SoundCategory.AMBIENT);
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entityPlayer, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            //FMLNetworkHandler.openGui(entityPlayer, MMAU.instance, MMAU.guiIdChickenBlock, world, x, y, z);
            entityPlayer.openGui(MMAU.instance, MMAU.guiIdChickenBlock, world, pos.getX(), pos.getY(), pos.getZ());
            MMAULogger.log("onBlockActivated_openGUI");

        }
        return true;

    }


    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        // TODO 自動生成されたメソッド・スタブ
        MMAULogger.log("createNewTileEntity");
        return new TileEntityChickenBlock();
    }

    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        MMAUPlaySound.playSound(world, pos, "mob.chicken.hurt", SoundCategory.AMBIENT);
        MMAUPlaySound.playSound(world, pos, "game.player.hurt", SoundCategory.AMBIENT);
        if (!keepInventory) {
            TileEntityChickenBlock tileEntity = (TileEntityChickenBlock) world.getTileEntity(pos);

            if (tileEntity != null) {
                for (int i = 0; i < tileEntity.getSizeInventory(); i++) {
                    ItemStack itemStack = tileEntity.getStackInSlot(i);

                    if (itemStack != null) {
                        float f = this.rand.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

                        while (itemStack.stackSize > 0) {
                            int j = this.rand.nextInt(21) + 10;

                            if (j > itemStack.stackSize) {
                                j = itemStack.stackSize;
                            }

                            itemStack.stackSize -= j;

                            EntityItem item = new EntityItem(world, (double) ((float) pos.getX() + f), (double) ((float) pos.getY() + f1), (double) ((float) pos.getY() + f2), new ItemStack(itemStack.getItem(), j, itemStack.getItemDamage()));

                            if (itemStack.hasTagCompound()) {
                                item.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
                            }

                            world.spawnEntityInWorld(item);
                        }
                    }
                }

                //world.func_147453_f(x, y, z, oldBlock);
            }
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
}
