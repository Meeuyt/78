package com.simplymore.epicfight.skill;

import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.weaponinnate.WeaponInnateSkill;

public class ColorShadingSkill extends WeaponInnateSkill {
    public ColorShadingSkill(SkillCategory category, Builder builder) {
        super(category, builder);
    }

    public static ColorShadingSkill create() {
        return new ColorShadingSkill(SkillCategory.WEAPON_INNATE, (new Builder()).setTranslatableColor(0.4F, 0.6F, 1.0F));
    }
}
