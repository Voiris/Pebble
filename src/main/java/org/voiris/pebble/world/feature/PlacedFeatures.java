package org.voiris.pebble.world.feature;

import org.voiris.pebble.Pebble;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class PlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Pebble.MOD_ID);

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return List.of(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return List.of(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

    public static final RegistryObject<PlacedFeature> PEBBLE_PILE_PLACED = PLACED_FEATURES.register("pebble_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.PEBBLE_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> ROSE_QUARTZ_PILE_PLACED = PLACED_FEATURES.register("rose_quartz_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.ROSE_QUARTZ_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> JASPER_PILE_PLACED = PLACED_FEATURES.register("jasper_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.JASPER_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> BULLS_EYE_PILE_PLACED = PLACED_FEATURES.register("bulls_eye_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.BULLS_EYE_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> LARIMAR_PILE_PLACED = PLACED_FEATURES.register("larimar_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.LARIMAR_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NEPHRITE_PILE_PLACED = PLACED_FEATURES.register("nephrite_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.NEPHRITE_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> SUNSTONE_PILE_PLACED = PLACED_FEATURES.register("sunstone_pile_placed",
            () -> new PlacedFeature(ConfiguredFeatures.SUNSTONE_PILE.getHolder().get(),
                    rareOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
}
