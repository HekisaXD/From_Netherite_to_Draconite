
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedraconiteore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thedraconiteore.item.RawDraconiteItem;
import net.mcreator.thedraconiteore.item.DraconiteSwordItem;
import net.mcreator.thedraconiteore.item.DraconiteShovelItem;
import net.mcreator.thedraconiteore.item.DraconitePickaxeItem;
import net.mcreator.thedraconiteore.item.DraconiteNuggetItem;
import net.mcreator.thedraconiteore.item.DraconiteItem;
import net.mcreator.thedraconiteore.item.DraconiteHoeItem;
import net.mcreator.thedraconiteore.item.DraconiteAxeItem;
import net.mcreator.thedraconiteore.item.DracArmorItem;
import net.mcreator.thedraconiteore.FromNetheriteToDraconiteMod;

public class FromNetheriteToDraconiteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FromNetheriteToDraconiteMod.MODID);
	public static final RegistryObject<Item> DRACONITE = REGISTRY.register("draconite", () -> new DraconiteItem());
	public static final RegistryObject<Item> DRACONITE_NUGGET = REGISTRY.register("draconite_nugget", () -> new DraconiteNuggetItem());
	public static final RegistryObject<Item> DRACONITE_SWORD = REGISTRY.register("draconite_sword", () -> new DraconiteSwordItem());
	public static final RegistryObject<Item> DRACONITE_AXE = REGISTRY.register("draconite_axe", () -> new DraconiteAxeItem());
	public static final RegistryObject<Item> DRACONITE_HOE = REGISTRY.register("draconite_hoe", () -> new DraconiteHoeItem());
	public static final RegistryObject<Item> DRACONITE_SHOVEL = REGISTRY.register("draconite_shovel", () -> new DraconiteShovelItem());
	public static final RegistryObject<Item> DRACONITE_PICKAXE = REGISTRY.register("draconite_pickaxe", () -> new DraconitePickaxeItem());
	public static final RegistryObject<Item> DRACONITE_ORE = block(FromNetheriteToDraconiteModBlocks.DRACONITE_ORE, FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB);
	public static final RegistryObject<Item> RAW_DRACONITE = REGISTRY.register("raw_draconite", () -> new RawDraconiteItem());
	public static final RegistryObject<Item> DRACONITE_BLOCK = block(FromNetheriteToDraconiteModBlocks.DRACONITE_BLOCK, FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB);
	public static final RegistryObject<Item> DRAC_ARMOR_HELMET = REGISTRY.register("drac_armor_helmet", () -> new DracArmorItem.Helmet());
	public static final RegistryObject<Item> DRAC_ARMOR_CHESTPLATE = REGISTRY.register("drac_armor_chestplate", () -> new DracArmorItem.Chestplate());
	public static final RegistryObject<Item> DRAC_ARMOR_LEGGINGS = REGISTRY.register("drac_armor_leggings", () -> new DracArmorItem.Leggings());
	public static final RegistryObject<Item> DRAC_ARMOR_BOOTS = REGISTRY.register("drac_armor_boots", () -> new DracArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
