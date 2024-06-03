plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.pmlyf.composemultimoduleapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.pmlyf.composemultimoduleapp"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        compose = true
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
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



    dependencies {

        val composeBom = platform("androidx.compose:compose-bom:2024.05.00")
        implementation(composeBom)
        androidTestImplementation(composeBom)

        // Choose one of the following:
        // Material Design 3
        implementation(libs.material3)
        // or Material Design 2
//        implementation("androidx.compose.material:material")
        implementation(libs.material)
        // or skip Material Design and build directly on top of foundational components
//        implementation("androidx.compose.foundation:foundation")
        // or only import the main APIs for the underlying toolkit systems,
        // such as input and measurement/layout
//        implementation("androidx.compose.ui:ui")

        // Android Studio Preview support
        implementation(libs.androidStudioPreviewSupport)
//        implementation("androidx.compose.ui:ui-tooling-preview")
//        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation(libs.debugImplementation)
        // UI Tests
//        androidTestImplementation("androidx.compose.ui:ui-test-junit4")
        androidTestImplementation(libs.composeUI)
//        debugImplementation("androidx.compose.ui:ui-test-manifest")
        debugImplementation(libs.composeTestJunit)

        // Optional - Included automatically by material, only add when you need
        // the icons but not the material library (e.g. when using Material3 or a
        // custom design system based on Foundation)
//        implementation("androidx.compose.material:material-icons-core")
        // Optional - Add full set of material icons
//        implementation("androidx.compose.material:material-icons-extended")
        // Optional - Add window size utils
//        implementation("androidx.compose.material3:material3-window-size-class")
        // Optional - Integration with activities
//        implementation("androidx.activity:activity-compose:1.9.0")
//        implementation(libs.activity-compose)
        implementation(libs.activityCompose)
        // Optional - Integration with ViewModels
        implementation(libs.lifecycleViewmodelCompose)
        // Optional - Integration with LiveData
        implementation(libs.runtimeLivedata)
        // Optional - Integration with RxJava
//        implementation("androidx.compose.runtime:runtime-livedata")
        implementation(libs.runtimeRxjava2)

        // Optional - Integration with RxJava
//        implementation("androidx.compose.runtime:runtime-rxjava2")
//        implementation(libs.runtimeRxjava2)


            // DAGGER HILT
        implementation(libs.daggerHilt)
    }
}