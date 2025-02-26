Reflect code change in Android Studio / Kotlin

1. Introduce Kotlin code change in source code

2. Reflect code change in Audroid Studio / Emulator

# Commands


1. Build apk

    ``` shell
    ./gradlew assembleDebug
    ```
2. Install apk onto tablet

    ``` shell
    adb install ./app/build/outputs/apk/debug/app-debug.apk
    ```