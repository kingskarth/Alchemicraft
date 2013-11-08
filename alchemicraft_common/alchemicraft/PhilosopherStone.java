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
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("Philosophor Stone");
	}
	public void registerIcons(IconRegister register)
	{
		this.itemIcon = register.registerIcon("alchemicraft:Philosophor Stone");
	}
}
