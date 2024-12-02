plugins {
    alias(libs.plugins.conventions.androidApplication) apply false
    alias(libs.plugins.conventions.publishedAndroidLibrary) apply false
    alias(libs.plugins.conventions.root)

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.kapt) apply false
}

allprojects {
    group = "native-platform"
}
