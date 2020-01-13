const val KOTLIN_VERSION = "1.3.50"

object AndroidSDK {
    const val MIN = 23
    const val TARGET = 29
    const val COMPILE = TARGET
}

object BuildPlugins {
    private object Versions {
        const val BUILD_TOOLS = "3.5.3"
        const val SAFEARGS = "2.1.0-alpha06"
    }
    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.BUILD_TOOLS}"
    const val KOTLIN_GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
    const val ANDROID_APPLICATION = "com.android.application"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
    const val KOTLIN_KAPT = "kotlin-kapt"
    const val NAVIGATION_SAFEARGS = "androidx.navigation.safeargs.kotlin"
    const val SAFEARGS_GRADLE = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.SAFEARGS}"
}

object Libraries {
    private object Versions {
        const val DAGGER = "2.23.1"
    }
    //Dagger 2
    const val DAGGER = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val DAGGER_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:${Versions.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"
    const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:${Versions.DAGGER}"
}

object AndroidLibraries {
    private object Versions {
        const val APPCOMPAT = "1.1.0-beta01"
        const val CORE_KTX = "1.2.0-alpha01"
        const val CONSTRAINT_LAYOUT = "2.0.0-beta4"
        const val REYCLER_VIEW = "1.0.0"
        const val MATERIAL_COMPONENTS = "1.1.0-alpha07"
        const val LIFE_CYCLE = "2.2.0-alpha01"
        const val COROUTINES = "1.1.1"
    }
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"

    const val KOTLIN_STD = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$KOTLIN_VERSION"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"

    //ConstraintLayout
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"

    //Recyclerview
    const val REYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.REYCLER_VIEW}"

    //Material Components
    const val MATERIAL_COMPONENTS = "com.google.android.material:material:${Versions.MATERIAL_COMPONENTS}"

    //Lifecycle components
    const val LIFE_CYCLE = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFE_CYCLE}"
    const val VIEWMODEL_KOTLIN = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFE_CYCLE}"
    const val LIFE_CYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:${Versions.LIFE_CYCLE}"

    //Coroutines
    const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
}

object TestLibraries {
    private object Versions {
        const val JUNIT = "4.12"
        const val JUNIT_EXT = "1.1.0"
        const val ESPRESSO = "3.1.1"
    }
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val JUNIT_EXT = "androidx.test:runner:${Versions.JUNIT_EXT}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
}