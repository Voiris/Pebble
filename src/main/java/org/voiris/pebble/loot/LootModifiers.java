package org.voiris.pebble.loot;

import org.voiris.pebble.Pebble;
import org.voiris.pebble.loot.modifiers.*;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Pebble.MOD_ID);

    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> PEBBLE_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("pebble_drop", PebbleModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ROSE_QUARTZ_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("rose_quartz_drop", RoseQuartzModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> JASPER_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("jasper_drop", JasperModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BULLS_EYE_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("bulls_eye_drop", BullsEyeModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> LARIMAR_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("larimar_drop", LarimarModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> NEPHRITE_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("nephrite_drop", NephriteModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SUNSTONE_DROP =
            LOOT_MODIFIER_SERIALIZERS.register("sunstone_drop", SunstoneModifier.CODEC);
}
