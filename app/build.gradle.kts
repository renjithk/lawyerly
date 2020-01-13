plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.NAVIGATION_SAFEARGS)
}

android {
    compileSdkVersion(AndroidSDK.COMPILE)
    defaultConfig {
        applicationId = "com.app.lawyerly"
        minSdkVersion(AndroidSDK.MIN)
        targetSdkVersion(AndroidSDK.TARGET)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    dataBinding.isEnabled = true
}

dependencies {
    implementation(AndroidLibraries.KOTLIN_STD)
    implementation(AndroidLibraries.APPCOMPAT)
    implementation(AndroidLibraries.CORE_KTX)
    implementation(AndroidLibraries.CONSTRAINT_LAYOUT)
    implementation(AndroidLibraries.MATERIAL_COMPONENTS)
    implementation(AndroidLibraries.LIFE_CYCLE)
    implementation(AndroidLibraries.VIEWMODEL_KOTLIN)
    implementation(AndroidLibraries.COROUTINE_CORE)
    implementation(AndroidLibraries.COROUTINE_ANDROID)
    kapt(AndroidLibraries.LIFE_CYCLE_COMPILER)

    implementation(Libraries.DAGGER)
    implementation(Libraries.DAGGER_ANDROID_SUPPORT)
    kapt(Libraries.DAGGER_ANDROID_PROCESSOR)
    kapt(Libraries.DAGGER_COMPILER)

    testImplementation(TestLibraries.JUNIT)
    androidTestImplementation(TestLibraries.JUNIT_EXT)
    androidTestImplementation(TestLibraries.ESPRESSO)
}
