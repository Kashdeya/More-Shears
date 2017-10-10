package com.kashdeya.moreshears.proxy;

import com.arclighttw.utilities.IProxy;
import com.kashdeya.moreshears.inits.MoreItems;
import com.kashdeya.moreshears.recipes.Recipes;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy {

	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		// Items
		MoreItems.init();
	}
	
	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
    		// Recipes
    		Recipes.registerRecipes();
	}
	
	@Override
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
	}    
}
