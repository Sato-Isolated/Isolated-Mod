package fr.isolated.items.tools;

import fr.isolated.Main;
import fr.isolated.init.ModItems;
import fr.isolated.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolBattleAxe extends ItemAxe implements IHasModel {

    public ToolBattleAxe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material, 6.0F, -3.2F);
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
