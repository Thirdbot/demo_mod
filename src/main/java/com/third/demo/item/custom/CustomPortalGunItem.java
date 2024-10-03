package com.third.demo.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

import java.util.Properties;

public class CustomPortalGunItem extends Item {
    public CustomPortalGunItem(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        //Gui open up
        return super.useOn(pContext);
    }
}
