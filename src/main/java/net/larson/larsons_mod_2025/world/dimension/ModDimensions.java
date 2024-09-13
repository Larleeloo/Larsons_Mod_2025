package net.larson.larsons_mod_2025.world.dimension;

import net.larson.larsons_mod_2025.Larsons_Mod_2025;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {

    public static final RegistryKey<DimensionOptions> KAUPENDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(Larsons_Mod_2025.MOD_ID, "kaupendim"));
    public static final RegistryKey<World> KAUPENDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(Larsons_Mod_2025.MOD_ID, "kaupendim"));
    public static final RegistryKey<DimensionType> KAUPEN_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(Larsons_Mod_2025.MOD_ID, "kaupendim_type"));

/*    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(KAUPEN_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }*/

}
