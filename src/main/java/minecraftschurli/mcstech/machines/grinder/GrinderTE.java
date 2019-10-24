package minecraftschurli.mcstech.machines.grinder;

import minecraftschurli.mcstech.init.Recipes;
import minecraftschurli.mcstech.init.TileEntities;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nonnull;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class GrinderTE extends AbstractFurnaceTileEntity {
    public GrinderTE() {
        super(TileEntities.GRINDER.get(), Recipes.GRINDER);
    }

    @Override
    @Nonnull
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.grinder");
    }

    @Override
    @Nonnull
    protected Container createMenu(int id, PlayerInventory player) {
        return new GrinderContainer(id, player, this, this.furnaceData);
    }
}
