package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mh2 implements o52 {
    @NotNull

    /* renamed from: a */
    private final ua1 f82216a;
    @NotNull

    /* renamed from: b */
    private final Object f82217b;
    @NotNull

    /* renamed from: c */
    private final ArrayList f82218c;

    public mh2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82216a = ua1.f86178g.m28831a(context);
        this.f82217b = new Object();
        this.f82218c = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.o52
    /* renamed from: a */
    public final void mo31158a() {
        List<p52> m17553Z0;
        synchronized (this.f82217b) {
            m17553Z0 = _Collections.m17553Z0(this.f82218c);
            this.f82218c.clear();
            Unit unit = Unit.f99208a;
        }
        for (p52 p52Var : m17553Z0) {
            this.f82216a.m28840a(p52Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.o52
    /* renamed from: a */
    public final void mo31157a(@NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f82217b) {
            this.f82218c.add(listener);
            this.f82216a.m28837b(listener);
            Unit unit = Unit.f99208a;
        }
    }
}
