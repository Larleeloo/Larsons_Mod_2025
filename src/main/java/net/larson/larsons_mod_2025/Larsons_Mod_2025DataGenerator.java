package net.larson.larsons_mod_2025;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.larson.larsons_mod_2025.datagen.ModWorldGenerator;
import net.minecraft.registry.RegistryBuilder;

public class Larsons_Mod_2025DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModWorldGenerator::new);
	}


	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		/*registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, ModDimensions::bootstrapType);*/
	}
}
