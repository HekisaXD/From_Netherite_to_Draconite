
package net.mcreator.thedraconiteore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.thedraconiteore.init.FromNetheriteToDraconiteModTabs;

public class DraconiteAxeItem extends AxeItem {
	public DraconiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.8f, new Item.Properties().tab(FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB).fireResistant());
	}
}
