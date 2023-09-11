
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedraconiteore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thedraconiteore.block.DraconiteOreBlock;
import net.mcreator.thedraconiteore.block.DraconiteBlockBlock;
import net.mcreator.thedraconiteore.FromNetheriteToDraconiteMod;

public class FromNetheriteToDraconiteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FromNetheriteToDraconiteMod.MODID);
	public static final RegistryObject<Block> DRACONITE_ORE = REGISTRY.register("draconite_ore", () -> new DraconiteOreBlock());
	public static final RegistryObject<Block> DRACONITE_BLOCK = REGISTRY.register("draconite_block", () -> new DraconiteBlockBlock());
}
