package fr.isolated.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PonyxArmor extends ArmorBase {

    public PonyxArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn, tab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof PonyxArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof PonyxArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof PonyxArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof PonyxArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, 0, false, false));
        }
    }
}
