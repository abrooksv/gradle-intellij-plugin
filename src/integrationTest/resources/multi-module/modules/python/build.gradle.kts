val languageVersionProperty = providers.gradleProperty("languageVersion").map { JavaLanguageVersion.of(it) }

plugins {
    id("java-test-fixtures")
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.intellij.platform.base")
}

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    implementation(project(":modules:core"))

    testImplementation(testFixtures(project(":modules:core")))

    intellijPlatform {
        pycharmCommunity(providers.gradleProperty("intellijPlatform.version"))

        testFramework()
    }
}

kotlin {
    jvmToolchain {
        languageVersion = languageVersionProperty
    }
}