package minecraftschurli.mcstech.init;

import minecraftschurli.mcstech.grinder.GrinderBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;

import static minecraftschurli.mcstech.MCSTech.BLOCKS;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class Blocks implements IInit {
    public static final RegistryObject<Block> GRINDER = BLOCKS.register("grinder", () -> new GrinderBlock(Block.Properties.create(Material.ROCK)));

    public static void register() {}
}
