package com.third.demo.item;

import com.third.demo.Demo;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //create static instance from interface DeferrendRegister for ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Demo.MODID);



    //Register Bus for items
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    //Item Properties

    public static final RegistryObject<Item> DEMO_ICONS = ITEMS.register("demo_icons", () -> new Item(new Item.Properties()));


}
