package io.github.asakura2811.industrialmachine.item;

import io.github.asakura2811.industrialmachine.IndustrialMachine;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IndustrialMachine.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_DUST = ITEMS.register("tin_dust",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}