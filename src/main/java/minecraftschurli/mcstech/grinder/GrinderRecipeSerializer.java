package minecraftschurli.mcstech.grinder;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

/**
 * @author Minecraftschurli
 * @version 2019-10-23
 */
public class GrinderRecipeSerializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<GrinderRecipe> {


    public GrinderRecipe read(ResourceLocation recipeId, JsonObject json) {
        String s = JSONUtils.getString(json, "group", "");
        JsonElement jsonelement = JSONUtils.isJsonArray(json, "ingredient") ? JSONUtils.getJsonArray(json, "ingredient") : JSONUtils.getJsonObject(json, "ingredient");
        Ingredient ingredient = Ingredient.deserialize(jsonelement);
        //Forge: Check if primitive string to keep vanilla or a object which can contain a count field.
        if (!json.has("result")) throw new com.google.gson.JsonSyntaxException("Missing result, expected to find a string or object");
        ItemStack itemstack;
        if (json.get("result").isJsonObject()) itemstack = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
        else {
            String s1 = JSONUtils.getString(json, "result");
            int amount = JSONUtils.getInt(json, "amount", 1);
            ResourceLocation resourcelocation = new ResourceLocation(s1);
            itemstack = new ItemStack(ForgeRegistries.ITEMS.getValue(resourcelocation), amount);
        }
        int i = JSONUtils.getInt(json, "cookingtime", 200);
        return new GrinderRecipe(recipeId, s, ingredient, itemstack, i);
    }

    public GrinderRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
        String s = buffer.readString(32767);
        Ingredient ingredient = Ingredient.read(buffer);
        ItemStack itemstack = buffer.readItemStack();
        int i = buffer.readVarInt();
        return new GrinderRecipe(recipeId, s, ingredient, itemstack, i);
    }

    public void write(PacketBuffer buffer, GrinderRecipe recipe) {
        buffer.writeString(recipe.getGroup());
        recipe.getIngredients().get(0).write(buffer);
        buffer.writeItemStack(recipe.getRecipeOutput());
        buffer.writeVarInt(recipe.getCookTime());
    }
}
