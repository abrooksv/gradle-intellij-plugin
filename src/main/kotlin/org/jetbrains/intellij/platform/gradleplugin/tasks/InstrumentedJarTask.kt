// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.intellij.platform.gradleplugin.tasks

import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.bundling.Jar
import org.jetbrains.intellij.platform.gradleplugin.IntelliJPluginConstants.PLUGIN_GROUP_NAME

/**
 * Creates a JAR file with instrumented classes.
 *
 * @see [InstrumentCodeTask]
 */
@CacheableTask
abstract class InstrumentedJarTask : Jar() {

    init {
        group = PLUGIN_GROUP_NAME
        description = "Assembles an instrumented JAR archive."
    }
}