package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WoodenPickaxeHead extends Item {

	public WoodenPickaxeHead(int id) 
	{
		super(id);
		this.setMaxStackSize(16);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("Wooden Pickaxe Head");
	}

}
