package me.ayydan.multimodloadertemplate.fabric;

import me.ayydan.multimodloadertemplate.CommonModEntryPoint;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        CommonModEntryPoint.init();
    }
}
