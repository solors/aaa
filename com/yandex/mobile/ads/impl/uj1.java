package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uj1 {
    @NotNull

    /* renamed from: a */
    private final qj1 f86301a;
    @NotNull

    /* renamed from: b */
    private final List<pm0> f86302b;

    /* renamed from: c */
    private final int f86303c;
    @Nullable

    /* renamed from: d */
    private final q30 f86304d;
    @NotNull

    /* renamed from: e */
    private final nl1 f86305e;

    /* renamed from: f */
    private final int f86306f;

    /* renamed from: g */
    private final int f86307g;

    /* renamed from: h */
    private final int f86308h;

    /* renamed from: i */
    private int f86309i;

    /* JADX WARN: Multi-variable type inference failed */
    public uj1(@NotNull qj1 call, @NotNull List<? extends pm0> interceptors, int i, @Nullable q30 q30Var, @NotNull nl1 request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f86301a = call;
        this.f86302b = interceptors;
        this.f86303c = i;
        this.f86304d = q30Var;
        this.f86305e = request;
        this.f86306f = i2;
        this.f86307g = i3;
        this.f86308h = i4;
    }

    @NotNull
    /* renamed from: a */
    public final qj1 m28752a() {
        return this.f86301a;
    }

    @NotNull
    /* renamed from: b */
    public final qj1 m28749b() {
        return this.f86301a;
    }

    /* renamed from: c */
    public final int m28748c() {
        return this.f86306f;
    }

    @Nullable
    /* renamed from: d */
    public final q30 m28747d() {
        return this.f86304d;
    }

    /* renamed from: e */
    public final int m28746e() {
        return this.f86307g;
    }

    @NotNull
    /* renamed from: f */
    public final nl1 m28745f() {
        return this.f86305e;
    }

    /* renamed from: g */
    public final int m28744g() {
        return this.f86308h;
    }

    /* renamed from: h */
    public final int m28743h() {
        return this.f86307g;
    }

    @NotNull
    /* renamed from: i */
    public final nl1 m28742i() {
        return this.f86305e;
    }

    /* renamed from: a */
    public static uj1 m28750a(uj1 uj1Var, int i, q30 q30Var, nl1 nl1Var, int i2) {
        if ((i2 & 1) != 0) {
            i = uj1Var.f86303c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            q30Var = uj1Var.f86304d;
        }
        q30 q30Var2 = q30Var;
        if ((i2 & 4) != 0) {
            nl1Var = uj1Var.f86305e;
        }
        nl1 request = nl1Var;
        int i4 = uj1Var.f86306f;
        int i5 = uj1Var.f86307g;
        int i6 = uj1Var.f86308h;
        Intrinsics.checkNotNullParameter(request, "request");
        return new uj1(uj1Var.f86301a, uj1Var.f86302b, i3, q30Var2, request, i4, i5, i6);
    }

    @NotNull
    /* renamed from: a */
    public final mm1 m28751a(@NotNull nl1 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f86303c < this.f86302b.size()) {
            this.f86309i++;
            q30 q30Var = this.f86304d;
            if (q30Var != null) {
                if (q30Var.m30487h().m29873a(request.m31476g())) {
                    if (this.f86309i != 1) {
                        throw new IllegalStateException(("network interceptor " + this.f86302b.get(this.f86303c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f86302b.get(this.f86303c - 1) + " must retain the same host and port").toString());
                }
            }
            uj1 m28750a = m28750a(this, this.f86303c + 1, null, request, 58);
            pm0 pm0Var = this.f86302b.get(this.f86303c);
            mm1 mo30614a = pm0Var.mo30614a(m28750a);
            if (mo30614a != null) {
                if (this.f86304d != null && this.f86303c + 1 < this.f86302b.size() && m28750a.f86309i != 1) {
                    throw new IllegalStateException(("network interceptor " + pm0Var + " must call proceed() exactly once").toString());
                } else if (mo30614a.m31930a() != null) {
                    return mo30614a;
                } else {
                    throw new IllegalStateException(("interceptor " + pm0Var + " returned a response with no body").toString());
                }
            }
            throw new NullPointerException("interceptor " + pm0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
