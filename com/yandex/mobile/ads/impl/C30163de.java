package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.de */
/* loaded from: classes8.dex */
public final class C30163de {
    @Nullable

    /* renamed from: a */
    private final AppMetricaAdapter f78050a;

    public C30163de(@NotNull Context context) {
        AppMetricaAdapter appMetricaAdapter;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            appMetricaAdapter = new AppMetricaAdapter(context);
        } catch (Throwable th) {
            th.toString();
            um0.m28727b(new Object[0]);
            appMetricaAdapter = null;
        }
        this.f78050a = appMetricaAdapter;
    }

    /* renamed from: a */
    public final void m34957a(@NotNull String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f78050a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.m25924a(apiKey);
            }
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    /* renamed from: b */
    public final void m34955b(@NotNull String experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f78050a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setExperiments(experiments);
            }
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m34956a(@NotNull Set<Long> testIds) {
        Intrinsics.checkNotNullParameter(testIds, "testIds");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f78050a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setTriggeredTestIds(testIds);
            }
        } catch (Throwable unused) {
            testIds.toString();
            um0.m28726c(new Object[0]);
        }
    }
}
