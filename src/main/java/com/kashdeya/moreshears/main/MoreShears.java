package com.kashdeya.moreshears.main;

import com.arclighttw.utilities.ForgeMod;
import com.arclighttw.utilities.IProxy;
import com.kashdeya.moreshears.configs.Config;
import com.kashdeya.moreshears.proxy.ClientProxy;
import com.kashdeya.moreshears.proxy.CommonProxy;
import com.kashdeya.moreshears.tabs.TabItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "after:immersiveengineering")

public class MoreShears extends ForgeMod {

	@Instance(Reference.MOD_ID)
	public static MoreShears instance;

	public static final CreativeTabs tabItems = new TabItems("MoreShears");

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		// Configs
		Config.initMainConfigs();
		
		proxy.setupInstance(instance);
		proxy.onPreInitialization(e);

		// Events
		MinecraftForge.EVENT_BUS.register(instance);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.onInitialization(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.onPostInitialization(e);
	}

	@Override
	public IProxy getClientProxy() {
		return new ClientProxy();
	}

	@Override
	public IProxy getServerProxy() {
		return new CommonProxy();
	}
}
