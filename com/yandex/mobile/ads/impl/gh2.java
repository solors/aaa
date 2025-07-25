package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gh2 implements pq1 {

    /* renamed from: a */
    private final Context f79662a;

    public gh2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79662a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.pq1
    @NotNull
    /* renamed from: a */
    public final nh2 mo30598a() {
        return new nh2(new za1());
    }

    @Override // com.yandex.mobile.ads.impl.pq1
    @NotNull
    /* renamed from: b */
    public final nx0 mo30597b() {
        Context context = this.f79662a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return C31644vc.m28371a(context, lh2.f81817a, qf2.f84329a);
    }

    @Override // com.yandex.mobile.ads.impl.pq1
    @NotNull
    /* renamed from: c */
    public final qh2 mo30596c() {
        return new qh2(new za1());
    }

    @Override // com.yandex.mobile.ads.impl.pq1
    @NotNull
    /* renamed from: d */
    public final hh2 mo30595d() {
        return new hh2();
    }

    @Override // com.yandex.mobile.ads.impl.pq1
    @NotNull
    /* renamed from: e */
    public final void mo30594e() {
        lh2 lh2Var = lh2.f81817a;
    }
}
