package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import td.C44401b;
import td.EnumEntries;

/* renamed from: com.chartboost.sdk.impl.la */
/* loaded from: classes3.dex */
public abstract class AbstractC10024la {

    /* renamed from: a */
    public final InterfaceC10068na f22533a;

    /* renamed from: b */
    public final String f22534b;

    /* renamed from: c */
    public final String f22535c;

    /* renamed from: d */
    public final String f22536d;

    /* renamed from: e */
    public final Mediation f22537e;

    /* renamed from: f */
    public final EnumC10026b f22538f;

    /* renamed from: g */
    public C9833ea f22539g;

    /* renamed from: h */
    public boolean f22540h;

    /* renamed from: i */
    public boolean f22541i;

    /* renamed from: j */
    public long f22542j;

    /* renamed from: k */
    public float f22543k;

    /* renamed from: l */
    public EnumC10025a f22544l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.la$a */
    /* loaded from: classes3.dex */
    public static final class EnumC10025a {

        /* renamed from: b */
        public static final EnumC10025a f22545b = new EnumC10025a("LOW", 0);

        /* renamed from: c */
        public static final EnumC10025a f22546c = new EnumC10025a("HIGH", 1);

        /* renamed from: d */
        public static final /* synthetic */ EnumC10025a[] f22547d;

        /* renamed from: e */
        public static final /* synthetic */ EnumEntries f22548e;

        static {
            EnumC10025a[] m81149a = m81149a();
            f22547d = m81149a;
            f22548e = C44401b.m3113a(m81149a);
        }

        public EnumC10025a(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10025a[] m81149a() {
            return new EnumC10025a[]{f22545b, f22546c};
        }

        public static EnumC10025a valueOf(String str) {
            return (EnumC10025a) Enum.valueOf(EnumC10025a.class, str);
        }

        public static EnumC10025a[] values() {
            return (EnumC10025a[]) f22547d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.la$b */
    /* loaded from: classes3.dex */
    public static final class EnumC10026b {

        /* renamed from: b */
        public static final EnumC10026b f22549b = new EnumC10026b("INFO", 0);

        /* renamed from: c */
        public static final EnumC10026b f22550c = new EnumC10026b("CRITICAL", 1);

        /* renamed from: d */
        public static final EnumC10026b f22551d = new EnumC10026b("ERROR", 2);

        /* renamed from: e */
        public static final /* synthetic */ EnumC10026b[] f22552e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f22553f;

        static {
            EnumC10026b[] m81148a = m81148a();
            f22552e = m81148a;
            f22553f = C44401b.m3113a(m81148a);
        }

        public EnumC10026b(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10026b[] m81148a() {
            return new EnumC10026b[]{f22549b, f22550c, f22551d};
        }

        public static EnumC10026b valueOf(String str) {
            return (EnumC10026b) Enum.valueOf(EnumC10026b.class, str);
        }

        public static EnumC10026b[] values() {
            return (EnumC10026b[]) f22552e.clone();
        }
    }

    public AbstractC10024la(InterfaceC10068na interfaceC10068na, String str, String str2, String str3, Mediation mediation, EnumC10026b enumC10026b, C9833ea c9833ea, boolean z, boolean z2, long j, float f, EnumC10025a enumC10025a) {
        this.f22533a = interfaceC10068na;
        this.f22534b = str;
        this.f22535c = str2;
        this.f22536d = str3;
        this.f22537e = mediation;
        this.f22538f = enumC10026b;
        this.f22539g = c9833ea;
        this.f22540h = z;
        this.f22541i = z2;
        this.f22542j = j;
        this.f22543k = f;
        this.f22544l = enumC10025a;
    }

    /* renamed from: a */
    public final String m81167a() {
        return this.f22535c;
    }

    /* renamed from: b */
    public final float m81162b() {
        return this.f22543k;
    }

    /* renamed from: c */
    public final String m81160c() {
        return this.f22536d;
    }

    /* renamed from: d */
    public final Mediation m81159d() {
        return this.f22537e;
    }

    /* renamed from: e */
    public final String m81158e() {
        return this.f22534b;
    }

    /* renamed from: f */
    public final InterfaceC10068na m81157f() {
        return this.f22533a;
    }

    /* renamed from: g */
    public final EnumC10025a m81156g() {
        return this.f22544l;
    }

    /* renamed from: h */
    public final boolean m81155h() {
        return this.f22541i;
    }

    /* renamed from: i */
    public final long m81154i() {
        return this.f22542j;
    }

    /* renamed from: j */
    public final long m81153j() {
        return AbstractC10385y9.m79863a(this.f22542j);
    }

    /* renamed from: k */
    public final C9833ea m81152k() {
        return this.f22539g;
    }

    /* renamed from: l */
    public final EnumC10026b m81151l() {
        return this.f22538f;
    }

    /* renamed from: m */
    public final boolean m81150m() {
        return this.f22540h;
    }

    public String toString() {
        String value = this.f22533a.getValue();
        String str = this.f22534b;
        String str2 = this.f22535c;
        String str3 = this.f22536d;
        Mediation mediation = this.f22537e;
        EnumC10026b enumC10026b = this.f22538f;
        C9833ea c9833ea = this.f22539g;
        boolean z = this.f22540h;
        boolean z2 = this.f22541i;
        long j = this.f22542j;
        float f = this.f22543k;
        EnumC10025a enumC10025a = this.f22544l;
        long m81153j = m81153j();
        return "TrackingEvent(name=" + value + ", message='" + str + "', impressionAdType='" + str2 + "', location='" + str3 + "', mediation=" + mediation + ", type=" + enumC10026b + ", trackAd=" + c9833ea + ", isLatencyEvent=" + z + ", shouldCalculateLatency=" + z2 + ", timestamp=" + j + ", latency=" + f + ", priority=" + enumC10025a + ", timestampInSeconds=" + m81153j + ")";
    }

    /* renamed from: a */
    public final void m81166a(float f) {
        this.f22543k = f;
    }

    /* renamed from: b */
    public final void m81161b(boolean z) {
        this.f22541i = z;
    }

    /* renamed from: a */
    public final void m81163a(boolean z) {
        this.f22540h = z;
    }

    /* renamed from: a */
    public final void m81164a(EnumC10025a enumC10025a) {
        Intrinsics.checkNotNullParameter(enumC10025a, "<set-?>");
        this.f22544l = enumC10025a;
    }

    /* renamed from: a */
    public final void m81165a(C9833ea c9833ea) {
        this.f22539g = c9833ea;
    }

    public /* synthetic */ AbstractC10024la(InterfaceC10068na interfaceC10068na, String str, String str2, String str3, Mediation mediation, EnumC10026b enumC10026b, C9833ea c9833ea, boolean z, boolean z2, long j, float f, EnumC10025a enumC10025a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10068na, str, str2, str3, mediation, enumC10026b, (i & 64) != 0 ? new C9833ea(null, null, null, null, null, null, null, null, 255, null) : c9833ea, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? System.currentTimeMillis() : j, (i & 1024) != 0 ? 0.0f : f, enumC10025a, null);
    }

    public /* synthetic */ AbstractC10024la(InterfaceC10068na interfaceC10068na, String str, String str2, String str3, Mediation mediation, EnumC10026b enumC10026b, C9833ea c9833ea, boolean z, boolean z2, long j, float f, EnumC10025a enumC10025a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10068na, str, str2, str3, mediation, enumC10026b, c9833ea, z, z2, j, f, enumC10025a);
    }
}
