package alchemicraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

@Mod(modid = Alchemicraft.modid, name = "Alchemicraft", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Alchemicraft 
{
	public static final String modid = "kingsley_alchemicraft";
	
	@Instance("Alchemicraft")
	public static Alchemicraft instance;
	
	private final static Item PhilosophorStone = new PhilosopherStone(422);
	private final static Item MorningDew = new MorningDew(423);
	private final static Item DarkMatter = new DarkMatter(424);
	private final static Item Urine = new Urine(425);
	private final static Item WhiteEarth = new WhiteEarth(426);
	private final static Item ClearOil = new ClearOil(427);
	private final static Item RedMercury = new RedMercury(428);
	private final static Item PhilosopherPowder = new PhilosopherPowder(429);
	private final static Item AmmoniumNitrate = new AmmoniumNitrate(430);
	private final static Item Filter = new Filter(431);
	private final static Item TheElixir = new TheElixir(432);
	private final static Block IronFurnace = new IronFurnace(433);
	private final static Block OFurnace = new OFurnace(434);
	private final static Block CFurnace = new CFurnace(435);
	private final static Block SteelFurnace = new SteelFurnace(436);
	
	@SidedProxy(clientSide="alchemicraft.client.ClientProxy", serverSide="Alechemicraft.CommonProxy")
	public static CommonProxy proxy;
			
	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderers();

		GameRegistry.registerItem(PhilosophorStone, "Philosopher Stone");
		GameRegistry.registerItem(AmmoniumNitrate, "Ammonium Nitrate");
		GameRegistry.registerItem(MorningDew, "Morning Dew");
		GameRegistry.registerItem(DarkMatter, "Dark Matter");
		GameRegistry.registerItem(Urine, "Urine");
		GameRegistry.registerItem(WhiteEarth, "White Earth");
		GameRegistry.registerItem(ClearOil, "Clear Oil");
		GameRegistry.registerItem(RedMercury, "Red Mercury");
		GameRegistry.registerItem(PhilosopherPowder, "Philosopher Powder");
		GameRegistry.registerItem(Filter, "Filter");
		GameRegistry.registerItem(TheElixir, "The Elixir");
		
		LanguageRegistry.addName(PhilosophorStone, "Philosopher Stone");
		LanguageRegistry.addName(AmmoniumNitrate, "Ammonium Nitrate");
		LanguageRegistry.addName(MorningDew, "Morning Dew");
		LanguageRegistry.addName(DarkMatter, "Dark Matter");
		LanguageRegistry.addName(Urine, "Urine");
		LanguageRegistry.addName(WhiteEarth,  "White Earth");
		LanguageRegistry.addName(ClearOil, "Clear Oil");
		LanguageRegistry.addName(RedMercury, "Red Mercury");
		LanguageRegistry.addName(PhilosopherPowder, "Philosopher Powder");
		LanguageRegistry.addName(Filter, "Filter");
		LanguageRegistry.addName(TheElixir, "The Elixir");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
