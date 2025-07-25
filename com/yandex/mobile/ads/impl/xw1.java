package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes8.dex */
final class xw1<V> {

    /* renamed from: c */
    private final InterfaceC31228qq<V> f87894c;

    /* renamed from: b */
    private final SparseArray<V> f87893b = new SparseArray<>();

    /* renamed from: a */
    private int f87892a = -1;

    public xw1(InterfaceC31228qq<V> interfaceC31228qq) {
        this.f87894c = interfaceC31228qq;
    }

    /* renamed from: a */
    public final void m27179a(int i, V v) {
        if (this.f87892a == -1) {
            if (this.f87893b.size() == 0) {
                this.f87892a = 0;
            } else {
                throw new IllegalStateException();
            }
        }
        if (this.f87893b.size() > 0) {
            SparseArray<V> sparseArray = this.f87893b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                throw new IllegalArgumentException();
            }
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.f87893b;
                this.f87894c.mo27114a(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f87893b.append(i, v);
    }

    /* renamed from: b */
    public final V m27177b(int i) {
        if (this.f87892a == -1) {
            this.f87892a = 0;
        }
        while (true) {
            int i2 = this.f87892a;
            if (i2 <= 0 || i >= this.f87893b.keyAt(i2)) {
                break;
            }
            this.f87892a--;
        }
        while (this.f87892a < this.f87893b.size() - 1 && i >= this.f87893b.keyAt(this.f87892a + 1)) {
            this.f87892a++;
        }
        return this.f87893b.valueAt(this.f87892a);
    }

    /* renamed from: c */
    public final boolean m27176c() {
        if (this.f87893b.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final V m27178b() {
        SparseArray<V> sparseArray = this.f87893b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: a */
    public final void m27181a() {
        for (int i = 0; i < this.f87893b.size(); i++) {
            this.f87894c.mo27114a(this.f87893b.valueAt(i));
        }
        this.f87892a = -1;
        this.f87893b.clear();
    }

    /* renamed from: a */
    public final void m27180a(int i) {
        int i2 = 0;
        while (i2 < this.f87893b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f87893b.keyAt(i3)) {
                return;
            }
            this.f87894c.mo27114a(this.f87893b.valueAt(i2));
            this.f87893b.removeAt(i2);
            int i4 = this.f87892a;
            if (i4 > 0) {
                this.f87892a = i4 - 1;
            }
            i2 = i3;
        }
    }
}
