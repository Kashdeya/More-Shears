package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class StarShears extends Shears {
	
    public StarShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.starDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("starShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.STARSTEEL + "_" + Names.INGOT));
    }
}