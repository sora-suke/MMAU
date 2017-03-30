package com.sorasuke.MMAU.blocks;


import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.tileentities.TileEntityGuidanceMarker;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * Created by sora_suke on 2017/03/30.
 */
public class GuidanceMarker extends Block implements IMMAUBaseBlock, ITileEntityProvider {

    String name;
    ResourceLocation location;

    public GuidanceMarker(String name) {
        super(Material.IRON);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        setSoundType(SoundType.METAL);
        setCreativeTab(MMAURegistry.MMAUUtilsTab);
        setHardness(0F);
        setResistance(0F);
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
        return new ItemBlock(this);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityGuidanceMarker();
    }
}
