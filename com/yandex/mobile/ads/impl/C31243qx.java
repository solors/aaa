package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.yandex.mobile.ads.impl.qx */
/* loaded from: classes8.dex */
public final class C31243qx {
    @NotNull

    /* renamed from: a */
    private final TimeUnit f84574a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC38501j f84575b;

    public C31243qx(@NotNull TimeUnit timeUnit) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f84574a = timeUnit;
        m14554a = LazyJVM.m14554a(new C31157px(this));
        this.f84575b = m14554a;
    }

    /* renamed from: a */
    public static final /* synthetic */ long m30200a(C31243qx c31243qx) {
        c31243qx.getClass();
        return 1L;
    }

    /* renamed from: a */
    public final long m30201a() {
        return ((Number) this.f84575b.getValue()).longValue();
    }
}
