package fanzhitianyu.morerecord.Item;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import fanzhitianyu.morerecord.MoreRecord;
public class Sounds {
    public static final SoundEvent bamboo_dream=register("music.bamboo_dream");
    public static final SoundEvent endseeker=register("music.endseeker");
    public static final SoundEvent overchill=register("music.overchill");
    public static final SoundEvent shock=register("music.shock");
    public static final SoundEvent shriker=register("music.shriker");
    public static final SoundEvent soulless=register("music.soulless");
    public static final SoundEvent tall_remix=register("music.tall_remix");
    public static final SoundEvent weird_realm=register("music.weird_realm");
    public static SoundEvent register(String name)
    {
        Identifier id=new Identifier(MoreRecord.MODID,name);
        return Registry.register(Registry.SOUND_EVENT,id,new SoundEvent(id));
    }
    public static void RegisterSounds() {}

}
