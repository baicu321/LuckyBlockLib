package com.coi.lbl.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.coi.lbl.LuckyBlockLib;

@Mod(LuckyBlockLib.MOD_ID)
public final class LuckyBlockLibForge {
    public LuckyBlockLibForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(LuckyBlockLib.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        LuckyBlockLib.init();
    }
}
