package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class oq0 {
    @Nullable
    /* renamed from: a */
    public static String m30948a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (String) m30947a(context, pq0.f84053f.m30599a());
    }

    @Nullable
    /* renamed from: b */
    public static Boolean m30946b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Boolean) m30947a(context, pq0.f84051d.m30599a());
    }

    /* renamed from: c */
    public static boolean m30945c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) m30947a(context, pq0.f84054g.m30599a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m30944d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) m30947a(context, pq0.f84050c.m30599a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    /* renamed from: e */
    public static Boolean m30943e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Boolean) m30947a(context, pq0.f84052e.m30599a());
    }

    /* renamed from: f */
    public static boolean m30942f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) m30947a(context, pq0.f84055h.m30599a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private static Object m30947a(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
        return null;
    }
}
