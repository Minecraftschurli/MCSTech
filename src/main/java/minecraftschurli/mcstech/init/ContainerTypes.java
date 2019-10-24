package minecraftschurli.mcstech.init;

import minecraftschurli.mcstech.machines.grinder.GrinderContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;

import static minecraftschurli.mcstech.MCSTech.CONTAINERS;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class ContainerTypes implements IInit {
    public static final RegistryObject<ContainerType<GrinderContainer>> GRINDER = CONTAINERS.register("grinder", () -> IForgeContainerType.create((windowId, inv, data) -> new GrinderContainer(windowId, inv)));

    public static void register() {}
}
