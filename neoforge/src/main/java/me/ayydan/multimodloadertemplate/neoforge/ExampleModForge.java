package me.ayydan.multimodloadertemplate.neoforge;

import me.ayydan.multimodloadertemplate.CommonModEntryPoint;
import net.neoforged.fml.common.Mod;

@Mod(CommonModEntryPoint.MOD_ID)
public class ExampleModForge
{
    public ExampleModForge()
    {
        CommonModEntryPoint.init();
    }
}
