package me.ayydan.multimodloadertemplate.forge;

import me.ayydan.multimodloadertemplate.ExampleExpectPlatform;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ExampleExpectPlatformImpl
{
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory()
    {
        return FMLPaths.CONFIGDIR.get();
    }
}
