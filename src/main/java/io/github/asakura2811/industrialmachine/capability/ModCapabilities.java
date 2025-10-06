package io.github.asakura2811.industrialmachine.capability;

import io.github.asakura2811.industrialmachine.block.entity.CrusherBlockEntity;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

public class ModCapabilities {
    public static void register(RegisterCapabilitiesEvent event) {
        CrusherBlockEntity.onCapabilitiesRegister(event);
    }
}
