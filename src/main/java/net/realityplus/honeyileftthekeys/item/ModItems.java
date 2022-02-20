package net.realityplus.honeyileftthekeys.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.realityplus.honeyileftthekeys.HoneyILeftTheKeys;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HoneyILeftTheKeys.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties()
            .tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
