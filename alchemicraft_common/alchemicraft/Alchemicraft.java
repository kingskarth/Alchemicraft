package alchemicraft;

import java.util.ArrayList;

import alchemicraft.lib.Reference;
import alchemicraft.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Alchemicraft 
{
	@Instance(Reference.MOD_ID)
	public static Alchemicraft Instance;
	
	//private final static Item AmmoniumNitrate = new AmmoniumNitrate(422);
	//private final static Item BlisterSteelBar = new BlisterSteelBar(423);
	//private final static Item CastIronIngot = new CastIronIngot(424);
	//private final static Item ChainLink = new ChainLink(42);
	//private final static Item CharcoalPowder = new CharchoalPowder(425);
	//private final static Item ClearOil = new ClearOil(426);
	//private final static Item CrucibleSteelIngot = new CrucibleSteelIngot(427);
	//private final static Item DarkMatter = new DarkMatter(428);
	//private final static Item Filter = new Filter(429);
	//private final static Item LimeStone = new LimeStone(430);
	private final static Item Handle = new Handle(431).setTextureName("ac:handle");
	//private final static Item MoldAxe = new MoldAxe(43);
	//private final static Item MoldBlade = new MoldBlade(43);
	//private final static Item MoldPickaxe = new MoldPickaxeHead(43);
	//private final static Item MoldSpade = new MoldSpade(43);
	//private final static Item MorningDew = new MorningDew(431);
	//private final static Item PhilosopherPowder = new PhilosopherPowder(432);
	private final static Item PhilosopherStone = new PhilosopherStone(433).setTextureName("ac:philosopher stone");
	//private final static Item PhosphorousSteelIngot = new PhosphorousSteelIngot(434);
	//private final static Item RedMercury = new RedMercury(435);
	//private final static Item SteelIngot = new SteelIngot(436);
	//private final static Item TheElixir = new TheElixir(437);
	//private final static Item Urine = new Urine(438);
	//private final static Item WhiteEarth = new WhiteEarth(439);
	private final static Item WoodenPickaxeHead = new WoodenPickaxeHead(434).setTextureName("ac:wooden pickaxe head");
	//private final static Item WroughtIronIngot = new WroughtIronIngot(440);

	//private final static Item MoltenCastIron = new MoltenCastIron(442);
	//private final static Item MoltenCrucibleSteel = new MoltenCrucibleSteel(444);
	//private final static Item MoltenDiamond = new MoltenDiamond();
	//private final static Item MoltenGold = new MoltenGold();
	//private final static Item MoltenIron = new MoltenIron(446);
	//private final static Item MoltenPhosphorousSteel = new MoltenPhosphorousSteel(445);
	//private final static Item MoltenSteel = new MoltenSteel(441);
	//private final static Item MoltenWroughtiron = new MoltenWroughtIron(443);

	//private final static Block CFurnace = new CFurnace(502);
	//private final static Block IronFurnace = new IronFurnace(500);
	//private final static Block OFurnace = new OFurnace(501);
	//private final static Block SteelFurnace = new SteelFurnace(1000);
	
	//private final static Block Limestone = new BlockLimestone(504);
	
	public static void RemoveRecipe(ItemStack resultItem) //Code by yope_fried inspired by pigalot, modified by jayperdu
    {
            ItemStack recipeResult = null;
            ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

            for (int i = 0; i < recipes.size(); i++)
            {
                    IRecipe tmpRecipe = (IRecipe) recipes.get(i);
                    if (tmpRecipe instanceof ShapedRecipes)
                    {
                            ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                            recipeResult = recipe.getRecipeOutput();
                    }

                    if (tmpRecipe instanceof ShapelessRecipes)
                    {
                            ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
                            recipeResult = recipe.getRecipeOutput();
                    }
                    
                    if (tmpRecipe instanceof ShapedOreRecipe)
                    {
                            ShapedOreRecipe recipe = (ShapedOreRecipe)tmpRecipe;
                            recipeResult = recipe.getRecipeOutput();
                    }
                    
                    if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
                    {
                            recipes.remove(i);
                    }
            }
    }
	
	@SidedProxy(clientSide="alchemicraft.proxy.ClientProxy", serverSide="alchemicraft.proxy.CommonProxy")
	public static CommonProxy proxy;
			
	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		this.RemoveRecipe(new ItemStack(Item.pickaxeStone));
		this.RemoveRecipe(new ItemStack(Item.pickaxeIron));
		this.RemoveRecipe(new ItemStack(Item.pickaxeWood));
		this.RemoveRecipe(new ItemStack(Item.pickaxeGold));
		this.RemoveRecipe(new ItemStack(Item.pickaxeDiamond));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
		
		//GameRegistry.registerItem(AmmoniumNitrate, "Ammonium Nitrate");
		//GameRegistry.registerItem(BlisterSteelBar, "Blister Steel Bar");
		//GameRegistry.registerItem(CastIronIngot, "Cast Iron Ingot");
		//GameRegistry.registerItem(CharcoalPowder, "Charcoal Powder");
		//GameRegistry.registerItem(ClearOil, "Clear Oil");
		//GameRegistry.registerItem(CrucibleSteelIngot,"CrucibleSteelIngot");
		//GameRegistry.registerItem(DarkMatter, "Dark Matter");
		//GameRegistry.registerItem(Filter, "Filter");
		GameRegistry.registerItem(Handle, "Handle");
		//GameRegistry.registerItem(LimeStone, "LimeStone");
		//GameRegistry.registerItem(LimeStone, "LimeStone");
		//GameRegistry.registerItem(MorningDew, "Morning Dew");
		//GameRegistry.registerItem(PhilosopherPowder, "Philosopher Powder");
		GameRegistry.registerItem(PhilosopherStone, "Philosopher Stone");
		//GameRegistry.registerItem(PhosphorousSteelIngot,"Phosphorous Steel Ingot");
		//GameRegistry.registerItem(RedMercury, "Red Mercury");
		//GameRegistry.registerItem(SteelIngot, "Steel Ingot");
		GameRegistry.registerItem(WoodenPickaxeHead, "Wooden Pickaxe Head");
		//GameRegistry.registerItem(TheElixir, "The Elixir");
		//GameRegistry.registerItem(Urine, "Urine");
		//GameRegistry.registerItem(WhiteEarth, "White Earth");
		//GameRegistry.registerItem(WroughtIronIngot, "Wrought Iron Ingot");

		//LanguageRegistry.addName(AmmoniumNitrate, "Ammonium Nitrate");
		//LanguageRegistry.addName(BlisterSteelBar, "Blister Steel Bar");
		//LanguageRegistry.addName(CastIronIngot, "Cast Iron Ingot");
		//LanguageRegistry.addName(CharcoalPowder, "Charcoal Powder");
		//LanguageRegistry.addName(ClearOil, "Clear Oil");
		//LanguageRegistry.addName(CrucibleSteelIngot,"CrucibleSteelIngot");
		//LanguageRegistry.addName(DarkMatter, "Dark Matter");
		//LanguageRegistry.addName(Filter, "Filter");
		LanguageRegistry.addName(Handle, "Handle");
		//LanguageRegistry.addName(LimeStone, "LimeStone");
		//LanguageRegistry.addName(Limestone, "Limestone");
		//LanguageRegistry.addName(MorningDew, "Morning Dew");
		//LanguageRegistry.addName(PhilosopherPowder, "Philosopher Powder");
		LanguageRegistry.addName(PhilosopherStone, "Philosopher Stone");
		//LanguageRegistry.addName(PhosphorousSteelIngot,"Phosphorous Steel Ingot");
		//LanguageRegistry.addName(RedMercury, "Red Mercury");
		//LanguageRegistry.addName(SteelIngot, "Steel Ingot");
		LanguageRegistry.addName(WoodenPickaxeHead, "Wooden Pickaxe Head");
		//LanguageRegistry.addName(TheElixir, "The Elixir");
		//LanguageRegistry.addName(Urine, "Urine");
		//LanguageRegistry.addName(WhiteEarth, "White Earth");
		//LanguageRegistry.addName(WroughtIronIngot, "Wrought Iron Ingot");
		
		
		GameRegistry.addRecipe(new ItemStack(Handle),
				"x",
				"x",
				'x', Item.stick);
		GameRegistry.addRecipe(new ItemStack(WoodenPickaxeHead),
				" x ",
				"xxx",
				'x', Block.planks);
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood),
				"x",
				"y",
				'x', WoodenPickaxeHead,
				'y', Handle);

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
