package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes9.dex */
public class FrameworkDetector {

    /* renamed from: a */
    private static final String f92444a = new FrameworkDetector().detectFramework();

    @NonNull
    public static String framework() {
        return f92444a;
    }

    @NonNull
    @VisibleForTesting
    public String detectFramework() {
        if (ReflectionUtils.detectClassExists(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME)) {
            return "unity";
        }
        if (ReflectionUtils.detectClassExists("mono.MonoPackageManager")) {
            return PluginErrorDetails.Platform.XAMARIN;
        }
        if (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin")) {
            return PluginErrorDetails.Platform.CORDOVA;
        }
        if (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView")) {
            return "react";
        }
        if (ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine")) {
            return PluginErrorDetails.Platform.FLUTTER;
        }
        return "native";
    }
}
