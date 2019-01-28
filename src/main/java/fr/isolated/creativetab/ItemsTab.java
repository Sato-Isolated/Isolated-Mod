package fr.isolated.creativetab;

import fr.isolated.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemsTab extends CreativeTabs {
    public ItemsTab(String name) {
        super(name);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.DIRTY_ONYX);//ItemInit.COPPER_INGOT);
    }
}
