package androidx.core.content.p016pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.pm.PermissionInfoCompat */
/* loaded from: classes.dex */
public final class PermissionInfoCompat {

    @RequiresApi(28)
    /* renamed from: androidx.core.content.pm.PermissionInfoCompat$Api28Impl */
    /* loaded from: classes.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static int getProtection(PermissionInfo permissionInfo) {
            int protection;
            protection = permissionInfo.getProtection();
            return protection;
        }

        @DoNotInline
        static int getProtectionFlags(PermissionInfo permissionInfo) {
            int protectionFlags;
            protectionFlags = permissionInfo.getProtectionFlags();
            return protectionFlags;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.content.pm.PermissionInfoCompat$Protection */
    /* loaded from: classes.dex */
    public @interface Protection {
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.content.pm.PermissionInfoCompat$ProtectionFlags */
    /* loaded from: classes.dex */
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
    }

    @SuppressLint({"WrongConstant"})
    public static int getProtection(@NonNull PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getProtection(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int getProtectionFlags(@NonNull PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getProtectionFlags(permissionInfo);
        }
        return permissionInfo.protectionLevel & (-16);
    }
}
