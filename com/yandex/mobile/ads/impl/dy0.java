package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dy0 {
    @NotNull

    /* renamed from: e */
    public static final C30200a f78285e = new C30200a(0);
    @Nullable

    /* renamed from: f */
    private static volatile dy0 f78286f;
    @NotNull

    /* renamed from: a */
    private final Object f78287a = new Object();

    /* renamed from: b */
    private volatile boolean f78288b = true;
    @NotNull

    /* renamed from: c */
    private final C30283f1 f78289c = new C30283f1();
    @NotNull

    /* renamed from: d */
    private final wc1 f78290d = new wc1();

    /* renamed from: com.yandex.mobile.ads.impl.dy0$a */
    /* loaded from: classes8.dex */
    public static final class C30200a {
        private C30200a() {
        }

        @NotNull
        /* renamed from: a */
        public final dy0 m34832a() {
            dy0 dy0Var = dy0.f78286f;
            if (dy0Var == null) {
                synchronized (this) {
                    dy0Var = dy0.f78286f;
                    if (dy0Var == null) {
                        dy0Var = new dy0();
                        dy0.f78286f = dy0Var;
                    }
                }
            }
            return dy0Var;
        }

        public /* synthetic */ C30200a(int i) {
            this();
        }
    }

    /* renamed from: a */
    public final void m34834a(@NotNull Context context) throws em0 {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f78288b) {
            synchronized (this.f78287a) {
                if (this.f78288b) {
                    if (C30155da.m34982a(context)) {
                        this.f78289c.m34394a(context);
                        this.f78290d.getClass();
                        wc1.m27979a(context);
                    }
                    this.f78288b = false;
                }
                Unit unit = Unit.f99208a;
            }
        }
    }
}
