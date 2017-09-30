package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import blusunrize.immersiveengineering.common.IEContent;
import net.minecraft.item.ItemStack;

public class copperShears extends Shears {
	
    public copperShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.immersiveCopperDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("copperShears");
    }
    
    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(IEContent.itemMetal, 1, 0);
    }
}