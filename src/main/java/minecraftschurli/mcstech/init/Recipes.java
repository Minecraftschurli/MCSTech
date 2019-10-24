package minecraftschurli.mcstech.init;

import minecraftschurli.mcstech.MCSTech;
import minecraftschurli.mcstech.machines.grinder.GrinderRecipe;
import minecraftschurli.mcstech.machines.grinder.GrinderRecipeSerializer;
import net.minecraft.item.crafting.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import static minecraftschurli.mcstech.MCSTech.RECIPE_SERIALIZERS;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class Recipes implements IInit {

    public static final IRecipeType<GrinderRecipe> GRINDER = IRecipeType.register(new ResourceLocation(MCSTech.MODID,"grinding").toString());

    public static void register() {}

    public static class Serializers implements IInit {

        public static final RegistryObject<IRecipeSerializer<?>> GRINDER = RECIPE_SERIALIZERS.register("grinding", GrinderRecipeSerializer::new);

        public static void register() {}
    }
}
