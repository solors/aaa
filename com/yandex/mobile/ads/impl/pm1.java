package com.yandex.mobile.ads.impl;

import okio.BufferedSource;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pm1 extends qm1 {

    /* renamed from: b */
    final /* synthetic */ cu0 f84016b;

    /* renamed from: c */
    final /* synthetic */ long f84017c;

    /* renamed from: d */
    final /* synthetic */ BufferedSource f84018d;

    public pm1(long j, cu0 cu0Var, C39200e c39200e) {
        this.f84016b = cu0Var;
        this.f84017c = j;
        this.f84018d = c39200e;
    }

    @Override // com.yandex.mobile.ads.impl.qm1
    /* renamed from: a */
    public final long mo28297a() {
        return this.f84017c;
    }

    @Override // com.yandex.mobile.ads.impl.qm1
    @Nullable
    /* renamed from: b */
    public final cu0 mo28296b() {
        return this.f84016b;
    }

    @Override // com.yandex.mobile.ads.impl.qm1
    @NotNull
    /* renamed from: c */
    public final BufferedSource mo28295c() {
        return this.f84018d;
    }
}
