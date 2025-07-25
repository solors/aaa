package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.Arrays;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;

/* loaded from: classes8.dex */
public final class nx0 implements jl1 {
    @NotNull

    /* renamed from: e */
    private static final Object f83179e = new Object();
    @Nullable

    /* renamed from: a */
    private final jl1 f83180a;

    /* renamed from: b */
    private final boolean f83181b;
    @NotNull

    /* renamed from: c */
    private final Executor f83182c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC38501j f83183d;

    public nx0(@Nullable jl1 jl1Var, @NotNull InterfaceC38501j<? extends i42> lazyVarioqubAdapter, boolean z, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(lazyVarioqubAdapter, "lazyVarioqubAdapter");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f83180a = jl1Var;
        this.f83181b = z;
        this.f83182c = executor;
        this.f83183d = lazyVarioqubAdapter;
    }

    /* renamed from: a */
    private static void m31249a(String str, Map map) {
        int m17292f;
        String m17416c;
        m17292f = MapsJVM.m17292f(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m17292f);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            m17416c = Arrays.m17416c(new Object[]{entry.getValue()});
            linkedHashMap.put(key, m17416c);
        }
        linkedHashMap.toString();
        um0.m28728a(new Object[0]);
    }

    /* renamed from: b */
    private static void m31246b(String str, Throwable th) {
        Objects.toString(th);
        um0.m28727b(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    public final void reportError(@NotNull final String message, @NotNull final Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f83181b) {
            if (this.f83180a != null) {
                this.f83182c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.qt2
                    {
                        nx0.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        nx0.m31247b(nx0.this, message, error);
                    }
                });
            } else {
                um0.m28725d(new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    public final void reportUnhandledException(@NotNull final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.f83180a != null) {
            this.f83182c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.nt2
                {
                    nx0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nx0.m31250a(nx0.this, throwable);
                }
            });
        } else {
            um0.m28725d(new Object[0]);
        }
    }

    /* renamed from: b */
    public static final void m31247b(nx0 this$0, String message, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(error, "$error");
        try {
            this$0.getClass();
            m31244c(message, error);
            this$0.f83180a.reportError(message, error);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    /* renamed from: c */
    private static void m31244c(String str, Throwable th) {
        Objects.toString(th);
        um0.m28727b(new Object[0]);
    }

    /* renamed from: a */
    private static void m31248a(Throwable th) {
        Objects.toString(th);
        um0.m28727b(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    /* renamed from: a */
    public final void mo27967a(@NotNull final String message, @NotNull final Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f83180a != null) {
            this.f83182c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.pt2
                {
                    nx0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nx0.m31251a(nx0.this, message, error);
                }
            });
        } else {
            um0.m28725d(new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m31251a(nx0 this$0, String message, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(error, "$error");
        try {
            this$0.getClass();
            m31246b(message, error);
            this$0.f83180a.mo27967a(message, error);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    /* renamed from: a */
    public final void mo27968a(@NotNull final fl1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (this.f83180a != null) {
            this.f83182c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.ot2
                {
                    nx0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nx0.m31252a(nx0.this, report);
                }
            });
        } else {
            um0.m28725d(new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m31252a(nx0 this$0, fl1 report) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(report, "$report");
        try {
            j42.m33045a((i42) this$0.f83183d.getValue(), report);
            m31249a(report.m34120c(), report.m34121b());
            this$0.f83180a.mo27968a(report);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m31250a(nx0 this$0, Throwable throwable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(throwable, "$throwable");
        try {
            this$0.getClass();
            m31248a(throwable);
            this$0.f83180a.reportUnhandledException(throwable);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    /* renamed from: a */
    public final void mo27966a(boolean z) {
        jl1 jl1Var = this.f83180a;
        if (jl1Var != null) {
            jl1Var.mo27966a(z);
        }
    }
}
