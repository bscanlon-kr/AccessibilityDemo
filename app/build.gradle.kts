import com.kroger.kap.nativeplatform.config.koverAllProjects

plugins {
    alias(libs.plugins.conventions.androidApplication)
}

android {
    namespace = "com.kroger.newgameplus"

    defaultConfig {
        applicationId = "com.kroger.newgameplus"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    testOptions.unitTests.isIncludeAndroidResources = true
}

koverReport {
    defaults {
        mergeWith("debug")
    }

    filters {
        excludes {
            packages(
                "dagger.hilt.internal.aggregatedroot.codegen",
                "hilt_aggregated_deps",
                "com.kroger.app",
                "com.kroger.newgameplus",
            )
            annotatedBy(
                "androidx.compose.runtime.Composable",
                "*Generated*",
            )
        }
    }
}
dependencies {

    implementation(project(":library"))
    implementation(libs.kotlin.stdLib)
    implementation(libs.androidx.core.ktx)

    koverAllProjects(rootProject)
}
