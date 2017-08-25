package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class PlatinumShears extends Shears {
	
    public PlatinumShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.platinumDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("platinumShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.getItemByName(MaterialNames.PLATINUM + "_" + Names.INGOT));
    }
}