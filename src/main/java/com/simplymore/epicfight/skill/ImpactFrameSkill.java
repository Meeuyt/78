package com.simplymore.epicfight.skill;

import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.weaponinnate.WeaponInnateSkill;

public class ImpactFrameSkill extends WeaponInnateSkill {
    public ImpactFrameSkill(SkillCategory category, Builder builder) {
        super(category, builder);
    }

    public static ImpactFrameSkill create() {
        return new ImpactFrameSkill(SkillCategory.WEAPON_INNATE, (new Builder()).setTranslatableColor(1.0F, 0.8F, 0.2F));
    }
}
