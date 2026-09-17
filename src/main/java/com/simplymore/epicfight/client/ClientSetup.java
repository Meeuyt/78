package com.simplymore.epicfight.client;

import com.simplymore.epicfight.SimplyMoreEpicFight;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = SimplyMoreEpicFight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    private static final Logger LOGGER = LogManager.getLogger(SimplyMoreEpicFight.MOD_ID);

    @SubscribeEvent
    public static void onRegisterGuiOverlays(net.minecraftforge.client.event.RegisterGuiOverlaysEvent event) {
        LOGGER.info("Registering GUI overlays...");
    }
}
