# Simply More Epic Fight - GitHub Actions 自动编译指南

## 快速开始

### 1. 创建 GitHub 仓库

1. 访问 [GitHub](https://github.com/) 并登录
2. 点击右上角 **+** → **New repository**
3. 仓库名填：`simplymore-epicfight`
4. 选择 **Public**
5. 点击 **Create repository**

### 2. 上传项目文件

在你的项目文件夹 `/data/data/com.termux/files/home/simplymore-epicfight/` 中执行：

```bash
# 初始化 git 仓库
git init
git add .
git commit -m "Initial commit: Simply More Epic Fight"

# 关联到 GitHub（替换 YOUR_USERNAME）
git remote add origin https://github.com/YOUR_USERNAME/simplymore-epicfight.git
git branch -M main
git push -u origin main
```

### 3. 等待自动编译

1. 访问你的 GitHub 仓库
2. 点击 **Actions** 标签
3. 你会看到 "Build Simply More Epic Fight" 工作流正在运行
4. 等待 2-3 分钟，直到显示绿色 ✓

### 4. 下载编译好的 JAR

1. 在 Actions 页面，点击最新的工作流运行
2. 在 **Artifacts** 部分下载：
   - `simplymore-epicfight.zip` - 编译好的 JAR 文件
   - `simplymore-epicfight-datapack.zip` - 数据包文件

### 5. 安装到 Minecraft

1. 解压 `simplymore-epicfight.zip`
2. 把 `simplymore-epicfight-1.0.0.jar` 放入 `.minecraft/mods/`
3. 解压 `simplymore-epicfight-datapack.zip`
4. 把数据包文件夹放入 `.minecraft/saves/你的世界/datapacks/`
5. 启动游戏，使用 `/datapack enable "simplymore-epicfight"` 启用

---

## 目录结构说明

```
simplymore-epicfight/
├── .github/
│   └── workflows/
│       └── build.yml          # GitHub Actions 配置
├── src/main/
│   ├── java/                  # Java 源码
│   └── resources/
│       ├── META-INF/mods.toml # 模组配置
│       ├── pack.mcmeta        # 数据包配置
│       └── data/simplymore/   # 133 个武器 JSON
├── build.gradle               # 构建脚本
├── settings.gradle
├── gradle.properties
├── generate_weapons.sh        # 数据包生成脚本
└── README.md
```

---

## 故障排除

### 编译失败

查看 Actions 日志中的错误信息。常见问题：

1. **依赖下载失败** - CurseForge Maven 可能被墙，需要配置代理
2. **Java 版本错误** - 确保使用 JDK 17
3. **Gradle 错误** - Actions 会自动下载 Gradle 8.5

### 重新编译

每次你推送代码到 GitHub，都会自动触发重新编译：

```bash
git add .
git commit -m "Update mod"
git push
```

---

## 本地测试编译（可选）

如果你有电脑，可以在本地测试：

```bash
# Windows
gradlew.bat build

# Mac/Linux
./gradlew build
```

输出：`build/libs/simplymore-epicfight-1.0.0.jar`
