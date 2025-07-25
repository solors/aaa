package com.bytedance.sdk.component.p233Kg;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.sdk.component.Kg.iR */
/* loaded from: classes3.dex */
public class C7254iR<V> extends FutureTask<V> implements Comparable<C7254iR<V>> {

    /* renamed from: IL */
    private int f15660IL;

    /* renamed from: bg */
    private int f15661bg;

    public C7254iR(Callable<V> callable, int i, int i2) {
        super(callable);
        this.f15661bg = i == -1 ? 5 : i;
        this.f15660IL = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(C7254iR c7254iR) {
        if (m89466bg() < c7254iR.m89466bg()) {
            return 1;
        }
        return m89466bg() > c7254iR.m89466bg() ? -1 : 0;
    }

    /* renamed from: bg */
    public int m89466bg() {
        return this.f15661bg;
    }

    public C7254iR(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.f15661bg = i == -1 ? 5 : i;
        this.f15660IL = i2;
    }
}
