package minecraftschurli.mcstech.datagen;

import minecraftschurli.mcslib.data.RecipeHelper;
import minecraftschurli.mcslib.data.TagHelper;
import minecraftschurli.mcstech.MCSTech;
import minecraftschurli.mcstech.init.Materials;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import javax.annotation.Nonnull;
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
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        Materials.STEEL.registerRecipes(consumer, MCSTech.MODID);
        RecipeHelper.addSmeltingRecipe(Items.GOLD_INGOT, TagHelper.getTag(TagHelper.TagType.DUST, "gold"), 0)
                .build(consumer, new ResourceLocation(MCSTech.MODID, "gold_ingot_from_gold_dust_smelt"));
        RecipeHelper.addBlastingRecipe(Items.GOLD_INGOT, TagHelper.getTag(TagHelper.TagType.DUST, "gold"), 0)
                .build(consumer, new ResourceLocation(MCSTech.MODID, "gold_ingot_from_gold_dust_blast"));
        RecipeHelper.addSmeltingRecipe(Items.IRON_INGOT, TagHelper.getTag(TagHelper.TagType.DUST, "iron"), 0)
                .build(consumer, new ResourceLocation(MCSTech.MODID, "iron_ingot_from_iron_dust_smelt"));
        RecipeHelper.addBlastingRecipe(Items.IRON_INGOT, TagHelper.getTag(TagHelper.TagType.DUST, "iron"), 0)
                .build(consumer, new ResourceLocation(MCSTech.MODID, "iron_ingot_from_iron_dust_blast"));
        RecipeHelper.addBlastingRecipe(Materials.STEEL.get("ingot"), Tags.Items.INGOTS_IRON, 0f, 1600)
                .build(consumer, new ResourceLocation(MCSTech.MODID, "steel_ingot_from_iron_ingot"));
    }

    @Override
    @Nonnull
    public String getName() {
        return "MCSTech Recipes";
    }
}
