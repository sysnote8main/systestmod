package com.sysnote8.systestmod;

import com.sysnote8.systestmod.client.util.SysTestKeybinds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class SysTestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		SysTestKeybinds.init();

		ClientTickEvents.END_CLIENT_TICK.register(SysTestKeybinds::onClientTick);
	}
}