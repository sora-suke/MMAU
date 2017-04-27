package com.sorasuke.MMAU.blocks;


import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.tileentities.TileEntityGuidanceMarker;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by sora_suke on 2017/03/30.
 */
public class GuidanceMarker extends Block implements IMMAUBaseBlock, ITileEntityProvider {

    String name;
    ResourceLocation location;
    public ItemBlock itemBlock;

    public GuidanceMarker(String name) {
        super(Material.IRON);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        this.itemBlock = new ItemBlock(this);
        setSoundType(SoundType.METAL);
        setCreativeTab(MMAURegistry.MMAUUtilsTab);
        setHardness(0F);
        setResistance(0F);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(6F / 16F, 6F / 16F, 6F / 16F, 10F / 16F, 10F / 16F, 10F / 16F);
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }

    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ResourceLocation getLocation() {
        return location;
    }

    @Override
    public ItemBlock getItemBlock() {
        return this.itemBlock;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityGuidanceMarker();
    }
}
