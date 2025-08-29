package io.github.asakura2811.industrialmachine.datagen;

import io.github.asakura2811.industrialmachine.IndustrialMachine;
import io.github.asakura2811.industrialmachine.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, IndustrialMachine.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get());

    }
}