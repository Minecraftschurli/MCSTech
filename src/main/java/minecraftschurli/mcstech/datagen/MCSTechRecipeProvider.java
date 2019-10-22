package minecraftschurli.mcstech.datagen;

import net.minecraft.data.*;

import java.util.function.Consumer;

/**
 * @author Minecraftschurli
 * @version 2019-10-22
 */
public class MCSTechRecipeProvider extends RecipeProvider {
    public MCSTechRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) { }
}
