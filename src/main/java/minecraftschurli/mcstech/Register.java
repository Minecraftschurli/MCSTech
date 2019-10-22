package minecraftschurli.mcstech;

import minecraftschurli.mcslib.objects.Material;
import minecraftschurli.mcslib.objects.OreBase;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

import static minecraftschurli.mcstech.MCSTech.*;

/**
 * @author Minecraftschurli
 * @version 2019-10-17
 */
public class Register {

    /*private static final ItemGroup GROUP = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(STEEL.get("block"));
        }
    };
    private static final Item.Properties STANDARD_ITEM_PROPERTIES = new Item.Properties().group(ItemGroup.BUILDING_BLOCKS);

    public static final Material COPPER = new Material("copper")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.ORANGE), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material TIN = new Material("tin")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.WHITE), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material ALUMINIUM = new Material("aluminium")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.WHITE), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material SILVER = new Material("silver")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.WHITE), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material LEAD = new Material("lead")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.WHITE), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material ZINC = new Material("zinc")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.LIGHT_GRAY), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);
    public static final Material NICKEL = new Material("nickel")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.YELLOW), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);
    public static final Material TITANIUM = new Material("titanium")
//            .withOre(Block.Properties.create(net.minecraft.block.material.Material.ROCK), STANDARD_ITEM_PROPERTIES, OreBase.OreSpawnProperties.create())
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.LIGHT_GRAY), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);

    public static final Material STEEL = new Material("steel")
            .withStorageBlock(Block.Properties.create(net.minecraft.block.material.Material.IRON, DyeColor.GRAY), STANDARD_ITEM_PROPERTIES)
            .withIngot(STANDARD_ITEM_PROPERTIES)
            .withNugget(STANDARD_ITEM_PROPERTIES)
            .withDust(STANDARD_ITEM_PROPERTIES);*/

    public static RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));


    public static void register() {
        /*COPPER.register(BLOCKS, ITEMS);
        TIN.register(BLOCKS, ITEMS);
        ALUMINIUM.register(BLOCKS, ITEMS);
        SILVER.register(BLOCKS, ITEMS);
        LEAD.register(BLOCKS, ITEMS);
        STEEL.register(BLOCKS, ITEMS);
        ZINC.register(BLOCKS, ITEMS);
        NICKEL.register(BLOCKS, ITEMS);
        TITANIUM.register(BLOCKS, ITEMS);*/
    }
}
