package com.sysnote8.systestmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SysTestMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Tags.MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}