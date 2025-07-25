package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n21 {
    @NotNull

    /* renamed from: c */
    private static final Object f82579c = new Object();
    @Nullable

    /* renamed from: d */
    private static volatile n21 f82580d;

    /* renamed from: e */
    public static final /* synthetic */ int f82581e = 0;
    @NotNull

    /* renamed from: a */
    private final Handler f82582a;

    /* renamed from: b */
    private boolean f82583b;

    /* renamed from: com.yandex.mobile.ads.impl.n21$a */
    /* loaded from: classes8.dex */
    public static final class C30907a {
        @NotNull
        /* renamed from: a */
        public static n21 m31692a() {
            if (n21.f82580d == null) {
                synchronized (n21.f82579c) {
                    if (n21.f82580d == null) {
                        n21.f82580d = new n21();
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            n21 n21Var = n21.f82580d;
            if (n21Var != null) {
                return n21Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* synthetic */ n21() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static /* synthetic */ void m31693b(n21 n21Var, View view) {
        m31696a(n21Var, view);
    }

    /* renamed from: a */
    private final void m31698a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f82583b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f82583b = true;
            }
            this.f82582a.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.dt2
                @Override // java.lang.Runnable
                public final void run() {
                    n21.m31693b(n21.this, view);
                }
            }, 100L);
        }
    }

    /* renamed from: b */
    public final void m31694b(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if ((view instanceof TextView) || (view instanceof dj1)) {
            m31698a(view, motionEvent);
        }
    }

    private n21(Handler handler) {
        this.f82582a = handler;
    }

    /* renamed from: a */
    public static final void m31696a(n21 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (this$0.f82583b) {
            view.setAlpha(view.getAlpha() * 2);
            this$0.f82583b = false;
        }
    }
}
