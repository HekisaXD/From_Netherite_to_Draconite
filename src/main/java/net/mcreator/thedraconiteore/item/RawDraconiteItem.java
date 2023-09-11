
package net.mcreator.thedraconiteore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.thedraconiteore.init.FromNetheriteToDraconiteModTabs;

public class RawDraconiteItem extends Item {
	public RawDraconiteItem() {
		super(new Item.Properties().tab(FromNetheriteToDraconiteModTabs.TAB_DRAC_CREAT_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
