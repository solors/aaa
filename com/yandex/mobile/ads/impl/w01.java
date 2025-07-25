package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
final class w01 {

    /* renamed from: a */
    private final int f87069a;

    /* renamed from: b */
    private boolean f87070b;

    /* renamed from: c */
    private boolean f87071c;

    /* renamed from: d */
    public byte[] f87072d;

    /* renamed from: e */
    public int f87073e;

    public w01(int i) {
        this.f87069a = i;
        byte[] bArr = new byte[131];
        this.f87072d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void m28085a(byte[] bArr, int i, int i2) {
        if (this.f87070b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f87072d;
            int length = bArr2.length;
            int i4 = this.f87073e + i3;
            if (length < i4) {
                this.f87072d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f87072d, this.f87073e, i3);
            this.f87073e += i3;
        }
    }

    /* renamed from: b */
    public final void m28084b() {
        this.f87070b = false;
        this.f87071c = false;
    }

    /* renamed from: b */
    public final void m28083b(int i) {
        if (!this.f87070b) {
            boolean z = i == this.f87069a;
            this.f87070b = z;
            if (z) {
                this.f87073e = 3;
                this.f87071c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final boolean m28086a(int i) {
        if (this.f87070b) {
            this.f87073e -= i;
            this.f87070b = false;
            this.f87071c = true;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m28087a() {
        return this.f87071c;
    }
}
