package com.kashdeya.moreshears.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabItems extends CreativeTabs {

	public TabItems(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.SHEARS;
	}

}