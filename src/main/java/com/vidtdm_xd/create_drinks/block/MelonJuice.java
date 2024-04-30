package com.vidtdm_xd.create_drinks.block;

import com.vidtdm_xd.create_drinks.init.CreateDrinksFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class MelonJuice extends LiquidBlock {
    public MelonJuice() {
        super(() -> CreateDrinksFluids.MELON_JUICE.get(),
                BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_NYLIUM).strength(100f)
                        .noCollission()
                        .noLootTable()
                        .liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
    }
}
