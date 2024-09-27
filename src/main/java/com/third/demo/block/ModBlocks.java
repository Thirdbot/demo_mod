package com.third.demo.block;

import com.third.demo.Demo;
import com.third.demo.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Demo.MODID);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> ToReTurn = BLOCKS.register(name,block);
        registerBlockItem(name,ToReTurn);
        return ToReTurn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

    // Creates a new Block with the id "demo:example_block", combining the namespace and path
    public static final RegistryObject<Block> REAL_GRASSBLOCK = registerBlock("real_grassblock", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));







}
