package com.vidtdm_xd.create_drinks;

import com.vidtdm_xd.create_drinks.init.CreateDrinksBlocks;
import com.vidtdm_xd.create_drinks.init.CreateDrinksCreativeModeTabs;
import com.vidtdm_xd.create_drinks.init.CreateDrinksFluidTypes;
import com.vidtdm_xd.create_drinks.init.CreateDrinksFluids;
import com.vidtdm_xd.create_drinks.init.CreateDrinksItems;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateDrinks.MODID)
public class CreateDrinks {
    public static final String MODID = "create_drinks";

    public CreateDrinks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        CreateDrinksItems.REGISTRY.register(bus);
        CreateDrinksBlocks.REGISTRY.register(bus);
        CreateDrinksFluids.REGISTRY.register(bus);
        CreateDrinksFluidTypes.REGISTRY.register(bus);
        CreateDrinksCreativeModeTabs.REGISTRY.register(bus);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
