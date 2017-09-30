package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class stoneShears extends Shears {
	
    public stoneShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.stoneDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("stoneShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Blocks.STONE);
    }
}