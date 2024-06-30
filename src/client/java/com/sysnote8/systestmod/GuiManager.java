package com.sysnote8.systestmod;

import com.sysnote8.systestmod.client.gui.HelloWorldGui;
import com.sysnote8.systestmod.client.screen.HelloWorldScreen;
import net.minecraft.client.MinecraftClient;

public class GuiManager {
    public static void open() {
        MinecraftClient.getInstance().setScreen(new HelloWorldScreen(new HelloWorldGui()));
    }
}
