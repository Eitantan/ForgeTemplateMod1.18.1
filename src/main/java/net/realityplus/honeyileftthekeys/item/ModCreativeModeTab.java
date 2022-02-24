package net.realityplus.honeyileftthekeys.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HONEY_I_LEFT_THE_KEYS = new CreativeModeTab("honeyileftthekeystab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MALTRINE.get());
        }
    };
}
