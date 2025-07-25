package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fl0 {
    @NotNull

    /* renamed from: d */
    private static final Object f79103d = new Object();
    @Nullable

    /* renamed from: e */
    private static volatile fl0 f79104e;

    /* renamed from: f */
    public static final /* synthetic */ int f79105f = 0;

    /* renamed from: a */
    private boolean f79106a;

    /* renamed from: b */
    private boolean f79107b;

    /* renamed from: c */
    private boolean f79108c;

    /* renamed from: com.yandex.mobile.ads.impl.fl0$a */
    /* loaded from: classes8.dex */
    public static final class C30322a {
        @NotNull
        /* renamed from: a */
        public static fl0 m34123a() {
            if (fl0.f79104e == null) {
                synchronized (fl0.f79103d) {
                    if (fl0.f79104e == null) {
                        fl0.f79104e = new fl0(0);
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            fl0 fl0Var = fl0.f79104e;
            if (fl0Var != null) {
                return fl0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private fl0() {
        this.f79106a = true;
        this.f79107b = true;
        this.f79108c = true;
    }

    /* renamed from: b */
    public final void m34128b(boolean z) {
        this.f79106a = z;
    }

    /* renamed from: c */
    public final boolean m34127c() {
        return this.f79108c;
    }

    /* renamed from: d */
    public final boolean m34125d() {
        return this.f79106a;
    }

    /* renamed from: e */
    public final boolean m34124e() {
        return this.f79107b;
    }

    /* renamed from: a */
    public final void m34130a(boolean z) {
        this.f79108c = z;
    }

    /* renamed from: c */
    public final void m34126c(boolean z) {
        this.f79107b = z;
    }

    public /* synthetic */ fl0(int i) {
        this();
    }
}
