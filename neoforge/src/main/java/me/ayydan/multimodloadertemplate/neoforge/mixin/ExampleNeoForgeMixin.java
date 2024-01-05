package me.ayydan.multimodloadertemplate.neoforge.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleNeoForgeMixin
{
    @Inject(method = "init", at = @At("HEAD"))
    public void initTitleScreen(CallbackInfo ci)
    {
        System.out.println("Hello from the example NeoForge mixin!");
    }
}
