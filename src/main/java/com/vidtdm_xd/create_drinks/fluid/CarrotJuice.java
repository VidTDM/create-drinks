package com.vidtdm_xd.create_drinks.fluid;

import com.vidtdm_xd.create_drinks.init.CreateDrinksFluids;
import com.vidtdm_xd.create_drinks.init.CreateDrinksFluidTypes;
import com.vidtdm_xd.create_drinks.init.CreateDrinksBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class CarrotJuice extends ForgeFlowingFluid {
    public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CreateDrinksFluidTypes.CARROT_JUICE_TYPE.get(), () -> CreateDrinksFluids.CARROT_JUICE.get(),
            () -> CreateDrinksFluids.FLOWING_CARROT_JUICE.get()).explosionResistance(100f)
            .block(() -> (LiquidBlock) CreateDrinksBlocks.CARROT_JUICE.get());

    private CarrotJuice() {
        super(PROPERTIES);
    }

    public static class Source extends CarrotJuice {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends CarrotJuice {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}
