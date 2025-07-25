package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.acm.services.f */
/* loaded from: classes7.dex */
public final class C23853f {
    @NotNull

    /* renamed from: a */
    public final InterfaceC23854g f61897a;
    @NotNull

    /* renamed from: b */
    public final AtomicLong f61898b;

    public C23853f(@NotNull InterfaceC23854g timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f61897a = timeProviderService;
        this.f61898b = new AtomicLong(0L);
    }

    /* renamed from: a */
    public final long m47613a() {
        return this.f61897a.invoke() - this.f61898b.get();
    }

    /* renamed from: b */
    public final void m47612b() {
        this.f61898b.set(this.f61897a.invoke());
    }
}
