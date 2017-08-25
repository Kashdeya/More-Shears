package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class AdamantineShears extends Shears {
	
    public AdamantineShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.adamantineDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("adamantineShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.ADAMANTINE + "_" + Names.INGOT));
    }
}