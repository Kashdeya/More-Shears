package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DiamondShears extends Shears {
	
    public DiamondShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.diamondDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("diamondShears");
    }
    
    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.DIAMOND);
    }
}