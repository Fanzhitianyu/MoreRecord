package fanzhitianyu.morerecord.Item;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class SoundDisc extends MusicDiscItem
{

    protected SoundDisc(SoundEvent sound, Settings settings)
    {
        super(15, sound, settings);
    }
}
