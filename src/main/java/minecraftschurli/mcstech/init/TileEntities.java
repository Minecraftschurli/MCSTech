package minecraftschurli.mcstech.init;

import minecraftschurli.mcstech.grinder.GrinderTE;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

import static minecraftschurli.mcstech.MCSTech.TILE_ENTITIES;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class TileEntities implements IInit {
    public static final RegistryObject<TileEntityType<GrinderTE>> GRINDER = TILE_ENTITIES.register("grinder", () -> TileEntityType.Builder.create(GrinderTE::new, Blocks.GRINDER.get()).build(null));

    public static void register() {}
}
