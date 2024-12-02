import com.kroger.kap.nativeplatform.config.junit5

plugins {
    alias(libs.plugins.conventions.publishedAndroidLibrary)
}

android {
    namespace = "com.kroger.library"
}

dependencies {
    junit5()
    testImplementation(libs.truth)

    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.androidx.test.rules)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.junit4)
    androidTestImplementation(libs.mockk.android)
}
