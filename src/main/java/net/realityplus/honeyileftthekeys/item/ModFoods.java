package net.realityplus.honeyileftthekeys.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties SLIMY = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).fast().effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 254), 0.65F).build();
}
