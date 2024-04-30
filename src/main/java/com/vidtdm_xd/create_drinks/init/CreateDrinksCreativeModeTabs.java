package com.vidtdm_xd.create_drinks.init;

import com.vidtdm_xd.create_drinks.CreateDrinks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.item.Item;

public class CreateDrinksCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, CreateDrinks.MODID);

    public static final RegistryObject<CreativeModeTab> CREATE_DRINKS_TAB = REGISTRY.register("create_drinks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CreateDrinksItems.APPLE_JUICE_BOTTLE.get()))
                    .title(Component.translatable("creativetab.create_drinks.create_drinks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (RegistryObject<Item> item : CreateDrinksItems.REGISTRY.getEntries()) {
                            output.accept(item.get());
                        }
                    }).build());

    public static void register(IEventBus bus) {
        REGISTRY.register(bus);
    }
}
