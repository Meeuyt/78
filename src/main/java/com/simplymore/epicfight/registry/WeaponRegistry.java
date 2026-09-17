package com.simplymore.epicfight.registry;

import com.simplymore.epicfight.SimplyMoreEpicFight;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import yesman.epicfight.api.animation.AnimationManager;
import yesman.epicfight.api.animation.property.AnimationProperties;
import yesman.epicfight.api.animation.types.*;
import yesman.epicfight.api.client.animation.Layer;
import yesman.epicfight.api.model.Armature;
import yesman.epicfight.api.model.JsonModelLoader;
import yesman.epicfight.api.model.ModelLoader;
import yesman.epicfight.api.registry.AnimationRegistry;
import yesman.epicfight.api.registry.SkillRegistry;
import yesman.epicfight.api.registry.StaticAnimationRegistry;
import yesman.epicfight.api.registry.WeaponTypeRegistry;
import yesman.epicfight.gameasset.Armatures;
import yesman.epicfight.gameasset.Models;

public class WeaponRegistry {
    private static final DeferredRegister<net.minecraft.resources.ResourceLocation> WEAPON_TYPES =
            DeferredRegister.create(net.minecraftforge.registries.Registries.RESOURCE_LOCATION, SimplyMoreEpicFight.MOD_ID);

    public static void register(IEventBus modEventBus) {
        SimplyMoreEpicFight.LOGGER.info("Registering Simply More weapons to Epic Fight...");
        WEAPON_TYPES.register(modEventBus);
        SimplyMoreEpicFight.LOGGER.info("Simply More weapons registered!");
    }

    public static void registerWeaponType(String name, String displayName) {
        ResourceLocation id = new ResourceLocation(SimplyMoreEpicFight.MOD_ID, name);
        WeaponTypeRegistry.register(id, displayName);
    }
}
