package fr.isolated.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PsapphireArmor extends ArmorBase {

    public PsapphireArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn, tab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof PsapphireArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof PsapphireArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof PsapphireArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof PsapphireArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 10, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0, false, false));
        }
    }
}
