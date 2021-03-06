package fr.isolated.blocks;

import fr.isolated.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class OnyxOre extends BlockBase {

    public OnyxOre(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.DIRTY_ONYX;
    }

    @Override
    public int quantityDropped(Random rand) {
        int max = 4;
        int min = 1;
        return rand.nextInt(max) + min;
    }
}