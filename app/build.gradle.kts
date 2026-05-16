plugins {
    alias(libs.plugins.android.application)
    // Legacy kapt plugin removed from here to fix the build crash
}

android {
    namespace = "com.example.gramavaxi"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.gramavaxi"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    // Room Database Components (Upgraded version matching your target SDK 36 environment)
    implementation("androidx.room:room-runtime:2.7.0-alpha01")
    implementation("androidx.room:room-ktx:2.7.0-alpha01")
    annotationProcessor("androidx.room:room-compiler:2.7.0-alpha01")

    // WorkManager Component for Background Notifications
    implementation("androidx.work:work-runtime-ktx:2.9.0")

    // Missing Lifecycle Libraries for Coroutines background scopes
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.1")
}