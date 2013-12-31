package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WhiteEarth extends Item {

	public WhiteEarth(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("White Earth");
	}

}
