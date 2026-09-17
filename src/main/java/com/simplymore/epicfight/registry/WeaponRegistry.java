package com.simplymore.epicfight.registry;

import com.simplymore.epicfight.SimplyMoreEpicFight;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WeaponRegistry {
    private static final DeferredRegister<net.minecraft.resources.ResourceLocation> WEAPON_TYPES =
            DeferredRegister.create(net.minecraftforge.registries.Registries.RESOURCE_LOCATION, SimplyMoreEpicFight.MOD_ID);

    public static void register(IEventBus modEventBus) {
        SimplyMoreEpicFight.LOGGER.info("Registering Simply More weapons...");
        WEAPON_TYPES.register(modEventBus);
        SimplyMoreEpicFight.LOGGER.info("Simply More weapons registered!");
    }

    public static void registerWeaponType(String name, String displayName) {
        ResourceLocation id = new ResourceLocation(SimplyMoreEpicFight.MOD_ID, name);
    }
}
