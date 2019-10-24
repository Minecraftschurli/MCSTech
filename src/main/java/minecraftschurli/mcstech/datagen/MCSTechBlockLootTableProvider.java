package minecraftschurli.mcstech.datagen;

import minecraftschurli.mcslib.data.BaseLootTableProvider;
import minecraftschurli.mcstech.init.Blocks;
import minecraftschurli.mcstech.init.Materials;
import minecraftschurli.mcstech.init.Tags;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.storage.loot.ConstantRange;
import net.minecraft.world.storage.loot.ItemLootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.conditions.SurvivesExplosion;
import net.minecraft.world.storage.loot.functions.CopyName;

import javax.annotation.Nonnull;

/**
 * @author Minecraftschurli
 * @version 2019-10-22
 */
public class MCSTechBlockLootTableProvider extends BaseLootTableProvider {

    public MCSTechBlockLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        Materials.STEEL.registerBlockLootTables(this);
        lootTables.put(Blocks.GRINDER.get(), LootTable.builder().addLootPool(LootPool.builder().rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(Blocks.GRINDER.get()).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY))).acceptCondition(SurvivesExplosion.builder())));
    }

    @Override
    @Nonnull
    public String getName() {
        return "MCSTech LootTables";
    }
}
