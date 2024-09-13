package net.larson.larsons_mod_2025;

import net.fabricmc.api.ModInitializer;
import net.larson.larsons_mod_2025.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Larsons_Mod_2025 implements ModInitializer {
	public static final String MOD_ID = "larsons_mod_2025";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
	}
}