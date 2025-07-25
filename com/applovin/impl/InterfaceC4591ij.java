package com.applovin.impl;

import com.ironsource.C21114v8;

/* renamed from: com.applovin.impl.ij */
/* loaded from: classes2.dex */
public interface InterfaceC4591ij {

    /* renamed from: com.applovin.impl.ij$a */
    /* loaded from: classes2.dex */
    public static final class C4592a {

        /* renamed from: a */
        public final C4719kj f6936a;

        /* renamed from: b */
        public final C4719kj f6937b;

        public C4592a(C4719kj c4719kj) {
            this(c4719kj, c4719kj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4592a.class != obj.getClass()) {
                return false;
            }
            C4592a c4592a = (C4592a) obj;
            if (this.f6936a.equals(c4592a.f6936a) && this.f6937b.equals(c4592a.f6937b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f6936a.hashCode() * 31) + this.f6937b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C21114v8.C21123i.f54137d);
            sb2.append(this.f6936a);
            if (this.f6936a.equals(this.f6937b)) {
                str = "";
            } else {
                str = ", " + this.f6937b;
            }
            sb2.append(str);
            sb2.append(C21114v8.C21123i.f54139e);
            return sb2.toString();
        }

        public C4592a(C4719kj c4719kj, C4719kj c4719kj2) {
            this.f6936a = (C4719kj) AbstractC4100b1.m100583a(c4719kj);
            this.f6937b = (C4719kj) AbstractC4100b1.m100583a(c4719kj2);
        }
    }

    /* renamed from: com.applovin.impl.ij$b */
    /* loaded from: classes2.dex */
    public static class C4593b implements InterfaceC4591ij {

        /* renamed from: a */
        private final long f6938a;

        /* renamed from: b */
        private final C4592a f6939b;

        public C4593b(long j) {
            this(j, 0L);
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public boolean mo92788b() {
            return false;
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: d */
        public long mo92786d() {
            return this.f6938a;
        }

        public C4593b(long j, long j2) {
            this.f6938a = j;
            this.f6939b = new C4592a(j2 == 0 ? C4719kj.f7552c : new C4719kj(0L, j2));
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public C4592a mo92787b(long j) {
            return this.f6939b;
        }
    }

    /* renamed from: b */
    C4592a mo92787b(long j);

    /* renamed from: b */
    boolean mo92788b();

    /* renamed from: d */
    long mo92786d();
}
