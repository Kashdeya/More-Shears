package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import blusunrize.immersiveengineering.common.IEContent;
import net.minecraft.item.ItemStack;

public class nickelShears extends Shears {
	
    public nickelShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.immersiveNickelDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("nickelShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(IEContent.itemMetal, 1, 4);
    }
}