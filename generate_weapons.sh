#!/bin/bash
# Data Pack Generator for Simply More Epic Fight

BASE_DIR="/data/data/com.termux/files/home/simplymore-epicfight/src/main/resources/data/simplymore/capabilities/weapons"

mkdir -p "$BASE_DIR"

# Clear existing files
rm -f "$BASE_DIR"/*.json

# Base weapon types mapping
declare -A BASE_TYPES=(
  ["great_katana"]="uchigatana"
  ["grandsword"]="greatsword"
  ["backhand_blade"]="sword"
  ["lance"]="spear"
  ["khopesh"]="sword"
  ["dagger"]="dagger"
  ["pernach"]="axe"
  ["quarterstaff"]="spear"
  ["great_spear"]="spear"
  ["deer_horns"]="fist"
)

# Material tiers
TIERS=(wooden stone iron gold diamond netherite runic)

echo "Generating base weapon types..."

# Generate base weapon types
for weapon in "${!BASE_TYPES[@]}"; do
  type="${BASE_TYPES[$weapon]}"
  for tier in "${TIERS[@]}"; do
    name="${tier}_${weapon}"
    cat > "$BASE_DIR/${name}.json" << JSONEOF
{
  "type": "epicfight:${type}",
  "attributes": {
    "common": {
      "armor_negation": 5.0,
      "impact": 1.2,
      "max_strikes": 1,
      "damage_bonus": 2.0,
      "speed_bonus": 0.0
    }
  }
}
JSONEOF
  done
done

echo "Base weapons generated: $(ls -1 $BASE_DIR | wc -l) files"

# Unique weapons mapping
declare -A UNIQUE_TYPES=(
  ["great_slither"]="uchigatana"
  ["molten_flare"]="greatsword"
  ["grandfrost"]="greatsword"
  ["glimmerstep"]="spear"
  ["the_blood_harvester"]="sword"
  ["jester_penetrate"]="spear"
  ["myrmedge"]="sword"
  ["black_pearl"]="sword"
  ["the_pan"]="fist"
  ["the_vessel_breach"]="dagger"
  ["blade_of_the_grotesque"]="greatsword"
  ["vipers_call"]="sword"
  ["timekeeper"]="sword"
  ["matterbane"]="longsword"
  ["smouldering_ruin"]="sword"
  ["stasis"]="spear"
  ["tidebreaker"]="fist"
  ["ruyi_jingu_bang"]="spear"
  ["ruptured_idol"]="fist"
  ["ascended_idol"]="fist"
  ["tarnished_idol"]="fist"
  ["darksent"]="fist"
  ["holylight"]="fist"
  ["soul_foreseer"]="spear"
  ["earthshatter"]="greatsword"
  ["serpentine_valor"]="spear"
  ["lustrous_moxie"]="uchigatana"
  ["brassturn"]="fist"
  ["cindergorge"]="fist"
  ["deaths_eyrie"]="greatsword"
  ["perforiscus"]="spear"
  ["revvengine"]="uchigatana"
  ["exedrill"]="spear"
  ["boa's_fang"]="sword"
  ["culterex"]="dagger"
  ["magmaseep"]="greatsword"
  ["crustspire"]="spear"
  ["moundshifter"]="greatsword"
)

echo "Generating unique weapons..."

for weapon in "${!UNIQUE_TYPES[@]}"; do
  type="${UNIQUE_TYPES[$weapon]}"
  cat > "$BASE_DIR/${weapon}.json" << JSONEOF
{
  "type": "epicfight:${type}",
  "attributes": {
    "common": {
      "armor_negation": 8.0,
      "impact": 1.5,
      "max_strikes": 1,
      "damage_bonus": 3.0,
      "speed_bonus": 0.0
    }
  }
}
JSONEOF
done

echo "Unique weapons generated: $(ls -1 $BASE_DIR | wc -l) total files"

# Generate mimicry variants
echo "Generating mimicry variants..."

for variant in longsword twinblade rapier katana spear glaive warglaive cutlass claymore greathammer greataxe chakram scythe halberd great_katana grandsword backhand_blade lance khopesh dagger pernach quarterstaff great_spear deer_horns sai; do
  name="mimicry_${variant}"
  cat > "$BASE_DIR/${name}.json" << JSONEOF
{
  "type": "epicfight:sword",
  "attributes": {
    "common": {
      "armor_negation": 5.0,
      "impact": 1.2,
      "max_strikes": 1,
      "damage_bonus": 2.0,
      "speed_bonus": 0.0
    }
  }
}
JSONEOF
done

echo "Mimicry variants generated: $(ls -1 $BASE_DIR | wc -l) total files"
echo "Data pack generation complete!"
