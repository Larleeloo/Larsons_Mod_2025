package net.larson.larsons_mod_2025;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.larson.larsons_mod_2025.sound.ModSounds;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Larsons_Mod_2025 implements ModInitializer {
	public static final String MOD_ID = "larsons_mod_2025";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.BOOKSHELF)
				.lightWithItem(Items.GOLDEN_SWORD)
				.destDimID(Identifier.of(Larsons_Mod_2025.MOD_ID,"kaupendim2"))
				.tintColor(0xc76efa)
				.registerPortal();
	}
}