package net.larson.larsons_mod_2025.sound;

import net.larson.larsons_mod_2025.Larsons_Mod_2025;
import net.minecraft.client.sound.AmbientSoundLoops;
import net.minecraft.client.sound.AmbientSoundPlayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent AMBIENT_RED_SOUNDS1 = registerSoundEvent("ambient_red_sounds1");
    public static final SoundEvent AMBIENT_BLUE_SOUNDS1 = registerSoundEvent("ambient_blue_sounds1");
    public static final SoundEvent AMBIENT_YELLOW_SOUNDS1 = registerSoundEvent("ambient_yellow_sounds1");

    private static SoundEvent registerSoundEvent(String name) {
        // Use Identifier.of correctly to create the Identifier instance
        Identifier id = Identifier.of(Larsons_Mod_2025.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        // Register sounds here, for example:
        Larsons_Mod_2025.LOGGER.info("Registering Sounds for " + Larsons_Mod_2025.MOD_ID);
    }
}