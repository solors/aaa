package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.qo */
/* loaded from: classes2.dex */
public interface InterfaceC5209qo {

    /* renamed from: com.applovin.impl.qo$a */
    /* loaded from: classes2.dex */
    public static final class C5210a {

        /* renamed from: a */
        public final int f9238a;

        /* renamed from: b */
        public final byte[] f9239b;

        /* renamed from: c */
        public final int f9240c;

        /* renamed from: d */
        public final int f9241d;

        public C5210a(int i, byte[] bArr, int i2, int i3) {
            this.f9238a = i;
            this.f9239b = bArr;
            this.f9240c = i2;
            this.f9241d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5210a.class != obj.getClass()) {
                return false;
            }
            C5210a c5210a = (C5210a) obj;
            if (this.f9238a == c5210a.f9238a && this.f9240c == c5210a.f9240c && this.f9241d == c5210a.f9241d && Arrays.equals(this.f9239b, c5210a.f9239b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f9238a * 31) + Arrays.hashCode(this.f9239b)) * 31) + this.f9240c) * 31) + this.f9241d;
        }
    }

    /* renamed from: a */
    default int m96250a(InterfaceC4379f5 interfaceC4379f5, int i, boolean z) {
        return mo96249a(interfaceC4379f5, i, z, 0);
    }

    /* renamed from: a */
    int mo96249a(InterfaceC4379f5 interfaceC4379f5, int i, boolean z, int i2);

    /* renamed from: a */
    void mo96254a(long j, int i, int i2, int i3, C5210a c5210a);

    /* renamed from: a */
    void mo96252a(C4066ah c4066ah, int i, int i2);

    /* renamed from: a */
    void mo96251a(C4310e9 c4310e9);

    /* renamed from: a */
    default void m96253a(C4066ah c4066ah, int i) {
        mo96252a(c4066ah, i, 0);
    }
}
