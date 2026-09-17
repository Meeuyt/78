# Simply More Epic Fight - Project Structure

## Directory Layout

```
simplymore-epicfight/
├── build.gradle                 # Gradle build script
├── settings.gradle              # Gradle settings
├── gradle.properties            # Gradle properties
├── README.md                    # Project documentation
├── generate_weapons.sh          # Data pack generation script
│
├── src/main/
│   ├── java/com/simplymore/epicfight/
│   │   ├── SimplyMoreEpicFight.java              # Main mod class
│   │   ├── config/
│   │   │   └── SimplyMoreEpicFightConfig.java   # Config handler
│   │   ├── registry/
│   │   │   ├── WeaponRegistry.java               # Weapon registration
│   │   │   └── WeaponTypeMapper.java             # Weapon type mappings
│   │   ├── skill/
│   │   │   ├── SkillRegistry.java                # Skill registration
│   │   │   ├── HyperFocusSkill.java              # Katana blur effect
│   │   │   ├── ImpactFrameSkill.java             # Special attack effect
│   │   │   └── ColorShadingSkill.java            # Weapon color effect
│   │   ├── event/
│   │   │   ├── ServerEventHandler.java           # Server events
│   │   │   └── ClientEventHandler.java           # Client events
│   │   └── client/
│   │       └── ClientSetup.java                  # Client setup
│   │
│   └── resources/
│       ├── META-INF/
│       │   └── mods.toml                         # Mod metadata
│       ├── pack.mcmeta                           # Data pack metadata
│       └── data/simplymore/
│           ├── capabilities/weapons/             # Weapon JSON files
│           │   ├── diamond_grandsword.json
│           │   ├── diamond_great_katana.json
│           │   └── ... (133 total files)
│           └── skills/                           # Skill data
│
└── src/generated/                                # Generated resources
```

## Key Components

### 1. Weapon Type Mapping
- Maps Simply More weapons to Epic Fight animation types
- 10 base weapon types × 7 tiers = 70 mappings
- 33 unique weapons + 25 mimic variants = 63 mappings

### 2. Custom Skills
- **Hyper Focus**: Blur effect for katanas
- **Impact Frame**: Effect for special attacks
- **Color Shading**: Weapon color effects in specific modes

### 3. Data Pack
- Auto-generated weapon capability JSON files
- Compatible with Epic Fight's datapack system
- Pack format 15 (Minecraft 1.20.1)

## Building

```bash
# Generate data pack files
bash generate_weapons.sh

# Build mod JAR
./gradlew build
```

## Dependencies

- Minecraft 1.20.1
- Forge 47.2.0
- Epic Fight 20.14.0+
- Simply Swords 1.55.0+
- Simply More 1.2.0+
