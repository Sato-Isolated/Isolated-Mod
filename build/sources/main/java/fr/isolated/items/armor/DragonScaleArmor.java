package fr.isolated.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DragonScaleArmor extends ArmorBase {

    public DragonScaleArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn, tab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof DragonScaleArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof DragonScaleArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof DragonScaleArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof DragonScaleArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 10, 0, false, false));
        }
    }
}
