package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WroughtIronIngot extends Item {

	public WroughtIronIngot(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Wrought Iron Ingot");
	}

}
