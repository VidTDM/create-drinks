package com.vidtdm_xd.create_drinks.init;

import com.vidtdm_xd.create_drinks.fluid.types.AppleJuiceType;
import com.vidtdm_xd.create_drinks.fluid.types.CarrotJuiceType;
import com.vidtdm_xd.create_drinks.fluid.types.ChorusFruitJuiceType;
import com.vidtdm_xd.create_drinks.fluid.types.GlowBerryJuiceType;
import com.vidtdm_xd.create_drinks.fluid.types.MelonJuiceType;
import com.vidtdm_xd.create_drinks.fluid.types.SugarcaneJuiceType;
import com.vidtdm_xd.create_drinks.fluid.types.SweetBerryJuiceType;
import com.vidtdm_xd.create_drinks.CreateDrinks;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class CreateDrinksFluidTypes {
    public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES,
            CreateDrinks.MODID);

    public static final RegistryObject<FluidType> APPLE_JUICE_TYPE = REGISTRY.register("apple_juice",
            () -> new AppleJuiceType());
    public static final RegistryObject<FluidType> CARROT_JUICE_TYPE = REGISTRY.register("carrot_juice",
            () -> new CarrotJuiceType());
    public static final RegistryObject<FluidType> GLOW_BERRY_JUICE_TYPE = REGISTRY.register("glow_berry_juice",
            () -> new GlowBerryJuiceType());
    public static final RegistryObject<FluidType> SWEET_BERRY_JUICE_TYPE = REGISTRY.register("sweet_berry_juice",
            () -> new SweetBerryJuiceType());
    public static final RegistryObject<FluidType> SUGARCANE_JUICE_TYPE = REGISTRY.register("sugarcane_juice",
            () -> new SugarcaneJuiceType());
    public static final RegistryObject<FluidType> MELON_JUICE_TYPE = REGISTRY.register("melon_juice",
            () -> new MelonJuiceType());
    public static final RegistryObject<FluidType> CHORUS_FRUIT_JUICE_TYPE = REGISTRY.register("chorus_fruit_juice",
            () -> new ChorusFruitJuiceType());
}