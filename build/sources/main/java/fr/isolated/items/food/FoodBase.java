package fr.isolated.items.food;

import fr.isolated.Main;
import fr.isolated.init.ModItems;
import fr.isolated.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
