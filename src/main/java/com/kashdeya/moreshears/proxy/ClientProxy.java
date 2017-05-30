package com.kashdeya.moreshears.proxy;

import com.kashdeya.moreshears.handlers.RenderHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        // Renders
        RenderHandler.init_shears();
    }
  
}
