// Copyright 2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

import com.intellij.openapi.components.service

class MyPythonProjectServiceTest : TestBase() {

    fun testService() {
        val myProjectService = project.service<MyPythonProjectService>()

        assertEquals(4, myProjectService.getRandomNumber())
    }
}
