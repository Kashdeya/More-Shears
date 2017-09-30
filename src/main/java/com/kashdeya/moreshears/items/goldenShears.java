package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class goldenShears extends Shears {
	
    public goldenShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.goldenDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("goldenShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.GOLD_INGOT);
    }
}