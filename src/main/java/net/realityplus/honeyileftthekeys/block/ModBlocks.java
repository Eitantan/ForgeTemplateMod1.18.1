package net.realityplus.honeyileftthekeys.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.realityplus.honeyileftthekeys.HoneyILeftTheKeys;
import net.realityplus.honeyileftthekeys.item.ModCreativeModeTab;
import net.realityplus.honeyileftthekeys.item.ModItems;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HoneyILeftTheKeys.MOD_ID);

    public static final RegistryObject<Block> MALTRINE_BLOCK = registerBlock("maltrine_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
                    .color(MaterialColor.COLOR_ORANGE)
                    .jumpFactor(2f)), ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS);

    public static final RegistryObject<Block> RAW_MALTRINE_BLOCK = registerBlock("raw_maltrine_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(4f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS);

    public static final RegistryObject<Block> MALTRINE_ORE = registerBlock("maltrine_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS);

    public static final RegistryObject<Block> DEEPSLATE_MALTRINE_ORE = registerBlock("deepslate_maltrine_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS);

    public static final RegistryObject<Block> ENDSTONE_MALTRINE_ORE = registerBlock("endstone_maltrine_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(5.5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS);

    public static final RegistryObject<Block> NETHERRACK_MALTRINE_ORE = registerBlock("netherrack_maltrine_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(4.5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.HONEY_I_LEFT_THE_KEYS);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
