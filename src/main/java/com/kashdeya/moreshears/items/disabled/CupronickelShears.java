package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class CupronickelShears extends Shears {
	
    public CupronickelShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.cupronickelDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("cupronickelShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.CUPRONICKEL + "_" + Names.INGOT));
    }
}