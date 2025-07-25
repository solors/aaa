package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o60 {
    @NotNull

    /* renamed from: a */
    private final jq0 f83342a;
    @NotNull

    /* renamed from: b */
    private final Handler f83343b;
    @NotNull

    /* renamed from: c */
    private final LinkedHashMap f83344c;

    /* renamed from: d */
    private boolean f83345d;

    /* renamed from: com.yandex.mobile.ads.impl.o60$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC31020a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ n60 f83347c;

        RunnableC31020a(n60 n60Var) {
            this.f83347c = n60Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap linkedHashMap = o60.this.f83344c;
            n60 n60Var = this.f83347c;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry.getValue()).intValue();
                if (cc2.m35258a((View) entry.getKey()) >= 1) {
                    n60Var.mo31655a(intValue);
                }
            }
            o60.this.f83343b.postDelayed(this, 200L);
        }
    }

    public /* synthetic */ o60() {
        this(new jq0(), new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final void m31154a(@NotNull View feedAdView, int i) {
        Intrinsics.checkNotNullParameter(feedAdView, "feedAdView");
        this.f83344c.put(feedAdView, Integer.valueOf(i));
    }

    public o60(@NotNull jq0 mainThreadExecutor, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f83342a = mainThreadExecutor;
        this.f83343b = handler;
        this.f83344c = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void m31155a(@NotNull View feedAdView) {
        Intrinsics.checkNotNullParameter(feedAdView, "feedAdView");
        this.f83344c.remove(feedAdView);
    }

    /* renamed from: a */
    public final void m31153a(@NotNull n60 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f83345d) {
            return;
        }
        this.f83345d = true;
        this.f83342a.m32795a(new RunnableC31020a(listener));
    }

    /* renamed from: a */
    public final void m31156a() {
        this.f83344c.clear();
        this.f83343b.removeCallbacksAndMessages(null);
        this.f83345d = false;
    }
}
