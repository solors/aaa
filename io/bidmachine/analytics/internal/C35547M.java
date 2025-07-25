package io.bidmachine.analytics.internal;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.M */
/* loaded from: classes9.dex */
public final class C35547M {

    /* renamed from: g */
    public static final C35548a f96326g = new C35548a(null);

    /* renamed from: a */
    private final String f96327a;

    /* renamed from: b */
    private final String f96328b;

    /* renamed from: c */
    private final String f96329c;

    /* renamed from: d */
    private final long f96330d;

    /* renamed from: e */
    private final Map f96331e;

    /* renamed from: f */
    private final C35620j0 f96332f;

    /* renamed from: io.bidmachine.analytics.internal.M$a */
    /* loaded from: classes9.dex */
    public static final class C35548a {
        private C35548a() {
        }

        public /* synthetic */ C35548a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C35547M(String str, String str2, String str3, long j, Map map, C35620j0 c35620j0) {
        this.f96327a = str;
        this.f96328b = str2;
        this.f96329c = str3;
        this.f96330d = j;
        this.f96331e = map;
        this.f96332f = c35620j0;
    }

    /* renamed from: a */
    public final C35547M m20375a(String str, String str2, String str3, long j, Map map, C35620j0 c35620j0) {
        return new C35547M(str, str2, str3, j, map, c35620j0);
    }

    /* renamed from: b */
    public final C35620j0 m20374b() {
        return this.f96332f;
    }

    /* renamed from: c */
    public final String m20373c() {
        return this.f96327a;
    }

    /* renamed from: d */
    public final String m20372d() {
        return this.f96328b;
    }

    /* renamed from: e */
    public final String m20371e() {
        return this.f96329c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35547M)) {
            return false;
        }
        C35547M c35547m = (C35547M) obj;
        if (Intrinsics.m17075f(this.f96327a, c35547m.f96327a) && Intrinsics.m17075f(this.f96328b, c35547m.f96328b) && Intrinsics.m17075f(this.f96329c, c35547m.f96329c) && this.f96330d == c35547m.f96330d && Intrinsics.m17075f(this.f96331e, c35547m.f96331e) && Intrinsics.m17075f(this.f96332f, c35547m.f96332f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m20370f() {
        return this.f96330d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.f96327a.hashCode() * 31) + this.f96328b.hashCode()) * 31) + this.f96329c.hashCode()) * 31) + Long.hashCode(this.f96330d)) * 31) + this.f96331e.hashCode()) * 31;
        C35620j0 c35620j0 = this.f96332f;
        if (c35620j0 == null) {
            hashCode = 0;
        } else {
            hashCode = c35620j0.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "MonitorRecord(id=" + this.f96327a + ", name=" + this.f96328b + ", sessionId=" + this.f96329c + ", timestamp=" + this.f96330d + ", data=" + this.f96331e + ", error=" + this.f96332f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C35547M(java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13, java.util.Map r15, io.bidmachine.analytics.internal.C35620j0 r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 1
            if (r0 == 0) goto Le
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2 = r0
            goto Lf
        Le:
            r2 = r10
        Lf:
            r0 = r17 & 8
            if (r0 == 0) goto L19
            long r0 = java.lang.System.currentTimeMillis()
            r5 = r0
            goto L1a
        L19:
            r5 = r13
        L1a:
            r0 = r17 & 16
            if (r0 == 0) goto L24
            java.util.Map r0 = kotlin.collections.C37554o0.m17366j()
            r7 = r0
            goto L25
        L24:
            r7 = r15
        L25:
            r0 = r17 & 32
            if (r0 == 0) goto L2c
            r0 = 0
            r8 = r0
            goto L2e
        L2c:
            r8 = r16
        L2e:
            r1 = r9
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.C35547M.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.util.Map, io.bidmachine.analytics.internal.j0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: a */
    public static /* synthetic */ C35547M m20376a(C35547M c35547m, String str, String str2, String str3, long j, Map map, C35620j0 c35620j0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c35547m.f96327a;
        }
        if ((i & 2) != 0) {
            str2 = c35547m.f96328b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c35547m.f96329c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = c35547m.f96330d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            map = c35547m.f96331e;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            c35620j0 = c35547m.f96332f;
        }
        return c35547m.m20375a(str, str4, str5, j2, map2, c35620j0);
    }

    /* renamed from: a */
    public final Map m20377a() {
        return this.f96331e;
    }
}
