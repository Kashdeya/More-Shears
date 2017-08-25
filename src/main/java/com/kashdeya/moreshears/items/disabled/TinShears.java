package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class TinShears extends Shears {
	
    public TinShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.tinDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("tinShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
    		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.TIN + "_" + Names.INGOT));
    }
}