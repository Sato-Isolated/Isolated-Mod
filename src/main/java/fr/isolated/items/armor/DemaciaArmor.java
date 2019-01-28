package fr.isolated.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DemaciaArmor extends ArmorBase {

    public DemaciaArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn, tab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof DemaciaArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof DemaciaArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof DemaciaArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof DemaciaArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 10, 1, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 10, 2, false, false));
        }
    }
}
