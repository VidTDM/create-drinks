package com.vidtdm_xd.create_drinks.block;

import com.vidtdm_xd.create_drinks.init.CreateDrinksFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class GlowBerryJuice extends LiquidBlock {
    public GlowBerryJuice() {
        super(() -> CreateDrinksFluids.GLOW_BERRY_JUICE.get(),
                BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(100f)
                        .noCollission()
                        .noLootTable()
                        .lightLevel((state) -> {
                            return 14;
                        })
                        .liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
    }
}
