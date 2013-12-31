package alchemicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TheElixir extends Item {

	public TheElixir(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("The Elixir");
	}

}
