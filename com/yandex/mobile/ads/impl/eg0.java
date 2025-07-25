package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class eg0 implements fg0 {
    @NotNull

    /* renamed from: h */
    private static final Object f78551h = new Object();
    @NotNull

    /* renamed from: a */
    private final InterfaceC30014be f78552a;
    @NotNull

    /* renamed from: b */
    private final C31033oe f78553b;
    @NotNull

    /* renamed from: c */
    private final C30842me f78554c;
    @NotNull

    /* renamed from: d */
    private final Context f78555d;
    @Nullable

    /* renamed from: e */
    private C30723ke f78556e;
    @NotNull

    /* renamed from: f */
    private final gg0 f78557f;
    @NotNull

    /* renamed from: g */
    private final String f78558g;

    public eg0(@NotNull Context context, @NotNull InterfaceC30014be appMetricaAdapter, @NotNull C31033oe appMetricaIdentifiersValidator, @NotNull C30842me appMetricaIdentifiersLoader, @NotNull pr0 mauidManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersValidator, "appMetricaIdentifiersValidator");
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersLoader, "appMetricaIdentifiersLoader");
        Intrinsics.checkNotNullParameter(mauidManager, "mauidManager");
        this.f78552a = appMetricaAdapter;
        this.f78553b = appMetricaIdentifiersValidator;
        this.f78554c = appMetricaIdentifiersLoader;
        this.f78557f = gg0.f79651b;
        this.f78558g = mauidManager.m30590a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f78555d = applicationContext;
    }

    @Override // com.yandex.mobile.ads.impl.fg0
    @NotNull
    /* renamed from: a */
    public final String mo34155a() {
        return this.f78558g;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.mobile.ads.impl.ke] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.yandex.mobile.ads.impl.fg0
    @NotNull
    /* renamed from: b */
    public final C30723ke mo34154b() {
        ?? r2;
        C37609n0 c37609n0 = new C37609n0();
        synchronized (f78551h) {
            C30723ke c30723ke = this.f78556e;
            r2 = c30723ke;
            if (c30723ke == null) {
                C30723ke c30723ke2 = new C30723ke(null, this.f78552a.mo28352b(this.f78555d), this.f78552a.mo28356a(this.f78555d));
                this.f78554c.m32043a(this.f78555d, this);
                r2 = c30723ke2;
            }
            c37609n0.f99327b = r2;
            Unit unit = Unit.f99208a;
        }
        return r2;
    }

    @Override // com.yandex.mobile.ads.impl.fg0
    @NotNull
    /* renamed from: c */
    public final gg0 mo34153c() {
        return this.f78557f;
    }

    /* renamed from: a */
    public final void m34593a(@NotNull C30723ke appMetricaIdentifiers) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (f78551h) {
            this.f78553b.getClass();
            if (C31033oe.m31047a(appMetricaIdentifiers)) {
                this.f78556e = appMetricaIdentifiers;
            }
            Unit unit = Unit.f99208a;
        }
    }
}
