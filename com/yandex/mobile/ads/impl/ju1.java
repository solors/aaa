package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ju1 implements InterfaceC29972ay {

    /* renamed from: b */
    private static final long f81160b = TimeUnit.SECONDS.toMillis(5);
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f81161a;

    public ju1(@NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f81161a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29972ay
    /* renamed from: a */
    public final long mo32726a() {
        Long m35079I = this.f81161a.m35079I();
        if (m35079I != null) {
            return m35079I.longValue();
        }
        return f81160b;
    }
}
