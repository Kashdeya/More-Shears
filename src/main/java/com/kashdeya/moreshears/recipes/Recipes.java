package com.kashdeya.moreshears.recipes;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.inits.MoreItems;
import com.kashdeya.moreshears.util.RecipeRegistry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
	
	public static void registerRecipes(){
		// Vanilla
		if (ConfigHandler.diamond_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.diamond_shears), " d", "d ", 'd', "gemDiamond");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.diamond_shears), "d ", " d", 'd', "gemDiamond");
		}
		if (ConfigHandler.golden_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.golden_shears), " g", "g ", 'g', "ingotGold");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.golden_shears), "g ", " g", 'g', "ingotGold");
		}
		if (ConfigHandler.stone_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.stone_shears), " s", "s ", 's', "stone");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.stone_shears), "s ", " s", 's', "stone");
		}
		if (ConfigHandler.wooden_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.wooden_shears), " w", "w ", 'w', "plankWood");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.wooden_shears), "w ", " w", 'w', "plankWood");
			
		if (ConfigHandler.emerald_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.emerald_shears), " w", "w ", 'w', "gemEmerald");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.emerald_shears), "w ", " w", 'w', "gemEmerald");
		}
		if (ConfigHandler.flint_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.flint_shears), new Object[] {" w", "w ", 'w', new ItemStack(Items.FLINT)});
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.flint_shears), new Object[] {"w ", " w", 'w', new ItemStack(Items.FLINT)});
		}
		
		if (ConfigHandler.immersiveCopper_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.copper_shears), " c", "c ", 'c', "ingotCopper");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.copper_shears), "c ", " c", 'c', "ingotCopper");
		}
		
		if (ConfigHandler.immersiveSilver_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.silver_shears), " s", "s ", 's', "ingotSilver");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.silver_shears), "s ", " s", 's', "ingotSilver");
		}
				
		if (ConfigHandler.immersiveLead_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.lead_shears), " l", "l ", 'l', "ingotLead");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.lead_shears), "l ", " l", 'l', "ingotLead");
		}
		
		if (ConfigHandler.immersiveSteel_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.steel_shears), " s", "s ", 's', "ingotSteel");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.steel_shears), "s ", " s", 's', "ingotSteel");
		}
		
		if (ConfigHandler.immersiveNickel_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.nickel_shears), " n", "n ", 'n', "ingotNickel");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.nickel_shears), "n ", " n", 'n', "ingotNickel");
		}
		
		if (ConfigHandler.immersiveElectrum_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.electrum_shears), " e", "e ", 'e', "ingotElectrum");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.electrum_shears), "e ", " e", 'e', "ingotElectrum");
		}
		
		if (ConfigHandler.immersiveAluminium_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.aluminium_shears), " a", "a ", 'a', "ingotAluminum");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.aluminium_shears), "a ", " a", 'a', "ingotAluminum");
		}
		if (ConfigHandler.immersiveConstantan_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.constantan_shears), " a", "a ", 'a', "ingotConstantan");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.constantan_shears), "a ", " a", 'a', "ingotConstantan");
		}
		if (ConfigHandler.immersiveUranium_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.uranium_shears), " a", "a ", 'a', "ingotUranium");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.uranium_shears), "a ", " a", 'a', "ingotUranium");
		}
		
	}
}

}
