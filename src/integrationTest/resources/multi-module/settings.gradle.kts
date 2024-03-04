import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform

pluginManagement {
    repositories {
        maven("https://oss.sonatype.org/content/repositories/snapshots/") {
            // Restrict snapshots to the IntelliJ plugins
            // content{
            //     includeGroup("org.jetbrains.intellij.plugins")
            // }
        }
        gradlePluginPortal()
    }
}

plugins {
    id("org.jetbrains.intellij.platform.settings") version "2.0.0-SNAPSHOT"
}

rootProject.name = "test"

dependencyResolutionManagement {
    repositories {
        mavenCentral()

        intellijPlatform {
            defaultRepositories()
        }
    }
}

include("modules:core")
include("modules:python")
