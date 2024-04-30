package com.vidtdm_xd.create_drinks.block;

import com.vidtdm_xd.create_drinks.init.CreateDrinksFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class ChorusFruitJuice extends LiquidBlock {
    public ChorusFruitJuice() {
        super(() -> CreateDrinksFluids.CHORUS_FRUIT_JUICE.get(),
                BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(100f)
                        .noCollission()
                        .noLootTable()
                        .liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
    }
}
