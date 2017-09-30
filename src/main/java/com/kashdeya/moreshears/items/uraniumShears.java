package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import blusunrize.immersiveengineering.common.IEContent;
import net.minecraft.item.ItemStack;

public class uraniumShears extends Shears {
	
    public uraniumShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.immersiveUraniumDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("uraniumShears");
    }
    
    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(IEContent.itemMetal, 1, 5);
    }
}