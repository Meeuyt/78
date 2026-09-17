package com.simplymore.epicfight.registry;

import com.simplymore.epicfight.SimplyMoreEpicFight;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class WeaponTypeMapper {
    private static final Logger LOGGER = LogManager.getLogger(SimplyMoreEpicFight.MOD_ID);
    
    public static final Map<String, String> BASE_WEAPON_TYPES = new HashMap<>();
    public static final Map<String, String> UNIQUE_WEAPON_TYPES = new HashMap<>();
    
    static {
        BASE_WEAPON_TYPES.put("great_katana", "uchigatana");
        BASE_WEAPON_TYPES.put("grandsword", "greatsword");
        BASE_WEAPON_TYPES.put("backhand_blade", "sword");
        BASE_WEAPON_TYPES.put("lance", "spear");
        BASE_WEAPON_TYPES.put("khopesh", "sword");
        BASE_WEAPON_TYPES.put("dagger", "dagger");
        BASE_WEAPON_TYPES.put("pernach", "axe");
        BASE_WEAPON_TYPES.put("quarterstaff", "spear");
        BASE_WEAPON_TYPES.put("great_spear", "spear");
        BASE_WEAPON_TYPES.put("deer_horns", "fist");
        
        UNIQUE_WEAPON_TYPES.put("great_slither", "uchigatana");
        UNIQUE_WEAPON_TYPES.put("molten_flare", "greatsword");
        UNIQUE_WEAPON_TYPES.put("grandfrost", "greatsword");
        UNIQUE_WEAPON_TYPES.put("glimmerstep", "spear");
        UNIQUE_WEAPON_TYPES.put("the_blood_harvester", "sword");
        UNIQUE_WEAPON_TYPES.put("jester_penetrate", "spear");
        UNIQUE_WEAPON_TYPES.put("myrmedge", "sword");
        UNIQUE_WEAPON_TYPES.put("black_pearl", "sword");
        UNIQUE_WEAPON_TYPES.put("the_pan", "fist");
        UNIQUE_WEAPON_TYPES.put("the_vessel_breach", "dagger");
        UNIQUE_WEAPON_TYPES.put("blade_of_the_grotesque", "greatsword");
        UNIQUE_WEAPON_TYPES.put("vipers_call", "sword");
        UNIQUE_WEAPON_TYPES.put("timekeeper", "sword");
        UNIQUE_WEAPON_TYPES.put("matterbane", "longsword");
        UNIQUE_WEAPON_TYPES.put("smouldering_ruin", "sword");
        UNIQUE_WEAPON_TYPES.put("stasis", "spear");
        UNIQUE_WEAPON_TYPES.put("tidebreaker", "fist");
        UNIQUE_WEAPON_TYPES.put("ruyi_jingu_bang", "spear");
        UNIQUE_WEAPON_TYPES.put("ruptured_idol", "fist");
        UNIQUE_WEAPON_TYPES.put("ascended_idol", "fist");
        UNIQUE_WEAPON_TYPES.put("tarnished_idol", "fist");
        UNIQUE_WEAPON_TYPES.put("darksent", "fist");
        UNIQUE_WEAPON_TYPES.put("holylight", "fist");
        UNIQUE_WEAPON_TYPES.put("soul_foreseer", "spear");
        UNIQUE_WEAPON_TYPES.put("earthshatter", "greatsword");
        UNIQUE_WEAPON_TYPES.put("serpentine_valor", "spear");
        UNIQUE_WEAPON_TYPES.put("lustrous_moxie", "uchigatana");
        UNIQUE_WEAPON_TYPES.put("brassturn", "fist");
        UNIQUE_WEAPON_TYPES.put("cindergorge", "fist");
        UNIQUE_WEAPON_TYPES.put("deaths_eyrie", "greatsword");
        UNIQUE_WEAPON_TYPES.put("perforiscus", "spear");
        UNIQUE_WEAPON_TYPES.put("revvengine", "uchigatana");
        UNIQUE_WEAPON_TYPES.put("exedrill", "spear");
        UNIQUE_WEAPON_TYPES.put("boa's_fang", "sword");
        UNIQUE_WEAPON_TYPES.put("culterex", "dagger");
        UNIQUE_WEAPON_TYPES.put("magmaseep", "greatsword");
        UNIQUE_WEAPON_TYPES.put("crustspire", "spear");
        UNIQUE_WEAPON_TYPES.put("moundshifter", "greatsword");
    }
    
    public static String getEpicFightType(String simplyMoreWeapon) {
        String baseType = BASE_WEAPON_TYPES.get(simplyMoreWeapon);
        if (baseType != null) {
            return "epicfight:" + baseType;
        }
        String uniqueType = UNIQUE_WEAPON_TYPES.get(simplyMoreWeapon);
        if (uniqueType != null) {
            return "epicfight:" + uniqueType;
        }
        LOGGER.warn("No Epic Fight type mapping found for: " + simplyMoreWeapon);
        return "epicfight:sword";
    }
    
    public static void logMappings() {
        LOGGER.info("=== Simply More to Epic Fight Weapon Type Mappings ===");
        BASE_WEAPON_TYPES.forEach((k, v) -> LOGGER.info("  " + k + " -> " + v));
        UNIQUE_WEAPON_TYPES.forEach((k, v) -> LOGGER.info("  " + k + " -> " + v));
        LOGGER.info("=== Total mappings: " + (BASE_WEAPON_TYPES.size() + UNIQUE_WEAPON_TYPES.size()) + " ===");
    }
}
