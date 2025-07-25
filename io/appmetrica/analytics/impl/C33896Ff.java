package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Ff */
/* loaded from: classes9.dex */
public final class C33896Ff {

    /* renamed from: a */
    public final String f92839a;

    /* renamed from: b */
    public final long f92840b;

    /* renamed from: c */
    public final long f92841c;

    /* renamed from: d */
    public final EnumC33871Ef f92842d;

    public C33896Ff(byte[] bArr) {
        C33921Gf m22582a = C33921Gf.m22582a(bArr);
        this.f92839a = m22582a.f92915a;
        this.f92840b = m22582a.f92917c;
        this.f92841c = m22582a.f92916b;
        this.f92842d = m22653a(m22582a.f92918d);
    }

    /* renamed from: a */
    public final byte[] m22654a() {
        C33921Gf c33921Gf = new C33921Gf();
        c33921Gf.f92915a = this.f92839a;
        c33921Gf.f92917c = this.f92840b;
        c33921Gf.f92916b = this.f92841c;
        int ordinal = this.f92842d.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 0;
            }
        }
        c33921Gf.f92918d = i;
        return MessageNano.toByteArray(c33921Gf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33896Ff.class != obj.getClass()) {
            return false;
        }
        C33896Ff c33896Ff = (C33896Ff) obj;
        if (this.f92840b == c33896Ff.f92840b && this.f92841c == c33896Ff.f92841c && this.f92839a.equals(c33896Ff.f92839a) && this.f92842d == c33896Ff.f92842d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f92840b;
        long j2 = this.f92841c;
        return this.f92842d.hashCode() + (((((this.f92839a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f92839a + "', referrerClickTimestampSeconds=" + this.f92840b + ", installBeginTimestampSeconds=" + this.f92841c + ", source=" + this.f92842d + '}';
    }

    public C33896Ff(String str, long j, long j2, EnumC33871Ef enumC33871Ef) {
        this.f92839a = str;
        this.f92840b = j;
        this.f92841c = j2;
        this.f92842d = enumC33871Ef;
    }

    /* renamed from: a */
    public static EnumC33871Ef m22653a(int i) {
        if (i != 1) {
            if (i != 2) {
                return EnumC33871Ef.f92792b;
            }
            return EnumC33871Ef.f92794d;
        }
        return EnumC33871Ef.f92793c;
    }
}
