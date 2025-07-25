package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fk */
/* loaded from: classes8.dex */
public final class C30320fk {
    @NotNull

    /* renamed from: a */
    private final AtomicBoolean f79095a = new AtomicBoolean(false);

    /* renamed from: a */
    public final boolean m34142a() {
        return this.f79095a.get();
    }

    /* renamed from: b */
    public final void m34141b() {
        this.f79095a.set(true);
    }
}
