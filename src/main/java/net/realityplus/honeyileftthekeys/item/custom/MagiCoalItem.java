package net.realityplus.honeyileftthekeys.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class MagiCoalItem extends Item {
    public MagiCoalItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return super.getBurnTime(itemStack, recipeType);
    }
}
