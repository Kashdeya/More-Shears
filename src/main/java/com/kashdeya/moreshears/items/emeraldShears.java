package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EmeraldShears extends Shears {
	
    public EmeraldShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.emeraldDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("emeraldShears");
    }
    
    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.EMERALD);
    }
}