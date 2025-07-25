package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zq0 implements qq0 {
    @NotNull

    /* renamed from: a */
    private final Handler f89074a;
    @Nullable

    /* renamed from: b */
    private qq0 f89075b;

    public /* synthetic */ zq0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static final void m26023a(zq0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qq0 qq0Var = this$0.f89075b;
        if (qq0Var != null) {
            qq0Var.onInstreamAdBreakCompleted();
        }
    }

    /* renamed from: b */
    public static final void m26021b(zq0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qq0 qq0Var = this$0.f89075b;
        if (qq0Var != null) {
            qq0Var.onInstreamAdBreakPrepared();
        }
    }

    /* renamed from: c */
    public static final void m26020c(zq0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qq0 qq0Var = this$0.f89075b;
        if (qq0Var != null) {
            qq0Var.onInstreamAdBreakStarted();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m26019d(zq0 zq0Var) {
        m26023a(zq0Var);
    }

    /* renamed from: e */
    public static /* synthetic */ void m26018e(zq0 zq0Var) {
        m26021b(zq0Var);
    }

    /* renamed from: f */
    public static /* synthetic */ void m26017f(zq0 zq0Var, String str) {
        m26022a(zq0Var, str);
    }

    /* renamed from: g */
    public static /* synthetic */ void m26016g(zq0 zq0Var) {
        m26020c(zq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakCompleted() {
        this.f89074a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.d23
            @Override // java.lang.Runnable
            public final void run() {
                zq0.m26019d(zq0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakError(@NotNull final String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f89074a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.c23
            @Override // java.lang.Runnable
            public final void run() {
                zq0.m26017f(zq0.this, reason);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakPrepared() {
        this.f89074a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.b23
            @Override // java.lang.Runnable
            public final void run() {
                zq0.m26018e(zq0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakStarted() {
        this.f89074a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.a23
            @Override // java.lang.Runnable
            public final void run() {
                zq0.m26016g(zq0.this);
            }
        });
    }

    public zq0(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f89074a = handler;
    }

    /* renamed from: a */
    public static final void m26022a(zq0 this$0, String reason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        qq0 qq0Var = this$0.f89075b;
        if (qq0Var != null) {
            qq0Var.onInstreamAdBreakError(reason);
        }
    }

    /* renamed from: a */
    public final void m26024a(@Nullable eg2 eg2Var) {
        this.f89075b = eg2Var;
    }
}
