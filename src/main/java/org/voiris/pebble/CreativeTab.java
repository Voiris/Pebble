package org.voiris.pebble;

import org.voiris.pebble.item.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab extends CreativeModeTab {
    public static final CreativeTab MAIN = new CreativeTab(CreativeModeTab.TABS.length, "pebble");

    public CreativeTab(int length, String label) {
        super(length, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.PEBBLE.get());
    }
}
