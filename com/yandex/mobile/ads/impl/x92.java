package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class x92 {
    @NotNull

    /* renamed from: a */
    private final m92 f87602a;
    @NotNull

    /* renamed from: b */
    private final Handler f87603b;
    @Nullable

    /* renamed from: c */
    private vh1 f87604c;

    /* renamed from: d */
    private boolean f87605d;

    /* renamed from: com.yandex.mobile.ads.impl.x92$a */
    /* loaded from: classes8.dex */
    private final class RunnableC31805a implements Runnable {
        public RunnableC31805a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long m32063c = x92.this.f87602a.m32063c();
            vh1 vh1Var = x92.this.f87604c;
            if (vh1Var != null) {
                vh1Var.mo28308a(m32063c);
            }
            if (x92.this.f87605d) {
                x92.this.f87603b.postDelayed(this, 200L);
            }
        }
    }

    public x92(@NotNull m92 videoPlayerController, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f87602a = videoPlayerController;
        this.f87603b = handler;
    }

    /* renamed from: a */
    public final void m27610a(@Nullable vh1 vh1Var) {
        this.f87604c = vh1Var;
    }

    /* renamed from: b */
    public final void m27608b() {
        if (this.f87605d) {
            this.f87603b.removeCallbacksAndMessages(null);
            this.f87605d = false;
        }
    }

    /* renamed from: a */
    public final void m27611a() {
        if (this.f87605d) {
            return;
        }
        this.f87605d = true;
        this.f87603b.post(new RunnableC31805a());
    }
}
