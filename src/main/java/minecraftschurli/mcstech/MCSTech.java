package minecraftschurli.mcstech;

import minecraftschurli.mcstech.init.*;
import minecraftschurli.mcstech.proxy.ClientProxy;
import minecraftschurli.mcstech.proxy.IProxy;
import minecraftschurli.mcstech.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Minecraftschurli
 * @version 2019-10-15
 */
@Mod(MCSTech.MODID)
public class MCSTech {
    public static final String MODID = "mcstech";

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public static MCSTech instance;

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MODID);
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MODID);
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = new DeferredRegister<>(ForgeRegistries.RECIPE_SERIALIZERS, MODID);

    public MCSTech() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::processIMC);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        TILE_ENTITIES.register(modEventBus);
        CONTAINERS.register(modEventBus);
        RECIPE_SERIALIZERS.register(modEventBus);

        Blocks.register();
        Items.register();
        ContainerTypes.register();
        Materials.register();
        Recipes.register();
        TileEntities.register();
        Recipes.Serializers.register();
    }
    // region INITIALIZATION
    private void commonSetup(final FMLCommonSetupEvent event) {
        proxy.init();
    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }
    // endregion
}
