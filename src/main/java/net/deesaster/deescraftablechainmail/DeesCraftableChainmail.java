package net.deesaster.deescraftablechainmail;

import net.deesaster.deescraftablechainmail.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class DeesCraftableChainmail implements ModInitializer {
	public static final String MOD_ID = "deescraftablechainmail";

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
