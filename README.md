# Lifecycle getCurrentState() Bug

## Details

App is stuck on `INITIALIZED` state, even the activity has already finished `onResume()` method call

## Steps to Reproduce

  - Build a signed production release `apk` with proguard `minifyEnabled true` (default)
  - Install on `Pixel 3a` running `Android 10`
  - Tap `UPDATE STATUS` button to examine the retrieved current state
  - Note that the expected word shall be `RESUMED`, as is on other devices (even on Android 10 emulator) except `Pixel 3a / Android 10`

## Notes

  - `'androidx.lifecycle:lifecycle-runtime:2.1.0'` doesn't have the issue
  - disable or removed `proguard` works