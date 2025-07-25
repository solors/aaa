package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;

/* loaded from: classes8.dex */
public interface ps1 {

    /* renamed from: com.yandex.mobile.ads.impl.ps1$a */
    /* loaded from: classes8.dex */
    public static final class C31150a {

        /* renamed from: a */
        public final rs1 f84067a;

        /* renamed from: b */
        public final rs1 f84068b;

        public C31150a(rs1 rs1Var) {
            this(rs1Var, rs1Var);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C31150a.class != obj.getClass()) {
                return false;
            }
            C31150a c31150a = (C31150a) obj;
            if (this.f84067a.equals(c31150a.f84067a) && this.f84068b.equals(c31150a.f84068b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f84068b.hashCode() + (this.f84067a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder(C21114v8.C21123i.f54137d);
            sb2.append(this.f84067a);
            if (this.f84067a.equals(this.f84068b)) {
                str = "";
            } else {
                str = ", " + this.f84068b;
            }
            sb2.append(str);
            sb2.append(C21114v8.C21123i.f54139e);
            return sb2.toString();
        }

        public C31150a(rs1 rs1Var, rs1 rs1Var2) {
            this.f84067a = (rs1) C30937nf.m31570a(rs1Var);
            this.f84068b = (rs1) C30937nf.m31570a(rs1Var2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ps1$b */
    /* loaded from: classes8.dex */
    public static class C31151b implements ps1 {

        /* renamed from: a */
        private final long f84069a;

        /* renamed from: b */
        private final C31150a f84070b;

        public C31151b() {
            this(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final boolean mo28595b() {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: c */
        public final long mo28592c() {
            return this.f84069a;
        }

        public C31151b(long j, long j2) {
            this.f84069a = j;
            this.f84070b = new C31150a(j2 == 0 ? rs1.f84870c : new rs1(0L, j2));
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final C31150a mo28594b(long j) {
            return this.f84070b;
        }
    }

    /* renamed from: b */
    C31150a mo28594b(long j);

    /* renamed from: b */
    boolean mo28595b();

    /* renamed from: c */
    long mo28592c();
}
