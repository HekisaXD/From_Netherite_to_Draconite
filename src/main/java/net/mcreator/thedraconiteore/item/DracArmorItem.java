
package net.mcreator.thedraconiteore.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thedraconiteore.init.FromNetheriteToDraconiteModTabs;
import net.mcreator.thedraconiteore.init.FromNetheriteToDraconiteModItems;

public abstract class DracArmorItem extends ArmorItem {
	public DracArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 40;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FromNetheriteToDraconiteModItems.DRACONITE.get()));
			}

			@Override
			public String getName() {
				return "drac_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DracArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "from_netherite_to_draconite:textures/models/armor/draconite__layer_1.png";
		}
	}

	public static class Chestplate extends DracArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "from_netherite_to_draconite:textures/models/armor/draconite__layer_1.png";
		}
	}

	public static class Leggings extends DracArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "from_netherite_to_draconite:textures/models/armor/draconite__layer_2.png";
		}
	}

	public static class Boots extends DracArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "from_netherite_to_draconite:textures/models/armor/draconite__layer_1.png";
		}
	}
}
