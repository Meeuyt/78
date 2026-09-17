package com.simplymore.epicfight;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SimplyMoreEpicFight.MOD_ID)
public class SimplyMoreEpicFight {
    public static final String MOD_ID = "simplymoreepicfight";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public SimplyMoreEpicFight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.info("Simply More Epic Fight initialized!");
    }
}
