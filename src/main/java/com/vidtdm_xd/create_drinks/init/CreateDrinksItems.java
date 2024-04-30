package com.vidtdm_xd.create_drinks.init;

import com.vidtdm_xd.create_drinks.item.AppleJuiceBottle;
import com.vidtdm_xd.create_drinks.item.CarrotJuiceBottle;
import com.vidtdm_xd.create_drinks.item.ChorusFruitJuiceBottle;
import com.vidtdm_xd.create_drinks.item.GlowBerryJuiceBottle;
import com.vidtdm_xd.create_drinks.item.MelonJuiceBottle;
import com.vidtdm_xd.create_drinks.item.SugarcaneJuiceBottle;
import com.vidtdm_xd.create_drinks.item.SweetBerryJuiceBottle;
import com.vidtdm_xd.create_drinks.CreateDrinks;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class CreateDrinksItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS,
            CreateDrinks.MODID);

    public static final RegistryObject<Item> APPLE_JUICE_BOTTLE = REGISTRY.register(
            "apple_juice_bottle", () -> new AppleJuiceBottle());
    public static final RegistryObject<Item> CARROT_JUICE_BOTTLE = REGISTRY.register(
            "carrot_juice_bottle", () -> new CarrotJuiceBottle());
    public static final RegistryObject<Item> GLOW_BERRY_JUICE_BOTTLE = REGISTRY.register(
            "glow_berry_juice_bottle", () -> new GlowBerryJuiceBottle());
    public static final RegistryObject<Item> SWEET_BERRY_JUICE_BOTTLE = REGISTRY.register(
            "sweet_berry_juice_bottle", () -> new SweetBerryJuiceBottle());
    public static final RegistryObject<Item> SUGARCANE_JUICE_BOTTLE = REGISTRY.register(
            "sugarcane_juice_bottle", () -> new SugarcaneJuiceBottle());
    public static final RegistryObject<Item> MELON_JUICE_BOTTLE = REGISTRY.register(
            "melon_juice_bottle", () -> new MelonJuiceBottle());
    public static final RegistryObject<Item> CHORUS_FRUIT_JUICE_BOTTLE = REGISTRY.register(
            "chorus_fruit_juice_bottle", () -> new ChorusFruitJuiceBottle());
}
