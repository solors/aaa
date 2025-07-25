package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fu1 implements InterfaceC31326s1 {

    /* renamed from: b */
    private static final long f79319b = TimeUnit.SECONDS.toMillis(5);
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f79320a;

    public fu1(@NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f79320a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31326s1
    /* renamed from: a */
    public final long mo29886a() {
        Long m35079I = this.f79320a.m35079I();
        return m35079I != null ? m35079I.longValue() : f79319b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31326s1
    /* renamed from: a */
    public final long mo29885a(long j) {
        Long m35079I = this.f79320a.m35079I();
        return m35079I != null ? Math.min(j, m35079I.longValue()) : j;
    }
}
