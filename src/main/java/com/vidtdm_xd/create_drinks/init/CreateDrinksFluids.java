package com.vidtdm_xd.create_drinks.init;

import com.vidtdm_xd.create_drinks.CreateDrinks;
import com.vidtdm_xd.create_drinks.fluid.AppleJuice;
import com.vidtdm_xd.create_drinks.fluid.CarrotJuice;
import com.vidtdm_xd.create_drinks.fluid.ChorusFruitJuice;
import com.vidtdm_xd.create_drinks.fluid.GlowBerryJuice;
import com.vidtdm_xd.create_drinks.fluid.MelonJuice;
import com.vidtdm_xd.create_drinks.fluid.SugarcaneJuice;
import com.vidtdm_xd.create_drinks.fluid.SweetBerryJuice;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class CreateDrinksFluids {
    public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS,
            CreateDrinks.MODID);

    public static final RegistryObject<FlowingFluid> APPLE_JUICE = REGISTRY.register(
            "apple_juice",
            () -> new AppleJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_APPLE_JUICE = REGISTRY.register(
            "flowing_apple_juice",
            () -> new AppleJuice.Flowing());
    /* -------------------------------------------------------------------------- */
    public static final RegistryObject<FlowingFluid> CARROT_JUICE = REGISTRY.register(
            "carrot_juice",
            () -> new CarrotJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_CARROT_JUICE = REGISTRY.register(
            "flowing_carrot_juice",
            () -> new CarrotJuice.Flowing());
    /* -------------------------------------------------------------------------- */
    public static final RegistryObject<FlowingFluid> GLOW_BERRY_JUICE = REGISTRY.register(
            "glow_berry_juice",
            () -> new GlowBerryJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_GLOW_BERRY_JUICE = REGISTRY.register(
            "flowing_glow_berry_juice",
            () -> new GlowBerryJuice.Flowing());
    /* -------------------------------------------------------------------------- */
    public static final RegistryObject<FlowingFluid> SWEET_BERRY_JUICE = REGISTRY.register(
            "sweet_berry_juice",
            () -> new SweetBerryJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_SWEET_BERRY_JUICE = REGISTRY.register(
            "flowing_sweet_berry_juice",
            () -> new SweetBerryJuice.Flowing());
    /* -------------------------------------------------------------------------- */
    public static final RegistryObject<FlowingFluid> SUGARCANE_JUICE = REGISTRY.register(
            "sugarcane_juice",
            () -> new SugarcaneJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_SUGARCANE_JUICE = REGISTRY.register(
            "flowing_sugarcane_juice",
            () -> new SugarcaneJuice.Flowing());
    /* -------------------------------------------------------------------------- */
    public static final RegistryObject<FlowingFluid> MELON_JUICE = REGISTRY.register(
            "melon_juice",
            () -> new MelonJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_MELON_JUICE = REGISTRY.register(
            "flowing_melon_juice",
            () -> new MelonJuice.Flowing());
    /* -------------------------------------------------------------------------- */
    public static final RegistryObject<FlowingFluid> CHORUS_FRUIT_JUICE = REGISTRY.register(
            "chorus_fruit_juice",
            () -> new ChorusFruitJuice.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_CHORUS_FRUIT_JUICE = REGISTRY.register(
            "flowing_chorus_fruit_juice",
            () -> new ChorusFruitJuice.Flowing());

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(APPLE_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_APPLE_JUICE.get(), RenderType.translucent());
            /* -------------------------------------------------------------------------- */
            ItemBlockRenderTypes.setRenderLayer(CARROT_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_CARROT_JUICE.get(), RenderType.translucent());
            /* -------------------------------------------------------------------------- */
            ItemBlockRenderTypes.setRenderLayer(GLOW_BERRY_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_GLOW_BERRY_JUICE.get(), RenderType.translucent());
            /* -------------------------------------------------------------------------- */
            ItemBlockRenderTypes.setRenderLayer(SWEET_BERRY_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_SWEET_BERRY_JUICE.get(), RenderType.translucent());
            /* -------------------------------------------------------------------------- */
            ItemBlockRenderTypes.setRenderLayer(SUGARCANE_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_SUGARCANE_JUICE.get(), RenderType.translucent());
            /* -------------------------------------------------------------------------- */
            ItemBlockRenderTypes.setRenderLayer(MELON_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_MELON_JUICE.get(), RenderType.translucent());
            /* -------------------------------------------------------------------------- */
            ItemBlockRenderTypes.setRenderLayer(CHORUS_FRUIT_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_CHORUS_FRUIT_JUICE.get(), RenderType.translucent());
        }
    }
}