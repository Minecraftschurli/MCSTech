package minecraftschurli.mcstech.proxy;

import minecraftschurli.mcstech.grinder.GrinderContainer;
import minecraftschurli.mcstech.grinder.GrinderScreen;
import minecraftschurli.mcstech.init.ContainerTypes;
import net.minecraft.client.gui.ScreenManager;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory(ContainerTypes.GRINDER.get(), GrinderScreen::new);
    }
}
