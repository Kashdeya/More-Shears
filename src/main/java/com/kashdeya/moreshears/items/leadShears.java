package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import blusunrize.immersiveengineering.common.IEContent;
import net.minecraft.item.ItemStack;

public class LeadShears extends Shears {
	
    public LeadShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.leadDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("leadShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(IEContent.itemMetal, 1, 2);
    }
}