package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class g30 {
    @Nullable

    /* renamed from: c */
    private static g30 f79471c;
    @NotNull

    /* renamed from: d */
    private static final Object f79472d = new Object();

    /* renamed from: e */
    public static final /* synthetic */ int f79473e = 0;
    @NotNull

    /* renamed from: a */
    private final f30 f79474a;
    @NotNull

    /* renamed from: b */
    private fg0 f79475b;

    /* renamed from: com.yandex.mobile.ads.impl.g30$a */
    /* loaded from: classes8.dex */
    public static final class C30360a {
        @NotNull
        /* renamed from: a */
        public static g30 m33939a(@NotNull Context context) {
            g30 g30Var;
            Intrinsics.checkNotNullParameter(context, "context");
            g30 g30Var2 = g30.f79471c;
            if (g30Var2 == null) {
                synchronized (g30.f79472d) {
                    g30Var = g30.f79471c;
                    if (g30Var == null) {
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        g30Var = new g30(applicationContext, new f30(), C30930ne.m31594a(applicationContext));
                        g30.f79471c = g30Var;
                    }
                }
                return g30Var;
            }
            return g30Var2;
        }
    }

    public g30(@NotNull Context appContext, @NotNull f30 environmentConfiguration, @NotNull fg0 appMetricaProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(appMetricaProvider, "appMetricaProvider");
        this.f79474a = environmentConfiguration;
        C37563v.m17166m();
        C37559r0.m17284j();
        this.f79475b = appMetricaProvider;
    }

    @NotNull
    /* renamed from: c */
    public final f30 m33941c() {
        return this.f79474a;
    }

    @NotNull
    /* renamed from: d */
    public final fg0 m33940d() {
        return this.f79475b;
    }
}
