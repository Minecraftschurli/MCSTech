package minecraftschurli.mcstech.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
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
public class MCSTechBlockTagsProvider extends BlockTagsProvider {

    private Set<ResourceLocation> filter = null;

    public MCSTechBlockTagsProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    public void registerTags() {
        super.registerTags();

        this.filter = this.tagToBuilder.keySet().stream().map(Tag::getId).collect(Collectors.toSet());
        
        /*getBuilder(Tags.Blocks.STORAGE_BLOCKS_ALUMINIUM).add(((BlockItem)Register.ALUMINIUM.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_TIN).add(((BlockItem)Register.TIN.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_COPPER).add(((BlockItem)Register.COPPER.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_SILVER).add(((BlockItem)Register.SILVER.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_LEAD).add(((BlockItem)Register.LEAD.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_ZINC).add(((BlockItem)Register.ZINC.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_TITANIUM).add(((BlockItem)Register.TITANIUM.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_NICKEL).add(((BlockItem)Register.NICKEL.get("block")).getBlock());
        getBuilder(Tags.Blocks.STORAGE_BLOCKS_STEEL).add(((BlockItem)Register.STEEL.get("block")).getBlock());

        getBuilder(net.minecraftforge.common.Tags.Blocks.STORAGE_BLOCKS).add(
                Tags.Blocks.STORAGE_BLOCKS_ALUMINIUM,
                Tags.Blocks.STORAGE_BLOCKS_TIN,
                Tags.Blocks.STORAGE_BLOCKS_COPPER,
                Tags.Blocks.STORAGE_BLOCKS_SILVER,
                Tags.Blocks.STORAGE_BLOCKS_LEAD,
                Tags.Blocks.STORAGE_BLOCKS_STEEL,
                Tags.Blocks.STORAGE_BLOCKS_ZINC,
                Tags.Blocks.STORAGE_BLOCKS_TITANIUM,
                Tags.Blocks.STORAGE_BLOCKS_NICKEL
        );

        getBuilder(Tags.Blocks.ORES_ALUMINIUM).add(((BlockItem)Register.ALUMINIUM.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_TIN).add(((BlockItem)Register.TIN.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_COPPER).add(((BlockItem)Register.COPPER.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_SILVER).add(((BlockItem)Register.SILVER.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_LEAD).add(((BlockItem)Register.LEAD.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_ZINC).add(((BlockItem)Register.ZINC.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_TITANIUM).add(((BlockItem)Register.TITANIUM.get("ore")).getBlock());
        getBuilder(Tags.Blocks.ORES_NICKEL).add(((BlockItem)Register.NICKEL.get("ore")).getBlock());

        getBuilder(net.minecraftforge.common.Tags.Blocks.ORES).add(
                Tags.Blocks.ORES_ALUMINIUM,
                Tags.Blocks.ORES_TIN,
                Tags.Blocks.ORES_COPPER,
                Tags.Blocks.ORES_SILVER,
                Tags.Blocks.ORES_LEAD,
                Tags.Blocks.ORES_ZINC,
                Tags.Blocks.ORES_TITANIUM,
                Tags.Blocks.ORES_NICKEL
        );*/

    }

    @Override
    protected Path makePath(ResourceLocation id) {
        return this.filter != null && this.filter.contains(id) ? null : super.makePath(id); //We don't want to save vanilla tags.
    }

    @Override
    @Nonnull
    public String getName() {
        return "MCSTech BlockTags";
    }

}
