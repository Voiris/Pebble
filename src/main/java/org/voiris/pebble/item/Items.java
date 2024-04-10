package org.voiris.pebble.item;

import org.voiris.pebble.CreativeTab;
import org.voiris.pebble.Pebble;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Pebble.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> PEBBLE_HANDFUL = ITEMS.register("pebble_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> PEBBLE_LARGE_HANDFUL = ITEMS.register("pebble_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));

    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> ROSE_QUARTZ_HANDFUL = ITEMS.register("rose_quartz_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> ROSE_QUARTZ_LARGE_HANDFUL = ITEMS.register("rose_quartz_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));

    public static final RegistryObject<Item> JASPER = ITEMS.register("jasper", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> JASPER_HANDFUL = ITEMS.register("jasper_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> JASPER_LARGE_HANDFUL = ITEMS.register("jasper_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));

    public static final RegistryObject<Item> BULLS_EYE = ITEMS.register("bulls_eye", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> BULLS_EYE_HANDFUL = ITEMS.register("bulls_eye_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> BULLS_EYE_LARGE_HANDFUL = ITEMS.register("bulls_eye_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));

    public static final RegistryObject<Item> LARIMAR = ITEMS.register("larimar", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> LARIMAR_HANDFUL = ITEMS.register("larimar_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> LARIMAR_LARGE_HANDFUL = ITEMS.register("larimar_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));

    public static final RegistryObject<Item> NEPHRITE = ITEMS.register("nephrite", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> NEPHRITE_HANDFUL = ITEMS.register("nephrite_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> NEPHRITE_LARGE_HANDFUL = ITEMS.register("nephrite_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));

    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> SUNSTONE_HANDFUL = ITEMS.register("sunstone_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
    public static final RegistryObject<Item> SUNSTONE_LARGE_HANDFUL = ITEMS.register("sunstone_large_handful", () -> new Item(new Item.Properties().tab(CreativeTab.MAIN)));
}
