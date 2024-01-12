package me.ayydan.multimodloadertemplate;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;

import java.nio.file.Path;

public class ExampleExpectPlatform
{
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: me.ayydan.multimodloadertemplate.ExampleExpectPlatform#getConfigDirectory()
     * Actual Fabric: me.ayydan.multimodloadertemplate.fabric.ExampleExpectPlatformImpl#getConfigDirectory()
     * Actual NeoForge: me.ayydan.multimodloadertemplate.neoforge.ExampleExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory()
    {
        // Throw an error, the contents of this function should get replaced at runtime.
        throw new AssertionError();
    }
}
