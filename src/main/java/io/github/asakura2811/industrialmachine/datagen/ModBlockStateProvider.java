package io.github.asakura2811.industrialmachine.datagen;

import io.github.asakura2811.industrialmachine.IndustrialMachine;
import io.github.asakura2811.industrialmachine.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, IndustrialMachine.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}