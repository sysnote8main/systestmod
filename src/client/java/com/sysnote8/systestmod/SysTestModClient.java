package com.sysnote8.systestmod;

import com.sysnote8.systestmod.client.screen.SimpleMachineScreen;
import com.sysnote8.systestmod.client.util.SysTestKeybinds;
import com.sysnote8.systestmod.gui.SimpleMachineGui;
import com.sysnote8.systestmod.manager.GuiManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class SysTestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// === Keybinds
		SysTestKeybinds.init();
		ClientTickEvents.END_CLIENT_TICK.register(SysTestKeybinds::onClientTick);

		// === Gui Handlers
		HandledScreens.<SimpleMachineGui, SimpleMachineScreen>register(
				GuiManager.SCREEN_HANDLER_TYPE,
				(gui, inv, title) -> new SimpleMachineScreen(gui, inv.player, title)
		);
	}
}