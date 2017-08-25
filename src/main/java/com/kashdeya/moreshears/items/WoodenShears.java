package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class WoodenShears extends Shears {
	
    public WoodenShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.woodenDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("woodenShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Blocks.PLANKS);
    }
}