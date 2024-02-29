// Copyright 2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

import com.intellij.testFramework.fixtures.BasePlatformTestCase

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

abstract class TestBase : BasePlatformTestCase() {
    val scope = CoroutineScope(SupervisorJob()) // TODO: Should this come through platform?
}
