package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class StarShears extends Shears {
	
    public StarShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.starDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("starShears");
    }

    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.getItemByName(MaterialNames.STARSTEEL + "_" + Names.INGOT));
    }
}