package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.re */
/* loaded from: classes9.dex */
public final class C34858re extends AbstractC34453cd implements InterfaceC33779An {

    /* renamed from: d */
    public static final C34832qe f95280d = new C34832qe("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e */
    public static final C34832qe f95281e = new C34832qe("PREF_KEY_OFFSET", null);

    /* renamed from: f */
    public static final C34832qe f95282f = new C34832qe("UNCHECKED_TIME", null);

    /* renamed from: g */
    public static final C34832qe f95283g = new C34832qe("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h */
    public static final C34832qe f95284h = new C34832qe("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i */
    public static final C34832qe f95285i = new C34832qe("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j */
    public static final C34832qe f95286j = new C34832qe("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k */
    public static final C34832qe f95287k = new C34832qe("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l */
    public static final C34832qe f95288l = new C34832qe("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m */
    public static final C34832qe f95289m = new C34832qe("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n */
    public static final C34832qe f95290n = new C34832qe("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o */
    public static final C34832qe f95291o = new C34832qe("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p */
    public static final C34832qe f95292p = new C34832qe("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q */
    public static final C34832qe f95293q = new C34832qe("VITAL_DATA", null);

    /* renamed from: r */
    public static final C34832qe f95294r = new C34832qe("LAST_KOTLIN_VERSION_SEND_TIME", null);

    public C34858re(InterfaceC33891Fa interfaceC33891Fa) {
        super(interfaceC33891Fa);
    }

    /* renamed from: a */
    public final long m21028a(int i) {
        return this.f95179a.getLong(f95281e.f95224b, i);
    }

    /* renamed from: b */
    public final C34858re m21019b(boolean z) {
        return (C34858re) m21144b(f95283g.f95224b, z);
    }

    /* renamed from: c */
    public final C34858re m21016c(boolean z) {
        return (C34858re) m21144b(f95282f.f95224b, z);
    }

    /* renamed from: d */
    public final void m21013d(boolean z) {
        m21144b(f95280d.f95224b, z).m21149b();
    }

    /* renamed from: e */
    public final boolean m21012e() {
        return this.f95179a.getBoolean(f95280d.f95224b, false);
    }

    /* renamed from: f */
    public final long m21011f() {
        return this.f95179a.getLong(f95294r.f95224b, 0L);
    }

    /* renamed from: g */
    public final C34858re m21009g() {
        return (C34858re) m21144b(f95292p.f95224b, true);
    }

    /* renamed from: h */
    public final C34858re m21008h() {
        return (C34858re) m21144b(f95291o.f95224b, true);
    }

    /* renamed from: i */
    public final boolean m21007i() {
        return this.f95179a.getBoolean(f95291o.f95224b, false);
    }

    /* renamed from: j */
    public final boolean m21006j() {
        return this.f95179a.getBoolean(f95292p.f95224b, false);
    }

    /* renamed from: a */
    public final boolean m21023a(boolean z) {
        return this.f95179a.getBoolean(f95282f.f95224b, z);
    }

    /* renamed from: b */
    public final C34858re m21022b(long j) {
        return (C34858re) m21146b(f95284h.f95224b, j);
    }

    /* renamed from: c */
    public final C34858re m21017c(long j) {
        return (C34858re) m21146b(f95294r.f95224b, j);
    }

    /* renamed from: d */
    public final C34858re m21014d(long j) {
        return (C34858re) m21146b(f95281e.f95224b, j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34453cd
    @NonNull
    /* renamed from: f */
    public final String mo21010f(@NonNull String str) {
        return new C34832qe(str, null).f95224b;
    }

    /* renamed from: a */
    public final long m21027a(long j) {
        return this.f95179a.getLong(f95284h.f95224b, j);
    }

    /* renamed from: b */
    public final C34858re m21021b(@NonNull EnumC34804pd enumC34804pd, int i) {
        C34832qe c34832qe;
        int ordinal = enumC34804pd.ordinal();
        if (ordinal == 0) {
            c34832qe = f95285i;
        } else if (ordinal != 1) {
            c34832qe = ordinal != 2 ? null : f95287k;
        } else {
            c34832qe = f95286j;
        }
        return c34832qe != null ? (C34858re) m21147b(c34832qe.f95224b, i) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34805pe
    @NonNull
    /* renamed from: c */
    public final Set<String> mo21018c() {
        return this.f95179a.mo21214a();
    }

    @Nullable
    /* renamed from: d */
    public final Boolean m21015d() {
        C34832qe c34832qe = f95283g;
        if (this.f95179a.mo21212a(c34832qe.f95224b)) {
            return Boolean.valueOf(this.f95179a.getBoolean(c34832qe.f95224b, true));
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    @Nullable
    /* renamed from: a */
    public final String mo21029a() {
        return this.f95179a.getString(f95293q.f95224b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    /* renamed from: a */
    public final void mo21024a(@NonNull String str) {
        m21145b(f95293q.f95224b, str).m21149b();
    }

    /* renamed from: b */
    public final C34858re m21020b(@NonNull EnumC34804pd enumC34804pd, long j) {
        C34832qe c34832qe;
        int ordinal = enumC34804pd.ordinal();
        if (ordinal == 0) {
            c34832qe = f95288l;
        } else if (ordinal != 1) {
            c34832qe = ordinal != 2 ? null : f95290n;
        } else {
            c34832qe = f95289m;
        }
        return c34832qe != null ? (C34858re) m21146b(c34832qe.f95224b, j) : this;
    }

    /* renamed from: a */
    public final int m21026a(@NonNull EnumC34804pd enumC34804pd, int i) {
        C34832qe c34832qe;
        int ordinal = enumC34804pd.ordinal();
        if (ordinal == 0) {
            c34832qe = f95285i;
        } else if (ordinal != 1) {
            c34832qe = ordinal != 2 ? null : f95287k;
        } else {
            c34832qe = f95286j;
        }
        if (c34832qe == null) {
            return i;
        }
        return this.f95179a.getInt(c34832qe.f95224b, i);
    }

    /* renamed from: a */
    public final long m21025a(@NonNull EnumC34804pd enumC34804pd, long j) {
        C34832qe c34832qe;
        int ordinal = enumC34804pd.ordinal();
        if (ordinal == 0) {
            c34832qe = f95288l;
        } else if (ordinal != 1) {
            c34832qe = ordinal != 2 ? null : f95290n;
        } else {
            c34832qe = f95289m;
        }
        if (c34832qe == null) {
            return j;
        }
        return this.f95179a.getLong(c34832qe.f95224b, j);
    }
}
