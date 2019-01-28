package fr.isolated.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AvalonBlock extends BlockBase {

    public AvalonBlock(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1.0F);
    }
}