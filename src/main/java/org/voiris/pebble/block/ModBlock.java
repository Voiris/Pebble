package org.voiris.pebble.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlock {
    public RegistryObject<? extends Block> BLOCK;
    public RegistryObject<Item> ITEM;

    public <T extends Block> ModBlock(RegistryObject<T> block, RegistryObject<Item> item) {
        BLOCK = block;
        ITEM = item;
    }
}
