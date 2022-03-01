package net.realityplus.honeyileftthekeys.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.realityplus.honeyileftthekeys.HoneyILeftTheKeys;
import net.realityplus.honeyileftthekeys.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HoneyILeftTheKeys.MOD_ID);

    public static final RegistryObject<Item> MALTRINE = ITEMS.register("maltrine", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS)));

    public static final  RegistryObject<Item> RAW_MALTRINE = ITEMS.register("raw_maltrine", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS)));

    public static final  RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties()
            .tab(ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS).durability(320)));

    public static final  RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS).food(ModFoods.CUCUMBER)));

    public static final  RegistryObject<Item> SLIMY = ITEMS.register("slimy", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS).food(ModFoods.SLIMY)));

    public static final  RegistryObject<Item> MAGICOAL = ITEMS.register("magicoal", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
