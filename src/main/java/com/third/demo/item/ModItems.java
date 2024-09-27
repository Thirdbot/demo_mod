package com.third.demo.item;

import com.third.demo.Demo;
import com.third.demo.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
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

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> GOD_APPLE = ITEMS.register("god_apple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build())));


}
