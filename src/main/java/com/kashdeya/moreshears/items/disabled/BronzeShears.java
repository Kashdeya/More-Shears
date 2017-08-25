package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class BronzeShears extends Shears {
	
    public BronzeShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.bronzeDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("bronzeShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.BRONZE + "_" + Names.INGOT));
    }
}