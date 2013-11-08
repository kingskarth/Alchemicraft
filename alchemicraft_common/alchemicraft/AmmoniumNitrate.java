package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AmmoniumNitrate extends Item {

	public AmmoniumNitrate(int id) 
	{
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
		setUnlocalizedName("Ammonium Nitrate");
	}

}
