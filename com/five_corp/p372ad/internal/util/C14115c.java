package com.five_corp.p372ad.internal.util;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import java.util.ArrayDeque;

/* renamed from: com.five_corp.ad.internal.util.c */
/* loaded from: classes4.dex */
public final class C14115c {

    /* renamed from: a */
    public final ArrayDeque f26736a = new ArrayDeque();

    /* renamed from: b */
    public final byte[] f26737b = new byte[1];

    /* renamed from: c */
    public final byte[] f26738c = new byte[2];

    /* renamed from: d */
    public final byte[] f26739d = new byte[3];

    /* renamed from: e */
    public final byte[] f26740e = new byte[4];

    /* renamed from: f */
    public final byte[] f26741f = new byte[8];

    /* renamed from: h */
    public int f26743h = 0;

    /* renamed from: g */
    public int f26742g = 0;

    /* renamed from: a */
    public final C14119g m78091a(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f26742g;
        if (i3 != i4) {
            return new C14119g(false, new C14068s(EnumC14106t.f26401K1, String.format("mPosition: %d, mLimit: %d, offsetInData: %d, size: %d, offsetInFile: %d", Integer.valueOf(this.f26743h), Integer.valueOf(this.f26742g), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), null, null));
        }
        if (i2 <= 0) {
            return new C14119g(false, new C14068s(EnumC14106t.f26470T1, String.format("mPosition: %d, mLimit: %d, offsetInData: %d, size: %d, offsetInFile: %d", Integer.valueOf(this.f26743h), Integer.valueOf(this.f26742g), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), null, null));
        }
        this.f26736a.addLast(new C14113a(bArr, i, i2, i4));
        this.f26742g += i2;
        return new C14119g(true, null);
    }

    /* renamed from: b */
    public final int m78090b() {
        C14119g m78092a = m78092a(this.f26740e);
        if (!m78092a.f26746a) {
            m78092a.f26747b.m78136b();
        }
        byte[] bArr = this.f26740e;
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* renamed from: c */
    public final long m78088c() {
        C14119g m78092a = m78092a(this.f26741f);
        if (!m78092a.f26746a) {
            m78092a.f26747b.m78136b();
        }
        byte[] bArr = this.f26741f;
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    /* renamed from: d */
    public final short m78087d() {
        C14119g m78092a = m78092a(this.f26738c);
        if (!m78092a.f26746a) {
            m78092a.f26747b.m78136b();
        }
        byte[] bArr = this.f26738c;
        return (short) (((short) (bArr[1] & 255)) | ((short) ((bArr[0] & 255) << 8)));
    }

    /* renamed from: b */
    public final C14119g m78089b(int i) {
        int i2;
        if (this.f26743h == i) {
            return new C14119g(true, null);
        }
        if (this.f26736a.isEmpty()) {
            return C14119g.m78085b(EnumC14106t.f26377H1);
        }
        int i3 = this.f26743h;
        if (i < i3) {
            return new C14119g(false, new C14068s(EnumC14106t.f26425N1, String.format("Current position: %d, Requested position: %d", Integer.valueOf(i3), Integer.valueOf(i)), null, null));
        }
        do {
            C14113a c14113a = (C14113a) this.f26736a.peekFirst();
            if (c14113a.f26733d + c14113a.f26732c > i) {
                break;
            }
            C14113a c14113a2 = (C14113a) this.f26736a.pollFirst();
            i2 = c14113a2.f26733d + c14113a2.f26732c;
            if (i2 < i && this.f26736a.isEmpty()) {
                return new C14119g(false, new C14068s(EnumC14106t.f26393J1, String.format("Maximum available position: %d, Request position: %d", Integer.valueOf(i2), Integer.valueOf(i)), null, null));
            }
        } while (i2 != i);
        this.f26743h = i;
        return new C14119g(true, null);
    }

    /* renamed from: a */
    public final C14118f m78093a(int i) {
        if (this.f26736a.isEmpty()) {
            return C14118f.m78086a(EnumC14106t.f26417M1);
        }
        C14113a c14113a = (C14113a) this.f26736a.getFirst();
        int i2 = this.f26743h;
        int i3 = i2 + i;
        int i4 = c14113a.f26733d;
        if (i3 <= c14113a.f26732c + i4) {
            C14114b c14114b = new C14114b(c14113a.f26730a, (c14113a.f26731b + i2) - i4);
            C14119g m78089b = m78089b(i3);
            if (m78089b.f26746a) {
                return new C14118f(true, null, c14114b);
            }
            return new C14118f(false, m78089b.f26747b, null);
        }
        byte[] bArr = new byte[i];
        C14119g m78092a = m78092a(bArr);
        if (!m78092a.f26746a) {
            return new C14118f(false, m78092a.f26747b, null);
        }
        return new C14118f(true, null, new C14114b(bArr, 0));
    }

    /* renamed from: a */
    public final byte m78094a() {
        C14119g m78092a = m78092a(this.f26737b);
        if (!m78092a.f26746a) {
            m78092a.f26747b.m78136b();
        }
        return this.f26737b[0];
    }

    /* renamed from: a */
    public final C14119g m78092a(byte[] bArr) {
        int i;
        if (this.f26736a.isEmpty()) {
            return new C14119g(false, new C14068s(EnumC14106t.f26433O1, String.format("Requested data length: %d, current position: %d, current limit: %d", Integer.valueOf(bArr.length), Integer.valueOf(this.f26743h), Integer.valueOf(this.f26742g)), null, null));
        }
        if (this.f26743h < ((C14113a) this.f26736a.peekFirst()).f26733d) {
            return new C14119g(false, new C14068s(EnumC14106t.f26441P1, String.format("Requested data length: %d, current position: %d, current limit: %d", Integer.valueOf(bArr.length), Integer.valueOf(this.f26743h), Integer.valueOf(this.f26742g)), null, null));
        }
        if (this.f26742g < this.f26743h + bArr.length) {
            return new C14119g(false, new C14068s(EnumC14106t.f26449Q1, String.format("Requested data length: %d, current position: %d, current limit: %d", Integer.valueOf(bArr.length), Integer.valueOf(this.f26743h), Integer.valueOf(this.f26742g)), null, null));
        }
        int i2 = 0;
        while (i2 < bArr.length) {
            if (this.f26736a.isEmpty()) {
                return new C14119g(false, new C14068s(EnumC14106t.f26456R1, String.format("Requested data length: %d, available data length: %d, data limit: %d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(this.f26742g)), null, null));
            }
            C14113a c14113a = (C14113a) this.f26736a.peekFirst();
            int i3 = this.f26743h - c14113a.f26733d;
            int i4 = c14113a.f26731b + i3;
            int min = Math.min(bArr.length - i2, c14113a.f26732c - i3);
            if (i4 >= 0) {
                byte[] bArr2 = c14113a.f26730a;
                if (bArr2.length >= i4 + min && i2 >= 0 && bArr.length >= (i = i2 + min) && min >= 0) {
                    System.arraycopy(bArr2, i4, bArr, i2, min);
                    C14119g m78089b = m78089b(this.f26743h + min);
                    if (!m78089b.f26746a) {
                        return m78089b;
                    }
                    i2 = i;
                }
            }
            return new C14119g(false, new C14068s(EnumC14106t.f26463S1, String.format("mPosition: %d, mLimit: %d, writeLength: %d, bytes.length: %d, node.offsetInFile: %d, node.offsetInData: %d, node.size: %d, node.data.length: %d", Integer.valueOf(this.f26743h), Integer.valueOf(this.f26742g), Integer.valueOf(min), Integer.valueOf(bArr.length), Integer.valueOf(c14113a.f26733d), Integer.valueOf(c14113a.f26731b), Integer.valueOf(c14113a.f26732c), Integer.valueOf(c14113a.f26730a.length)), null, null));
        }
        return new C14119g(true, null);
    }
}
