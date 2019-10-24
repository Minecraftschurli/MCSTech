package minecraftschurli.mcstech.init;

import minecraftschurli.mcslib.objects.Material;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MaterialColor;

import static minecraftschurli.mcstech.MCSTech.BLOCKS;
import static minecraftschurli.mcstech.MCSTech.ITEMS;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class Materials implements IInit {

    public static void register() {
        /*COPPER.register(BLOCKS, ITEMS);
        TIN.register(BLOCKS, ITEMS);
        ALUMINIUM.register(BLOCKS, ITEMS);
        SILVER.register(BLOCKS, ITEMS);
        LEAD.register(BLOCKS, ITEMS);
        */STEEL.register(BLOCKS, ITEMS);/*
        ZINC.register(BLOCKS, ITEMS);
        NICKEL.register(BLOCKS, ITEMS);
        TITANIUM.register(BLOCKS, ITEMS);*/
    }

    /*public static final Material COPPER = new Material("copper")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.ORANGE_TERRACOTTA), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material TIN = new Material("tin")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.IRON), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material ALUMINIUM = new Material("aluminium")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.IRON), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material SILVER = new Material("silver")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.IRON), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material LEAD = new Material("lead")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.OBSIDIAN), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material ZINC = new Material("zinc")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.IRON), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material NICKEL = new Material("nickel")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.ADOBE), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material TITANIUM = new Material("titanium")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.IRON), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);*/

    public static final Material STEEL = new Material("steel")
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, MaterialColor.GRAY).hardnessAndResistance(6.0F, 100.0F).sound(SoundType.METAL), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);
}
