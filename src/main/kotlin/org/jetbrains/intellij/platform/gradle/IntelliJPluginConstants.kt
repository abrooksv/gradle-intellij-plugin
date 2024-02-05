// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.intellij.platform.gradle

import org.gradle.api.attributes.Attribute
import org.gradle.util.GradleVersion
import org.jetbrains.intellij.platform.gradle.utils.toVersion

object IntelliJPluginConstants {
    const val PLUGIN_NAME = "IntelliJ Platform Gradle Plugin"
    const val PLUGIN_ID = "org.jetbrains.intellij.platform"
    const val PLUGIN_CORE_ID = "$PLUGIN_ID.core"
    const val PLUGIN_SETTINGS_ID = "$PLUGIN_ID.settings"
    const val PLUGIN_TASKS_ID = "$PLUGIN_ID.tasks"
    const val LOG_PREFIX = "[$PLUGIN_ID]"

    const val PLUGIN_GROUP_NAME = "intellijPlatform"
    const val JETBRAINS_RUNTIME_VENDOR = "JetBrains"
    const val JETBRAINS_MARKETPLACE_MAVEN_GROUP = "com.jetbrains.plugins"
    const val JAVA_TEST_FIXTURES_PLUGIN_ID = "java-test-fixtures"
    const val KOTLIN_GRADLE_PLUGIN_ID = "org.jetbrains.kotlin.jvm"
    const val KOTLIN_STDLIB_DEFAULT_DEPENDENCY_PROPERTY_NAME = "kotlin.stdlib.default.dependency"
    const val KOTLIN_INCREMENTAL_USE_CLASSPATH_SNAPSHOT = "kotlin.incremental.useClasspathSnapshot"
    const val COMPILE_KOTLIN_TASK_NAME = "compileKotlin"
    const val TEST_TASK_NAME = "test"
    const val VERSION_LATEST = "latest"

    object Constraints {
        val MINIMAL_GRADLE_VERSION: GradleVersion = GradleVersion.version("8.1")
        val MINIMAL_INTELLIJ_PLATFORM_BUILD_NUMBER = "223".toVersion()
        val MINIMAL_INTELLIJ_PLATFORM_VERSION = "2022.3".toVersion()
    }

    object Extensions {
        const val IDES = "ides"
        const val IDEA_VERSION = "ideaVersion"
        const val INTELLIJ_PLATFORM = "intellijPlatform"
        const val PLUGIN_CONFIGURATION = "pluginConfiguration"
        const val PRODUCT_DESCRIPTOR = "productDescriptor"
        const val PUBLISHING = "publishing"
        const val SIGNING = "signing"
        const val VENDOR = "vendor"
        const val VERIFY_PLUGIN = "verifyPlugin"
    }

    object Configurations {
        const val INTELLIJ_PLATFORM_DEPENDENCY = "intellijPlatformDependency"
        const val INTELLIJ_PLATFORM_LOCAL_INSTANCE = "intellijPlatformLocalInstance"
        const val INTELLIJ_PLATFORM = "intellijPlatform"
        const val INTELLIJ_PLATFORM_PLUGINS = "intellijPlatformPlugins"
        const val INTELLIJ_PLATFORM_PLUGINS_EXTRACTED = "intellijPlatformPluginsExtracted"
        const val INTELLIJ_PLATFORM_BUNDLED_PLUGINS = "intellijPlatformBundledPlugins"
        const val INTELLIJ_PLATFORM_BUNDLED_PLUGINS_LIST = "intellijPlatformBundledPluginsList"
        const val INTELLIJ_PLATFORM_DEPENDENCIES = "intellijPlatformDependencies"
        const val INTELLIJ_PLUGIN_VERIFIER = "intellijPluginVerifier"
        const val INTELLIJ_PLUGIN_VERIFIER_IDES = "intellijPluginVerifierIdes"
        const val INTELLIJ_PLUGIN_VERIFIER_IDES_DEPENDENCY = "intellijPluginVerifierIdesDependency"
        const val INTELLIJ_PLUGIN_VERIFIER_IDES_LOCAL_INSTANCE = "intellijPluginVerifierIdesLocalInstance"
        const val MARKETPLACE_ZIP_SIGNER = "marketplaceZipSigner"
        const val JETBRAINS_RUNTIME = "jetbrainsRuntime"
        const val JETBRAINS_RUNTIME_DEPENDENCY = "jetbrainsRuntimeDependency"
        const val JETBRAINS_RUNTIME_LOCAL_INSTANCE = "jetbrainsRuntimeLocalInstance"
        const val TEST_FIXTURES_COMPILE_ONLY = "testFixturesCompileOnly"

        object Attributes {
            val bundledPluginsList = Attribute.of("intellijPlatformBundledPluginsList", Boolean::class.javaObjectType)
            val collected = Attribute.of("intellijPlatformCollected", Boolean::class.javaObjectType)
            val extracted = Attribute.of("intellijPlatformExtracted", Boolean::class.javaObjectType)
            val binaryReleaseExtracted = Attribute.of("intellijPlatformPluginVerifierIdeExtracted", Boolean::class.javaObjectType)
        }

        object Dependencies {
            const val LOCAL_IDE_GROUP = "localIde"
            const val BUNDLED_PLUGIN_GROUP = "bundledPlugin"
        }
    }

    object Tasks {
        const val BUILD_PLUGIN = "buildPlugin" // TODO: check
        const val BUILD_SEARCHABLE_OPTIONS = "buildSearchableOptions"
        const val INITIALIZE_INTELLIJ_PLATFORM_PLUGIN = "initializeIntellijPlatformPlugin"
        const val INSTRUMENTED_JAR = "instrumentedJar" // TODO: check
        const val JAR_SEARCHABLE_OPTIONS = "jarSearchableOptions"
        const val PATCH_PLUGIN_XML = "patchPluginXml" // TODO: check
        const val PREPARE_SANDBOX = "prepareSandbox" // TODO: check
        const val PREPARE_TEST_SANDBOX = "prepareTestingSandbox" // TODO: check
        const val PREPARE_UI_TEST_SANDBOX = "prepareUiTestingSandbox" // TODO: check
        const val PRINT_BUNDLED_PLUGINS = "printBundledPlugins"
        const val PRINT_PRODUCTS_RELEASES = "printProductsReleases"
        const val PUBLISH_PLUGIN = "publishPlugin"
        const val RUN_IDE = "runIde" // TODO: check
        const val SETUP_DEPENDENCIES = "setupDependencies"
        const val SIGN_PLUGIN = "signPlugin"
        const val TEST_IDE = "testIde" // TODO: check
        const val TEST_IDE_PERFORMANCE = "testIdePerformance" // TODO: check
        const val TEST_IDE_UI = "testIdeUi" // TODO: check
        const val VERIFY_PLUGIN = "verifyPlugin" // TODO: check
        const val VERIFY_PLUGIN_STRUCTURE = "verifyPluginStructure" // TODO: check
        const val VERIFY_PLUGIN_PROJECT_CONFIGURATION = "verifyPluginProjectConfiguration" // TODO: check
        const val VERIFY_PLUGIN_SIGNATURE = "verifyPluginSignature"
    }

    object Sandbox {
        const val CONTAINER = "idea-sandbox"
        const val CONFIG = "config"
        const val PLUGINS = "plugins"
        const val SYSTEM = "system"
        const val LOG = "log"
    }

    object Locations {
        const val ANDROID_STUDIO_BINARY_RELEASES = "https://redirector.gvt1.com/edgedl/android/studio/ide-zips"
        const val DOWNLOAD = "https://download.jetbrains.com"
        const val CACHE_REDIRECTOR = "https://cache-redirector.jetbrains.com"
        const val GITHUB_REPOSITORY = "https://github.com/jetbrains/gradle-intellij-plugin"
        const val INTELLIJ_DEPENDENCIES_REPOSITORY = "$CACHE_REDIRECTOR/intellij-dependencies"
        const val JETBRAINS_RUNTIME_REPOSITORY = "$CACHE_REDIRECTOR/intellij-jbr"
        const val MAVEN_GRADLE_PLUGIN_PORTAL_REPOSITORY = "https://plugins.gradle.org/m2"
        const val MAVEN_REPOSITORY = "https://repo1.maven.org/maven2"
        const val MARKETPLACE = "https://plugins.jetbrains.com"
        const val PRODUCTS_RELEASES_ANDROID_STUDIO = "https://jb.gg/android-studio-releases-list.xml"
        const val PRODUCTS_RELEASES_JETBRAINS_IDES = "https://www.jetbrains.com/updates/updates.xml"
    }

    const val CLASSPATH_INDEX_CLEANUP_TASK_NAME = "classpathIndexCleanup"
    const val DOWNLOAD_ROBOT_SERVER_PLUGIN_TASK_NAME = "downloadRobotServerPlugin"
    const val INSTRUMENT_CODE_TASK_NAME = "instrumentCode"
    const val INSTRUMENT_TEST_CODE_TASK_NAME = "instrumentTestCode"

    const val RUN_IDE_FOR_UI_TESTS_TASK_NAME = "runIdeForUiTests"
    const val RUN_IDE_PERFORMANCE_TEST_TASK_NAME = "runIdePerformanceTest"

    val TASKS = listOf(
        Tasks.BUILD_PLUGIN,
//        BUILD_SEARCHABLE_OPTIONS_TASK_NAME,
//        CLASSPATH_INDEX_CLEANUP_TASK_NAME,
//        DOWNLOAD_ANDROID_STUDIO_PRODUCT_RELEASES_XML_TASK_NAME,
//        DOWNLOAD_IDE_PRODUCT_RELEASES_XML_TASK_NAME,
//        DOWNLOAD_ROBOT_SERVER_PLUGIN_TASK_NAME,
        Tasks.INITIALIZE_INTELLIJ_PLATFORM_PLUGIN,
//        INSTRUMENT_CODE_TASK_NAME,
        Tasks.INSTRUMENTED_JAR,
//        INSTRUMENT_TEST_CODE_TASK_NAME,
//        JAR_SEARCHABLE_OPTIONS_TASK_NAME,
        Tasks.PATCH_PLUGIN_XML,
        Tasks.PREPARE_SANDBOX,
        Tasks.PREPARE_TEST_SANDBOX,
        Tasks.PREPARE_UI_TEST_SANDBOX,
//        PRINT_BUNDLED_PLUGINS_TASK_NAME,
//        PRINT_PRODUCTS_RELEASES_TASK_NAME,
//        PUBLISH_PLUGIN_TASK_NAME,
        Tasks.RUN_IDE,
//        RUN_IDE_FOR_UI_TESTS_TASK_NAME,
//        RUN_IDE_PERFORMANCE_TEST_TASK_NAME,
        Tasks.VERIFY_PLUGIN,
        Tasks.SETUP_DEPENDENCIES,
        Tasks.SIGN_PLUGIN,
        Tasks.TEST_IDE,
        Tasks.VERIFY_PLUGIN_STRUCTURE,
        Tasks.VERIFY_PLUGIN_PROJECT_CONFIGURATION,
        Tasks.VERIFY_PLUGIN_SIGNATURE,
    )


    const val SEARCHABLE_OPTIONS_DIR_NAME = "searchableOptions"
    const val SEARCHABLE_OPTIONS_SUFFIX = ".searchableOptions.xml"

    const val DEFAULT_INTELLIJ_REPOSITORY = "${Locations.CACHE_REDIRECTOR}/www.jetbrains.com/intellij-repository"
    const val DEFAULT_INTELLIJ_PLUGINS_REPOSITORY = "${Locations.CACHE_REDIRECTOR}/plugins.jetbrains.com/maven"
    const val JAVA_COMPILER_ANT_TASKS_MAVEN_METADATA =
        "$DEFAULT_INTELLIJ_REPOSITORY/releases/com/jetbrains/intellij/java/java-compiler-ant-tasks/maven-metadata.xml"

    const val PERFORMANCE_PLUGIN_ID = "com.jetbrains.performancePlugin"
}