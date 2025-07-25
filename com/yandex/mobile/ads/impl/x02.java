package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public interface x02 {

    /* renamed from: com.yandex.mobile.ads.impl.x02$a */
    /* loaded from: classes8.dex */
    public static final class C31785a {

        /* renamed from: a */
        public final int f87480a;

        /* renamed from: b */
        public final byte[] f87481b;

        /* renamed from: c */
        public final int f87482c;

        /* renamed from: d */
        public final int f87483d;

        public C31785a(int i, int i2, int i3, byte[] bArr) {
            this.f87480a = i;
            this.f87481b = bArr;
            this.f87482c = i2;
            this.f87483d = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C31785a.class != obj.getClass()) {
                return false;
            }
            C31785a c31785a = (C31785a) obj;
            if (this.f87480a == c31785a.f87480a && this.f87482c == c31785a.f87482c && this.f87483d == c31785a.f87483d && Arrays.equals(this.f87481b, c31785a.f87481b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f87481b) + (this.f87480a * 31)) * 31) + this.f87482c) * 31) + this.f87483d;
        }
    }

    /* renamed from: a */
    int mo26065a(InterfaceC30417gu interfaceC30417gu, int i, boolean z) throws IOException;

    /* renamed from: a */
    default void m27709a(int i, cc1 cc1Var) {
        mo26056b(i, cc1Var);
    }

    /* renamed from: a */
    void mo26069a(long j, int i, int i2, int i3, @Nullable C31785a c31785a);

    /* renamed from: a */
    void mo26064a(v90 v90Var);

    /* renamed from: b */
    default int m27708b(InterfaceC30417gu interfaceC30417gu, int i, boolean z) throws IOException {
        return mo26065a(interfaceC30417gu, i, z);
    }

    /* renamed from: b */
    void mo26056b(int i, cc1 cc1Var);
}
