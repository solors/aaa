package com.applovin.impl;

import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.nb */
/* loaded from: classes2.dex */
final class C4997nb {

    /* renamed from: a */
    private int f8532a = 0;

    /* renamed from: b */
    private int f8533b = -1;

    /* renamed from: c */
    private int f8534c = 0;

    /* renamed from: d */
    private int[] f8535d = new int[16];

    /* renamed from: e */
    private int f8536e = 15;

    /* renamed from: b */
    private void m97023b() {
        int[] iArr = this.f8535d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f8532a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f8535d, 0, iArr2, i2, i);
            this.f8532a = 0;
            this.f8533b = this.f8534c - 1;
            this.f8535d = iArr2;
            this.f8536e = length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void m97024a(int i) {
        if (this.f8534c == this.f8535d.length) {
            m97023b();
        }
        int i2 = (this.f8533b + 1) & this.f8536e;
        this.f8533b = i2;
        this.f8535d[i2] = i;
        this.f8534c++;
    }

    /* renamed from: c */
    public boolean m97022c() {
        if (this.f8534c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int m97021d() {
        int i = this.f8534c;
        if (i != 0) {
            int[] iArr = this.f8535d;
            int i2 = this.f8532a;
            int i3 = iArr[i2];
            this.f8532a = (i2 + 1) & this.f8536e;
            this.f8534c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public void m97025a() {
        this.f8532a = 0;
        this.f8533b = -1;
        this.f8534c = 0;
    }
}
