package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.np */
/* loaded from: classes8.dex */
public final class C30962np {
    @NotNull

    /* renamed from: a */
    private f30 f82864a;
    @NotNull

    /* renamed from: b */
    private C31807xb f82865b;
    @NotNull

    /* renamed from: c */
    private final List<String> f82866c;

    public /* synthetic */ C30962np() {
        this(new C31807xb(), new f30());
    }

    @NotNull
    /* renamed from: a */
    public final C31807xb m31449a() {
        return this.f82865b;
    }

    @NotNull
    /* renamed from: b */
    public final f30 m31446b() {
        return this.f82864a;
    }

    @NotNull
    /* renamed from: c */
    public final List<String> m31445c() {
        return this.f82866c;
    }

    /* renamed from: a */
    public final void m31447a(@NotNull C31807xb c31807xb) {
        Intrinsics.checkNotNullParameter(c31807xb, "<set-?>");
        this.f82865b = c31807xb;
    }

    public C30962np(@NotNull C31807xb advertisingConfiguration, @NotNull f30 environmentConfiguration) {
        List<String> m17163p;
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        this.f82864a = environmentConfiguration;
        this.f82865b = advertisingConfiguration;
        m17163p = C37563v.m17163p("small", "medium", "large");
        this.f82866c = m17163p;
    }

    /* renamed from: a */
    public final void m31448a(@NotNull f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<set-?>");
        this.f82864a = f30Var;
    }
}
