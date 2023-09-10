
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedraconiteore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.thedraconiteore.world.features.ores.DraconiteOreFeature;
import net.mcreator.thedraconiteore.TheDraconiteOreMod;

@Mod.EventBusSubscriber
public class TheDraconiteOreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheDraconiteOreMod.MODID);
	public static final RegistryObject<Feature<?>> DRACONITE_ORE = REGISTRY.register("draconite_ore", DraconiteOreFeature::feature);
}
