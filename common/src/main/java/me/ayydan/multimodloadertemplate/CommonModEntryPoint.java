package me.ayydan.multimodloadertemplate;

public class CommonModEntryPoint
{
    public static final String MOD_ID = "multimodloadertemplate";

    public static void init()
    {
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
