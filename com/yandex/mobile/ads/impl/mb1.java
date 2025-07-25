package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes8.dex */
public abstract class mb1<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> mb1<T> m32052a(Comparator<T> comparator) {
        if (comparator instanceof mb1) {
            return (mb1) comparator;
        }
        return new C31225qp(comparator);
    }

    /* renamed from: b */
    public <S extends T> mb1<S> mo28490b() {
        return new hn1(this);
    }

    /* renamed from: a */
    public static <C extends Comparable> mb1<C> m32053a() {
        return v81.f86600b;
    }
}
