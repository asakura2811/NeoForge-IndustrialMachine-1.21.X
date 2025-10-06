package io.github.asakura2811.industrialmachine;

import com.mojang.logging.LogUtils;
import io.github.asakura2811.industrialmachine.block.ModBlocks;
import io.github.asakura2811.industrialmachine.block.entity.ModBlockEntities;
import io.github.asakura2811.industrialmachine.capability.ModCapabilities;
import io.github.asakura2811.industrialmachine.item.ModCreativeModeTabs;
import io.github.asakura2811.industrialmachine.item.ModItems;
import io.github.asakura2811.industrialmachine.recipe.ModRecipes;
import io.github.asakura2811.industrialmachine.screen.ModMenuTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(IndustrialMachine.MOD_ID)
public class IndustrialMachine {
    public static final String MOD_ID = "industrialmachine";

    public static final Logger LOGGER = LogUtils.getLogger();

    public IndustrialMachine(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(ModCapabilities::register);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
