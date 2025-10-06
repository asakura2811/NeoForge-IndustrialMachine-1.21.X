package io.github.asakura2811.industrialmachine.datagen;


import io.github.asakura2811.industrialmachine.IndustrialMachine;
import io.github.asakura2811.industrialmachine.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IndustrialMachine.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.TIN_DUST.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.BRONZE_DUST.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.IRON_DUST.get());
        basicItem(ModItems.GOLD_DUST.get());
        basicItem(ModItems.COPPER_DUST.get());
    }
}