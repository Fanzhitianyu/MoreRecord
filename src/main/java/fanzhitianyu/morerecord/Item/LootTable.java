package fanzhitianyu.morerecord.Item;

import fanzhitianyu.morerecord.MoreRecord;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetLootTableLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTable {
    /**
    private static final Identifier DRAGON_LOOT_TABLE = new Identifier(MoreRecord.MODID,"entities/ender_dragon");
    private static final Identifier IRON_GOLEM_LOOT_TABLE=new Identifier(MoreRecord.MODID,"entities/iron_golem");

    public static void modifyLootTables()
    {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if(DRAGON_LOOT_TABLE.equals(id)){
                FabricLootPoolBuilder poolBuilder = net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(DRAGON_LOOT_TABLE));
                supplier.withPool(LootPool.builder().build());
            }
            if(IRON_GOLEM_LOOT_TABLE.equals(id)){
                FabricLootPoolBuilder poolBuilder = net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(IRON_GOLEM_LOOT_TABLE));
                supplier.withPool(LootPool.builder().build());
            }

        }));
    }
     */
    //LootTableEvents.Replace()
}


/*
shock是击杀凋零掉率1/50shock是击杀凋零掉率1/50
 weird realm配方是
草 蕨 藤蔓
缠远藤 任意唱片 萤石
泥土 圆石 钻石
（md这个配方怎么这么诡异）
shrieker是骷髅击杀铁傀儡
soulless是骷髅击杀烈焰人
endseeker是击杀末影龙，爆率1/100
*/