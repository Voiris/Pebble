package org.voiris.pebble;

import org.voiris.pebble.block.Blocks;
import org.voiris.pebble.item.Items;
import org.voiris.pebble.loot.LootModifiers;
import org.voiris.pebble.sound.Sounds;
import org.voiris.pebble.world.feature.ConfiguredFeatures;
import org.voiris.pebble.world.feature.PlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Pebble.MOD_ID)
public class Pebble
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "pebble";

    // Directly reference a slf4j logger
    private static final Logger logger = LogUtils.getLogger();

    public Pebble() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.register(modEventBus);

        Sounds.register(modEventBus);

        Blocks.register(modEventBus);

        LootModifiers.register(modEventBus);

        ConfiguredFeatures.register(modEventBus);
        PlacedFeatures.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
