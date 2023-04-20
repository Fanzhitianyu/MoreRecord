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
