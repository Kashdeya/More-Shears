package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class SteelShears extends Shears {
	
    public SteelShears()
    {
    		this.maxStackSize = 1;
    		this.setMaxDamage(ConfigHandler.silverDamage);
    		this.setCreativeTab(MoreShears.tabItems);
    		this.setUnlocalizedName("steelShears");
    }
    
    @Override
    public ItemStack getRepairMaterial()
    {
        return new ItemStack(Items.getItemByName(MaterialNames.STEEL + "_" + Names.INGOT));
    }
}