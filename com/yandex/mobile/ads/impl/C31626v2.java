package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v2 */
/* loaded from: classes8.dex */
public final class C31626v2 {
    @NotNull

    /* renamed from: a */
    private final C30530i2 f86532a;
    @NotNull

    /* renamed from: b */
    private final qa2 f86533b;

    public C31626v2(@NotNull Context context, @NotNull C30530i2 adBreak) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        this.f86532a = adBreak;
        this.f86533b = new qa2(context);
    }

    /* renamed from: a */
    public final void m28566a() {
        this.f86533b.m30429a(this.f86532a, "breakEnd");
    }

    /* renamed from: b */
    public final void m28565b() {
        this.f86533b.m30429a(this.f86532a, "error");
    }

    /* renamed from: c */
    public final void m28564c() {
        this.f86533b.m30429a(this.f86532a, "breakStart");
    }
}
