package minecraftschurli.mcstech.grinder;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.FurnaceTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class GrinderBlock extends AbstractFurnaceBlock {
    public GrinderBlock(Properties properties) {
        super(properties);
    }

    /**
     * Interface for handling interaction with blocks that impliment AbstractFurnaceBlock. Called in onBlockActivated
     * inside AbstractFurnaceBlock.
     *
     * @param worldIn
     * @param pos
     * @param player
     */
    @Override
    protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if (tileentity instanceof GrinderTE) {
            player.openContainer((INamedContainerProvider)tileentity);
            player.addStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new GrinderTE();
    }
}
