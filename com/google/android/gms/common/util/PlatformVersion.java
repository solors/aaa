package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.core.p017os.BuildCompat;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @ChecksSdkIntAtLeast(api = 11)
    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 12)
    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 14)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 15)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 16)
    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 17)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 18)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 19)
    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 20)
    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 21)
    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 22)
    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 23)
    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 24)
    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @KeepForSdk
    public static boolean isAtLeastO() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @KeepForSdk
    public static boolean isAtLeastP() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @KeepForSdk
    public static boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @KeepForSdk
    public static boolean isAtLeastR() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 31)
    @KeepForSdk
    public static boolean isAtLeastS() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 32)
    @KeepForSdk
    public static boolean isAtLeastSv2() {
        if (Build.VERSION.SDK_INT >= 32) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 33)
    @KeepForSdk
    public static boolean isAtLeastT() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "UpsideDownCake")
    @KeepForSdk
    public static boolean isAtLeastU() {
        if (!isAtLeastT()) {
            return false;
        }
        return BuildCompat.isAtLeastU();
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "VanillaIceCream")
    @KeepForSdk
    public static boolean isAtLeastV() {
        if (!isAtLeastU()) {
            return false;
        }
        return BuildCompat.isAtLeastV();
    }
}
