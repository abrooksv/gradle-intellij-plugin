import org.jetbrains.intellij.platform.gradle.extensions.TestFrameworkType

val languageVersionProperty = providers.gradleProperty("languageVersion").map { JavaLanguageVersion.of(it) }

plugins {
    id("java-test-fixtures")
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.intellij.platform.base")
}

dependencies {
    implementation(project(":modules:core"))

    testImplementation(testFixtures(project(":modules:core")))

    intellijPlatform {
        pycharmCommunity(providers.gradleProperty("intellijPlatform.version"))

        testFramework(TestFrameworkType.JUnit4)
    }
}

kotlin {
    jvmToolchain {
        languageVersion = languageVersionProperty
    }
}