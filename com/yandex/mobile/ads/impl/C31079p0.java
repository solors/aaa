package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p0 */
/* loaded from: classes8.dex */
public final class C31079p0 {
    @NotNull

    /* renamed from: a */
    public static final C31079p0 f83664a = new C31079p0();
    @Nullable

    /* renamed from: b */
    private static C31166q0 f83665b;

    private C31079p0() {
    }

    /* renamed from: a */
    public static final void m30860a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f83664a) {
            if (f83665b == null) {
                Context applicationContext = context.getApplicationContext();
                Activity activity = null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    Activity activity2 = context instanceof Activity ? (Activity) context : null;
                    if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                        activity = activity2;
                    }
                    C31166q0 c31166q0 = new C31166q0(new C31324s0(activity));
                    f83665b = c31166q0;
                    application.registerActivityLifecycleCallbacks(c31166q0);
                }
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Nullable
    /* renamed from: a */
    public static final Activity m30861a() {
        Activity m30544a;
        synchronized (f83664a) {
            C31166q0 c31166q0 = f83665b;
            m30544a = c31166q0 != null ? c31166q0.m30544a() : null;
        }
        return m30544a;
    }
}
