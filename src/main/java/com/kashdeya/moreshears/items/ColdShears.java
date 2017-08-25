package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class ColdShears extends Shears {
	
    public ColdShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.coldDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("coldShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.getItemByName(MaterialNames.COLDIRON + "_" + Names.INGOT));
    }
}