package com.carthax08.oresplus.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LeadOre extends BlockBase {


    public LeadOre(String name, Material material) {
        super(name, material);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.METAL);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 1);
    }
}
