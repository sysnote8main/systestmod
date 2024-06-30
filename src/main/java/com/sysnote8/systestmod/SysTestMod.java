package com.sysnote8.systestmod;

import com.sysnote8.systestmod.manager.BlockManager;
import com.sysnote8.systestmod.manager.BlockEntityManager;
import com.sysnote8.systestmod.manager.GuiManager;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SysTestMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Tags.MOD_ID);

	@Override
	public void onInitialize() {
		BlockManager.init();
		BlockEntityManager.init();
		GuiManager.init();
	}
}