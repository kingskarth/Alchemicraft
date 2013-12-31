package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedMercury extends Item {

	public RedMercury(int id)
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Red Mercury");
	}

}
