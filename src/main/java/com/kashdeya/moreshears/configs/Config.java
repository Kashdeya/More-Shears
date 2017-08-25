package com.kashdeya.moreshears.configs;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.kashdeya.moreshears.handlers.ConfigHandler;

public class Config {
	
	public static Configuration config;
	
	public static final File configDir = new File("config/More Shears");
	
	public static void initMainConfigs()
	{
		
		File f = new File(configDir, "Main.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "More Shears";
		
		config.addCustomCategoryComment(category + " BaseMetal Shears", "True or False (BaseMetals Support needs to be enabled above.)");
		ConfigHandler.adamantine_shears = config.getBoolean("Adamantine Shears", category + " BaseMetal Shears", true, "Enable Adamantine Shears?");
		ConfigHandler.aquarium_shears = config.getBoolean("Aquarium Shears", category + " BaseMetal Shears", true, "Enable Aquarium Shears?");
		ConfigHandler.brass_shears = config.getBoolean("Brass Shears", category + " BaseMetal Shears", true, "Enable Brass Shears?");
		ConfigHandler.bronze_shears = config.getBoolean("Bronze Shears", category + " BaseMetal Shears", true, "Enable Bronze Shears?");
		ConfigHandler.cold_shears = config.getBoolean("Cold-Iron Shears", category + " BaseMetal Shears", true, "Enable Cold-Iron Shears?");
		ConfigHandler.copper_shears = config.getBoolean("Copper Shears", category + " BaseMetal Shears", true, "Enable Copper Shears?");
		ConfigHandler.cupronickel_shears = config.getBoolean("Cupronickel Shears", category + " BaseMetal Shears", true, "Enable Cupronickel Shears?");
		ConfigHandler.electrum_shears = config.getBoolean("Electrum Shears", category + " BaseMetal Shears", true, "Enable Electrum Shears?");
		ConfigHandler.invar_shears = config.getBoolean("Invar Shears", category + " BaseMetal Shears", true, "Enable Invar Shears?");
		ConfigHandler.lead_shears = config.getBoolean("Lead Shears", category + " BaseMetal Shears", true, "Enable Lead Shears?");
		ConfigHandler.mithril_shears = config.getBoolean("Mithril Shears", category + " BaseMetal Shears", true, "Enable Mithril Shears?");
		ConfigHandler.nickel_shears = config.getBoolean("Nickel Shears", category + " BaseMetal Shears", true, "Enable Nickel Shears?");
		ConfigHandler.platinum_shears = config.getBoolean("Platinum Shears", category + " BaseMetal Shears", true, "Enable Platinum Shears?");
		ConfigHandler.silver_shears = config.getBoolean("Silver Shears", category + " BaseMetal Shears", true, "Enable Silver Shears?");
		ConfigHandler.star_shears = config.getBoolean("Star Steel Shears", category + " BaseMetal Shears", true, "Enable Star Steel Shears?");
		ConfigHandler.steel_shears = config.getBoolean("Steel Shears", category + " BaseMetal Shears", true, "Enable Steel Shears?");
		ConfigHandler.tin_shears = config.getBoolean("Tin Shears", category + " BaseMetal Shears", true, "Enable Tin Shears?");
		
		config.addCustomCategoryComment(category + " BaseMetal Shears Durability", "Enables you to change the ammount of Durability a pair of Shears have.");
		ConfigHandler.adamantineDamage = config.getInt("Adamantine Shears", category + " BaseMetal Shears Durability", 3200, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.aquariumDamage = config.getInt("Aquarium Shears", category + " BaseMetal Shears Durability", 320, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.brassDamage = config.getInt("Brass Shears", category + " BaseMetal Shears Durability", 96, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.bronzeDamage = config.getInt("Bronze Shears", category + " BaseMetal Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.coldDamage = config.getInt("Cold-Iron Shears", category + " BaseMetal Shears Durability", 224, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.copperDamage = config.getInt("Copper Shears", category + " BaseMetal Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.cupronickelDamage = config.getInt("Cupronickel Shears", category + " BaseMetal Shears Durability", 192, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.electrumDamage = config.getInt("Electrum Shears", category + " BaseMetal Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.invarDamage = config.getInt("Invar Shears", category + " BaseMetal Shears Durability", 320, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.leadDamage = config.getInt("Lead Shears", category + " BaseMetal Shears Durability", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.mithrilDamage = config.getInt("Mithril Shears", category + " BaseMetal Shears Durability", 288, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.nickelDamage = config.getInt("Nickel Shears", category + " BaseMetal Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.platinumDamage = config.getInt("Platinum Shears", category + " BaseMetal Shears Durability", 160, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.silverDamage = config.getInt("Silver Shears", category + " BaseMetal Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.starDamage = config.getInt("Star Steel Shears", category + " BaseMetal Shears Durability", 800, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.steelDamage = config.getInt("Steel Shears", category + " BaseMetal Shears Durability", 480, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.tinDamage = config.getInt("Tin Shears", category + " BaseMetal Shears Durability", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " Immersive Engineering Shears", "True or False (Immersive Engineering Support needs to be enabled above.)");
		ConfigHandler.immersiveAluminium_shears = config.getBoolean("Aluminium Shears", category + " Immersive Engineering Shears", true, "Enable Aluminium Shears?");
		ConfigHandler.immersiveConstantan_shears = config.getBoolean("Constantan Shears", category + " Immersive Engineering Shears", true, "Enable Constantan Shears?");
		ConfigHandler.immersiveUranium_shears = config.getBoolean("Uranium Shears", category + " Immersive Engineering Shears", true, "Enable Uranium Shears?");
		
		config.addCustomCategoryComment(category + " Immersive Engineering Shears Durability", "Enables you to change the ammount of Durability a pair of Shears have.");
		ConfigHandler.immersiveAluminiumDamage = config.getInt("Aluminium Shears", category + " Immersive Engineering Shears Durability", 255, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveConstantanDamage = config.getInt("Constantan Shears", category + " Immersive Engineering Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveUraniumDamage = config.getInt("Uranium Shears", category + " Immersive Engineering Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " Vanilla Shears", "True or False (Vanilla Support needs to be enabled above.)");
		ConfigHandler.diamond_shears = config.getBoolean("Diamond Shears", category + " Vanilla Shears", true, "Enable Diamond Shears?");
		ConfigHandler.golden_shears = config.getBoolean("Golden Shears", category + " Vanilla Shears", true, "Enable Golden Shears?");
		ConfigHandler.stone_shears = config.getBoolean("Stone Shears", category + " Vanilla Shears", true, "Enable Stone Shears?");
		ConfigHandler.wooden_shears = config.getBoolean("Wooden Shears", category + " Vanilla Shears", true, "Enable Wooden Shears?");
		ConfigHandler.flint_shears = config.getBoolean("Flint Shears", category + " Vanilla Shears", true, "Enable Flint Shears?");
		ConfigHandler.emerald_shears = config.getBoolean("Emerald Shears", category + " Vanilla Shears", true, "Enable Emerald Shears?");
		
		config.addCustomCategoryComment(category + " Vanilla Shears Durability", "Enables you to change the ammount of Durability a pair of Shears have.");
		ConfigHandler.diamondDamage = config.getInt("Diamond Shears", category + " Vanilla Shears Durability", 1561, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.goldenDamage = config.getInt("Golden Shears", category + " Vanilla Shears Durability", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.stoneDamage = config.getInt("Stone Shears", category + " Vanilla Shears Durability", 131, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.woodenDamage = config.getInt("Wooden Shears", category + " Vanilla Shears Durability", 59, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.flintDamage = config.getInt("Flint Shears", category + " Vanilla Shears Durability", 81, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.emeraldDamage = config.getInt("Emerald Shears", category + " Vanilla Shears Durability", 1061, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
        if (config.hasChanged())
        config.save();
	}

}
