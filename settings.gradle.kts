include(":app")
include(":library")

rootProject.name = "newgameplus"

pluginManagement {
    repositories {
        maven {
            url = uri("https://krogertechnology.jfrog.io/artifactory/plugins-release")
            credentials {
                username = System.getenv("KT_JFROG_USERID")
                password = System.getenv("KT_JFROG_TOKEN")
            }
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

dependencyResolutionManagement {
    repositories {
        listOf("libs-release", "remote-repos").forEach { repo ->
            maven {
                url = uri("https://krogertechnology.jfrog.io/artifactory/$repo")
                credentials {
                    username = System.getenv("KT_JFROG_USERID")
                    password = System.getenv("KT_JFROG_TOKEN")
                }
            }
        }
    }

    defaultLibrariesExtensionName.set("projectLibs")
    versionCatalogs {
        create("libs") {
            from("com.kroger.kap.nativeplatform.versioncatalogs:android-version-catalog:2.0.0")
            version("bedrock", "1.1.0-beta.2")
            version("conventionPlugin", "2.0.0")

            this.bundle(
                "compose",
                listOf(
                    "androidx-activity-compose",
                    "androidx-compose-material",
                    "androidx-navigation-compose",
                ),
            )

            // FIXME Cannot currently use version from version catalog due to this issue.
            // https://github.com/mockk/mockk/issues/1035
            version("mockk", "1.13.3")
        }
    }
}
