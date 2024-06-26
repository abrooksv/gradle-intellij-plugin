// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.intellij.platform.gradle.resolvers.latestVersion

import org.jetbrains.intellij.platform.gradle.Constants.Locations
import java.net.URL

class IntelliJPluginVerifierLatestVersionResolver : LatestVersionResolver(
    url = URL("${Locations.MAVEN_REPOSITORY}/org/jetbrains/intellij/plugins/verifier-cli/maven-metadata.xml"),
) {

    override val subject = "IntelliJ Plugin Verifier"

    override fun resolve() = fromMaven()
}
