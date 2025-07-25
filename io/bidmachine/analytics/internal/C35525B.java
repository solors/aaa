package io.bidmachine.analytics.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* renamed from: io.bidmachine.analytics.internal.B */
/* loaded from: classes9.dex */
public final class C35525B {

    /* renamed from: c */
    public static final C35526a f96279c = new C35526a(null);

    /* renamed from: a */
    private final Regex f96280a = new Regex("^(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}) ([A-Z])\\/(\\S+)\\(\\s*(\\d+)\\): (.*)$");

    /* renamed from: b */
    private final C35540J f96281b = new C35540J();

    /* renamed from: io.bidmachine.analytics.internal.B$a */
    /* loaded from: classes9.dex */
    public static final class C35526a {
        private C35526a() {
        }

        public /* synthetic */ C35526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.B$b */
    /* loaded from: classes9.dex */
    public static final class C35527b {

        /* renamed from: a */
        private final long f96282a;

        /* renamed from: b */
        private final String f96283b;

        /* renamed from: c */
        private final String f96284c;

        /* renamed from: d */
        private final String f96285d;

        public C35527b(long j, String str, String str2, String str3) {
            this.f96282a = j;
            this.f96283b = str;
            this.f96284c = str2;
            this.f96285d = str3;
        }

        /* renamed from: a */
        public final String m20408a() {
            return this.f96284c;
        }

        /* renamed from: b */
        public final String m20407b() {
            return this.f96285d;
        }

        /* renamed from: c */
        public final String m20406c() {
            return this.f96283b;
        }

        /* renamed from: d */
        public final long m20405d() {
            return this.f96282a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35527b)) {
                return false;
            }
            C35527b c35527b = (C35527b) obj;
            if (this.f96282a == c35527b.f96282a && Intrinsics.m17075f(this.f96283b, c35527b.f96283b) && Intrinsics.m17075f(this.f96284c, c35527b.f96284c) && Intrinsics.m17075f(this.f96285d, c35527b.f96285d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f96282a) * 31) + this.f96283b.hashCode()) * 31) + this.f96284c.hashCode()) * 31) + this.f96285d.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: a */
    public final C35527b m20409a(String str) {
        long j;
        MatchResult m16768c = Regex.m16768c(this.f96280a, str, 0, 2, null);
        if (m16768c == null) {
            return null;
        }
        MatchResult.C37674b mo16750a = m16768c.mo16750a();
        String str2 = mo16750a.m16771a().mo16748c().get(2);
        String str3 = mo16750a.m16771a().mo16748c().get(3);
        String str4 = mo16750a.m16771a().mo16748c().get(5);
        Long m20383a = this.f96281b.m20383a(mo16750a.m16771a().mo16748c().get(1));
        if (m20383a != null) {
            j = m20383a.longValue();
        } else {
            j = 0;
        }
        return new C35527b(j, str3, str2, str4);
    }
}
