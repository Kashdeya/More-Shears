package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class AquariumShears extends Shears {
	
    public AquariumShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.aquariumDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("aquariumShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.AQUARIUM + "_" + Names.INGOT));
    }
}