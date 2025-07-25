package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes2.dex */
public final class AFb1cSDK {
    private final AFa1tSDK AFInAppEventType = new AFa1tSDK() { // from class: com.appsflyer.internal.AFb1cSDK.2
        @Override // com.appsflyer.internal.AFb1cSDK.AFa1tSDK
        public final Class<?> AFKeystoreWrapper(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface AFa1tSDK {
        Class<?> AFKeystoreWrapper(String str) throws ClassNotFoundException;
    }

    /* loaded from: classes2.dex */
    enum AFa1vSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        private final String afRDLog;

        /* renamed from: w */
        private final String f12964w;

        AFa1vSDK(String str, String str2) {
            this.f12964w = str;
            this.afRDLog = str2;
        }
    }

    private boolean AFInAppEventType(String str) {
        try {
            this.AFInAppEventType.AFKeystoreWrapper(str);
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is found.");
            AFLogger.afRDLog(sb2.toString());
            return true;
        } catch (ClassNotFoundException e) {
            StringBuilder sb3 = new StringBuilder("Class: ");
            sb3.append(str);
            sb3.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb3.toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    public final String AFKeystoreWrapper() {
        AFa1vSDK[] values;
        for (AFa1vSDK aFa1vSDK : AFa1vSDK.values()) {
            if (AFInAppEventType(aFa1vSDK.afRDLog)) {
                return aFa1vSDK.f12964w;
            }
        }
        return AFa1vSDK.DEFAULT.f12964w;
    }
}
