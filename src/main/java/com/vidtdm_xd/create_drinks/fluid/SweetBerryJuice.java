package com.vidtdm_xd.create_drinks.fluid;

import com.vidtdm_xd.create_drinks.init.CreateDrinksFluids;
import com.vidtdm_xd.create_drinks.init.CreateDrinksFluidTypes;
import com.vidtdm_xd.create_drinks.init.CreateDrinksBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class SweetBerryJuice extends ForgeFlowingFluid {
    public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CreateDrinksFluidTypes.SWEET_BERRY_JUICE_TYPE.get(), () -> CreateDrinksFluids.SWEET_BERRY_JUICE.get(),
            () -> CreateDrinksFluids.FLOWING_SWEET_BERRY_JUICE.get()).explosionResistance(100f)
            .block(() -> (LiquidBlock) CreateDrinksBlocks.SWEET_BERRY_JUICE.get());

    private SweetBerryJuice() {
        super(PROPERTIES);
    }

    public static class Source extends SweetBerryJuice {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends SweetBerryJuice {
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
