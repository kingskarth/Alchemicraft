package alchemicraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PhilosopherStone extends Item
{

	public PhilosopherStone(int id) 
	{
		super(id);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("Philosopher Stone");
	}
}
