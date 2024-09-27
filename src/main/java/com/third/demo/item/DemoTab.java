package com.third.demo.item;

import com.third.demo.Demo;
import com.third.demo.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DemoTab {

    public static final DeferredRegister<CreativeModeTab> DEMO_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Demo.MODID);

    public static final RegistryObject<CreativeModeTab> BLOCK_TAB = DEMO_TAB.register("demo_block",
            ()->CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.REAL_GRASSBLOCK.get()))
                    .title(Component.translatable("creativetab.demo_block")).displayItems((displayParameters, output) ->{
                        output.accept(ModBlocks.REAL_GRASSBLOCK.get());
                    } ).build());
    public static final RegistryObject<CreativeModeTab> ITEM_TAB = DEMO_TAB.register("demo_item",
            ()->CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.DEMO_ICONS.get()))
                    .title(Component.translatable("creativetab.demo_item")).displayItems((displayParameters, output) ->{
                        output.accept(ModItems.DEMO_ICONS.get());
                        output.accept(ModItems.GOD_APPLE.get());
                    } ).build());

    public static void register(IEventBus eventBus)
    {
        DEMO_TAB.register(eventBus);
    }
}
