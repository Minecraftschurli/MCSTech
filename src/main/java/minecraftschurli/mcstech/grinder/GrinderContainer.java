package minecraftschurli.mcstech.grinder;

import minecraftschurli.mcstech.init.ContainerTypes;
import minecraftschurli.mcstech.init.Recipes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.util.IIntArray;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class GrinderContainer extends AbstractFurnaceContainer {
    public GrinderContainer(int id, PlayerInventory playerInventory) {
        super(ContainerTypes.GRINDER.get(), Recipes.GRINDER, id, playerInventory);
    }

    public GrinderContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray p_i50104_6_) {
        super(ContainerTypes.GRINDER.get(), Recipes.GRINDER, id, playerInventoryIn, furnaceInventoryIn, p_i50104_6_);
    }
}
