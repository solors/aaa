package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class el0 implements wl0 {
    @NotNull

    /* renamed from: a */
    private final Handler f78694a;
    @Nullable

    /* renamed from: b */
    private vi0 f78695b;

    public /* synthetic */ el0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static final void m34501a(el0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vi0 vi0Var = this$0.f78695b;
        if (vi0Var != null) {
            vi0Var.onInstreamAdPrepared();
        }
    }

    /* renamed from: b */
    public static final void m34498b(el0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vi0 vi0Var = this$0.f78695b;
        if (vi0Var != null) {
            vi0Var.onInstreamAdCompleted();
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m34497c(el0 el0Var) {
        m34498b(el0Var);
    }

    /* renamed from: d */
    public static /* synthetic */ void m34496d(el0 el0Var, String str) {
        m34500a(el0Var, str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m34495e(el0 el0Var) {
        m34501a(el0Var);
    }

    @Override // com.yandex.mobile.ads.impl.wl0
    public final void onInstreamAdPrepared() {
        this.f78694a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.cn2
            @Override // java.lang.Runnable
            public final void run() {
                el0.m34495e(el0.this);
            }
        });
    }

    public el0(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f78694a = handler;
    }

    @Override // com.yandex.mobile.ads.impl.wl0
    /* renamed from: a */
    public final void mo27875a() {
        this.f78694a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.dn2
            @Override // java.lang.Runnable
            public final void run() {
                el0.m34497c(el0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.wl0
    /* renamed from: b */
    public final void mo27874b() {
        Intrinsics.checkNotNullParameter("Video player returned error", "reason");
        this.f78694a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.en2
            @Override // java.lang.Runnable
            public final void run() {
                el0.m34496d(el0.this, r2);
            }
        });
    }

    /* renamed from: a */
    public static final void m34500a(el0 this$0, String reason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        vi0 vi0Var = this$0.f78695b;
        if (vi0Var != null) {
            vi0Var.onError(reason);
        }
    }

    /* renamed from: a */
    public final void m34499a(@Nullable hg2 hg2Var) {
        this.f78695b = hg2Var;
    }
}
