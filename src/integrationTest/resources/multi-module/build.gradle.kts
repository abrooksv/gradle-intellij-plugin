val sinceBuildProperty = providers.gradleProperty("sinceBuild")
val languageVersionProperty = providers.gradleProperty("languageVersion").map { JavaLanguageVersion.of(it) }
val downloadDirectoryProperty = providers.gradleProperty("downloadDirectory").map { file(it) }

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.21"
    id("org.jetbrains.intellij.platform")
}

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    implementation(project(":modules:core"))
    implementation(project(":modules:python"))

    intellijPlatform {
        intellijIdeaUltimate(providers.gradleProperty("intellijPlatform.version"))
    }
}

kotlin {
    jvmToolchain {
        languageVersion = languageVersionProperty
    }
}

intellijPlatform {
    buildSearchableOptions = false
    instrumentCode = false

    pluginConfiguration {
        ideaVersion {
            sinceBuild = sinceBuildProperty
        }
    }

    verifyPlugin {
        downloadDirectory = downloadDirectoryProperty
    }
}
