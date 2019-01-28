package fr.isolated.creativetab;

import fr.isolated.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArmorAndWeaponTab extends CreativeTabs {
    public ArmorAndWeaponTab(String name) {
        super(name);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.PONYX_SWORD);//ItemInit.COPPER_INGOT);
    }
}
