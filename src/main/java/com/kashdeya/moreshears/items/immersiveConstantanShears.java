package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import blusunrize.immersiveengineering.common.IEContent;
import net.minecraft.item.ItemStack;

public class ImmersiveConstantanShears extends Shears {
	
    public ImmersiveConstantanShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.immersiveConstantanDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("immersiveConstantanShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(IEContent.itemMetal, 1, 6);
    }
}