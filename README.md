# ATAK Plugin Template

This is a clean, "blank slate" template for developing private ATAK plugins. It is based on the ATAK 5.6.0 SDK and follows modern plugin development patterns.

## Getting Started

### 1. Prerequisites
- **ATAK SDK:** This template assumes you are working within an ATAK SDK environment.
- **Android Studio:** Latest stable version recommended.
- **JDK 17:** Required for ATAK 5.x development.

### 2. How to Use This Template
- **GitHub:** Click the **"Use this template"** button to create a new repository based on this code.
- **Manual:** Copy this directory to your `plugins/` folder in the ATAK SDK.

### 3. Rename Your Plugin
To transition from the template to your own plugin:
1. Update `namespace` and `applicationId` in `app/build.gradle`.
2. Rename the package directory `com.atakmap.android.helloworld` to your desired package name.
3. Update `AndroidManifest.xml` and `app/src/main/assets/plugin.xml` to reflect your new package and class names.
4. Change `app_name` in `strings.xml`.

## Key Concepts

### Context Management
ATAK plugins deal with two types of `Context`:
- **Plugin Context:** Used to resolve resources (layouts, strings, drawables) from your plugin APK.
- **MapView Context:** Used for UI elements like `AlertDialog`, `Toast`, and graphics access.

### Lifecycle & Tools
- `HelloWorldLifecycle`: Manages the plugin's entry point and initialization.
- `HelloWorldTool`: Defines the plugin's presence in the ATAK toolbar/menu.

## Build and Deploy
Run the following to build the APK:
```bash
./gradlew assembleCivDebug
```
The resulting APK will be located in `app/build/outputs/apk/civ/debug/`.

---
*Note: This template is provided as-is for the ATAK development community.*
