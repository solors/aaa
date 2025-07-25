package com.smaato.sdk.richmedia.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.Supplier;

/* renamed from: com.smaato.sdk.richmedia.util.e */
/* loaded from: classes7.dex */
final class OrientationLockedCompat {
    /* renamed from: a */
    public static /* synthetic */ Boolean m39016a(Activity activity) {
        return m39007j(activity);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m39015b(Activity activity) {
        return m39008i(activity);
    }

    /* renamed from: c */
    public static boolean m39014c(@NonNull final Activity activity) {
        return m39012e(activity.getRequestedOrientation(), new Supplier() { // from class: com.smaato.sdk.richmedia.util.a
            @Override // com.smaato.sdk.core.util.p574fi.Supplier
            public final Object get() {
                return OrientationLockedCompat.m39015b(activity);
            }
        });
    }

    /* renamed from: d */
    public static boolean m39013d(@NonNull final Activity activity) {
        try {
            return m39012e(activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).screenOrientation, new Supplier() { // from class: com.smaato.sdk.richmedia.util.b
                @Override // com.smaato.sdk.core.util.p574fi.Supplier
                public final Object get() {
                    return OrientationLockedCompat.m39016a(activity);
                }
            });
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    private static boolean m39012e(int i, @NonNull Supplier<Boolean> supplier) {
        return m39010g(i, supplier);
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: f */
    private static boolean m39011f(int i, @NonNull Supplier<Boolean> supplier) {
        if (i != 0 && i != 1) {
            if (i != 3) {
                switch (i) {
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        return false;
                }
            } else {
                return supplier.get().booleanValue();
            }
        }
        return true;
    }

    @RequiresApi(api = 18)
    @SuppressLint({"SwitchIntDef"})
    /* renamed from: g */
    private static boolean m39010g(int i, @NonNull Supplier<Boolean> supplier) {
        if (i != 11 && i != 12 && i != 14) {
            return m39011f(i, supplier);
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m39009h(@NonNull Activity activity, @NonNull Function<Activity, Boolean> function) {
        if (!activity.isChild()) {
            return false;
        }
        return function.apply(activity.getParent()).booleanValue();
    }

    /* renamed from: i */
    public static /* synthetic */ Boolean m39008i(Activity activity) {
        return Boolean.valueOf(m39009h(activity, new Function() { // from class: com.smaato.sdk.richmedia.util.c
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(OrientationLockedCompat.m39014c((Activity) obj));
            }
        }));
    }

    /* renamed from: j */
    public static /* synthetic */ Boolean m39007j(Activity activity) {
        return Boolean.valueOf(m39009h(activity, new Function() { // from class: com.smaato.sdk.richmedia.util.d
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(OrientationLockedCompat.m39013d((Activity) obj));
            }
        }));
    }
}
