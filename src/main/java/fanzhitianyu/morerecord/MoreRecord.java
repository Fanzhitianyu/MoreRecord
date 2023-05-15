package fanzhitianyu.morerecord;

import net.fabricmc.api.ModInitializer;
import fanzhitianyu.morerecord.Item.*;


public class MoreRecord implements ModInitializer
{
    public static final String MODNAME="MoreRecord";
    public static final String MODID="morerecord";
    public static final String Version="1.0.1";

    @Override
    public void onInitialize()
    {
    Sounds.RegisterSounds();
    RecordItem.RegisterItem();
    }
}
