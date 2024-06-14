package net.stormyz.bronzite;

import net.fabricmc.api.ModInitializer;

import net.stormyz.bronzite.block.ModBlocks;
import net.stormyz.bronzite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bronzite implements ModInitializer {

	public  static final String MOD_ID = "bronzite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}