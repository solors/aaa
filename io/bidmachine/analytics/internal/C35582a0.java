package io.bidmachine.analytics.internal;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.a0 */
/* loaded from: classes9.dex */
public final class C35582a0 {

    /* renamed from: a */
    private final String f96399a;

    /* renamed from: b */
    private final String f96400b;

    /* renamed from: c */
    private final long f96401c;

    /* renamed from: d */
    private final String f96402d;

    /* renamed from: e */
    private final C35583a f96403e;

    /* renamed from: f */
    private final C35620j0 f96404f;

    /* renamed from: g */
    private final boolean f96405g;

    /* renamed from: io.bidmachine.analytics.internal.a0$a */
    /* loaded from: classes9.dex */
    public static final class C35583a {

        /* renamed from: a */
        private final String f96406a;

        /* renamed from: b */
        private final String f96407b;

        public C35583a(String str, String str2) {
            this.f96406a = str;
            this.f96407b = str2;
        }

        /* renamed from: a */
        public final String m20282a() {
            return this.f96407b;
        }

        /* renamed from: b */
        public final String m20281b() {
            return this.f96406a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35583a)) {
                return false;
            }
            C35583a c35583a = (C35583a) obj;
            if (Intrinsics.m17075f(this.f96406a, c35583a.f96406a) && Intrinsics.m17075f(this.f96407b, c35583a.f96407b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f96406a.hashCode() * 31) + this.f96407b.hashCode();
        }

        public String toString() {
            return "Rule(tag=" + this.f96406a + ", path=" + this.f96407b + ')';
        }
    }

    public C35582a0(String str, String str2, long j, String str3, C35583a c35583a, C35620j0 c35620j0, boolean z) {
        this.f96399a = str;
        this.f96400b = str2;
        this.f96401c = j;
        this.f96402d = str3;
        this.f96403e = c35583a;
        this.f96404f = c35620j0;
        this.f96405g = z;
    }

    /* renamed from: a */
    public final C35582a0 m20289a(String str, String str2, long j, String str3, C35583a c35583a, C35620j0 c35620j0, boolean z) {
        return new C35582a0(str, str2, j, str3, c35583a, c35620j0, z);
    }

    /* renamed from: b */
    public final C35620j0 m20288b() {
        return this.f96404f;
    }

    /* renamed from: c */
    public final String m20287c() {
        return this.f96399a;
    }

    /* renamed from: d */
    public final String m20286d() {
        return this.f96400b;
    }

    /* renamed from: e */
    public final C35583a m20285e() {
        return this.f96403e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35582a0)) {
            return false;
        }
        C35582a0 c35582a0 = (C35582a0) obj;
        if (Intrinsics.m17075f(this.f96399a, c35582a0.f96399a) && Intrinsics.m17075f(this.f96400b, c35582a0.f96400b) && this.f96401c == c35582a0.f96401c && Intrinsics.m17075f(this.f96402d, c35582a0.f96402d) && Intrinsics.m17075f(this.f96403e, c35582a0.f96403e) && Intrinsics.m17075f(this.f96404f, c35582a0.f96404f) && this.f96405g == c35582a0.f96405g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m20284f() {
        return this.f96401c;
    }

    /* renamed from: g */
    public final boolean m20283g() {
        return this.f96405g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.f96399a.hashCode() * 31) + this.f96400b.hashCode()) * 31) + Long.hashCode(this.f96401c)) * 31) + this.f96402d.hashCode()) * 31) + this.f96403e.hashCode()) * 31;
        C35620j0 c35620j0 = this.f96404f;
        if (c35620j0 == null) {
            hashCode = 0;
        } else {
            hashCode = c35620j0.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.f96405g;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        return "ReaderRecord(id=" + this.f96399a + ", name=" + this.f96400b + ", timestamp=" + this.f96401c + ", dataHash=" + this.f96402d + ", rule=" + this.f96403e + ", error=" + this.f96404f + ", isDirty=" + this.f96405g + ')';
    }

    public /* synthetic */ C35582a0(String str, String str2, long j, String str3, C35583a c35583a, C35620j0 c35620j0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, (i & 4) != 0 ? System.currentTimeMillis() : j, str3, c35583a, (i & 32) != 0 ? null : c35620j0, (i & 64) != 0 ? true : z);
    }

    /* renamed from: a */
    public final String m20291a() {
        return this.f96402d;
    }
}
