package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class BrassShears extends Shears {
	
    public BrassShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.brassDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("brassShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.BRASS + "_" + Names.INGOT));
    }
}