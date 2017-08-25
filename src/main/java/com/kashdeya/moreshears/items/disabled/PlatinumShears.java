package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class PlatinumShears extends Shears {
	
    public PlatinumShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.platinumDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("platinumShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.PLATINUM + "_" + Names.INGOT));
    }
}