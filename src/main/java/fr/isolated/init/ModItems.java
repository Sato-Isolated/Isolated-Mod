package fr.isolated.init;

import fr.isolated.Main;
import fr.isolated.items.Bow.EmeraldBow;
import fr.isolated.items.ItemBase;
import fr.isolated.items.armor.*;
import fr.isolated.items.food.FoodEffectBase;
import fr.isolated.items.tools.*;
import fr.isolated.utils.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //region Emerald
    //region Emerald Stats
    public static final ToolMaterial MATERIAL_EMERALD_SWORD = EnumHelper.addToolMaterial("material_emerald", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_EMERALD_SHOVEL = EnumHelper.addToolMaterial("material_emerald", 3, 1768,
            9.0F, 4.25F, 20);
    public static final ToolMaterial MATERIAL_EMERALD_AXE = EnumHelper.addToolMaterial("material_emerald", 3, 1768,
            9.0F, 2.25F, 20);
    public static final ToolMaterial MATERIAL_EMERALD_PICKAXE = EnumHelper.addToolMaterial("material_emerald", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_EMERALD_HOE = EnumHelper.addToolMaterial("material_emerald", 3, 1768,
            9.0F, 4.25F, 20);
    public static final ArmorMaterial EMERALD_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 70,
            new int[]{0, 0, 0, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial EMERALD_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 53,
            new int[]{0, 0, 9, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial EMERALD_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 55,
            new int[]{0, 7, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial EMERALD_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Armor Emerald
    public static final Item EMERALD_HELMET = new EmeraldArmor("emerald_helmet", EMERALD_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item EMERALD_CHESTPLATE = new EmeraldArmor("emerald_chestplate", EMERALD_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item EMERALD_LEGGINGS = new EmeraldArmor("emerald_leggings", EMERALD_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item EMERALD_BOOTS = new EmeraldArmor("emerald_boots", EMERALD_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion

    //region Emerald Tool
    public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD_SWORD, Main.TABS);
    public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD_SHOVEL, Main.TABS);
    public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD_PICKAXE, Main.TABS);
    public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD_AXE, Main.TABS);
    public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD_HOE, Main.TABS);
    //endregion
    //endregion

    //region Topaze
    //region Topaze Stats
    public static final ToolMaterial MATERIAL_TOPAZE_SWORD = EnumHelper.addToolMaterial("material_topaze", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_TOPAZE_SHOVEL = EnumHelper.addToolMaterial("material_topaze", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_TOPAZE_AXE = EnumHelper.addToolMaterial("material_topaze", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_TOPAZE_PICKAXE = EnumHelper.addToolMaterial("material_topaze", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_TOPAZE_HOE = EnumHelper.addToolMaterial("material_topaze", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ArmorMaterial TOPAZE_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_topaze", Reference.MOD_ID + ":topaze", 70,
            new int[]{0, 0, 0, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial TOPAZE_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_topaze", Reference.MOD_ID + ":topaze", 53,
            new int[]{0, 0, 8, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial TOPAZE_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_topaze", Reference.MOD_ID + ":topaze", 55,
            new int[]{0, 6, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial TOPAZE_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_topaze", Reference.MOD_ID + ":topaze", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Topaze Tool
    public static final ItemSword TOPAZE_SWORD = new ToolSword("topaze_sword", MATERIAL_TOPAZE_SWORD, Main.TABS);
    public static final ItemSpade TOPAZE_SHOVEL = new ToolSpade("topaze_shovel", MATERIAL_TOPAZE_SHOVEL, Main.TABS);
    public static final ItemPickaxe TOPAZE_PICKAXE = new ToolPickaxe("topaze_pickaxe", MATERIAL_TOPAZE_PICKAXE, Main.TABS);
    public static final ItemAxe TOPAZE_AXE = new ToolAxe("topaze_axe", MATERIAL_TOPAZE_AXE, Main.TABS);
    public static final ItemHoe TOPAZE_HOE = new ToolHoe("topaze_hoe", MATERIAL_TOPAZE_HOE, Main.TABS);
    //endregion

    //region Topaze Armor
    public static final Item TOPAZE_HELMET = new TopazeArmor("topaze_helmet", TOPAZE_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item TOPAZE_CHESTPLATE = new TopazeArmor("topaze_chestplate", TOPAZE_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item TOPAZE_LEGGINGS = new TopazeArmor("topaze_leggings", TOPAZE_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item TOPAZE_BOOTS = new TopazeArmor("topaze_boots", TOPAZE_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion
    //endregion

    //region Obsidite
    //region Obsidite Stats
    public static final ToolMaterial MATERIAL_OBSIDITE_SWORD = EnumHelper.addToolMaterial("material_obsidite", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_OBSIDITE_SHOVEL = EnumHelper.addToolMaterial("material_obsidite", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_OBSIDITE_AXE = EnumHelper.addToolMaterial("material_obsidite", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_OBSIDITE_PICKAXE = EnumHelper.addToolMaterial("material_obsidite", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_OBSIDITE_HOE = EnumHelper.addToolMaterial("material_obsidite", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ArmorMaterial OBSIDITE_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_obsidite", Reference.MOD_ID + ":topaze", 70,
            new int[]{0, 0, 0, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial OBSIDITE_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_obsidite", Reference.MOD_ID + ":topaze", 53,
            new int[]{0, 0, 8, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial OBSIDITE_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_obsidite", Reference.MOD_ID + ":topaze", 55,
            new int[]{0, 6, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial OBSIDITE_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_obsidite", Reference.MOD_ID + ":topaze", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Obsidite Tool
    public static final ItemSword OBSIDITE_SWORD = new ToolSword("obsidite_sword", MATERIAL_OBSIDITE_SWORD, Main.TABS);
    public static final ItemSpade OBSIDITE_SHOVEL = new ToolSpade("obsidite_shovel", MATERIAL_OBSIDITE_SHOVEL, Main.TABS);
    public static final ItemPickaxe OBSIDITE_PICKAXE = new ToolPickaxe("obsidite_pickaxe", MATERIAL_OBSIDITE_PICKAXE, Main.TABS);
    public static final ItemAxe OBSIDITE_AXE = new ToolAxe("obsidite_axe", MATERIAL_OBSIDITE_AXE, Main.TABS);
    public static final ItemHoe OBSIDITE_HOE = new ToolHoe("obsidite_hoe", MATERIAL_OBSIDITE_HOE, Main.TABS);
    //endregion

    //region Obsidite Armor
    public static final Item OBSIDITE_HELMET = new ObsiditeArmor("obsidite_helmet", OBSIDITE_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item OBSIDITE_CHESTPLATE = new ObsiditeArmor("obsidite_chestplate", OBSIDITE_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item OBSIDITE_LEGGINGS = new ObsiditeArmor("obsidite_leggings", OBSIDITE_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item OBSIDITE_BOOTS = new ObsiditeArmor("obsidite_boots", OBSIDITE_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion
    //endregion

    //region Perfect Onyx
    //region Perfect Onyx Stats
    public static final ToolMaterial MATERIAL_PONYX_SWORD = EnumHelper.addToolMaterial("material_ponyx", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_PONYX_SHOVEL = EnumHelper.addToolMaterial("material_ponyx", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_PONYX_AXE = EnumHelper.addToolMaterial("material_ponyx", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_PONYX_PICKAXE = EnumHelper.addToolMaterial("material_ponyx", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_PONYX_HOE = EnumHelper.addToolMaterial("material_ponyx", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ArmorMaterial PONYX_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_ponyx", Reference.MOD_ID + ":ponyx", 70,
            new int[]{0, 0, 0, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial PONYX_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_ponyx", Reference.MOD_ID + ":ponyx", 53,
            new int[]{0, 0, 8, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial PONYX_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_ponyx", Reference.MOD_ID + ":ponyx", 55,
            new int[]{0, 6, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial PONYX_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_ponyx", Reference.MOD_ID + ":ponyx", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Perfect Onyx Tool
    public static final ItemSword PONYX_SWORD = new ToolSword("ponyx_sword", MATERIAL_PONYX_SWORD, Main.TABS);
    public static final ItemSpade PONYX_SHOVEL = new ToolSpade("ponyx_shovel", MATERIAL_PONYX_SHOVEL, Main.TABS);
    public static final ItemPickaxe PONYX_PICKAXE = new ToolPickaxe("ponyx_pickaxe", MATERIAL_PONYX_PICKAXE, Main.TABS);
    public static final ItemAxe PONYX_AXE = new ToolAxe("ponyx_axe", MATERIAL_PONYX_AXE, Main.TABS);
    public static final ItemHoe PONYX_HOE = new ToolHoe("ponyx_hoe", MATERIAL_PONYX_HOE, Main.TABS);
    //endregion

    //region Perfect Onyx Armor
    public static final Item PONYX_HELMET = new PonyxArmor("ponyx_helmet", PONYX_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item PONYX_CHESTPLATE = new PonyxArmor("ponyx_chestplate", PONYX_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item PONYX_LEGGINGS = new PonyxArmor("ponyx_leggings", PONYX_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item PONYX_BOOTS = new PonyxArmor("ponyx_boots", PONYX_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion
    //endregion

    //region Perfect Sapphire
    //region Perfect Sapphire Stats
    public static final ToolMaterial MATERIAL_PSAPPHIRE_SWORD = EnumHelper.addToolMaterial("material_psapphire", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_PSAPPHIRE_SHOVEL = EnumHelper.addToolMaterial("material_psapphire", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_PSAPPHIRE_AXE = EnumHelper.addToolMaterial("material_psapphire", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_PSAPPHIRE_PICKAXE = EnumHelper.addToolMaterial("material_psapphire", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_PSAPPHIRE_HOE = EnumHelper.addToolMaterial("material_psapphire", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ArmorMaterial PSAPPHIRE_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_psapphire", Reference.MOD_ID + ":psapphire", 70,
            new int[]{0, 0, 0, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial PSAPPHIRE_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_psapphire", Reference.MOD_ID + ":psapphire", 53,
            new int[]{0, 0, 8, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial PSAPPHIRE_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_psapphire", Reference.MOD_ID + ":psapphire", 55,
            new int[]{0, 6, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial PSAPPHIRE_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_psapphire", Reference.MOD_ID + ":psapphire", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Perfect Sapphire Tool
    public static final ItemSword PSAPPHIRE_SWORD = new ToolSword("psapphire_sword", MATERIAL_PSAPPHIRE_SWORD, Main.TABS);
    public static final ItemSpade PSAPPHIRE_SHOVEL = new ToolSpade("psapphire_shovel", MATERIAL_PSAPPHIRE_SHOVEL, Main.TABS);
    public static final ItemPickaxe PSAPPHIRE_PICKAXE = new ToolPickaxe("psapphire_pickaxe", MATERIAL_PSAPPHIRE_PICKAXE, Main.TABS);
    public static final ItemAxe PSAPPHIRE_AXE = new ToolAxe("psapphire_axe", MATERIAL_PSAPPHIRE_AXE, Main.TABS);
    public static final ItemHoe PSAPPHIRE_HOE = new ToolHoe("psapphire_hoe", MATERIAL_PSAPPHIRE_HOE, Main.TABS);
    //endregion

    //region Perfect Sapphire Armor
    public static final Item PSAPPHIRE_HELMET = new PsapphireArmor("psapphire_helmet", PSAPPHIRE_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item PSAPPHIRE_CHESTPLATE = new PsapphireArmor("psapphire_chestplate", PSAPPHIRE_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item PSAPPHIRE_LEGGINGS = new PsapphireArmor("psapphire_leggings", PSAPPHIRE_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item PSAPPHIRE_BOOTS = new PsapphireArmor("psapphire_boots", PSAPPHIRE_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion
    //endregion

    //region Avalon
    //region Avalon Stats
    public static final ToolMaterial MATERIAL_AVALON_SWORD = EnumHelper.addToolMaterial("material_avalon", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_AVALON_SHOVEL = EnumHelper.addToolMaterial("material_avalon", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_AVALON_AXE = EnumHelper.addToolMaterial("material_avalon", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_AVALON_PICKAXE = EnumHelper.addToolMaterial("material_avalon", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_AVALON_HOE = EnumHelper.addToolMaterial("material_avalon", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ArmorMaterial AVALON_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_avalon", Reference.MOD_ID + ":avalon", 70,
            new int[]{0, 0, 0, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial AVALON_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_avalon", Reference.MOD_ID + ":avalon", 53,
            new int[]{0, 0, 8, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial AVALON_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_avalon", Reference.MOD_ID + ":avalon", 55,
            new int[]{0, 6, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial AVALON_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_avalon", Reference.MOD_ID + ":avalon", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Avalon Tool
    public static final ItemSword AVALON_SWORD = new ToolSword("avalon_sword", MATERIAL_AVALON_SWORD, Main.TABS);
    public static final ItemSpade AVALON_SHOVEL = new ToolSpade("avalon_shovel", MATERIAL_AVALON_SHOVEL, Main.TABS);
    public static final ItemPickaxe AVALON_PICKAXE = new ToolPickaxe("avalon_pickaxe", MATERIAL_AVALON_PICKAXE, Main.TABS);
    public static final ItemAxe AVALON_AXE = new ToolAxe("avalon_axe", MATERIAL_AVALON_AXE, Main.TABS);
    public static final ItemHoe AVALON_HOE = new ToolHoe("avalon_hoe", MATERIAL_AVALON_HOE, Main.TABS);
    //endregion

    //region Avalon Armor
    public static final Item AVALON_HELMET = new AvalonArmor("avalon_helmet", AVALON_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item AVALON_CHESTPLATE = new AvalonArmor("avalon_chestplate", AVALON_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item AVALON_LEGGINGS = new AvalonArmor("avalon_leggings", AVALON_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item AVALON_BOOTS = new AvalonArmor("avalon_boots", AVALON_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion
    //endregion

    //region Dragon Scale
    //region Dragon Scale Stats
    public static final ToolMaterial MATERIAL_DRAGONSCALE_SWORD = EnumHelper.addToolMaterial("material_dragonscale", 3, 1768,
            2.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_DRAGONSCALE_SHOVEL = EnumHelper.addToolMaterial("material_dragonscale", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_DRAGONSCALE_AXE = EnumHelper.addToolMaterial("material_dragonscale", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ToolMaterial MATERIAL_DRAGONSCALE_PICKAXE = EnumHelper.addToolMaterial("material_dragonscale", 3, 1768,
            9.0F, 3.25F, 20);
    public static final ToolMaterial MATERIAL_DRAGONSCALE_HOE = EnumHelper.addToolMaterial("material_dragonscale", 3, 1768,
            9.0F, 4.0F, 20);
    public static final ArmorMaterial DRAGONSCALE_HELMET_STATS = EnumHelper.addArmorMaterial("armor_material_dragonscale", Reference.MOD_ID + ":dragonscale", 70,
            new int[]{0, 0, 0, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial DRAGONSCALE_CHESTPLATE_STATS = EnumHelper.addArmorMaterial("armor_material_dragonscale", Reference.MOD_ID + ":dragonscale", 53,
            new int[]{0, 0, 8, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial DRAGONSCALE_LEGGINGS_STATS = EnumHelper.addArmorMaterial("armor_material_dragonscale", Reference.MOD_ID + ":dragonscale", 55,
            new int[]{0, 6, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial DRAGONSCALE_BOOTS_STATS = EnumHelper.addArmorMaterial("armor_material_dragonscale", Reference.MOD_ID + ":dragonscale", 57,
            new int[]{3, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    //endregion

    //region Dragon Scale Tool
    public static final ItemSword DRAGONSCALE_SWORD = new ToolSword("dragonscale_sword", MATERIAL_DRAGONSCALE_SWORD, Main.TABS);
    public static final ItemSpade DRAGONSCALE_SHOVEL = new ToolSpade("dragonscale_shovel", MATERIAL_DRAGONSCALE_SHOVEL, Main.TABS);
    public static final ItemPickaxe DRAGONSCALE_PICKAXE = new ToolPickaxe("dragonscale_pickaxe", MATERIAL_DRAGONSCALE_PICKAXE, Main.TABS);
    public static final ItemAxe DRAGONSCALE_AXE = new ToolAxe("dragonscale_axe", MATERIAL_DRAGONSCALE_AXE, Main.TABS);
    public static final ItemHoe DRAGONSCALE_HOE = new ToolHoe("dragonscale_hoe", MATERIAL_DRAGONSCALE_HOE, Main.TABS);
    //endregion

    //region Dragon Scale Armor
    public static final Item DRAGONSCALE_HELMET = new DragonScaleArmor("dragonscale_helmet", DRAGONSCALE_HELMET_STATS, 1, EntityEquipmentSlot.HEAD, Main.TABS);
    public static final Item DRAGONSCALE_CHESTPLATE = new DragonScaleArmor("dragonscale_chestplate", DRAGONSCALE_CHESTPLATE_STATS, 1, EntityEquipmentSlot.CHEST, Main.TABS);
    public static final Item DRAGONSCALE_LEGGINGS = new DragonScaleArmor("dragonscale_leggings", DRAGONSCALE_LEGGINGS_STATS, 2, EntityEquipmentSlot.LEGS, Main.TABS);
    public static final Item DRAGONSCALE_BOOTS = new DragonScaleArmor("dragonscale_boots", DRAGONSCALE_BOOTS_STATS, 1, EntityEquipmentSlot.FEET, Main.TABS);
    //endregion
    //endregion


    //region Bow
    public static final Item EMERALD_BOW = new EmeraldBow("emerald_bow");
    //endregion


    //region Items
    public static final Item RUBY = new ItemBase("ruby", Main.TABS1);
    public static final Item DIRTY_ONYX = new ItemBase("onyx_dirty", Main.TABS1);
    public static final Item PERFECT_ONYX = new ItemBase("onyx_perfect", Main.TABS1);
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot", Main.TABS1);
    public static final Item AVALON = new ItemBase("avalon", Main.TABS1);
    public static final Item DIRTY_SAPPHIRE = new ItemBase("sapphire_dirty", Main.TABS1);
    public static final Item PERFECT_SAPPHIRE = new ItemBase("sapphire_perfect", Main.TABS1);
    public static final Item OBSIDITE = new ItemBase("obsidite", Main.TABS1);
    public static final Item TOPAZE = new ItemBase("topaze", Main.TABS1);
    public static final Item DRAGONSCALE = new ItemBase("dragonscale", Main.TABS1);
    public static final Item IRON_STICK = new ItemBase("iron_stick", Main.TABS1);
    public static final Item DRAGONCLAW = new ItemBase("dragonclaw", Main.TABS1);
    //endregion

    //Food
    //public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f, false);
    public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f, false, new PotionEffect(MobEffects.POISON, (60 * 20), 1, false, true));
}
