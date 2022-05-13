plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Configs.COMPILE_SDK

    defaultConfig {
        minSdk = Configs.MIN_SDK
        targetSdk = Configs.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(Kotlin.KOTLIN_STDLIB)
    implementation(Kotlin.COROUTINES_ANDROID)
    implementation(Kotlin.COROUTINES_CORE)

    implementation(AndroidX.APP_COMPAT)
    implementation(AndroidX.CORE_KTX)
    implementation(AndroidX.LIFECYCLE_RUNTIME_KTX)

    implementation(AndroidX.COMPOSE_UI)
    implementation(AndroidX.COMPOSE_MATERIAL)
    implementation(AndroidX.COMPOSE_PREVIEW)
    implementation(AndroidX.ACTIVITY_COMPOSE)

    implementation(Libraries.COIL)

    implementation(Google.HILT_ANDROID)
    kapt(Google.HILT_ANDROID_COMPILER)

    androidTestImplementation(UnitTest.COMPOSE_JUNIT)
    debugImplementation(AndroidX.COMPOSE_UI_TOOLING)
}