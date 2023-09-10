
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedraconiteore.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheDraconiteOreModTabs {
	public static CreativeModeTab TAB_DRAC_CREAT_TAB;

	public static void load() {
		TAB_DRAC_CREAT_TAB = new CreativeModeTab("tabdrac_creat_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheDraconiteOreModItems.DRACONITE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
