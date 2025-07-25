package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.hy */
/* loaded from: classes8.dex */
public final class C30513hy implements o50 {

    /* renamed from: b */
    private final InterfaceC30417gu f80238b;

    /* renamed from: c */
    private final long f80239c;

    /* renamed from: d */
    private long f80240d;

    /* renamed from: f */
    private int f80242f;

    /* renamed from: g */
    private int f80243g;

    /* renamed from: e */
    private byte[] f80241e = new byte[65536];

    /* renamed from: a */
    private final byte[] f80237a = new byte[4096];

    static {
        i40.m33371a("goog.exo.extractor");
    }

    public C30513hy(InterfaceC30672ju interfaceC30672ju, long j, long j2) {
        this.f80238b = interfaceC30672ju;
        this.f80240d = j;
        this.f80239c = j2;
    }

    /* renamed from: a */
    public final boolean m33444a(boolean z, int i) throws IOException {
        int i2 = this.f80242f + i;
        byte[] bArr = this.f80241e;
        if (i2 > bArr.length) {
            int i3 = y32.f88010a;
            this.f80241e = Arrays.copyOf(this.f80241e, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int i4 = this.f80243g - this.f80242f;
        while (i4 < i) {
            i4 = m33443a(this.f80241e, this.f80242f, i, i4, z);
            if (i4 == -1) {
                return false;
            }
            this.f80243g = this.f80242f + i4;
        }
        this.f80242f += i;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: b */
    public final void mo27617b(int i) throws IOException {
        m33444a(false, i);
    }

    /* renamed from: c */
    public final int m33441c(byte[] bArr, int i, int i2) throws IOException {
        int min;
        int i3 = this.f80242f + i2;
        byte[] bArr2 = this.f80241e;
        if (i3 > bArr2.length) {
            int i4 = y32.f88010a;
            this.f80241e = Arrays.copyOf(this.f80241e, Math.max(65536 + i3, Math.min(bArr2.length * 2, i3 + 524288)));
        }
        int i5 = this.f80243g;
        int i6 = this.f80242f;
        int i7 = i5 - i6;
        if (i7 == 0) {
            min = m33443a(this.f80241e, i6, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f80243g += min;
        } else {
            min = Math.min(i2, i7);
        }
        System.arraycopy(this.f80241e, this.f80242f, bArr, i, min);
        this.f80242f += min;
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: d */
    public final long mo27613d() {
        return this.f80240d + this.f80242f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f80243g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f80241e, 0, bArr, i, min);
            m33440d(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = m33443a(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.f80240d += i4;
        }
        return i4;
    }

    /* renamed from: d */
    private void m33440d(int i) {
        int i2 = this.f80243g - i;
        this.f80243g = i2;
        this.f80242f = 0;
        byte[] bArr = this.f80241e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f80241e = bArr2;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: b */
    public final long mo27618b() {
        return this.f80239c;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: b */
    public final boolean mo27615b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (m33444a(z, i2)) {
            System.arraycopy(this.f80241e, this.f80242f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: b */
    public final void mo27616b(byte[] bArr, int i, int i2) throws IOException {
        mo27619a(bArr, i, i2, false);
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: a */
    public final long mo27622a() {
        return this.f80240d;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: a */
    public final void mo27620a(byte[] bArr, int i, int i2) throws IOException {
        mo27615b(bArr, i, i2, false);
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: a */
    public final boolean mo27619a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int i3;
        int i4 = this.f80243g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.f80241e, 0, bArr, i, min);
            m33440d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = m33443a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.f80240d += i3;
        }
        return i3 != -1;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: c */
    public final void mo27614c() {
        this.f80242f = 0;
    }

    /* renamed from: c */
    public final int m33442c(int i) throws IOException {
        int min = Math.min(this.f80243g, i);
        m33440d(min);
        if (min == 0) {
            byte[] bArr = this.f80237a;
            min = m33443a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f80240d += min;
        }
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.o50
    /* renamed from: a */
    public final void mo27621a(int i) throws IOException {
        int min = Math.min(this.f80243g, i);
        m33440d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = m33443a(this.f80237a, -i2, Math.min(i, this.f80237a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.f80240d += i2;
        }
    }

    /* renamed from: a */
    private int m33443a(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f80238b.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }
}
