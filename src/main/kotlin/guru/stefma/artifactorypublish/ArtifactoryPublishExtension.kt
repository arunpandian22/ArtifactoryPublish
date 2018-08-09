package guru.stefma.artifactorypublish

import guru.stefma.androidartifacts.AndroidArtifactsExtension

/**
 * A ArtifactoryExtension which takes the AndroidArtifactsExtension
 * as argument to set the default properties for this class.
 */
class ArtifactoryPublishExtension(
        private val artifactsExtension: AndroidArtifactsExtension
) {

    var artifactoryUrl = ""

    var artifactoryRepo = ""

    var artifactoryUser: String? = null

    var artifactoryKey: String? = null

    var artifactId
        set(value) {
            artifactsExtension.artifactId = value
        }
        get() = artifactsExtension.artifactId

    var javadoc
        set(value) {
            artifactsExtension.javadoc = value
        }
        get() = artifactsExtension.javadoc

    var sources
        set(value) {
            artifactsExtension.sources = value
        }
        get() = artifactsExtension.sources

}
