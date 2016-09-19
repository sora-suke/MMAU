package com.sorasuke.MMAU.blocks;

import java.util.Random;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.tileentities.TileEntityContainerWood;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ContainerWood extends Block implements ITileEntityProvider{
	
	private Random random = new Random();
	
	public ContainerWood() {
		super(Material.wood);
		
		setBlockTextureName("mmau:container_wood");
		setCreativeTab(MMAU.MMAUTAB);
		setStepSound(soundTypeWood);
		setHardness(3.0F);
		setResistance(15.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO 自動生成されたメソッド・スタブ
		return new TileEntityContainerWood();
	}
	
	@Override
	public boolean onBlockActivated(World world,int x,int y,int z,EntityPlayer player,int side,float hitX,float hitY,float hitZ){
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		NBTTagCompound testNBT;
		if(tileEntity == null || !(tileEntity instanceof TileEntityContainerWood)){
			return false;
		}
		TileEntityContainerWood containerWood = (TileEntityContainerWood)tileEntity;
		if(player.getHeldItem()==null){
			player.inventory.mainInventory[player.inventory.currentItem] = containerWood.tryExportItemStack();
		}else{
			if(containerWood.tryImportItemStack(player.getHeldItem())){
				player.inventory.mainInventory[player.inventory.currentItem] = null;
			}
		}
		
		return true;
	}
	
	@Override
	public void breakBlock(World world,int x,int y,int z,Block block,int meta){
		TileEntityContainerWood tileEntity = (TileEntityContainerWood)world.getTileEntity(x, y, z);
		if(tileEntity!=null){
			for(int i=0;i<tileEntity.getSizeInventory();i++){
				ItemStack itemStack = tileEntity.getStackInSlot(i);
				if(itemStack != null){
					float f = random.nextFloat()*0.6F+0.1F;
					float f1 = random.nextFloat()*0.6F+0.1F;
					float f2 = random.nextFloat()*0.6F+0.1F;
					
					while(itemStack.stackSize>0){
						
						int j = random.nextInt(21)+10;
						if(j > itemStack.stackSize){
							j = itemStack.stackSize;
						}
						
						itemStack.stackSize -= j;
						EntityItem entityItem = new EntityItem(world,x+f,y+f1,z+f2,new ItemStack(itemStack.getItem(), j, itemStack.getItemDamage()));
						
						if(itemStack.hasTagCompound()){
							entityItem.getEntityItem()
								.setTagCompound(((NBTTagCompound) itemStack.getTagCompound().copy()));
						}
						float f3 = 0.025F;
						entityItem.motionX = (float)random.nextGaussian()*f3;
						entityItem.motionY = (float)random.nextGaussian()*f3+0.1F;
						entityItem.motionZ = (float)random.nextGaussian()*f3;
						world.spawnEntityInWorld(entityItem);
					}
					
				}
				
			}
			world.func_147453_f(x, y, z, block);
			
		}
		super.breakBlock(world, x, y, z, block, meta);
		
	}
	
}
