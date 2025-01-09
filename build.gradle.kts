plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdkVersion(33)

    defaultConfig {
        applicationId = "com.example.pic2text3"
        minSdkVersion(21) // Increased minSdkVersion
        targetSdkVersion(33)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    // Define Kotlin version
    kotlinOptions {
        jvmTarget = "1.8" // Or adjust to your desired JVM target
    }
}

dependencies {
    implementation("com.google.mlkit:vision:31.0.0")
    implementation("com.google.mlkit:vision-text:31.0.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0") // Replace with actual Kotlin version
    implementation("androidx.core:core-ktx:1.9.0") // Updated to a newer version
    implementation("androidx.appcompat:appcompat:1.5.1") // Updated to a newer version
    implementation("com.google.android.material:material:1.7.0") // Updated to a newer version
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Updated to a newer version
    testImplementation("junit:junit:4.13.2") // Updated to a newer version
    androidTestImplementation("androidx.test.ext:junit:1.1.3") // Updated to a newer version
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0") // Updated to a newer version
}