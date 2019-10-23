package minecraftschurli.mcstech.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import static minecraftschurli.mcstech.MCSTech.ITEMS;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class Items implements IInit {

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GRINDER = ITEMS.register("grinder", () -> new BlockItem(Blocks.GRINDER.get(), STANDARD_ITEM_PROPERTIES));

    public static void register() {}
}
