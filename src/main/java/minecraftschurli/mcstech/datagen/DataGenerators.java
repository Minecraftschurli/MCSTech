package minecraftschurli.mcstech.datagen;

import minecraftschurli.mcstech.MCSTech;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * @author Minecraftschurli
 * @version 2019-10-22
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MCSTech.MODID)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new MCSTechItemTagsProvider(generator));
            generator.addProvider(new MCSTechBlockTagsProvider(generator));
            generator.addProvider(new MCSTechRecipeProvider(generator));
            generator.addProvider(new MCSTechBlockLootTableProvider(generator));
        }
    }
}
