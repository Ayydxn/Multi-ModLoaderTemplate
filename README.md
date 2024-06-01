# Multi-Mod Loader Template

---

An easy-to-use Minecraft mod template that is able to compile mods for Fabric and NeoForge using a common sourceset and Architectury as a way to connect everything together. Note that your mods won't need the Architectury API installed alongside them in order to work, and can be easily removed as a dependency if you don't need it.

In addition, it follows **DRY** (Don't Repeat Yourself). This means that you can change any of your mod's details in the gradle.properties file and have those changes be automatically reflected in your fabric.mod.json and neoforge.mods.toml files.

Lastly, for those of you who use GitHub Actions, it comes with a [super basic workflow file](https://github.com/Ayydxn/Multi-ModLoaderTemplate/blob/master/.github/workflows/build.yml) that will build your mod on every pull request and push to your repository.

---

## ❗Reporting Issues

If you come across any bugs/issues while using the template, you can report them using the [issue tracker](https://github.com/Ayydxn/Multi-ModLoaderTemplate/issues). Before opening an issue, please use the search tool to make sure that your issue hasn't already been reported. As soon as an issue is found to be a duplicate, it will be closed immediately.

Please note that while the issue tracker is also open to feature requests such as adding support for another mod loader.

---

## 🛠️ Usage

### 📃 Requirements

- A JDK (Java Development Kit) for Java 17.
  - I recommend using the [Azul Zulu]() distribution as this is what the template is built with. However, any JDK distribution should work perfectly fine.

- Any Java IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/). You may also use other code editors with support for Java and Gradle such as [Visual Studio Code](https://code.visualstudio.com/).
  - If you're new to modding, I recommend using IntelliJ IDEA as it is what is used by most people for modding. It is also what is used in most modding tutorials.

After cloning the project, you'll want to open it in your chosen code editor and wait for Gradle to load the project. Once the project has loaded, you can start modding!

If you want to change any of the details about your mod such as the name or version, you will want to do that in the gradle.properties file. 

To build your mod, you can just run the default `build` task and your mod will be built for all present mod-loaders. The built JAR for each mod loader can be found in that respective mod loader's `build/libs` folder. For example, `fabric/build/libs`.

---

## 📄 License

This template is available under the CC0 license. For more information, please read the license [here](). 