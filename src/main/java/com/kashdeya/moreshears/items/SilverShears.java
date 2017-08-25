package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class SilverShears extends Shears {
	
    public SilverShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.silverDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("silverShears");
    }
    
    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.getItemByName(MaterialNames.SILVER + "_" + Names.INGOT));
    }
}