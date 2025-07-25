package com.mobilefuse.sdk;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.Telemetry;

/* loaded from: classes7.dex */
public class MobileFuse {
    static final String SDK_NAME = "MobileFuse Ads";
    static MobileFuseImpl sdkImpl;

    static {
        try {
            Telemetry.onAppLaunchInternally("MobileFuseSDK");
            sdkImpl = new MobileFuseImpl();
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuse.class, th);
        }
    }

    @NonNull
    public static MobileFusePrivacyPreferences getPrivacyPreferences() {
        return sdkImpl.getPrivacyPreferences();
    }

    public static String getSdkVersion() {
        return "1.8.0";
    }

    @Deprecated
    public static synchronized void init(Context context, int i, int i2) {
        synchronized (MobileFuse.class) {
            init(context, i, i2, null);
        }
    }

    @Deprecated
    public static synchronized void initSdkServices(Context context) {
        synchronized (MobileFuse.class) {
            MobileFuseServices.requireAllServices();
        }
    }

    static boolean isEnabled() {
        return sdkImpl.isEnabled();
    }

    public static /* synthetic */ void lambda$init$0(SdkInitListener sdkInitListener) {
        try {
            sdkImpl.initSdk(sdkInitListener);
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuse.class, th);
            if (sdkInitListener != null) {
                sdkInitListener.onInitError();
            }
        }
    }

    public static void logDebug(@NonNull String str) {
        try {
            Log.d("MobileFuse SDK", str);
        } catch (Throwable unused) {
        }
    }

    public static void logError(@NonNull String str) {
        try {
            Log.e("MobileFuse SDK", str);
        } catch (Throwable unused) {
        }
    }

    public static void logWarning(@NonNull String str) {
        try {
            Log.w("MobileFuse SDK", str);
        } catch (Throwable unused) {
        }
    }

    public static void setPrivacyPreferences(@NonNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        sdkImpl.setPrivacyPreferences(mobileFusePrivacyPreferences);
    }

    public static void logError(@NonNull String str, Throwable th) {
        try {
            Log.e("MobileFuse SDK", str, th);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static synchronized void init(Context context, int i, int i2, SdkInitListener sdkInitListener) {
        synchronized (MobileFuse.class) {
            init(context, i + "_" + i2, sdkInitListener);
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (MobileFuse.class) {
            init(context, str, (SdkInitListener) null);
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str, SdkInitListener sdkInitListener) {
        synchronized (MobileFuse.class) {
            init(sdkInitListener);
        }
    }

    public static synchronized void init() {
        synchronized (MobileFuse.class) {
            init(null);
        }
    }

    public static synchronized void init(@Nullable final SdkInitListener sdkInitListener) {
        synchronized (MobileFuse.class) {
            try {
                Utils.getHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        MobileFuse.lambda$init$0(sdkInitListener);
                    }
                });
            } catch (Throwable th) {
                StabilityHelper.logException((Class<?>) MobileFuse.class, th);
                if (sdkInitListener != null) {
                    sdkInitListener.onInitError();
                }
            }
        }
    }
}
