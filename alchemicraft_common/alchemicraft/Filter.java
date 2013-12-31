package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Filter extends Item {

	public Filter(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Filter");
	}

}
