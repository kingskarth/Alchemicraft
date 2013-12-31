package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlisterSteelBar extends Item {

	public BlisterSteelBar(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Blister Steel Bar");
	}

}
