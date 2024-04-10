package org.voiris.pebble.block;

import org.voiris.pebble.CreativeTab;
import org.voiris.pebble.Pebble;
import org.voiris.pebble.item.Items;
import org.voiris.pebble.sound.Sounds;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Pebble.MOD_ID);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> ModBlock registryBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return new ModBlock(toReturn, registryBlockItem(name, toReturn));
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block) {
        return Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeTab.MAIN)));
    }

    public static final ModBlock PEBBLE_PILE = registryBlock("pebble_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock PEBBLE_SMOOTH_PILE = registryBlock("pebble_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock PEBBLE_POLISHED_PILE = registryBlock("pebble_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock PEBBLE_BRICKS = registryBlock("pebble_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final ModBlock ROSE_QUARTZ_PILE = registryBlock("rose_quartz_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock ROSE_QUARTZ_SMOOTH_PILE = registryBlock("rose_quartz_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock ROSE_QUARTZ_POLISHED_PILE = registryBlock("rose_quartz_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock ROSE_QUARTZ_BRICKS = registryBlock("rose_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final ModBlock JASPER_PILE = registryBlock("jasper_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock JASPER_SMOOTH_PILE = registryBlock("jasper_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock JASPER_POLISHED_PILE = registryBlock("jasper_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock JASPER_BRICKS = registryBlock("jasper_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    // public static final ModBlock BULLS_EYE = registryBlock("bulls_eye",
    //        () -> new Horizontal3DBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.2f).noOcclusion().noCollission()));
    public static final ModBlock BULLS_EYE_PILE = registryBlock("bulls_eye_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock BULLS_EYE_SMOOTH_PILE = registryBlock("bulls_eye_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock BULLS_EYE_POLISHED_PILE = registryBlock("bulls_eye_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock BULLS_EYE_BRICKS = registryBlock("bulls_eye_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final ModBlock LARIMAR_PILE = registryBlock("larimar_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock LARIMAR_SMOOTH_PILE = registryBlock("larimar_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock LARIMAR_POLISHED_PILE = registryBlock("larimar_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock LARIMAR_BRICKS = registryBlock("larimar_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final ModBlock NEPHRITE_PILE = registryBlock("nephrite_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock NEPHRITE_SMOOTH_PILE = registryBlock("nephrite_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock NEPHRITE_POLISHED_PILE = registryBlock("nephrite_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock NEPHRITE_BRICKS = registryBlock("nephrite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final ModBlock SUNSTONE_PILE = registryBlock("sunstone_pile",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(Sounds.PILE).strength(0.6f)));
    public static final ModBlock SUNSTONE_SMOOTH_PILE = registryBlock("sunstone_smooth_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.3f).requiresCorrectToolForDrops()));
    public static final ModBlock SUNSTONE_POLISHED_PILE = registryBlock("sunstone_polished_pile",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
    public static final ModBlock SUNSTONE_BRICKS = registryBlock("sunstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f).requiresCorrectToolForDrops()));
}
