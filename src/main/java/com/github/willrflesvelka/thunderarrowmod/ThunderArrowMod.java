package com.github.willrflesvelka.thunderarrowmod;

import com.github.willrflesvelka.thunderarrowmod.block.ModBlocks;
import com.github.willrflesvelka.thunderarrowmod.item.ModItemGroups;
import com.github.willrflesvelka.thunderarrowmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThunderArrowMod implements ModInitializer {
	public static final String MOD_ID = "thunderarrowmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}