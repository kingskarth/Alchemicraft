package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MorningDew extends Item {

	public MorningDew(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Morning Dew");
	}

}
