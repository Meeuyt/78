package com.simplymore.epicfight.skill;

import com.simplymore.epicfight.SimplyMoreEpicFight;
import yesman.epicfight.api.registry.SkillRegistry;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillCategory;

public class SkillRegistry {
    public static void register() {
        SimplyMoreEpicFight.LOGGER.info("Registering custom skills...");
        registerSkill("hyper_focus", SkillCategory.WEAPON_INNATE, HyperFocusSkill::new);
        registerSkill("impact_frame", SkillCategory.WEAPON_INNATE, ImpactFrameSkill::new);
        registerSkill("color_shading", SkillCategory.WEAPON_INNATE, ColorShadingSkill::new);
        SimplyMoreEpicFight.LOGGER.info("Custom skills registered!");
    }

    private static void registerSkill(String name, SkillCategory category, SkillFactory factory) {
        try {
            Skill skill = factory.create();
            SkillRegistry.register(skill);
        } catch (Exception e) {
            SimplyMoreEpicFight.LOGGER.error("Failed to register skill: " + name, e);
        }
    }

    @FunctionalInterface
    interface SkillFactory {
        Skill create();
    }
}
