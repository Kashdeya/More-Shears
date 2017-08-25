package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FlintShears extends Shears {
	
    public FlintShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.flintDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("flintShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.FLINT);
    }
}