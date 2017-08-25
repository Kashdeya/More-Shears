package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import blusunrize.immersiveengineering.common.IEContent;
import net.minecraft.item.ItemStack;

public class ImmersiveAluminiumShears extends Shears {
	
    public ImmersiveAluminiumShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.immersiveAluminiumDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("immersiveAluminiumShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
    		return new ItemStack(IEContent.itemMetal, 1, 1);
    }
}