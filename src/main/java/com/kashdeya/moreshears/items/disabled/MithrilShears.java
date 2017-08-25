package com.kashdeya.moreshears.items.disabled;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.items.Shears;
import com.kashdeya.moreshears.main.MoreShears;

import net.minecraft.item.ItemStack;

public class MithrilShears extends Shears {
	
    public MithrilShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.mithrilDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("mithrilShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
		return ItemStack.EMPTY;
//        return new ItemStack(Items.getItemByName(MaterialNames.MITHRIL + "_" + Names.INGOT));
    }
}