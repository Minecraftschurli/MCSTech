package minecraftschurli.mcstech.datagen;

import minecraftschurli.mcstech.Register;
import minecraftschurli.mcstech.Tags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * @author Minecraftschurli
 * @version 2019-10-22
 */
public class MCSTechItemTagsProvider extends ItemTagsProvider {

    private Set<ResourceLocation> filter = null;

    public MCSTechItemTagsProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    public void registerTags() {
        super.registerTags();

        this.filter = this.tagToBuilder.keySet().stream().map(Tag::getId).collect(Collectors.toSet());
        
        /*getBuilder(Tags.Items.INGOTS_ALUMINIUM).add(Register.ALUMINIUM.get("ingot"));
        getBuilder(Tags.Items.INGOTS_TIN).add(Register.TIN.get("ingot"));
        getBuilder(Tags.Items.INGOTS_COPPER).add(Register.COPPER.get("ingot"));
        getBuilder(Tags.Items.INGOTS_SILVER).add(Register.SILVER.get("ingot"));
        getBuilder(Tags.Items.INGOTS_LEAD).add(Register.LEAD.get("ingot"));
        getBuilder(Tags.Items.INGOTS_ZINC).add(Register.ZINC.get("ingot"));
        getBuilder(Tags.Items.INGOTS_TITANIUM).add(Register.TITANIUM.get("ingot"));
        getBuilder(Tags.Items.INGOTS_NICKEL).add(Register.NICKEL.get("ingot"));
        getBuilder(Tags.Items.INGOTS_STEEL).add(Register.STEEL.get("ingot"));

        getBuilder(net.minecraftforge.common.Tags.Items.INGOTS).add(
                Tags.Items.INGOTS_ALUMINIUM,
                Tags.Items.INGOTS_TIN,
                Tags.Items.INGOTS_COPPER,
                Tags.Items.INGOTS_SILVER,
                Tags.Items.INGOTS_LEAD,
                Tags.Items.INGOTS_STEEL,
                Tags.Items.INGOTS_ZINC,
                Tags.Items.INGOTS_TITANIUM,
                Tags.Items.INGOTS_NICKEL
        );

        getBuilder(Tags.Items.NUGGETS_ALUMINIUM).add(Register.ALUMINIUM.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_TIN).add(Register.TIN.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_COPPER).add(Register.COPPER.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_SILVER).add(Register.SILVER.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_LEAD).add(Register.LEAD.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_ZINC).add(Register.ZINC.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_TITANIUM).add(Register.TITANIUM.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_NICKEL).add(Register.NICKEL.get("nugget"));
        getBuilder(Tags.Items.NUGGETS_STEEL).add(Register.STEEL.get("nugget"));

        getBuilder(net.minecraftforge.common.Tags.Items.NUGGETS).add(
                Tags.Items.NUGGETS_ALUMINIUM,
                Tags.Items.NUGGETS_TIN,
                Tags.Items.NUGGETS_COPPER,
                Tags.Items.NUGGETS_SILVER,
                Tags.Items.NUGGETS_LEAD,
                Tags.Items.NUGGETS_STEEL,
                Tags.Items.NUGGETS_ZINC,
                Tags.Items.NUGGETS_TITANIUM,
                Tags.Items.NUGGETS_NICKEL
        );

        getBuilder(Tags.Items.DUSTS_ALUMINIUM).add(Register.ALUMINIUM.get("dust"));
        getBuilder(Tags.Items.DUSTS_TIN).add(Register.TIN.get("dust"));
        getBuilder(Tags.Items.DUSTS_COPPER).add(Register.COPPER.get("dust"));
        getBuilder(Tags.Items.DUSTS_SILVER).add(Register.SILVER.get("dust"));
        getBuilder(Tags.Items.DUSTS_LEAD).add(Register.LEAD.get("dust"));
        getBuilder(Tags.Items.DUSTS_ZINC).add(Register.ZINC.get("dust"));
        getBuilder(Tags.Items.DUSTS_TITANIUM).add(Register.TITANIUM.get("dust"));
        getBuilder(Tags.Items.DUSTS_NICKEL).add(Register.NICKEL.get("dust"));
        getBuilder(Tags.Items.DUSTS_STEEL).add(Register.STEEL.get("dust"));*/

        getBuilder(net.minecraftforge.common.Tags.Items.DUSTS).add(
                /*Tags.Items.DUSTS_ALUMINIUM,
                Tags.Items.DUSTS_TIN,
                Tags.Items.DUSTS_COPPER,
                Tags.Items.DUSTS_SILVER,
                Tags.Items.DUSTS_LEAD,
                Tags.Items.DUSTS_STEEL,
                Tags.Items.DUSTS_ZINC,
                Tags.Items.DUSTS_TITANIUM,
                Tags.Items.DUSTS_NICKEL*/
                Tags.Items.DUSTS_GOLD,
                Tags.Items.DUSTS_IRON
        );

        getBuilder(Tags.Items.DUSTS_GOLD).add(Register.GOLD_DUST.get());
        getBuilder(Tags.Items.DUSTS_IRON).add(Register.IRON_DUST.get());

        /*this.copy(Tags.Blocks.STORAGE_BLOCKS_ALUMINIUM, Tags.Items.STORAGE_BLOCKS_ALUMINIUM);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_TIN, Tags.Items.STORAGE_BLOCKS_TIN);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_COPPER, Tags.Items.STORAGE_BLOCKS_COPPER);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_SILVER, Tags.Items.STORAGE_BLOCKS_SILVER);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_LEAD, Tags.Items.STORAGE_BLOCKS_LEAD);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_ZINC, Tags.Items.STORAGE_BLOCKS_ZINC);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_NICKEL, Tags.Items.STORAGE_BLOCKS_NICKEL);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_TITANIUM, Tags.Items.STORAGE_BLOCKS_TITANIUM);
        this.copy(Tags.Blocks.STORAGE_BLOCKS_STEEL, Tags.Items.STORAGE_BLOCKS_STEEL);
        this.copy(net.minecraftforge.common.Tags.Blocks.STORAGE_BLOCKS, net.minecraftforge.common.Tags.Items.STORAGE_BLOCKS);

        this.copy(Tags.Blocks.ORES_ALUMINIUM, Tags.Items.ORES_ALUMINIUM);
        this.copy(Tags.Blocks.ORES_TIN, Tags.Items.ORES_TIN);
        this.copy(Tags.Blocks.ORES_COPPER, Tags.Items.ORES_COPPER);
        this.copy(Tags.Blocks.ORES_SILVER, Tags.Items.ORES_SILVER);
        this.copy(Tags.Blocks.ORES_LEAD, Tags.Items.ORES_LEAD);
        this.copy(Tags.Blocks.ORES_ZINC, Tags.Items.ORES_ZINC);
        this.copy(Tags.Blocks.ORES_NICKEL, Tags.Items.ORES_NICKEL);
        this.copy(Tags.Blocks.ORES_TITANIUM, Tags.Items.ORES_TITANIUM);
        this.copy(net.minecraftforge.common.Tags.Blocks.ORES, net.minecraftforge.common.Tags.Items.ORES);*/
    }

    @Override
    protected Path makePath(ResourceLocation id) {
        return this.filter != null && this.filter.contains(id) ? null : super.makePath(id); //We don't want to save vanilla tags.
    }

    @Override
    @Nonnull
    public String getName() {
        return "MCSTech Item Tags";
    }

}
