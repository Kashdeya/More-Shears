package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class InvarShears extends Shears {
	
    public InvarShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.invarDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("invarShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.INVAR + "_" + Names.INGOT));
    }
}