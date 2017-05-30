package com.kashdeya.moreshears.inits;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.adamantineShears;
import com.kashdeya.moreshears.items.aquariumShears;
import com.kashdeya.moreshears.items.brassShears;
import com.kashdeya.moreshears.items.bronzeShears;
import com.kashdeya.moreshears.items.coldShears;
import com.kashdeya.moreshears.items.copperShears;
import com.kashdeya.moreshears.items.cupronickelShears;
import com.kashdeya.moreshears.items.diamondShears;
import com.kashdeya.moreshears.items.electrumShears;
import com.kashdeya.moreshears.items.emeraldShears;
import com.kashdeya.moreshears.items.flintShears;
import com.kashdeya.moreshears.items.goldenShears;
import com.kashdeya.moreshears.items.immersiveAluminiumShears;
import com.kashdeya.moreshears.items.immersiveConstantanShears;
import com.kashdeya.moreshears.items.immersiveUraniumShears;
import com.kashdeya.moreshears.items.invarShears;
import com.kashdeya.moreshears.items.leadShears;
import com.kashdeya.moreshears.items.mithrilShears;
import com.kashdeya.moreshears.items.nickelShears;
import com.kashdeya.moreshears.items.platinumShears;
import com.kashdeya.moreshears.items.silverShears;
import com.kashdeya.moreshears.items.starShears;
import com.kashdeya.moreshears.items.steelShears;
import com.kashdeya.moreshears.items.stoneShears;
import com.kashdeya.moreshears.items.tinShears;
import com.kashdeya.moreshears.items.woodenShears;
import com.kashdeya.moreshears.items.woodenShears;
import com.kashdeya.moreshears.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MoreItems {
	// Vanilla
	public static Item wooden_shears;
	public static Item golden_shears;
	public static Item diamond_shears;
	public static Item stone_shears;
	public static Item flint_shears;
	public static Item emerald_shears;
	// Base Metals
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
	// Immersive
	public static Item immersiveAluminium_shears;
	public static Item immersiveUranium_shears;
	public static Item immersiveConstantan_shears;
	
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
	    
		// Base
		if (Loader.isModLoaded("basemetals"))
		{
		    if (ConfigHandler.tin_shears){
		    	tin_shears = new tinShears();
		    	registerItem(tin_shears, "tin_shears");
		    }
		    if (ConfigHandler.platinum_shears){
		    	platinum_shears = new platinumShears();
		    	registerItem(platinum_shears, "platinum_shears");
		    }
		    if (ConfigHandler.cold_shears){
		    	cold_shears = new coldShears();
		    	registerItem(cold_shears, "cold_shears");
		    }
		    if (ConfigHandler.mithril_shears){
		    	mithril_shears = new mithrilShears();
		    	registerItem(mithril_shears, "mithril_shears");
		    }
		    if (ConfigHandler.star_shears){
		    	star_shears = new starShears();
		    	registerItem(star_shears, "star_shears");
		    }
		    if (ConfigHandler.bronze_shears){
		    	bronze_shears = new bronzeShears();
		    	registerItem(bronze_shears, "bronze_shears");
		    }
		    if (ConfigHandler.brass_shears){
		    	brass_shears = new brassShears();
		    	registerItem(brass_shears, "brass_shears");
		    }
		    if (ConfigHandler.invar_shears){
		    	invar_shears = new invarShears();
		    	registerItem(invar_shears, "invar_shears");
		    }
		    if (ConfigHandler.aquarium_shears){
		    	aquarium_shears = new aquariumShears();
		    	registerItem(aquarium_shears, "aquarium_shears");
		    }
		    if (ConfigHandler.adamantine_shears){
		    	adamantine_shears = new adamantineShears();
		    	registerItem(adamantine_shears, "adamantine_shears");
		    }
		    if (ConfigHandler.cupronickel_shears){
		    	cupronickel_shears = new cupronickelShears();
		    	registerItem(cupronickel_shears, "cupronickel_shears");
		    }
		}
		
		// IE
		if (Loader.isModLoaded("immersiveengineering"))
		{
			if (ConfigHandler.immersiveAluminium_shears){
				immersiveAluminium_shears = new immersiveAluminiumShears();
				registerItem(immersiveAluminium_shears, "immersiveAluminium_shears");
			}
			if (ConfigHandler.immersiveConstantan_shears){
				immersiveConstantan_shears = new immersiveConstantanShears();
				registerItem(immersiveConstantan_shears, "immersiveConstantan_shears");
			}
			if (ConfigHandler.immersiveUranium_shears){
				immersiveUranium_shears = new immersiveUraniumShears();
				registerItem(immersiveUranium_shears, "immersiveUranium_shears");
			}	
		}
		
		// IE & BASE
		if (Loader.isModLoaded("basemetals") || Loader.isModLoaded("immersiveengineering"))
		{
			if (ConfigHandler.copper_shears){
				copper_shears = new copperShears();
				registerItem(copper_shears, "copper_shears");
			}
			if (ConfigHandler.silver_shears){
				silver_shears = new silverShears();
				registerItem(silver_shears, "silver_shears");
			}
			if (ConfigHandler.lead_shears){
		    	lead_shears = new leadShears();
		    	registerItem(lead_shears, "lead_shears");
		    }
		    if (ConfigHandler.nickel_shears){
		    	nickel_shears = new nickelShears();
		    	registerItem(nickel_shears, "nickel_shears");
		    }
		    if (ConfigHandler.steel_shears){
		    	steel_shears = new steelShears();
		    	registerItem(steel_shears, "steel_shears");
		    }
		    if (ConfigHandler.electrum_shears){
		    	electrum_shears = new electrumShears();
		    	registerItem(electrum_shears, "electrum_shears");
		    }
		    
		}
		
		// Adamantium
		if (Loader.isModLoaded("adamantium")){
			if (ConfigHandler.Adamantium_shears){
				Adamantium_shears = new Adamantium_shears(ToolHandler.adamantiumToolMaterial);
				registerItem(Adamantium_shears, "Adamantium_shears");
			}
		}
		
		// Taiga
		if (Loader.isModLoaded("taiga")){
			if (ConfigHandler.Abyssum_shears){
				Abyssum_shears = new Abyssum_shears(ToolHandler.abyssumToolMaterial);
				registerItem(Abyssum_shears, "Abyssum_shears");
			}
			if (ConfigHandler.Adamant_shears){
				Adamant_shears = new Adamant_shears(ToolHandler.adamantToolMaterial);
				registerItem(Adamant_shears, "Adamant_shears");
			}
			if (ConfigHandler.Astrium_shears){
				Astrium_shears = new Astrium_shears(ToolHandler.astriumToolMaterial);
				registerItem(Astrium_shears, "Astrium_shears");
			}
			if (ConfigHandler.Aurorium_shears){
				Aurorium_shears = new Aurorium_shears(ToolHandler.auroriumToolMaterial);
				registerItem(Aurorium_shears, "Aurorium_shears");
			}
			if (ConfigHandler.Basalt_shears){
				Basalt_shears = new Basalt_shears(ToolHandler.basaltToolMaterial);
				registerItem(Basalt_shears, "Basalt_shears");
			}
			if (ConfigHandler.Dilithium_shears){
				Dilithium_shears = new Dilithium_shears(ToolHandler.dilithiumToolMaterial);
				registerItem(Dilithium_shears, "Dilithium_shears");
			}
			if (ConfigHandler.Duranite_shears){
				Duranite_shears = new Duranite_shears(ToolHandler.duraniteToolMaterial);
				registerItem(Duranite_shears, "Duranite_shears");
			}
			if (ConfigHandler.Dyonite_shears){
				Dyonite_shears = new Dyonite_shears(ToolHandler.dyoniteToolMaterial);
				registerItem(Dyonite_shears, "Dyonite_shears");
			}
			if (ConfigHandler.Eezo_shears){
				Eezo_shears = new Eezo_shears(ToolHandler.eezoToolMaterial);
				registerItem(Eezo_shears, "Eezo_shears");
			}
			if (ConfigHandler.Fractum_shears){
				Fractum_shears = new Fractum_shears(ToolHandler.fractumToolMaterial);
				registerItem(Fractum_shears, "Fractum_shears");
			}
			if (ConfigHandler.Ignitz_shears){
				Ignitz_shears = new Ignitz_shears(ToolHandler.ignitzToolMaterial);
				registerItem(Ignitz_shears, "Ignitz_shears");
			}
			if (ConfigHandler.Imperomite_shears){
				Imperomite_shears = new Imperomite_shears(ToolHandler.imperomiteToolMaterial);
				registerItem(Imperomite_shears, "Imperomite_shears");
			}
			if (ConfigHandler.Iox_shears){
				Iox_shears = new Iox_shears(ToolHandler.ioxToolMaterial);
				registerItem(Iox_shears, "Iox_shears");
			}
			if (ConfigHandler.Jauxum_shears){
				Jauxum_shears = new Jauxum_shears(ToolHandler.jauxumToolMaterial);
				registerItem(Jauxum_shears, "Jauxum_shears");
			}
			if (ConfigHandler.Karmesine_shears){
				Karmesine_shears = new Karmesine_shears(ToolHandler.karmesineToolMaterial);
				registerItem(Karmesine_shears, "Karmesine_shears");
			}
			if (ConfigHandler.Lumix_shears){
				Lumix_shears = new Lumix_shears(ToolHandler.lumixToolMaterial);
				registerItem(Lumix_shears, "Lumix_shears");
			}
			if (ConfigHandler.Meteorite_shears){
				Meteorite_shears = new Meteorite_shears(ToolHandler.meteoriteToolMaterial);
				registerItem(Meteorite_shears, "Meteorite_shears");
			}
			if (ConfigHandler.Nihilite_shears){
				Nihilite_shears = new Nihilite_shears(ToolHandler.nihiliteToolMaterial);
				registerItem(Nihilite_shears, "Nihilite_shears");
			}
			if (ConfigHandler.Niob_shears){
				Niob_shears = new Niob_shears(ToolHandler.niobToolMaterial);
				registerItem(Niob_shears, "Niob_shears");
			}
			if (ConfigHandler.Nucleum_shears){
				Nucleum_shears = new Nucleum_shears(ToolHandler.nucleumToolMaterial);
				registerItem(Nucleum_shears, "Nucleum_shears");
			}
			if (ConfigHandler.Obsidiorite_shears){
				Obsidiorite_shears = new Obsidiorite_shears(ToolHandler.obsidioriteToolMaterial);
				registerItem(Obsidiorite_shears, "Obsidiorite_shears");
			}
			if (ConfigHandler.Osram_shears){
				Osram_shears = new Osram_shears(ToolHandler.osramToolMaterial);
				registerItem(Osram_shears, "Osram_shears");
			}
			if (ConfigHandler.Ovium_shears){
				Ovium_shears = new Ovium_shears(ToolHandler.oviumToolMaterial);
				registerItem(Ovium_shears, "Ovium_shears");
			}
			if (ConfigHandler.Palladium_shears){
				Palladium_shears = new Palladium_shears(ToolHandler.palladiumToolMaterial);
				registerItem(Palladium_shears, "Palladium_shears");
			}
			if (ConfigHandler.Prometheum_shears){
				Prometheum_shears = new Prometheum_shears(ToolHandler.prometheumToolMaterial);
				registerItem(Prometheum_shears, "Prometheum_shears");
			}
			if (ConfigHandler.Proxii_shears){
				Proxii_shears = new Proxii_shears(ToolHandler.proxiiToolMaterial);
				registerItem(Proxii_shears, "Proxii_shears");
			}
			if (ConfigHandler.Seismum_shears){
				Seismum_shears = new Seismum_shears(ToolHandler.seismumToolMaterial);
				registerItem(Seismum_shears, "Seismum_shears");
			}
			if (ConfigHandler.Solarium_shears){
				Solarium_shears = new Solarium_shears(ToolHandler.solariumToolMaterial);
				registerItem(Solarium_shears, "Solarium_shears");
			}
			if (ConfigHandler.Terrax_shears){
				Terrax_shears = new Terrax_shears(ToolHandler.terraxToolMaterial);
				registerItem(Terrax_shears, "Terrax_shears");
			}
			if (ConfigHandler.Tiberium_shears){
				Tiberium_shears = new Tiberium_shears(ToolHandler.tiberiumToolMaterial);
				registerItem(Tiberium_shears, "Tiberium_shears");
			}
			if (ConfigHandler.Triberium_shears){
				Triberium_shears = new Triberium_shears(ToolHandler.triberiumToolMaterial);
				registerItem(Triberium_shears, "Triberium_shears");
			}
			if (ConfigHandler.Tritonite_shears){
				Tritonite_shears = new Tritonite_shears(ToolHandler.tritoniteToolMaterial);
				registerItem(Tritonite_shears, "Tritonite_shears");
			}
			if (ConfigHandler.Uru_shears){
				Uru_shears = new Uru_shears(ToolHandler.uruToolMaterial);
				registerItem(Uru_shears, "Uru_shears");
			}
			if (ConfigHandler.Valyrium_shears){
				Valyrium_shears = new Valyrium_shears(ToolHandler.valyriumToolMaterial);
				registerItem(Valyrium_shears, "Valyrium_shears");
			}
			if (ConfigHandler.Vibranium_shears){
				Vibranium_shears = new Vibranium_shears(ToolHandler.vibraniumToolMaterial);
				registerItem(Vibranium_shears, "Vibranium_shears");
			}
			if (ConfigHandler.Violium_shears){
				Violium_shears = new Violium_shears(ToolHandler.violiumToolMaterial);
				registerItem(Violium_shears, "Violium_shears");
			}
			if (ConfigHandler.Yrdeen_shears){
				Yrdeen_shears = new Yrdeen_shears(ToolHandler.yrdeenToolMaterial);
				registerItem(Yrdeen_shears, "Yrdeen_shears");
			}
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
