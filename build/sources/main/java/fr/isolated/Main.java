package fr.isolated;

import fr.isolated.creativetab.ArmorAndWeaponTab;
import fr.isolated.creativetab.ItemsTab;
import fr.isolated.init.ModRecipes;
import fr.isolated.proxy.CommonProxy;
import fr.isolated.utils.Reference;
import fr.isolated.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static fr.isolated.utils.Reference.*;

@Mod(modid = MOD_ID, name = NAME, version = VERSION)
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(NAME);
    public static final CreativeTabs TABS = new ArmorAndWeaponTab("ArmorAndWeapon");
    public static final CreativeTabs TABS1 = new ItemsTab("BlockOreItem");
    @Instance
    public static Main instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event) {

    }
}