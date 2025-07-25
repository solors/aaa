package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class w82 implements b92 {
    @NotNull

    /* renamed from: a */
    private final Handler f87158a = new Handler(Looper.getMainLooper());
    @Nullable

    /* renamed from: b */
    private InterfaceC30118ct f87159b;

    /* renamed from: a */
    public static final void m28004a(w82 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30118ct interfaceC30118ct = this$0.f87159b;
        if (interfaceC30118ct != null) {
            interfaceC30118ct.onVideoComplete();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m28003b(w82 w82Var) {
        m28004a(w82Var);
    }

    @Override // com.yandex.mobile.ads.impl.b92
    public final void onVideoComplete() {
        this.f87158a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.c03
            @Override // java.lang.Runnable
            public final void run() {
                w82.m28003b(w82.this);
            }
        });
    }

    /* renamed from: a */
    public final void m28005a(@Nullable uh2 uh2Var) {
        this.f87159b = uh2Var;
    }
}
