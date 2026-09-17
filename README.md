# Simply More × Epic Fight

Epic Fight 战斗动画支持 for Simply More 武器（Minecraft 1.20.1 Forge）。

365 件 Simply More 武器全覆盖，13 个自定义武器类型（`simplymore:*`）的连招与待机动作套用 EpicFied 2。

## 前置 Mod

- Epic Fight 20.14+
- Simply More 1.1+
- Simply Swords 1.55+
- 完整动作体验另需：Weapons of Miracles、Epic Fight Resurrection（cdmoveset）、SEpicfied Core、Epic Fight Nightfall、Epic Fight Extended Datapacks（均已声明为可选依赖，缺失时对应类型自动降级）

## 构建

```bash
bash generate_weapons.sh   # 生成 data pack（365 武器映射；types/ 为静态引用数据）
gradle build               # 或推 main 分支走 GitHub Actions
```

## 第三方来源与致谢（Credits）

- **Epic Fight** by YesdogMan —— 战斗系统本体。本项目仅以 `compileOnly` 方式引用其 API（CurseMaven），不分发其二进制。
- **Simply Swords EpicFied 2** by **RobertOn**（CC-BY-SA-4.0）—— `data/simplymore/capabilities/weapons/types/` 下 13 个武器类型定义直接改编自该项目（原命名空间 `simplyswords:*`），动画资源（`wom` / `reimportrob` / `efn` / `cdmoveset` / `epicfight`）归各自作者所有。
- **Simply More** by RosemaryThyme —— 武器本体。
- **Simply Swords** by Sweenus —— 武器本体。

## 许可（License）

本项目采用 **CC-BY-SA-4.0**（与所改编的 EpicFied 2 内容保持相同方式共享），使用时请保留本节致谢。
