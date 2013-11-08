package alchemicraft;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CFurnace extends BlockContainer
{
	protected CFurnace(int id) 
	{
		super(id, Material.rock);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
}

