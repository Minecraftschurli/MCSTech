package minecraftschurli.mcstech.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static minecraftschurli.mcstech.MCSTech.MODID;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public interface IInit {
    ItemGroup GROUP = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.GRINDER.get());
        }
    };
    Item.Properties STANDARD_ITEM_PROPERTIES = new Item.Properties().group(GROUP);
}
