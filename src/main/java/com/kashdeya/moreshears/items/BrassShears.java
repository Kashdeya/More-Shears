package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

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
        return new ItemStack(Items.getItemByName(MaterialNames.BRASS + "_" + Names.INGOT));
    }
}