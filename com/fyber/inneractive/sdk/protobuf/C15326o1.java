package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.protobuf.o1 */
/* loaded from: classes4.dex */
public final class C15326o1 {

    /* renamed from: f */
    public static final C15326o1 f30285f = new C15326o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f30286a;

    /* renamed from: b */
    public int[] f30287b;

    /* renamed from: c */
    public Object[] f30288c;

    /* renamed from: d */
    public int f30289d;

    /* renamed from: e */
    public boolean f30290e;

    public C15326o1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static C15326o1 m76839a(C15326o1 c15326o1, C15326o1 c15326o12) {
        int i = c15326o1.f30286a + c15326o12.f30286a;
        int[] copyOf = Arrays.copyOf(c15326o1.f30287b, i);
        System.arraycopy(c15326o12.f30287b, 0, copyOf, c15326o1.f30286a, c15326o12.f30286a);
        Object[] copyOf2 = Arrays.copyOf(c15326o1.f30288c, i);
        System.arraycopy(c15326o12.f30288c, 0, copyOf2, c15326o1.f30286a, c15326o12.f30286a);
        return new C15326o1(i, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C15326o1)) {
            return false;
        }
        C15326o1 c15326o1 = (C15326o1) obj;
        int i = this.f30286a;
        if (i == c15326o1.f30286a) {
            int[] iArr = this.f30287b;
            int[] iArr2 = c15326o1.f30287b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f30288c;
                    Object[] objArr2 = c15326o1.f30288c;
                    int i3 = this.f30286a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f30286a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f30287b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f30288c;
        int i7 = this.f30286a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C15326o1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f30289d = -1;
        this.f30286a = i;
        this.f30287b = iArr;
        this.f30288c = objArr;
        this.f30290e = z;
    }

    /* renamed from: a */
    public final boolean m76842a(int i, AbstractC15348w abstractC15348w) {
        int mo76763t;
        if (this.f30290e) {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                m76841a(i, Long.valueOf(abstractC15348w.mo76771l()));
                return true;
            } else if (i3 == 1) {
                m76841a(i, Long.valueOf(abstractC15348w.mo76774i()));
                return true;
            } else if (i3 == 2) {
                m76841a(i, abstractC15348w.mo76779e());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        m76841a(i, Integer.valueOf(abstractC15348w.mo76775h()));
                        return true;
                    }
                    int i4 = C15325o0.f30284a;
                    throw new C15322n0();
                }
                return false;
            } else {
                C15326o1 c15326o1 = new C15326o1();
                do {
                    mo76763t = abstractC15348w.mo76763t();
                    if (mo76763t == 0) {
                        break;
                    }
                } while (c15326o1.m76842a(mo76763t, abstractC15348w));
                abstractC15348w.mo76789a((i2 << 3) | 4);
                m76841a(i, c15326o1);
                return true;
            }
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void m76841a(int i, Object obj) {
        if (this.f30290e) {
            int i2 = this.f30286a;
            int[] iArr = this.f30287b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f30287b = Arrays.copyOf(iArr, i3);
                this.f30288c = Arrays.copyOf(this.f30288c, i3);
            }
            int[] iArr2 = this.f30287b;
            int i4 = this.f30286a;
            iArr2[i4] = i;
            this.f30288c[i4] = obj;
            this.f30286a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void m76840a(C15219C c15219c) {
        if (this.f30286a == 0) {
            return;
        }
        c15219c.getClass();
        for (int i = 0; i < this.f30286a; i++) {
            int i2 = this.f30287b[i];
            Object obj = this.f30288c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c15219c.f30150a.mo76685b(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c15219c.f30150a.mo76693a(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c15219c.f30150a.mo76690a(i3, (AbstractC15336s) obj);
            } else if (i4 == 3) {
                c15219c.f30150a.mo76681c(i3, 3);
                ((C15326o1) obj).m76840a(c15219c);
                c15219c.f30150a.mo76681c(i3, 4);
            } else if (i4 == 5) {
                c15219c.f30150a.mo76694a(i3, ((Integer) obj).intValue());
            } else {
                int i5 = C15325o0.f30284a;
                throw new RuntimeException(new C15322n0());
            }
        }
    }

    /* renamed from: a */
    public final int m76843a() {
        int m77023b;
        int i = this.f30289d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f30286a; i3++) {
            int i4 = this.f30287b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                m77023b = AbstractC15216B.m77023b(i5) + AbstractC15216B.m77027a(((Long) this.f30288c[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.f30288c[i3]).getClass();
                m77023b = AbstractC15216B.m77023b(i5) + 8;
            } else if (i6 == 2) {
                m77023b = AbstractC15216B.m77026a((AbstractC15336s) this.f30288c[i3]) + AbstractC15216B.m77023b(i5);
            } else if (i6 == 3) {
                i2 = ((C15326o1) this.f30288c[i3]).m76843a() + (AbstractC15216B.m77023b(i5) * 2) + i2;
            } else if (i6 == 5) {
                ((Integer) this.f30288c[i3]).getClass();
                m77023b = AbstractC15216B.m77023b(i5) + 4;
            } else {
                int i7 = C15325o0.f30284a;
                throw new IllegalStateException(new C15322n0());
            }
            i2 = m77023b + i2;
        }
        this.f30289d = i2;
        return i2;
    }
}
