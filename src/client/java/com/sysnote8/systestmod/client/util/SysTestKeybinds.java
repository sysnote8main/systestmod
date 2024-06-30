package com.sysnote8.systestmod.client.util;

import com.sysnote8.systestmod.client.gui.HelloWorldGui;
import com.sysnote8.systestmod.client.screen.HelloWorldScreen;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class SysTestKeybinds {
    private static final String GENERAL_CATEGORY = "systestmod.key.category.general";
    private static KeyBinding OPEN_TEST_GUI;

    public static void init() {
        OPEN_TEST_GUI = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "systestmod.key.open_test_gui",
                GLFW.GLFW_KEY_UNKNOWN,
                GENERAL_CATEGORY
        ));
    }

    public static void onClientTick(MinecraftClient client) {
        while(OPEN_TEST_GUI.wasPressed()) {
            client.setScreen(new HelloWorldScreen(new HelloWorldGui()));
        }
    }
}
