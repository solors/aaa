package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.b */
/* loaded from: classes4.dex */
public final class C14833b {

    /* renamed from: g */
    public static final byte[] f28282g = new byte[4096];

    /* renamed from: a */
    public final InterfaceC15089h f28283a;

    /* renamed from: b */
    public final long f28284b;

    /* renamed from: c */
    public long f28285c;

    /* renamed from: d */
    public byte[] f28286d = new byte[65536];

    /* renamed from: e */
    public int f28287e;

    /* renamed from: f */
    public int f28288f;

    public C14833b(InterfaceC15089h interfaceC15089h, long j, long j2) {
        this.f28283a = interfaceC15089h;
        this.f28285c = j;
        this.f28284b = j2;
    }

    /* renamed from: a */
    public final boolean m77521a(byte[] bArr, int i, int i2, boolean z) {
        if (m77523a(i2, z)) {
            System.arraycopy(this.f28286d, this.f28287e - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m77519b(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.f28288f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.f28286d, 0, bArr, i, min);
            m77520b(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = m77522a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.f28285c += i3;
        }
        return i3 != -1;
    }

    /* renamed from: a */
    public final boolean m77523a(int i, boolean z) {
        int i2 = this.f28287e + i;
        byte[] bArr = this.f28286d;
        if (i2 > bArr.length) {
            int i3 = AbstractC15133z.f29832a;
            this.f28286d = Arrays.copyOf(this.f28286d, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = Math.min(this.f28288f - this.f28287e, i);
        while (min < i) {
            min = m77522a(this.f28286d, this.f28287e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.f28287e + i;
        this.f28287e = i4;
        this.f28288f = Math.max(this.f28288f, i4);
        return true;
    }

    /* renamed from: b */
    public final void m77520b(int i) {
        int i2 = this.f28288f - i;
        this.f28288f = i2;
        this.f28287e = 0;
        byte[] bArr = this.f28286d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f28286d = bArr2;
    }

    /* renamed from: a */
    public final void m77524a(int i) {
        int min = Math.min(this.f28288f, i);
        m77520b(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = m77522a(f28282g, -i2, Math.min(i, i2 + 4096), i2, false);
        }
        if (i2 != -1) {
            this.f28285c += i2;
        }
    }

    /* renamed from: a */
    public final int m77522a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f28283a.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedException();
    }
}
