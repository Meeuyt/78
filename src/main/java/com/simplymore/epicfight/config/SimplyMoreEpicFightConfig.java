package com.simplymore.epicfight.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class SimplyMoreEpicFightConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec COMMON_SPEC;

    static {
        BUILDER.push("Simply More Epic Fight Config");
        BUILDER.pop();
        COMMON_SPEC = BUILDER.build();
    }
}
