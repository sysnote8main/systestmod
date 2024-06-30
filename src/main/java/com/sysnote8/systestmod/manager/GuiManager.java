package com.sysnote8.systestmod.manager;

import com.sysnote8.systestmod.gui.SimpleMachineGui;
import com.sysnote8.systestmod.util.STUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;

public class GuiManager {
    public static ScreenHandlerType<SimpleMachineGui> SCREEN_HANDLER_TYPE;
    public static void init() {
        SCREEN_HANDLER_TYPE = Registry.register(
                Registries.SCREEN_HANDLER,
                STUtil.id("helloworld_machine_block"),
                new ScreenHandlerType<>(
                        (syncId, inv) -> new SimpleMachineGui(syncId, inv, ScreenHandlerContext.EMPTY),
                        FeatureFlags.VANILLA_FEATURES
                )
        );
    }
}
