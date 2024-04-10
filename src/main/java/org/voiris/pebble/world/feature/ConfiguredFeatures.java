package org.voiris.pebble.world.feature;

import com.google.common.base.Suppliers;
import org.voiris.pebble.Pebble;
import org.voiris.pebble.block.Blocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Pebble.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PEBBLE_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.PEBBLE_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.PEBBLE_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_JASPER_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.JASPER_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.JASPER_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ROSE_QUARTZ_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.ROSE_QUARTZ_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.ROSE_QUARTZ_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BULLS_EYE_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.BULLS_EYE_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.BULLS_EYE_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LARIMAR_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.LARIMAR_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.LARIMAR_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_NEPHRITE_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.NEPHRITE_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.NEPHRITE_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SUNSTONE_PILE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.SUNSTONE_PILE.BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.SUNSTONE_PILE.BLOCK.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PEBBLE_PILE = CONFIGURED_FEATURES.register("pebble_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PEBBLE_PILE.get(), 30)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ROSE_QUARTZ_PILE = CONFIGURED_FEATURES.register("rose_quartz_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ROSE_QUARTZ_PILE.get(), 30)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> JASPER_PILE = CONFIGURED_FEATURES.register("jasper_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_JASPER_PILE.get(), 30)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LARIMAR_PILE = CONFIGURED_FEATURES.register("larimar_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LARIMAR_PILE.get(), 30)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NEPHRITE_PILE = CONFIGURED_FEATURES.register("nephrite_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_NEPHRITE_PILE.get(), 30)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SUNSTONE_PILE = CONFIGURED_FEATURES.register("sunstone_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SUNSTONE_PILE.get(), 30)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BULLS_EYE_PILE = CONFIGURED_FEATURES.register("bulls_eye_pile",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BULLS_EYE_PILE.get(), 30)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
