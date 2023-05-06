package fanzhitianyu.morerecord.Item;
import fanzhitianyu.morerecord.MoreRecord;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class RecordItem
{
    public static final Item Music_bamboo_dream=registerItem("bamboo_dream",Sounds.bamboo_dream);
    public static final Item Music_endseeker=registerItem("endseeker",Sounds.endseeker);
    public static final Item Music_overchill=registerItem("overchill",Sounds.overchill);
    public static final Item Music_shock=registerItem("shock",Sounds.shock);
    public static final Item Music_shriker=registerItem("shriker",Sounds.shriker);
    public static final Item Music_soulless=registerItem("soulless",Sounds.soulless);
    public static final Item Music_tall_remix=registerItem("tall_remix",Sounds.tall_remix);
    public static final Item Music_weird_realm=registerItem("weird_realm",Sounds.weird_realm);
    public static Item registerItem(String id, SoundEvent sound)
    {
    Item.Settings settings = new Item.Settings().rarity(Rarity.EPIC).maxCount(1).group(ItemGroup.MISC).fireproof();
    return Registry.register(Registry.ITEM,new Identifier(MoreRecord.MODID,id),new SoundDisc(sound,settings));
    }
    public static void RegisterItem()
    {}
}

/*
shock是击杀凋零掉率1/50
 weird realm配方是
草 蕨 藤蔓
缠远藤 任意唱片 萤石
泥土 圆石 钻石
（md这个配方怎么这么诡异）
shrieker是骷髅击杀铁傀儡
soulless是骷髅击杀烈焰人
endseeker是击杀末影龙，爆率1/100
*/