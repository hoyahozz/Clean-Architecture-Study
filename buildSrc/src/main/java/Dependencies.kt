object Kotlin {
    const val KOTLIN_STDLIB      = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}"
    const val COROUTINES_CORE    = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLIN_COROUTINE}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLIN_COROUTINE}"
}


object AndroidX {
    const val APP_COMPAT                  = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val CORE_KTX                    = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val CONSTRAINT_LAYOUT           = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val LIFECYCLE_RUNTIME_KTX       = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"

    const val COMPOSE_UI                  = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val COMPOSE_MATERIAL            = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val COMPOSE_PREVIEW             = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
    const val COMPOSE_UI_TOOLING          = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val COMPOSE_MATERIAL_ICON       = "androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
    const val ACTIVITY_COMPOSE            = "androidx.activity:activity-compose:${Versions.COMPOSE}"
    const val HILT_NAVIGATION_COMPOSE     = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
}

object Google {
    const val HILT_ANDROID                = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_ANDROID_COMPILER       = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_CORE                   = "com.google.dagger:hilt-core:${Versions.HILT}"

    const val MATERIAL                    = "com.google.android.material:material:${Versions.MATERIAL}"
}

object Libraries {
    const val RETROFIT                    = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER_GSON     = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val OKHTTP                      = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR  = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"

    const val COIL                        = "io.coil-kt:coil-compose:${Versions.COIL}"
}

object UnitTest {
    const val JUNIT                       = "junit:junit:${Versions.JUNIT}"
    const val COMPOSE_JUNIT               = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
}

object AndroidTest {
    const val ANDROID_JUNIT               = "junit:junit:${Versions.ANDROID_JUNIT}"
    const val ESPRESSO_CORE               = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}