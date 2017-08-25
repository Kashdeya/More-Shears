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
		
		// BaseMetals
		if (ConfigHandler.copper_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.copper_shears), " c", "c ", 'c', "ingotCopper");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.copper_shears), "c ", " c", 'c', "ingotCopper");
		}
		if (ConfigHandler.silver_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.silver_shears), " s", "s ", 's', "ingotSilver");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.silver_shears), "s ", " s", 's', "ingotSilver");
		}
		if (ConfigHandler.tin_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.tin_shears), " t", "t ", 't', "ingotTin");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.tin_shears), "t ", " t", 't', "ingotTin");
		}
		if (ConfigHandler.lead_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.lead_shears), " l", "l ", 'l', "ingotLead");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.lead_shears), "l ", " l", 'l', "ingotLead");
		}
		if (ConfigHandler.steel_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.steel_shears), " s", "s ", 's', "ingotSteel");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.steel_shears), "s ", " s", 's', "ingotSteel");
		}
		if (ConfigHandler.nickel_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.nickel_shears), " n", "n ", 'n', "ingotNickel");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.nickel_shears), "n ", " n", 'n', "ingotNickel");
		}
		if (ConfigHandler.platinum_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.platinum_shears), " p", "p ", 'p', "ingotPlatinum");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.platinum_shears), "p ", " p", 'p', "ingotPlatinum");
		}
		if (ConfigHandler.cold_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.cold_shears), " c", "c ", 'c', "ingotColdiron");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.cold_shears), "c ", " c", 'c', "ingotColdiron");
		}
		if (ConfigHandler.mithril_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.mithril_shears), " m", "m ", 'm', "ingotMithril");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.mithril_shears), "m ", " m", 'm', "ingotMithril");
		}
		if (ConfigHandler.star_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.star_shears), " s", "s ", 's', "ingotStarsteel");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.star_shears), "s ", " s", 's', "ingotStarsteel");
		}
		if (ConfigHandler.bronze_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.bronze_shears), " b", "b ", 'b', "ingotBronze");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.bronze_shears), "b ", " b", 'b', "ingotBronze");
		}
		if (ConfigHandler.brass_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.brass_shears), " b", "b ", 'b', "ingotBrass");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.brass_shears), "b ", " b", 'b', "ingotBrass");
		}
		if (ConfigHandler.electrum_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.electrum_shears), " e", "e ", 'e', "ingotElectrum");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.electrum_shears), "e ", " e", 'e', "ingotElectrum");
		}
		if (ConfigHandler.invar_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.invar_shears), " i", "i ", 'i', "ingotInvar");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.invar_shears), "i ", " i", 'i', "ingotInvar");
		}
		if (ConfigHandler.aquarium_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.aquarium_shears), " a", "a ", 'a', "ingotAquarium");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.aquarium_shears), "a ", " a", 'a', "ingotAquarium");
		}
		if (ConfigHandler.adamantine_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.adamantine_shears), " a", "a ", 'a', "ingotAdamantine");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.adamantine_shears), "a ", " a", 'a', "ingotAdamantine");
		}
		if (ConfigHandler.cupronickel_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.cupronickel_shears), " c", "c ", 'c', "ingotCupronickel");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.cupronickel_shears), "c ", " c", 'c', "ingotCupronickel");
		}
		
		// IE
		if (ConfigHandler.immersiveAluminium_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.immersiveAluminium_shears), " a", "a ", 'a', "ingotAluminum");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.immersiveAluminium_shears), "a ", " a", 'a', "ingotAluminum");
		}
		if (ConfigHandler.immersiveConstantan_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.immersiveConstantan_shears), " a", "a ", 'a', "ingotConstantan");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.immersiveConstantan_shears), "a ", " a", 'a', "ingotConstantan");
		}
		if (ConfigHandler.immersiveUranium_shears){
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.immersiveUranium_shears), " a", "a ", 'a', "ingotUranium");
			RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.immersiveUranium_shears), "a ", " a", 'a', "ingotUranium");
		}
		
		// Adamantium (OUTDATED)
		/*
		if (Loader.isModLoaded("adamantium")){
			if (ConfigHandler.adamantium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Adamantium_shears), new Object[] {" w", "w ", 'w', new ItemStack(AdaItems.adamantiumIngot)});
			}
		}
		*/
		// Taiga (OUTDATED)
		/*
		if (Loader.isModLoaded("taiga")){
			if (ConfigHandler.Abyssum_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Abyssum_shears), "www", " sw", " s ", 'w', "ingotAbyssum"));
			}
			if (ConfigHandler.Adamant_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Adamant_shears), "www", " sw", " s ", 'w', "ingotAdamant"));
			}
			if (ConfigHandler.Astrium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Astrium_shears), "www", " sw", " s ", 'w', "ingotAstrium"));
			}
			if (ConfigHandler.Aurorium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Aurorium_shears), "www", " sw", " s ", 'w', "ingotAurorium"));
			}
			if (ConfigHandler.Basalt_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Basalt_shears), "www", " sw", " s ", 'w', "ingotBasalt"));
			}
			if (ConfigHandler.Dilithium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Dilithium_shears), "www", " sw", " s ", 'w', "ingotDilithium"));
			}
			if (ConfigHandler.Duranite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Duranite_shears), "www", " sw", " s ", 'w', "ingotDuranite"));
			}
			if (ConfigHandler.Dyonite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Dyonite_shears), "www", " sw", " s ", 'w', "ingotDyonite"));
			}
			if (ConfigHandler.Eezo_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Eezo_shears), "www", " sw", " s ", 'w', "ingotEezo"));
			}
			if (ConfigHandler.Fractum_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Fractum_shears), "www", " sw", " s ", 'w', "ingotFractum"));
			}
			if (ConfigHandler.Ignitz_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Ignitz_shears), "www", " sw", " s ", 'w', "ingotIgnitz"));
			}
			if (ConfigHandler.Imperomite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Imperomite_shears), "www", " sw", " s ", 'w', "ingotImperomite"));
			}
			if (ConfigHandler.Iox_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Iox_shears), "www", " sw", " s ", 'w', "ingotIox"));
			}
			if (ConfigHandler.Jauxum_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Jauxum_shears), "www", " sw", " s ", 'w', "ingotJauxum"));
			}
			if (ConfigHandler.Karmesine_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Karmesine_shears), "www", " sw", " s ", 'w', "ingotKarmesine"));
			}
			if (ConfigHandler.Lumix_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Lumix_shears), "www", " sw", " s ", 'w', "ingotLumix"));
			}
			if (ConfigHandler.Meteorite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Meteorite_shears), "www", " sw", " s ", 'w', "ingotMeteorite"));
			}
			if (ConfigHandler.Nihilite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Nihilite_shears), "www", " sw", " s ", 'w', "ingotNihilite"));
			}
			if (ConfigHandler.Niob_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Niob_shears), "www", " sw", " s ", 'w', "ingotNiob"));
			}
			if (ConfigHandler.Nucleum_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Nucleum_shears), "www", " sw", " s ", 'w', "ingotNucleum"));
			}
			if (ConfigHandler.Obsidiorite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Obsidiorite_shears), "www", " sw", " s ", 'w', "ingotObsidiorite"));
			}
			if (ConfigHandler.Osram_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Osram_shears), "www", " sw", " s ", 'w', "ingotOsram"));
			}
			if (ConfigHandler.Ovium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Ovium_shears), "www", " sw", " s ", 'w', "ingotOvium"));
			}
			if (ConfigHandler.Palladium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Palladium_shears), "www", " sw", " s ", 'w', "ingotPalladium"));
			}
			if (ConfigHandler.Prometheum_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Prometheum_shears), "www", " sw", " s ", 'w', "ingotPrometheum"));
			}
			if (ConfigHandler.Proxii_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Proxii_shears), "www", " sw", " s ", 'w', "ingotProxii"));
			}
			if (ConfigHandler.Seismum_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Seismum_shears), "www", " sw", " s ", 'w', "ingotSeismum"));
			}
			if (ConfigHandler.Solarium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Solarium_shears), "www", " sw", " s ", 'w', "ingotSolarium"));
			}
			if (ConfigHandler.Terrax_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Terrax_shears), "www", " sw", " s ", 'w', "ingotTerrax"));
			}
			if (ConfigHandler.Tiberium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Tiberium_shears), "www", " sw", " s ", 'w', "ingotTiberium"));
			}
			if (ConfigHandler.Triberium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Triberium_shears), "www", " sw", " s ", 'w', "ingotTriberium"));
			}
			if (ConfigHandler.Tritonite_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Tritonite_shears), "www", " sw", " s ", 'w', "ingotTritonite"));
			}
			if (ConfigHandler.Uru_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Uru_shears), "www", " sw", " s ", 'w', "ingotUru"));
			}
			if (ConfigHandler.Valyrium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Valyrium_shears), "www", " sw", " s ", 'w', "ingotValyrium"));
			}
			if (ConfigHandler.Vibranium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Vibranium_shears), "www", " sw", " s ", 'w', "ingotVibranium"));
			}
			if (ConfigHandler.Violium_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Violium_shears), "www", " sw", " s ", 'w', "ingotViolium"));
			}
			if (ConfigHandler.Yrdeen_shears){
				RecipeRegistry.addShapedRecipe(new ItemStack(MoreItems.Yrdeen_shears), "www", " sw", " s ", 'w', "ingotYrdeen"));
			}
			*/
		}
	}

}
