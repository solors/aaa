package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.k */
/* loaded from: classes8.dex */
public abstract class AbstractC30686k<T> extends d32<T> {

    /* renamed from: b */
    private int f81221b = 2;

    /* renamed from: c */
    private T f81222c;

    /* renamed from: a */
    protected abstract T mo31891a();

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final void m32692b() {
        this.f81221b = 3;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        int i = this.f81221b;
        if (i != 4) {
            int m28855a = C31558u8.m28855a(i);
            if (m28855a == 0) {
                return true;
            }
            if (m28855a == 2) {
                return false;
            }
            this.f81221b = 4;
            this.f81222c = mo31891a();
            if (this.f81221b == 3) {
                return false;
            }
            this.f81221b = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f81221b = 2;
            T t = this.f81222c;
            this.f81222c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
