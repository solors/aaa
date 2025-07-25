package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class nj1 {
    @NotNull

    /* renamed from: b */
    public static final C30952a f82799b = new C30952a(0);
    @NotNull

    /* renamed from: c */
    private static final Object f82800c = new Object();
    @Nullable

    /* renamed from: d */
    private static volatile nj1 f82801d;
    @NotNull

    /* renamed from: a */
    private final WeakHashMap f82802a;

    /* renamed from: com.yandex.mobile.ads.impl.nj1$a */
    /* loaded from: classes8.dex */
    public static final class C30952a {
        private C30952a() {
        }

        @NotNull
        /* renamed from: a */
        public final nj1 m31488a() {
            nj1 nj1Var = nj1.f82801d;
            if (nj1Var == null) {
                synchronized (this) {
                    nj1Var = nj1.f82801d;
                    if (nj1Var == null) {
                        nj1Var = new nj1(0);
                        nj1.f82801d = nj1Var;
                    }
                }
            }
            return nj1Var;
        }

        public /* synthetic */ C30952a(int i) {
            this();
        }
    }

    private nj1() {
        this.f82802a = new WeakHashMap();
    }

    @Nullable
    /* renamed from: a */
    public final String m31490a(@NotNull ml1<?> request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (f82800c) {
            str = (String) this.f82802a.get(request);
        }
        return str;
    }

    public /* synthetic */ nj1(int i) {
        this();
    }

    /* renamed from: a */
    public final void m31491a(@NotNull j21 request, @NotNull String response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        synchronized (f82800c) {
            this.f82802a.put(request, response);
            Unit unit = Unit.f99208a;
        }
    }
}
