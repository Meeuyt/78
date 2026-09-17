package com.simplymore.epicfight.event;

import com.simplymore.epicfight.skill.SkillRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = "simplymoreepicfight", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerEventHandler {
    private static final Logger LOGGER = LogManager.getLogger("simplymoreepicfight");

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Registering Simply More Epic Fight skills...");
        SkillRegistry.register();
        LOGGER.info("Simply More Epic Fight skills registered!");
    }
}
