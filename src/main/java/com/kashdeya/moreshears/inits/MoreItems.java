package com.kashdeya.moreshears.inits;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.aluminiumShears;
import com.kashdeya.moreshears.items.constantanShears;
import com.kashdeya.moreshears.items.copperShears;
import com.kashdeya.moreshears.items.diamondShears;
import com.kashdeya.moreshears.items.electrumShears;
import com.kashdeya.moreshears.items.emeraldShears;
import com.kashdeya.moreshears.items.flintShears;
import com.kashdeya.moreshears.items.goldenShears;
import com.kashdeya.moreshears.items.leadShears;
import com.kashdeya.moreshears.items.nickelShears;
import com.kashdeya.moreshears.items.silverShears;
import com.kashdeya.moreshears.items.steelShears;
import com.kashdeya.moreshears.items.stoneShears;
import com.kashdeya.moreshears.items.uraniumShears;
import com.kashdeya.moreshears.items.woodenShears;
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
			wooden_shears = new woodenShears();
			registerItem(wooden_shears, "wooden_shears");
		}
		if (ConfigHandler.golden_shears){
			golden_shears = new goldenShears();
			registerItem(golden_shears, "golden_shears");
		}
		if (ConfigHandler.stone_shears){
			stone_shears = new stoneShears();
			registerItem(stone_shears, "stone_shears");
		}
		if (ConfigHandler.diamond_shears){
			diamond_shears = new diamondShears();
			registerItem(diamond_shears, "diamond_shears");
		}
		if (ConfigHandler.emerald_shears){
			emerald_shears = new emeraldShears();
			registerItem(emerald_shears, "emerald_shears");
		}
		if (ConfigHandler.flint_shears){
			flint_shears = new flintShears();
			registerItem(flint_shears, "flint_shears");
		}
		
		// IE
		if (Loader.isModLoaded("immersiveengineering"))
		{
			if (ConfigHandler.immersiveAluminium_shears){
				aluminium_shears = new aluminiumShears();
				registerItem(aluminium_shears, "aluminium_shears");
			}
			if (ConfigHandler.immersiveConstantan_shears){
				constantan_shears = new constantanShears();
				registerItem(constantan_shears, "constantan_shears");
			}
			if (ConfigHandler.immersiveUranium_shears){
				uranium_shears = new uraniumShears();
				registerItem(uranium_shears, "uranium_shears");
			}	
			if (ConfigHandler.immersiveCopper_shears){
				copper_shears = new copperShears();
				registerItem(copper_shears, "copper_shears");
			}
			if (ConfigHandler.immersiveSilver_shears){
				silver_shears = new silverShears();
				registerItem(silver_shears, "silver_shears");
			}
			if (ConfigHandler.immersiveLead_shears){
		    	lead_shears = new leadShears();
		    	registerItem(lead_shears, "lead_shears");
		    }
		    if (ConfigHandler.immersiveNickel_shears){
		    	nickel_shears = new nickelShears();
		    	registerItem(nickel_shears, "nickel_shears");
		    }
		    if (ConfigHandler.immersiveSteel_shears){
		    	steel_shears = new steelShears();
		    	registerItem(steel_shears, "steel_shears");
		    }
		    if (ConfigHandler.immersiveElectrum_shears){
		    	electrum_shears = new electrumShears();
		    	registerItem(electrum_shears, "electrum_shears");
		    }
		    
		}
	}
	
	static void registerItem(Item item, String name){
		item.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
	    MoreShears.REGISTRY.register(item);
	    MoreShears.REGISTRY.render(item);
	}

}
