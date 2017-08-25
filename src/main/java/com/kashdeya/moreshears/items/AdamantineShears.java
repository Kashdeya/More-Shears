package com.kashdeya.moreshears.items;

import com.kashdeya.moreshears.handlers.ConfigHandler;
import com.kashdeya.moreshears.main.MoreShears;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

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
        return new ItemStack(Items.getItemByName(MaterialNames.ADAMANTINE + "_" + Names.INGOT));
    }
}