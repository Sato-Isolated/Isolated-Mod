package fr.isolated.items.divers;

import fr.isolated.Main;
import fr.isolated.init.ModItems;
import fr.isolated.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;

public class IronStick extends ItemBase {

    public IronStick(String name, CreativeTabs tab) {
        super(name, tab);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

