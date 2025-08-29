package io.github.asakura2811.industrialmachine.item;

import io.github.asakura2811.industrialmachine.IndustrialMachine;
import io.github.asakura2811.industrialmachine.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndustrialMachine.MOD_ID);

    public static final Supplier<CreativeModeTab> INDUSTRIALMACHINE_TAB = CREATIVE_MODE_TAB.register("industrialmachine_tab",() -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.TIN_INGOT.get()))
            .title(Component.translatable("creativetab.industrialmachine.industrialmachine_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.TIN_INGOT);
                output.accept(ModItems.RAW_TIN);
                output.accept(ModItems.TIN_DUST);
                output.accept(ModBlocks.TIN_BLOCK);
                output.accept(ModBlocks.RAW_TIN_BLOCK);
                output.accept(ModBlocks.TIN_ORE);
                output.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            }).build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
