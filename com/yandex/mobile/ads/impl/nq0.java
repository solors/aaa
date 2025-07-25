package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nq0 {
    @NotNull

    /* renamed from: a */
    private final yz1 f82874a;

    /* renamed from: b */
    private final Context f82875b;
    @NotNull

    /* renamed from: c */
    private final AtomicBoolean f82876c;

    public nq0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82874a = new yz1();
        this.f82875b = context.getApplicationContext();
        this.f82876c = new AtomicBoolean();
    }

    /* renamed from: a */
    public final void m31438a() {
        if (C30155da.m34982a(this.f82875b)) {
            this.f82874a.getClass();
            if (!yz1.m26511a() && !this.f82876c.getAndSet(true)) {
                km0.m32485c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
            }
        }
    }
}
