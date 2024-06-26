// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.intellij.platform.gradle.tasks.aware

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Internal
import org.jetbrains.intellij.platform.gradle.Constants
import org.jetbrains.intellij.platform.gradle.extensions.IntelliJPlatformExtension

/**
 * The interface provides quick access to the sandbox container and specific directories located within it.
 * The path to the sandbox container is obtained using the [IntelliJPlatformExtension.sandboxContainer] extension property and the type and version
 * of the IntelliJ Platform applied to the project.
 * Paths respect custom IntelliJ Platform when combined with [CustomIntelliJPlatformVersionAware].
 *
 * @see IntelliJPlatformExtension.sandboxContainer
 * @see CustomIntelliJPlatformVersionAware
 */
interface SandboxAware : IntelliJPlatformVersionAware {

    /**
     * Represents the suffix used i.e., for test-related tasks.
     */
    @get:Internal
    val sandboxSuffix: Property<String>

    /**
     * The directory containing content read and produced by the running IDE.
     *
     * The directory name depends on the platform type and version currently used for running a task.
     */
    @get:Internal
    val sandboxDirectory: DirectoryProperty

    /**
     * A configuration directory located within the [sandboxDirectory].
     *
     * @see Constants.Sandbox.CONFIG
     */
    @get:Internal
    val sandboxConfigDirectory: DirectoryProperty

    /**
     * A plugins directory located within the [sandboxDirectory].
     *
     * @see Constants.Sandbox.PLUGINS
     */
    @get:Internal
    val sandboxPluginsDirectory: DirectoryProperty

    /**
     * A system directory located within the [sandboxDirectory].
     *
     * @see Constants.Sandbox.SYSTEM
     */
    @get:Internal
    val sandboxSystemDirectory: DirectoryProperty

    /**
     * A log directory located within the [sandboxDirectory].
     *
     * @see Constants.Sandbox.LOG
     */
    @get:Internal
    val sandboxLogDirectory: DirectoryProperty
}
