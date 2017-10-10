package com.kashdeya.moreshears.inits;

import com.arclighttw.utilities.client.Renderer;
import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.AluminiumShears;
import com.kashdeya.moreshears.items.ConstantanShears;
import com.kashdeya.moreshears.items.CopperShears;
import com.kashdeya.moreshears.items.DiamondShears;
import com.kashdeya.moreshears.items.ElectrumShears;
import com.kashdeya.moreshears.items.EmeraldShears;
import com.kashdeya.moreshears.items.FlintShears;
import com.kashdeya.moreshears.items.GoldenShears;
import com.kashdeya.moreshears.items.LeadShears;
import com.kashdeya.moreshears.items.NickelShears;
import com.kashdeya.moreshears.items.SilverShears;
import com.kashdeya.moreshears.items.SteelShears;
import com.kashdeya.moreshears.items.StoneShears;
import com.kashdeya.moreshears.items.UraniumShears;
import com.kashdeya.moreshears.items.WoodenShears;
import com.kashdeya.moreshears.main.MoreShears;
import com.kashdeya.moreshears.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

public class MoreItems {
	// Vanilla
	public static Item wooden_shears;
	public static Item golden_shears;
	public static Item diamond_shears;
	public static Item stone_shears;
	public static Item flint_shears;
	public static Item emerald_shears;
	// Immersive
	public static Item copper_shears;
	public static Item silver_shears;
	public static Item tin_shears;
	public static Item lead_shears;
	public static Item steel_shears;
	public static Item nickel_shears;
	public static Item platinum_shears;
	public static Item cold_shears;
	public static Item mithril_shears;
	public static Item star_shears;
	public static Item bronze_shears;
	public static Item brass_shears;
	public static Item electrum_shears;
	public static Item invar_shears;
	public static Item aquarium_shears;
	public static Item adamantine_shears;
	public static Item cupronickel_shears;
	public static Item aluminium_shears;
	public static Item uranium_shears;
	public static Item constantan_shears;
	
	public static void init(){
		// Vanilla
		if (ConfigHandler.wooden_shears){
			wooden_shears = new WoodenShears();
			registerItem(wooden_shears, "wooden_shears");
		}
		if (ConfigHandler.golden_shears){
			golden_shears = new GoldenShears();
			registerItem(golden_shears, "golden_shears");
		}
		if (ConfigHandler.stone_shears){
			stone_shears = new StoneShears();
			registerItem(stone_shears, "stone_shears");
		}
		if (ConfigHandler.diamond_shears){
			diamond_shears = new DiamondShears();
			registerItem(diamond_shears, "diamond_shears");
		}
		if (ConfigHandler.emerald_shears){
			emerald_shears = new EmeraldShears();
			registerItem(emerald_shears, "emerald_shears");
		}
		if (ConfigHandler.flint_shears){
			flint_shears = new FlintShears();
			registerItem(flint_shears, "flint_shears");
		}
		
		// IE
		if (Loader.isModLoaded("immersiveengineering"))
		{
			if (ConfigHandler.immersiveAluminium_shears){
				aluminium_shears = new AluminiumShears();
				registerItem(aluminium_shears, "aluminium_shears");
			}
			if (ConfigHandler.immersiveConstantan_shears){
				constantan_shears = new ConstantanShears();
				registerItem(constantan_shears, "constantan_shears");
			}
			if (ConfigHandler.immersiveUranium_shears){
				uranium_shears = new UraniumShears();
				registerItem(uranium_shears, "uranium_shears");
			}	
			if (ConfigHandler.immersiveCopper_shears){
				copper_shears = new CopperShears();
				registerItem(copper_shears, "copper_shears");
			}
			if (ConfigHandler.immersiveSilver_shears){
				silver_shears = new SilverShears();
				registerItem(silver_shears, "silver_shears");
			}
			if (ConfigHandler.immersiveLead_shears){
				lead_shears = new LeadShears();
		    		registerItem(lead_shears, "lead_shears");
		    }
			if (ConfigHandler.immersiveNickel_shears){
		    		nickel_shears = new NickelShears();
		    		registerItem(nickel_shears, "nickel_shears");
		    }
		    if (ConfigHandler.immersiveSteel_shears){
		    		steel_shears = new SteelShears();
		    		registerItem(steel_shears, "steel_shears");
		    }
		    if (ConfigHandler.immersiveElectrum_shears){
		    		electrum_shears = new ElectrumShears();
		    		registerItem(electrum_shears, "electrum_shears");
		    }
		    
		}
	}
	
	public static void render(){
		// Vanilla
		if (ConfigHandler.wooden_shears){
			renderItem(wooden_shears, "wooden_shears");
		}
		if (ConfigHandler.golden_shears){
			renderItem(golden_shears, "golden_shears");
		}
		if (ConfigHandler.stone_shears){
			renderItem(stone_shears, "stone_shears");
		}
		if (ConfigHandler.diamond_shears){
			renderItem(diamond_shears, "diamond_shears");
		}
		if (ConfigHandler.emerald_shears){
			renderItem(emerald_shears, "emerald_shears");
		}
		if (ConfigHandler.flint_shears){
			renderItem(flint_shears, "flint_shears");
		}
		
		// IE
		if (Loader.isModLoaded("immersiveengineering"))
		{
			if (ConfigHandler.immersiveAluminium_shears){
				renderItem(aluminium_shears, "aluminium_shears");
			}
			if (ConfigHandler.immersiveConstantan_shears){
				renderItem(constantan_shears, "constantan_shears");
			}
			if (ConfigHandler.immersiveUranium_shears){
				renderItem(uranium_shears, "uranium_shears");
			}	
			if (ConfigHandler.immersiveCopper_shears){
				renderItem(copper_shears, "copper_shears");
			}
			if (ConfigHandler.immersiveSilver_shears){
				renderItem(silver_shears, "silver_shears");
			}
			if (ConfigHandler.immersiveLead_shears){
				renderItem(lead_shears, "lead_shears");
		    }
		    if (ConfigHandler.immersiveNickel_shears){
		    		renderItem(nickel_shears, "nickel_shears");
		    }
		    if (ConfigHandler.immersiveSteel_shears){
		    		renderItem(steel_shears, "steel_shears");
		    }
		    if (ConfigHandler.immersiveElectrum_shears){
		    		renderItem(electrum_shears, "electrum_shears");
		    }
		    
		}
	}
	
	static void registerItem(Item item, String name){
		item.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
	    MoreShears.instance.register(item);
	}
	
	static void renderItem(Item item, String unusedString)
	{
	    MoreShears.instance.render(new Renderer(item));
	}

}
