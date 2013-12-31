package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SteelIngot extends Item {

	public SteelIngot(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Steel ingot");
	}

}
