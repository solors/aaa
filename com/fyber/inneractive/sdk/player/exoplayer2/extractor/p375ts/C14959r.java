package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r */
/* loaded from: classes4.dex */
public final class C14959r {

    /* renamed from: a */
    public final int f29227a;

    /* renamed from: b */
    public boolean f29228b;

    /* renamed from: c */
    public boolean f29229c;

    /* renamed from: d */
    public byte[] f29230d;

    /* renamed from: e */
    public int f29231e;

    public C14959r(int i) {
        this.f29227a = i;
        byte[] bArr = new byte[131];
        this.f29230d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void m77404a(byte[] bArr, int i, int i2) {
        if (this.f29228b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f29230d;
            int length = bArr2.length;
            int i4 = this.f29231e + i3;
            if (length < i4) {
                this.f29230d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f29230d, this.f29231e, i3);
            this.f29231e += i3;
        }
    }

    /* renamed from: b */
    public final void m77403b(int i) {
        boolean z = true;
        if (!this.f29228b) {
            if (i != this.f29227a) {
                z = false;
            }
            this.f29228b = z;
            if (z) {
                this.f29231e = 3;
                this.f29229c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final boolean m77405a(int i) {
        if (this.f29228b) {
            this.f29231e -= i;
            this.f29228b = false;
            this.f29229c = true;
            return true;
        }
        return false;
    }
}
