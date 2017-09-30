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
		
		config.addCustomCategoryComment(category + " Extra Shears", "True or False (Extras Support needs to be enabled above.)");
		ConfigHandler.immersiveCopper_shears = config.getBoolean("Copper Shears", category + " Extra Shears", true, "Enable Copper Shears?");
		ConfigHandler.immersiveElectrum_shears = config.getBoolean("Electrum Shears", category + " Extra Shears", true, "Enable Electrum Shears?");
		ConfigHandler.immersiveLead_shears = config.getBoolean("Lead Shears", category + " Extra Shears", true, "Enable Lead Shears?");
		ConfigHandler.immersiveNickel_shears = config.getBoolean("Nickel Shears", category + " Extra Shears", true, "Enable Nickel Shears?");
		ConfigHandler.immersiveSilver_shears = config.getBoolean("Silver Shears", category + " Extra Shears", true, "Enable Silver Shears?");
		ConfigHandler.immersiveSteel_shears = config.getBoolean("Steel Shears", category + " Extra Shears", true, "Enable Steel Shears?");
		ConfigHandler.immersiveAluminium_shears = config.getBoolean("Aluminium Shears", category + " Extra Shears", true, "Enable Aluminium Shears?");
		ConfigHandler.immersiveConstantan_shears = config.getBoolean("Constantan Shears", category + " Extra Shears", true, "Enable Constantan Shears?");
		ConfigHandler.immersiveUranium_shears = config.getBoolean("Uranium Shears", category + " Extra Shears", true, "Enable Uranium Shears?");
		
		config.addCustomCategoryComment(category + " Extra Shears Durability", "Enables you to change the ammount of Durability a pair of Shears have.");
		ConfigHandler.immersiveCopperDamage = config.getInt("Copper Shears", category + " Extra Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveElectrumDamage = config.getInt("Electrum Shears", category + " Extra Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveLeadDamage = config.getInt("Lead Shears", category + " Extra Shears Durability", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveNickelDamage = config.getInt("Nickel Shears", category + " Extra Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveSilverDamage = config.getInt("Silver Shears", category + " Extra Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveSteelDamage = config.getInt("Steel Shears", category + " Extra Shears Durability", 480, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveAluminiumDamage = config.getInt("Aluminium Shears", category + " Extra Shears Durability", 255, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveConstantanDamage = config.getInt("Constantan Shears", category + " Extra Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.immersiveUraniumDamage = config.getInt("Uranium Shears", category + " Extra Shears Durability", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
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
