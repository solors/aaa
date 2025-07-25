package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ic1 {
    @NotNull

    /* renamed from: a */
    private final me0 f80407a;
    @NotNull

    /* renamed from: b */
    private final Handler f80408b;
    @NotNull

    /* renamed from: c */
    private final nu1 f80409c;
    @NotNull

    /* renamed from: d */
    private final RunnableC30367g7 f80410d;

    /* renamed from: e */
    private boolean f80411e;

    public ic1(@NotNull me0 htmlWebViewRenderer, @NotNull Handler handler, @NotNull nu1 singleTimeRunner, @NotNull RunnableC30367g7 adRenderWaitBreaker) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(singleTimeRunner, "singleTimeRunner");
        Intrinsics.checkNotNullParameter(adRenderWaitBreaker, "adRenderWaitBreaker");
        this.f80407a = htmlWebViewRenderer;
        this.f80408b = handler;
        this.f80409c = singleTimeRunner;
        this.f80410d = adRenderWaitBreaker;
    }

    /* renamed from: b */
    public static /* synthetic */ void m33311b(ic1 ic1Var) {
        m33314a(ic1Var);
    }

    /* renamed from: a */
    public final void m33316a() {
        this.f80408b.removeCallbacksAndMessages(null);
        this.f80410d.m33914a(null);
    }

    /* renamed from: b */
    public final void m33312b() {
        if (this.f80411e) {
            return;
        }
        this.f80409c.m31279a(new Runnable() { // from class: com.yandex.mobile.ads.impl.hq2
            @Override // java.lang.Runnable
            public final void run() {
                ic1.m33311b(ic1.this);
            }
        });
    }

    /* renamed from: a */
    public final void m33315a(int i, @Nullable String str) {
        this.f80411e = true;
        this.f80408b.removeCallbacks(this.f80410d);
        this.f80408b.post(new ae2(i, str, this.f80407a));
    }

    /* renamed from: a */
    public static final void m33314a(ic1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        um0.m28725d(new Object[0]);
        this$0.f80408b.postDelayed(this$0.f80410d, 10000L);
    }

    /* renamed from: a */
    public final void m33313a(@Nullable le0 le0Var) {
        this.f80410d.m33914a(le0Var);
    }
}
