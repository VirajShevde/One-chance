plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.example.onechance"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.onechance"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    androidResources { noCompress += listOf("swf", "wasm") }
    kotlinOptions { jvmTarget = "17" }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies {
    implementation("androidx.webkit:webkit:1.11.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
