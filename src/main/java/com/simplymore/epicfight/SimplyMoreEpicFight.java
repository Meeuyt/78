package com.simplymore.epicfight;

import com.simplymore.epicfight.config.SimplyMoreEpicFightConfig;
import com.simplymore.epicfight.registry.WeaponRegistry;
import com.simplymore.epicfight.skill.SkillRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SimplyMoreEpicFight.MOD_ID)
public class SimplyMoreEpicFight {
    public static final String MOD_ID = "simplymoreepicfight";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public SimplyMoreEpicFight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SimplyMoreEpicFightConfig.COMMON_SPEC);

        WeaponRegistry.register(modEventBus);
        forgeEventBus.addListener(new com.simplymore.epicfight.event.ServerEventHandler());

        LOGGER.info("Simply More Epic Fight initialized!");
    }
}
