package com.kashdeya.moreshears.proxy;

import com.kashdeya.moreshears.recipes.Recipes;

public class CommonProxy {

    public void init() {
    	// Recipes
    	Recipes.registerRecipes();
    }
    
	public void registerRenderers() {
		//unused - only called clientside
	}

}
