package minecraftschurli.mcstech.grinder;

import minecraftschurli.mcstech.init.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class GrinderRecipe extends AbstractCookingRecipe {
    public GrinderRecipe(ResourceLocation idIn, String groupIn, Ingredient ingredientIn, ItemStack resultIn, int cookTimeIn) {
        super(Recipes.GRINDER, idIn, groupIn, ingredientIn, resultIn, 0, cookTimeIn);
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return Recipes.Serializers.GRINDER.get();
    }
}
