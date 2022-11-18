import org.jetbrains.intellij.IntelliJPluginExtension
import org.jetbrains.intellij.tasks.PatchPluginXmlTask

fun properties(key: String) = project.findProperty(key).toString()

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
    id("org.jetbrains.intellij") version "1.10.0" apply false
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

tasks {
    wrapper {
        jarFile = file("../gradle/wrapper/gradle-wrapper.jar")
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.intellij")

    repositories {
        mavenCentral()
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }

    configure<IntelliJPluginExtension> {
        type.set(properties("platformType"))
        version.set(properties("platformVersion"))
    }

    tasks.named<PatchPluginXmlTask>("patchPluginXml") {
        version.set(properties("version"))
    }
}
