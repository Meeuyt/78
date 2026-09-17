package com.simplymore.epicfight.skill;

import yesman.epicfight.api.animation.types.AttackAnimation;
import yesman.epicfight.api.animation.types.BasicAttackAnimation;
import yesman.epicfight.api.client.animation.Layer;
import yesman.epicfight.api.model.Armature;
import yesman.epicfight.api.registry.AnimationRegistry;
import yesman.epicfight.api.registry.SkillRegistry;
import yesman.epicfight.api.registry.WeaponTypeRegistry;
import yesman.epicfight.api.animation.property.AnimationProperties;
import yesman.epicfight.gameasset.Models;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.weaponinnate.WeaponInnateSkill;

public class HyperFocusSkill extends WeaponInnateSkill {
    public HyperFocusSkill(SkillCategory category, Builder builder) {
        super(category, builder);
    }

    public static HyperFocusSkill create() {
        return new HyperFocusSkill(SkillCategory.WEAPON_INNATE, (new Builder()).setTranslatableColor(0.8F, 0.2F, 0.2F));
    }
}
