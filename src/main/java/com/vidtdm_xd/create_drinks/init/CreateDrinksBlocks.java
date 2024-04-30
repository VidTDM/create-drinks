package com.vidtdm_xd.create_drinks.init;

import com.vidtdm_xd.create_drinks.block.AppleJuice;
import com.vidtdm_xd.create_drinks.block.CarrotJuice;
import com.vidtdm_xd.create_drinks.block.ChorusFruitJuice;
import com.vidtdm_xd.create_drinks.block.GlowBerryJuice;
import com.vidtdm_xd.create_drinks.block.MelonJuice;
import com.vidtdm_xd.create_drinks.block.SugarcaneJuice;
import com.vidtdm_xd.create_drinks.block.SweetBerryJuice;
import com.vidtdm_xd.create_drinks.CreateDrinks;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CreateDrinksBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS,
            CreateDrinks.MODID);

    public static final RegistryObject<Block> APPLE_JUICE = REGISTRY.register("apple_juice",
            () -> new AppleJuice());
    public static final RegistryObject<Block> CARROT_JUICE = REGISTRY.register("carrot_juice",
            () -> new CarrotJuice());
    public static final RegistryObject<Block> GLOW_BERRY_JUICE = REGISTRY.register("glow_berry_juice",
            () -> new GlowBerryJuice());
    public static final RegistryObject<Block> SWEET_BERRY_JUICE = REGISTRY.register("sweet_berry_juice",
            () -> new SweetBerryJuice());
    public static final RegistryObject<Block> SUGARCANE_JUICE = REGISTRY.register("sugarcane_juice",
            () -> new SugarcaneJuice());
    public static final RegistryObject<Block> MELON_JUICE = REGISTRY.register("melon_juice",
            () -> new MelonJuice());
    public static final RegistryObject<Block> CHORUS_FRUIT_JUICE = REGISTRY.register("chorus_fruit_juice",
            () -> new ChorusFruitJuice());
}