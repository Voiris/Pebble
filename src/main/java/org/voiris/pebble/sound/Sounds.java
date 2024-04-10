package org.voiris.pebble.sound;

import org.voiris.pebble.Pebble;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Sounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Pebble.MOD_ID);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Pebble.MOD_ID, name)));
    }

    public static RegistryObject<SoundEvent> PILE_BREAK = registerSoundEvent("pile_break");
    public static RegistryObject<SoundEvent> PILE_STEP = registerSoundEvent("pile_step");
    public static RegistryObject<SoundEvent> PILE_PLACE = registerSoundEvent("pile_place");
    public static RegistryObject<SoundEvent> PILE_HIT = registerSoundEvent("pile_hit");
    public static RegistryObject<SoundEvent> PILE_FALL = registerSoundEvent("pile_fall");

    public static final ForgeSoundType PILE = new ForgeSoundType(1f, 1f,
            Sounds.PILE_BREAK, Sounds.PILE_STEP, Sounds.PILE_PLACE, Sounds.PILE_HIT, Sounds.PILE_FALL);

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
