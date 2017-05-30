package com.kashdeya.moreshears.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.moreshears.configs.Config;
import com.kashdeya.moreshears.inits.MoreItems;
import com.kashdeya.moreshears.proxy.CommonProxy;
import com.kashdeya.moreshears.tabs.TabItems;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "after:basemetals;after:immersiveengineering")

public class MoreShears {
	
	@Instance(Reference.MOD_ID)
    public static MoreShears instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
	public static final CreativeTabs tabItems = new TabItems("MoreShears");

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	PROXY.registerRenderers();
    	
		// Configs
		Config.initMainConfigs();
		
		// Items
		MoreItems.init();
		
		// Renders
		PROXY.registerRenderers();
		
		// Events
    	MinecraftForge.EVENT_BUS.register(instance);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    }
}
