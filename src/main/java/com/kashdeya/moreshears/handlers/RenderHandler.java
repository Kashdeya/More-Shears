package com.kashdeya.moreshears.handlers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import com.kashdeya.moreshears.inits.MoreItems;
import com.kashdeya.moreshears.main.Reference;

public class RenderHandler {
	
	public static void init_shears(){
		// Vanilla
		InventoryItemRender(MoreItems.wooden_shears, "wooden_shears");
		InventoryItemRender(MoreItems.golden_shears, "golden_shears");
		InventoryItemRender(MoreItems.diamond_shears, "diamond_shears");
		InventoryItemRender(MoreItems.stone_shears, "stone_shears");
		InventoryItemRender(MoreItems.emerald_shears, "emerald_shears");
		InventoryItemRender(MoreItems.flint_shears, "flint_shears");
		// Base
		InventoryItemRender(MoreItems.tin_shears, "tin_shears");
		InventoryItemRender(MoreItems.platinum_shears, "platinum_shears");
		InventoryItemRender(MoreItems.cold_shears, "cold_shears");
		InventoryItemRender(MoreItems.mithril_shears, "mithril_shears");
		InventoryItemRender(MoreItems.star_shears, "star_shears");
		InventoryItemRender(MoreItems.bronze_shears, "bronze_shears");
		InventoryItemRender(MoreItems.brass_shears, "brass_shears");
		InventoryItemRender(MoreItems.invar_shears, "invar_shears");
		InventoryItemRender(MoreItems.aquarium_shears, "aquarium_shears");
		InventoryItemRender(MoreItems.adamantine_shears, "adamantine_shears");
		InventoryItemRender(MoreItems.cupronickel_shears, "cupronickel_shears");
		// IE
		InventoryItemRender(MoreItems.immersiveAluminium_shears, "immersiveAluminium_shears");
		InventoryItemRender(MoreItems.immersiveConstantan_shears, "immersiveConstantan_shears");
		InventoryItemRender(MoreItems.immersiveUranium_shears, "immersiveUranium_shears");
		// Base & IE
		InventoryItemRender(MoreItems.copper_shears, "copper_shears");
		InventoryItemRender(MoreItems.silver_shears, "silver_shears");
		InventoryItemRender(MoreItems.lead_shears, "lead_shears");
		InventoryItemRender(MoreItems.steel_shears, "steel_shears");
		InventoryItemRender(MoreItems.nickel_shears, "nickel_shears");
		InventoryItemRender(MoreItems.electrum_shears, "electrum_shears");
	}
	
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}

}
