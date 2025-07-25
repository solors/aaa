package androidx.core.p017os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.util.Locale;

/* renamed from: androidx.core.os.BuildCompat */
/* loaded from: classes.dex */
public class BuildCompat {

    @RequiresOptIn
    /* renamed from: androidx.core.os.BuildCompat$PrereleaseSdkCheck */
    /* loaded from: classes.dex */
    public @interface PrereleaseSdkCheck {
    }

    private BuildCompat() {
    }

    @ChecksSdkIntAtLeast(api = 24)
    @Deprecated
    public static boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @Deprecated
    public static boolean isAtLeastNMR1() {
        if (Build.VERSION.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @Deprecated
    public static boolean isAtLeastO() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @Deprecated
    public static boolean isAtLeastOMR1() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @Deprecated
    public static boolean isAtLeastP() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    protected static boolean isAtLeastPreReleaseCodename(@NonNull String str, @NonNull String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @Deprecated
    public static boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @Deprecated
    public static boolean isAtLeastR() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = ExifInterface.LATITUDE_SOUTH)
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && (i < 30 || !isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @PrereleaseSdkCheck
    @Deprecated
    public static boolean isAtLeastSv2() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32 && (i < 31 || !isAtLeastPreReleaseCodename("Sv2", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @PrereleaseSdkCheck
    public static boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 32 || !isAtLeastPreReleaseCodename("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(codename = "UpsideDownCake")
    @PrereleaseSdkCheck
    public static boolean isAtLeastU() {
        if (Build.VERSION.SDK_INT >= 33 && isAtLeastPreReleaseCodename("UpsideDownCake", Build.VERSION.CODENAME)) {
            return true;
        }
        return false;
    }
}
