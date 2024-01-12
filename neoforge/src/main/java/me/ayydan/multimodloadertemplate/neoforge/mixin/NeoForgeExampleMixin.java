package me.ayydan.multimodloadertemplate.neoforge.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class NeoForgeExampleMixin
{
    @Inject(method = "init", at = @At("HEAD"))
    private void init(CallbackInfo ci)
    {
        System.out.println("Hello from the NeoForge example mixin!");
    }
}
