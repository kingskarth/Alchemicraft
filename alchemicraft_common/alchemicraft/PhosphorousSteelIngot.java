package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PhosphorousSteelIngot extends Item {

	public PhosphorousSteelIngot(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Phosphorous Steel Ingot");
	}

}
