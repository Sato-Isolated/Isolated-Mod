package fr.isolated.init;

import fr.isolated.Main;
import fr.isolated.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    //Blocks
    public static final Block ANTI_PISTON_BLOCK = new AntiPistonBlock("anti_piston_block", Material.ROCK, Main.TABS1);
    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON, Main.TABS1);
    public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.IRON, Main.TABS1);
    public static final Block TOPAZE_BLOCK = new TopazeBlock("topaze_block", Material.IRON, Main.TABS1);
    public static final Block ONYX_BLOCK = new OnyxBlock("onyx_block", Material.IRON, Main.TABS1);
    public static final Block AVALON_BLOCK = new AvalonBlock("avalon_block", Material.IRON, Main.TABS1);
    //Ore
    public static final Block AVALON_ORE = new AvalonOre("avalon_ore", Material.ROCK, Main.TABS1);
    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK, Main.TABS1);
    public static final Block TOPAZE_ORE = new TopazeOre("topaze_ore", Material.ROCK, Main.TABS1);
    public static final Block ONYX_ORE = new OnyxOre("onyx_ore", Material.ROCK, Main.TABS1);
    public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK, Main.TABS1);
}
