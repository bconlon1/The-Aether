package com.gildedgames.aether.block.utility;

import com.gildedgames.aether.blockentity.SkyrootBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;

import javax.annotation.Nonnull;

public class SkyrootBedBlock extends BedBlock
{
    public SkyrootBedBlock(Properties properties) {
        super(DyeColor.CYAN, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false));
    }

    @Override
    public BlockEntity newBlockEntity(@Nonnull BlockPos pos, @Nonnull BlockState state) {
        return new SkyrootBedBlockEntity(pos, state);
    }
}

