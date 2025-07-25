package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.chartboost.sdk.impl.h1 */
/* loaded from: classes3.dex */
public class C9879h1 implements Comparable {

    /* renamed from: b */
    public final EnumC10022l8 f22145b;

    /* renamed from: c */
    public final String f22146c;

    /* renamed from: d */
    public final String f22147d;

    /* renamed from: e */
    public final String f22148e;

    /* renamed from: f */
    public final String f22149f;

    /* renamed from: g */
    public final AtomicInteger f22150g;

    /* renamed from: h */
    public final AtomicReference f22151h;

    /* renamed from: i */
    public final AtomicInteger f22152i;

    public C9879h1(EnumC10022l8 enumC10022l8, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference atomicReference, AtomicInteger atomicInteger2, String str4) {
        this.f22145b = enumC10022l8;
        this.f22146c = str;
        this.f22147d = str2;
        this.f22148e = str3;
        this.f22150g = atomicInteger;
        this.f22151h = atomicReference;
        this.f22152i = atomicInteger2;
        this.f22149f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C9879h1 c9879h1) {
        return this.f22145b.m81175b() - c9879h1.f22145b.m81175b();
    }

    /* renamed from: a */
    public void m81582a(Executor executor, boolean z) {
        InterfaceC9799d1 interfaceC9799d1;
        if ((this.f22150g.decrementAndGet() == 0 || !z) && (interfaceC9799d1 = (InterfaceC9799d1) this.f22151h.getAndSet(null)) != null) {
            executor.execute(new RunnableC9823e1(interfaceC9799d1, z, this.f22152i.get()));
        }
    }
}
