package com.applovin.impl;

import android.util.SparseArray;

/* renamed from: com.applovin.impl.qk */
/* loaded from: classes2.dex */
final class C5204qk {

    /* renamed from: c */
    private final InterfaceC5169q4 f9224c;

    /* renamed from: b */
    private final SparseArray f9223b = new SparseArray();

    /* renamed from: a */
    private int f9222a = -1;

    public C5204qk(InterfaceC5169q4 interfaceC5169q4) {
        this.f9224c = interfaceC5169q4;
    }

    /* renamed from: a */
    public void m96283a(int i, Object obj) {
        if (this.f9222a == -1) {
            AbstractC4100b1.m100577b(this.f9223b.size() == 0);
            this.f9222a = 0;
        }
        if (this.f9223b.size() > 0) {
            SparseArray sparseArray = this.f9223b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC4100b1.m100580a(i >= keyAt);
            if (keyAt == i) {
                InterfaceC5169q4 interfaceC5169q4 = this.f9224c;
                SparseArray sparseArray2 = this.f9223b;
                interfaceC5169q4.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f9223b.append(i, obj);
    }

    /* renamed from: b */
    public void m96281b(int i) {
        int i2 = 0;
        while (i2 < this.f9223b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f9223b.keyAt(i3)) {
                return;
            }
            this.f9224c.accept(this.f9223b.valueAt(i2));
            this.f9223b.removeAt(i2);
            int i4 = this.f9222a;
            if (i4 > 0) {
                this.f9222a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* renamed from: c */
    public Object m96279c(int i) {
        if (this.f9222a == -1) {
            this.f9222a = 0;
        }
        while (true) {
            int i2 = this.f9222a;
            if (i2 <= 0 || i >= this.f9223b.keyAt(i2)) {
                break;
            }
            this.f9222a--;
        }
        while (this.f9222a < this.f9223b.size() - 1 && i >= this.f9223b.keyAt(this.f9222a + 1)) {
            this.f9222a++;
        }
        return this.f9223b.valueAt(this.f9222a);
    }

    /* renamed from: b */
    public Object m96282b() {
        SparseArray sparseArray = this.f9223b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public boolean m96280c() {
        return this.f9223b.size() == 0;
    }

    /* renamed from: a */
    public void m96285a() {
        for (int i = 0; i < this.f9223b.size(); i++) {
            this.f9224c.accept(this.f9223b.valueAt(i));
        }
        this.f9222a = -1;
        this.f9223b.clear();
    }

    /* renamed from: a */
    public void m96284a(int i) {
        for (int size = this.f9223b.size() - 1; size >= 0 && i < this.f9223b.keyAt(size); size--) {
            this.f9224c.accept(this.f9223b.valueAt(size));
            this.f9223b.removeAt(size);
        }
        this.f9222a = this.f9223b.size() > 0 ? Math.min(this.f9222a, this.f9223b.size() - 1) : -1;
    }
}
