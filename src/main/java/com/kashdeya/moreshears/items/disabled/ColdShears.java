package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class ColdShears extends Shears {
	
    public ColdShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.coldDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("coldShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.COLDIRON + "_" + Names.INGOT));
    }
}