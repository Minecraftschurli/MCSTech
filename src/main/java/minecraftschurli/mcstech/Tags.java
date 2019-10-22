package minecraftschurli.mcstech;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

import static minecraftschurli.mcstech.MCSTech.MODID;

/**
 * @author Minecraftschurli
 * @version 2019-10-22
 */
public class Tags {

    public static class Blocks {

        /*public static final Tag<Block> STORAGE_BLOCKS_SILVER = forgeTag("storage_blocks/silver");
        public static final Tag<Block> STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead");
        public static final Tag<Block> STORAGE_BLOCKS_COPPER = forgeTag("storage_blocks/copper");
        public static final Tag<Block> STORAGE_BLOCKS_TIN = forgeTag("storage_blocks/tin");
        public static final Tag<Block> STORAGE_BLOCKS_ALUMINIUM = forgeTag("storage_blocks/aluminium");
        public static final Tag<Block> STORAGE_BLOCKS_ZINC = forgeTag("storage_blocks/zinc");
        public static final Tag<Block> STORAGE_BLOCKS_NICKEL = forgeTag("storage_blocks/nickel");
        public static final Tag<Block> STORAGE_BLOCKS_TITANIUM = forgeTag("storage_blocks/titanium");*/

        /*public static final Tag<Block> STORAGE_BLOCKS_BRASS = forgeTag("storage_blocks/brass"); // Copper + Zinc
        public static final Tag<Block> STORAGE_BLOCKS_CONSTANTAN = forgeTag("storage_blocks/constantan"); // Copper + Nickel
        public static final Tag<Block> STORAGE_BLOCKS_BRONZE = forgeTag("storage_blocks/bronze"); // Tin + Copper
        public static final Tag<Block> STORAGE_BLOCKS_SOLDER = forgeTag("storage_blocks/invar"); // Tin + Lead
        public static final Tag<Block> STORAGE_BLOCKS_ELECTRUM = forgeTag("storage_blocks/electrum"); // Gold + Silver
        public static final Tag<Block> STORAGE_BLOCKS_TITANIUM_GOLD = forgeTag("storage_blocks/titanium_gold"); // Gold + Titanium
        public static final Tag<Block> STORAGE_BLOCKS_INVAR = forgeTag("storage_blocks/invar"); // Iron + Nickel*/
        /*public static final Tag<Block> STORAGE_BLOCKS_STEEL = forgeTag("storage_blocks/steel"); // Iron + Carbon

        public static final Tag<Block> ORES_SILVER = forgeTag("ores/silver");
        public static final Tag<Block> ORES_LEAD = forgeTag("ores/lead");
        public static final Tag<Block> ORES_COPPER = forgeTag("ores/copper");
        public static final Tag<Block> ORES_TIN = forgeTag("ores/tin");
        public static final Tag<Block> ORES_ALUMINIUM = forgeTag("ores/aluminium");
        public static final Tag<Block> ORES_ZINC = forgeTag("ores/zinc");
        public static final Tag<Block> ORES_NICKEL = forgeTag("ores/nickel");
        public static final Tag<Block> ORES_TITANIUM = forgeTag("ores/titanium");*/

        private static Tag<Block> tag(String name) {
            return new BlockTags.Wrapper(new ResourceLocation(MODID, name));
        }

        private static Tag<Block> forgeTag(String name) {
            return new BlockTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        /*public static final Tag<Item> STORAGE_BLOCKS_SILVER = forgeTag("storage_blocks/silver");
        public static final Tag<Item> STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead");
        public static final Tag<Item> STORAGE_BLOCKS_COPPER = forgeTag("storage_blocks/copper");
        public static final Tag<Item> STORAGE_BLOCKS_TIN = forgeTag("storage_blocks/tin");
        public static final Tag<Item> STORAGE_BLOCKS_ALUMINIUM = forgeTag("storage_blocks/aluminium");
        public static final Tag<Item> STORAGE_BLOCKS_ZINC = forgeTag("storage_blocks/zinc");
        public static final Tag<Item> STORAGE_BLOCKS_NICKEL = forgeTag("storage_blocks/nickel");
        public static final Tag<Item> STORAGE_BLOCKS_TITANIUM = forgeTag("storage_blocks/titanium");*/

        /*public static final Tag<Item> STORAGE_BLOCKS_BRASS = forgeTag("storage_blocks/brass"); // Copper + Zinc
        public static final Tag<Item> STORAGE_BLOCKS_CONSTANTAN = forgeTag("storage_blocks/constantan"); // Copper + Nickel
        public static final Tag<Item> STORAGE_BLOCKS_BRONZE = forgeTag("storage_blocks/bronze"); // Tin + Copper
        public static final Tag<Item> STORAGE_BLOCKS_SOLDER = forgeTag("storage_blocks/invar"); // Tin + Lead
        public static final Tag<Item> STORAGE_BLOCKS_ELECTRUM = forgeTag("storage_blocks/electrum"); // Gold + Silver
        public static final Tag<Item> STORAGE_BLOCKS_TITANIUM_GOLD = forgeTag("storage_blocks/titanium_gold"); // Gold + Titanium
        public static final Tag<Item> STORAGE_BLOCKS_INVAR = forgeTag("storage_blocks/invar"); // Iron + Nickel*/
        /*public static final Tag<Item> STORAGE_BLOCKS_STEEL = forgeTag("storage_blocks/steel"); // Iron + Carbon

        public static final Tag<Item> ORES_SILVER = forgeTag("ores/silver");
        public static final Tag<Item> ORES_LEAD = forgeTag("ores/lead");
        public static final Tag<Item> ORES_COPPER = forgeTag("ores/copper");
        public static final Tag<Item> ORES_TIN = forgeTag("ores/tin");
        public static final Tag<Item> ORES_ALUMINIUM = forgeTag("ores/aluminium");
        public static final Tag<Item> ORES_ZINC = forgeTag("ores/zinc");
        public static final Tag<Item> ORES_NICKEL = forgeTag("ores/nickel");
        public static final Tag<Item> ORES_TITANIUM = forgeTag("ores/titanium");

        public static final Tag<Item> INGOTS_SILVER = forgeTag("ingots/silver");
        public static final Tag<Item> INGOTS_LEAD = forgeTag("ingots/lead");
        public static final Tag<Item> INGOTS_COPPER = forgeTag("ingots/copper");
        public static final Tag<Item> INGOTS_TIN = forgeTag("ingots/tin");
        public static final Tag<Item> INGOTS_ALUMINIUM = forgeTag("ingots/aluminium");
        public static final Tag<Item> INGOTS_ZINC = forgeTag("ingots/zinc");
        public static final Tag<Item> INGOTS_NICKEL = forgeTag("ingots/nickel");
        public static final Tag<Item> INGOTS_TITANIUM = forgeTag("ingots/titanium");
        public static final Tag<Item> INGOTS_STEEL = forgeTag("ingots/steel");

        public static final Tag<Item> NUGGETS_SILVER = forgeTag("nuggets/silver");
        public static final Tag<Item> NUGGETS_LEAD = forgeTag("nuggets/lead");
        public static final Tag<Item> NUGGETS_COPPER = forgeTag("nuggets/copper");
        public static final Tag<Item> NUGGETS_TIN = forgeTag("nuggets/tin");
        public static final Tag<Item> NUGGETS_ALUMINIUM = forgeTag("nuggets/aluminium");
        public static final Tag<Item> NUGGETS_ZINC = forgeTag("nuggets/zinc");
        public static final Tag<Item> NUGGETS_NICKEL = forgeTag("nuggets/nickel");
        public static final Tag<Item> NUGGETS_TITANIUM = forgeTag("nuggets/titanium");
        public static final Tag<Item> NUGGETS_STEEL = forgeTag("nuggets/steel");

        public static final Tag<Item> DUSTS_SILVER = forgeTag("dusts/silver");
        public static final Tag<Item> DUSTS_LEAD = forgeTag("dusts/lead");
        public static final Tag<Item> DUSTS_COPPER = forgeTag("dusts/copper");
        public static final Tag<Item> DUSTS_TIN = forgeTag("dusts/tin");
        public static final Tag<Item> DUSTS_ALUMINIUM = forgeTag("dusts/aluminium");
        public static final Tag<Item> DUSTS_ZINC = forgeTag("dusts/zinc");
        public static final Tag<Item> DUSTS_NICKEL = forgeTag("dusts/nickel");
        public static final Tag<Item> DUSTS_TITANIUM = forgeTag("dusts/titanium");
        public static final Tag<Item> DUSTS_STEEL = forgeTag("dusts/steel");*/
        public static final Tag<Item> DUSTS_GOLD = forgeTag("dusts/gold");
        public static final Tag<Item> DUSTS_IRON = forgeTag("dusts/iron");

        private static Tag<Item> tag(String name) {
            return new ItemTags.Wrapper(new ResourceLocation(MODID, name));
        }

        private static Tag<Item> forgeTag(String name) {
            return new ItemTags.Wrapper(new ResourceLocation("forge", name));
        }
    }
}
