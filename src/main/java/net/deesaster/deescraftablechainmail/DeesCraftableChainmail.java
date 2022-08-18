package net.deesaster.deescraftablechainmail;

import net.deesaster.deescraftablechainmail.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeesCraftableChainmail implements ModInitializer {
	public static final String MOD_ID = "deescraftablechainmail";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Chainmail is now craftable");
	}
}
