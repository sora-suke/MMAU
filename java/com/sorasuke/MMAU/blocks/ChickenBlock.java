package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.items.IMMAUBaseItem;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

/**
 * ニワトリブロック
 * Created by sora_suke on 2016/11/26.
 */
public class ChickenBlock extends Block implements IMMAUBaseBlock, ITileEntityProvider {
    private String name;

    private Random rand = new Random();

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;

    @SideOnly(Side.CLIENT)
    private IIcon iconBottom;

    private static boolean keepInventory;

    public ChickenBlock(Material material, String name) {
        super(material);
        this.name = name;
        setBlockName("MMAU_" + name);
        setBlockTextureName("mmau:" + name);
        isBlockContainer = true;

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("mmau:chicken_block_side");
        this.iconFront = icon.registerIcon("mmau:chicken_block_front");
        this.iconTop = icon.registerIcon("mmau:chicken_block_top");
        this.iconBottom = icon.registerIcon("mmau:chicken_block_bottom");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        return ForgeDirection.getOrientation(side) == ForgeDirection.DOWN ? this.iconBottom :
                (ForgeDirection.getOrientation(side) == ForgeDirection.UP ? this.iconTop :
                        (side == metadata ? this.iconFront :
                                (metadata == 0 && ForgeDirection.getOrientation(side) == ForgeDirection.SOUTH ? this.iconFront : this.blockIcon)));
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);

    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
        world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "mob.chicken.hurt", 1.0F, world.rand.nextFloat() * 0.1F + 0.9F);
        world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "game.player.hurt", 1.0F, world.rand.nextFloat() * 0.1F + 0.9F);
    }


    private void setDefaultDirection(World world, int x, int y, int z) {
        if (!world.isRemote) {
            Block b1 = world.getBlock(x, y, z - 1);
            Block b2 = world.getBlock(x, y, z + 1);
            Block b3 = world.getBlock(x - 1, y, z);
            Block b4 = world.getBlock(x + 1, y, z);

            byte b0 = 3;

            if (b1.func_149730_j() && !b2.func_149730_j()) {
                b0 = 3;
            }
            if (b2.func_149730_j() && !b1.func_149730_j()) {
                b0 = 2;
            }
            if (b3.func_149730_j() && !b4.func_149730_j()) {
                b0 = 5;
            }
            if (b4.func_149730_j() && !b3.func_149730_j()) {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, x, b0, 2);


        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            //FMLNetworkHandler.openGui(entityPlayer, MMAU.instance, MMAU.guiIdChickenBlock, world, x, y, z);
            entityPlayer.openGui(MMAU.instance, MMAU.guiIdChickenBlock, world, x, y, z);
            MMAULogger.log("テステス");

        }
        return true;

    }


    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        // TODO 自動生成されたメソッド・スタブ
        MMAULogger.log("テステス");
        return new TileEntityChickenBlock();
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityPlayer, ItemStack itemStack) {
        int l = MathHelper.floor_double((double) (entityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }


    }

    public void breakBlock(World world, int x, int y, int z, Block oldBlock, int oldMetaData) {
        world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "mob.chicken.hurt", 1.0F, world.rand.nextFloat() * 0.1F + 0.9F);
        world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "game.player.hurt", 1.0F, world.rand.nextFloat() * 0.1F + 0.9F);
        if (!keepInventory) {
            TileEntityChickenBlock tileEntity = (TileEntityChickenBlock) world.getTileEntity(x, y, z);

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

                            EntityItem item = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(itemStack.getItem(), j, itemStack.getItemDamage()));

                            if (itemStack.hasTagCompound()) {
                                item.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
                            }

                            world.spawnEntityInWorld(item);
                        }
                    }
                }

                world.func_147453_f(x, y, z, oldBlock);
            }
        }

        super.breakBlock(world, x, y, z, oldBlock, oldMetaData);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
