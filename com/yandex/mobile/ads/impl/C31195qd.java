package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qd */
/* loaded from: classes8.dex */
public final class C31195qd {
    @NotNull

    /* renamed from: a */
    private static final AtomicBoolean f84297a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final /* synthetic */ int f84298b = 0;

    /* renamed from: a */
    public static void m30406a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            boolean z = true;
            if (f84297a.compareAndSet(false, true)) {
                int i = as1.f76895l;
                yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
                if (m35796a == null || !m35796a.m26748l()) {
                    z = false;
                }
                if (oq0.m30945c(context) && !z) {
                    AppMetricaLibraryAdapter.activate(context);
                }
            }
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }
}
