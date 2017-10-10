package com.kashdeya.moreshears.proxy;

import com.arclighttw.utilities.IProxy;
import com.kashdeya.moreshears.inits.MoreItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy implements IProxy {
	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		// Items
		MoreItems.render();
	}
	
	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
	}
	
	@Override
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
	} 
}
