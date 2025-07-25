package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class v72 {
    @NotNull

    /* renamed from: a */
    private final aa2 f86588a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31636a f86589b;
    @NotNull

    /* renamed from: c */
    private final Handler f86590c;

    /* renamed from: d */
    private boolean f86591d;

    /* renamed from: e */
    private boolean f86592e;

    /* renamed from: com.yandex.mobile.ads.impl.v72$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31636a {
        /* renamed from: a */
        void mo28511a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.v72$b */
    /* loaded from: classes8.dex */
    private final class RunnableC31637b implements Runnable {
        public RunnableC31637b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!v72.this.f86591d && v72.this.f86588a.mo26325a()) {
                v72.this.f86589b.mo28511a();
                v72.this.f86591d = true;
                v72.this.m28516b();
                return;
            }
            v72.this.f86590c.postDelayed(this, 200L);
        }
    }

    public v72(@NotNull aa2 renderValidator, @NotNull InterfaceC31636a renderingStartListener) {
        Intrinsics.checkNotNullParameter(renderValidator, "renderValidator");
        Intrinsics.checkNotNullParameter(renderingStartListener, "renderingStartListener");
        this.f86588a = renderValidator;
        this.f86589b = renderingStartListener;
        this.f86590c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void m28518a() {
        if (this.f86592e || this.f86591d) {
            return;
        }
        this.f86592e = true;
        this.f86590c.post(new RunnableC31637b());
    }

    /* renamed from: b */
    public final void m28516b() {
        this.f86590c.removeCallbacksAndMessages(null);
        this.f86592e = false;
    }
}
