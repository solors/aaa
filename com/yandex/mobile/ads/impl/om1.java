package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31376sl;

/* loaded from: classes8.dex */
public final class om1<T> {
    @Nullable

    /* renamed from: a */
    public final T f83557a;
    @Nullable

    /* renamed from: b */
    public final InterfaceC31376sl.C31377a f83558b;
    @Nullable

    /* renamed from: c */
    public final yc2 f83559c;

    /* renamed from: d */
    public boolean f83560d;

    /* renamed from: com.yandex.mobile.ads.impl.om1$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31053a {
        /* renamed from: a */
        void mo29243a(yc2 yc2Var);
    }

    /* renamed from: com.yandex.mobile.ads.impl.om1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31054b<T> {
        /* renamed from: a */
        void mo28555a(T t);
    }

    private om1(yc2 yc2Var) {
        this.f83560d = false;
        this.f83557a = null;
        this.f83558b = null;
        this.f83559c = yc2Var;
    }

    /* renamed from: a */
    public static <T> om1<T> m30956a(@Nullable T t, @Nullable InterfaceC31376sl.C31377a c31377a) {
        return new om1<>(t, c31377a);
    }

    /* renamed from: a */
    public static <T> om1<T> m30957a(yc2 yc2Var) {
        return new om1<>(yc2Var);
    }

    private om1(@Nullable T t, @Nullable InterfaceC31376sl.C31377a c31377a) {
        this.f83560d = false;
        this.f83557a = t;
        this.f83558b = c31377a;
        this.f83559c = null;
    }
}
