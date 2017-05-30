package com.kashdeya.moreshears.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.inits.MoreItems;
import com.reygok.adamantiummod.init.AdaItems;

public class Recipes {
	
	public static void registerRecipes(){
		// Vanilla
		if (ConfigHandler.diamond_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.diamond_shears), " d", "d ", 'd', "gemDiamond"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.diamond_shears), "d ", " d", 'd', "gemDiamond"));
		}
		if (ConfigHandler.golden_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.golden_shears), " g", "g ", 'g', "ingotGold"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.golden_shears), "g ", " g", 'g', "ingotGold"));
		}
		if (ConfigHandler.stone_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.stone_shears), " s", "s ", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.stone_shears), "s ", " s", 's', "stone"));
		}
		if (ConfigHandler.wooden_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.wooden_shears), " w", "w ", 'w', "plankWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.wooden_shears), "w ", " w", 'w', "plankWood"));
		}
		if (ConfigHandler.emerald_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.emerald_shears), " w", "w ", 'w', "gemEmerald"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.emerald_shears), "w ", " w", 'w', "gemEmerald"));
		}
		if (ConfigHandler.flint_shears){
			GameRegistry.addShapedRecipe(new ItemStack(MoreItems.flint_shears), new Object[] {" w", "w ", 'w', new ItemStack(Items.FLINT)});
			GameRegistry.addShapedRecipe(new ItemStack(MoreItems.flint_shears), new Object[] {"w ", " w", 'w', new ItemStack(Items.FLINT)});
		}
		
		// BaseMetals
		if (ConfigHandler.copper_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.copper_shears), " c", "c ", 'c', "ingotCopper"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.copper_shears), "c ", " c", 'c', "ingotCopper"));
		}
		if (ConfigHandler.silver_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.silver_shears), " s", "s ", 's', "ingotSilver"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.silver_shears), "s ", " s", 's', "ingotSilver"));
		}
		if (ConfigHandler.tin_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.tin_shears), " t", "t ", 't', "ingotTin"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.tin_shears), "t ", " t", 't', "ingotTin"));
		}
		if (ConfigHandler.lead_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.lead_shears), " l", "l ", 'l', "ingotLead"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.lead_shears), "l ", " l", 'l', "ingotLead"));
		}
		if (ConfigHandler.steel_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.steel_shears), " s", "s ", 's', "ingotSteel"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.steel_shears), "s ", " s", 's', "ingotSteel"));
		}
		if (ConfigHandler.nickel_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.nickel_shears), " n", "n ", 'n', "ingotNickel"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.nickel_shears), "n ", " n", 'n', "ingotNickel"));
		}
		if (ConfigHandler.platinum_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.platinum_shears), " p", "p ", 'p', "ingotPlatinum"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.platinum_shears), "p ", " p", 'p', "ingotPlatinum"));
		}
		if (ConfigHandler.cold_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.cold_shears), " c", "c ", 'c', "ingotColdiron"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.cold_shears), "c ", " c", 'c', "ingotColdiron"));
		}
		if (ConfigHandler.mithril_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.mithril_shears), " m", "m ", 'm', "ingotMithril"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.mithril_shears), "m ", " m", 'm', "ingotMithril"));
		}
		if (ConfigHandler.star_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.star_shears), " s", "s ", 's', "ingotStarsteel"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.star_shears), "s ", " s", 's', "ingotStarsteel"));
		}
		if (ConfigHandler.bronze_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.bronze_shears), " b", "b ", 'b', "ingotBronze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.bronze_shears), "b ", " b", 'b', "ingotBronze"));
		}
		if (ConfigHandler.brass_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.brass_shears), " b", "b ", 'b', "ingotBrass"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.brass_shears), "b ", " b", 'b', "ingotBrass"));
		}
		if (ConfigHandler.electrum_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.electrum_shears), " e", "e ", 'e', "ingotElectrum"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.electrum_shears), "e ", " e", 'e', "ingotElectrum"));
		}
		if (ConfigHandler.invar_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.invar_shears), " i", "i ", 'i', "ingotInvar"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.invar_shears), "i ", " i", 'i', "ingotInvar"));
		}
		if (ConfigHandler.aquarium_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.aquarium_shears), " a", "a ", 'a', "ingotAquarium"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.aquarium_shears), "a ", " a", 'a', "ingotAquarium"));
		}
		if (ConfigHandler.adamantine_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.adamantine_shears), " a", "a ", 'a', "ingotAdamantine"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.adamantine_shears), "a ", " a", 'a', "ingotAdamantine"));
		}
		if (ConfigHandler.cupronickel_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.cupronickel_shears), " c", "c ", 'c', "ingotCupronickel"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.cupronickel_shears), "c ", " c", 'c', "ingotCupronickel"));
		}
		
		// IE
		if (ConfigHandler.immersiveAluminium_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.immersiveAluminium_shears), " a", "a ", 'a', "ingotAluminum"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.immersiveAluminium_shears), "a ", " a", 'a', "ingotAluminum"));
		}
		if (ConfigHandler.immersiveConstantan_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.immersiveConstantan_shears), " a", "a ", 'a', "ingotConstantan"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.immersiveConstantan_shears), "a ", " a", 'a', "ingotConstantan"));
		}
		if (ConfigHandler.immersiveUranium_shears){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.immersiveUranium_shears), " a", "a ", 'a', "ingotUranium"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.immersiveUranium_shears), "a ", " a", 'a', "ingotUranium"));
		}
		
		// Adamantium
		if (Loader.isModLoaded("adamantium")){
			if (ConfigHandler.adamantium_shears){
				GameRegistry.addShapedRecipe(new ItemStack(MoreItems.Adamantium_shears), new Object[] {" w", "w ", 'w', new ItemStack(AdaItems.adamantiumIngot)});
			}
		}
		
		// Taiga
		if (Loader.isModLoaded("taiga")){
			if (ConfigHandler.Abyssum_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Abyssum_shears), "www", " sw", " s ", 'w', "ingotAbyssum"));
			}
			if (ConfigHandler.Adamant_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Adamant_shears), "www", " sw", " s ", 'w', "ingotAdamant"));
			}
			if (ConfigHandler.Astrium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Astrium_shears), "www", " sw", " s ", 'w', "ingotAstrium"));
			}
			if (ConfigHandler.Aurorium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Aurorium_shears), "www", " sw", " s ", 'w', "ingotAurorium"));
			}
			if (ConfigHandler.Basalt_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Basalt_shears), "www", " sw", " s ", 'w', "ingotBasalt"));
			}
			if (ConfigHandler.Dilithium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Dilithium_shears), "www", " sw", " s ", 'w', "ingotDilithium"));
			}
			if (ConfigHandler.Duranite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Duranite_shears), "www", " sw", " s ", 'w', "ingotDuranite"));
			}
			if (ConfigHandler.Dyonite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Dyonite_shears), "www", " sw", " s ", 'w', "ingotDyonite"));
			}
			if (ConfigHandler.Eezo_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Eezo_shears), "www", " sw", " s ", 'w', "ingotEezo"));
			}
			if (ConfigHandler.Fractum_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Fractum_shears), "www", " sw", " s ", 'w', "ingotFractum"));
			}
			if (ConfigHandler.Ignitz_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Ignitz_shears), "www", " sw", " s ", 'w', "ingotIgnitz"));
			}
			if (ConfigHandler.Imperomite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Imperomite_shears), "www", " sw", " s ", 'w', "ingotImperomite"));
			}
			if (ConfigHandler.Iox_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Iox_shears), "www", " sw", " s ", 'w', "ingotIox"));
			}
			if (ConfigHandler.Jauxum_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Jauxum_shears), "www", " sw", " s ", 'w', "ingotJauxum"));
			}
			if (ConfigHandler.Karmesine_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Karmesine_shears), "www", " sw", " s ", 'w', "ingotKarmesine"));
			}
			if (ConfigHandler.Lumix_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Lumix_shears), "www", " sw", " s ", 'w', "ingotLumix"));
			}
			if (ConfigHandler.Meteorite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Meteorite_shears), "www", " sw", " s ", 'w', "ingotMeteorite"));
			}
			if (ConfigHandler.Nihilite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Nihilite_shears), "www", " sw", " s ", 'w', "ingotNihilite"));
			}
			if (ConfigHandler.Niob_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Niob_shears), "www", " sw", " s ", 'w', "ingotNiob"));
			}
			if (ConfigHandler.Nucleum_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Nucleum_shears), "www", " sw", " s ", 'w', "ingotNucleum"));
			}
			if (ConfigHandler.Obsidiorite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Obsidiorite_shears), "www", " sw", " s ", 'w', "ingotObsidiorite"));
			}
			if (ConfigHandler.Osram_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Osram_shears), "www", " sw", " s ", 'w', "ingotOsram"));
			}
			if (ConfigHandler.Ovium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Ovium_shears), "www", " sw", " s ", 'w', "ingotOvium"));
			}
			if (ConfigHandler.Palladium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Palladium_shears), "www", " sw", " s ", 'w', "ingotPalladium"));
			}
			if (ConfigHandler.Prometheum_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Prometheum_shears), "www", " sw", " s ", 'w', "ingotPrometheum"));
			}
			if (ConfigHandler.Proxii_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Proxii_shears), "www", " sw", " s ", 'w', "ingotProxii"));
			}
			if (ConfigHandler.Seismum_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Seismum_shears), "www", " sw", " s ", 'w', "ingotSeismum"));
			}
			if (ConfigHandler.Solarium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Solarium_shears), "www", " sw", " s ", 'w', "ingotSolarium"));
			}
			if (ConfigHandler.Terrax_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Terrax_shears), "www", " sw", " s ", 'w', "ingotTerrax"));
			}
			if (ConfigHandler.Tiberium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Tiberium_shears), "www", " sw", " s ", 'w', "ingotTiberium"));
			}
			if (ConfigHandler.Triberium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Triberium_shears), "www", " sw", " s ", 'w', "ingotTriberium"));
			}
			if (ConfigHandler.Tritonite_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Tritonite_shears), "www", " sw", " s ", 'w', "ingotTritonite"));
			}
			if (ConfigHandler.Uru_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Uru_shears), "www", " sw", " s ", 'w', "ingotUru"));
			}
			if (ConfigHandler.Valyrium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Valyrium_shears), "www", " sw", " s ", 'w', "ingotValyrium"));
			}
			if (ConfigHandler.Vibranium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Vibranium_shears), "www", " sw", " s ", 'w', "ingotVibranium"));
			}
			if (ConfigHandler.Violium_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Violium_shears), "www", " sw", " s ", 'w', "ingotViolium"));
			}
			if (ConfigHandler.Yrdeen_shears){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MoreItems.Yrdeen_shears), "www", " sw", " s ", 'w', "ingotYrdeen"));
			}
		}
	}

}
