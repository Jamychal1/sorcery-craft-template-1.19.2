package com.goat;

import com.goat.primary.ModItems;
import com.goat.setup.ModStatusEffect;
import com.goat.setup.ModdedAttributes;
import com.goat.setup.ModdedEffects;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class SorceryCraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("sorcery-craft");
	public static final String MOD_ID = "sorcery-craft";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModdedAttributes.registerAttributes();
		//ModdedEffects.registerEffects();


		GeckoLib.initialize();

		LOGGER.info("Hello Fabric world!");
	}
}