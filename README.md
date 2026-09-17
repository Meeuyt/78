# Simply More Epic Fight

Epic Fight integration for Simply More weapons. Adds unique combat styles, animations, and skills for all Simply More weapons.

## Requirements

- **Java 17+** (Java 21 recommended)
- **Gradle 8.5** (included via wrapper)
- **Minecraft 1.20.1 Forge** MDK

## Setup Instructions

### 1. Prerequisites

Ensure you have Java 17 or newer installed:
```bash
java -version
```

### 2. Build the Mod

Using the Gradle wrapper:
```bash
./gradlew build
```

Or using system Gradle (8.5+):
```bash
gradle build
```

### 3. Output

The compiled JAR will be at:
```
build/libs/simplymore-epicfight-1.0.0.jar
```

### 4. Installation

1. Install **Forge 1.20.1** for Minecraft
2. Install **Epic Fight** (20.14.0+)
3. Install **Simply Swords** (1.55.0+)
4. Install **Simply More** (1.2.0+)
5. Place `simplymore-epicfight-1.0.0.jar` in your `mods/` folder
6. Launch Minecraft - the data pack will be automatically installed

## Project Structure

```
simplymore-epicfight/
├── build.gradle                 # ForgeGradle 6.x build script
├── settings.gradle              # Gradle settings
├── gradle.properties            # Version configuration
├── gradlew / gradlew.bat        # Gradle wrapper scripts
├── generate_weapons.sh          # Data pack generator
├── README.md                    # This file
│
├── src/main/java/com/simplymore/epicfight/
│   ├── SimplyMoreEpicFight.java           # Main mod class
│   ├── config/
│   │   └── SimplyMoreEpicFightConfig.java # Config
│   ├── registry/
│   │   ├── WeaponRegistry.java            # Weapon registration
│   │   └── WeaponTypeMapper.java          # 133 weapon mappings
│   ├── skill/
│   │   ├── SkillRegistry.java             # Skill registration
│   │   ├── HyperFocusSkill.java           # Katana blur effect
│   │   ├── ImpactFrameSkill.java          # Special attack effect
│   │   └── ColorShadingSkill.java         # Weapon color effect
│   ├── event/
│   │   ├── ServerEventHandler.java        # Server events
│   │   └── ClientEventHandler.java        # Client events
│   └── client/
│       └── ClientSetup.java               # Client setup
│
└── src/main/resources/
    ├── META-INF/mods.toml                 # Mod metadata
    ├── pack.mcmeta                        # Data pack config
    └── data/simplymore/
        └── capabilities/weapons/          # 133 weapon JSON files
```

## Dependencies

| Mod | Version | Purpose |
|-----|---------|---------|
| Epic Fight | 20.14.0+ | Combat animation system |
| Simply Swords | 1.55.0+ | Base weapon mod |
| Simply More | 1.2.0+ | Additional weapon types |
| Cloth Config | 11.1.106+ | Configuration |
| Architectury API | Latest | Cross-platform compatibility |

## Features

- **133+ Weapon Mappings**: All Simply More weapons mapped to Epic Fight types
- **Custom Skills**: Hyper Focus, Impact Frame, Color Shading
- **Auto Data Pack**: Weapon capabilities generated at build time
- **Balanced Attributes**: Tuned damage, impact, and armor negation
- **Full Compatibility**: Works with Simply Swords, Simply More, and Epic Fight

## Building for Development

### Windows
```cmd
gradlew.bat build
```

### Linux/Mac
```bash
./gradlew build
```

### Troubleshooting

**Gradle version mismatch:**
- Ensure you're using Gradle 8.5 or newer
- The `gradle-wrapper.properties` is configured for Gradle 8.5

**ForgeGradle compatibility:**
- This project uses ForgeGradle 6.0+
- Minecraft 1.20.1 with Forge 47.2.0

**Compilation errors:**
- Ensure all dependencies are accessible
- Check that Java 17+ is installed

## License

This project is inspired by Epic Fight | Simply Swords EpicFied 2 by RobertOn.
All original code and assets are created independently.

See [LICENSE](LICENSE) and [NOTICE](NOTICE) for details.

## Credits

- **Epic Fight** by maninthe_home / Antikythera Studios
- **Simply Swords** by Sweenus / Timefall Development
- **Simply More** by RosemaryThyme & NotSaneAshley
