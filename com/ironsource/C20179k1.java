package com.ironsource;

import com.ironsource.AbstractC19682c7;
import com.ironsource.AbstractC21070uc;
import com.ironsource.C20220ks;
import com.ironsource.C21205x1;
import com.ironsource.lifecycle.C20271b;
import com.ironsource.mediationsdk.C20410l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.k1 */
/* loaded from: classes6.dex */
public class C20179k1 extends C20593ok {
    @NotNull

    /* renamed from: b */
    private final IronSource.AD_UNIT f50780b;
    @NotNull

    /* renamed from: c */
    private final C20220ks.C20222b f50781c;
    @NotNull

    /* renamed from: d */
    private final C20257lb f50782d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC20097ig f50783e;

    /* renamed from: f */
    private final long f50784f;

    @Metadata
    /* renamed from: com.ironsource.k1$a */
    /* loaded from: classes6.dex */
    public static final class C20180a {
        @NotNull

        /* renamed from: a */
        public static final C20180a f50785a = new C20180a();

        private C20180a() {
        }

        @NotNull
        /* renamed from: a */
        public static final C20179k1 m57744a(@NotNull IronSource.AD_UNIT adFormat, @NotNull C21205x1.EnumC21207b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C20179k1(adFormat, level);
        }
    }

    public C20179k1(@NotNull C20179k1 adTools, @NotNull C21205x1.EnumC21207b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f50783e = C19821el.f49880p.m58785d().mo57089r();
        this.f50784f = TimeUnit.HOURS.toMillis(1L);
        IronSource.AD_UNIT ad_unit = adTools.f50780b;
        this.f50780b = ad_unit;
        this.f50781c = adTools.f50781c;
        this.f50782d = new C20257lb(ad_unit, level, adTools.f50782d.m57500c(), null, 8, null);
    }

    @NotNull
    /* renamed from: a */
    public final ISBannerSize m57761a(@NotNull LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C20022h1().m58314b(adSize);
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC19682c7.C19685b m57756b(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C19588ak mo57983a = this.f50783e.mo57983a();
        if (mo57983a != null) {
            return mo57983a.m59435a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    /* renamed from: c */
    public final AbstractC21070uc.C21071a m57754c(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C19588ak mo57983a = this.f50783e.mo57983a();
        if (mo57983a != null) {
            return mo57983a.m59430b(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    /* renamed from: d */
    protected final IronSource.AD_UNIT m57753d() {
        return this.f50780b;
    }

    @NotNull
    /* renamed from: e */
    public final C20257lb m57751e() {
        return this.f50782d;
    }

    /* renamed from: f */
    public final long m57749f() {
        C19588ak mo57983a = this.f50783e.mo57983a();
        return mo57983a != null ? mo57983a.m59428i() : this.f50784f;
    }

    /* renamed from: g */
    public final int m57747g() {
        return C19821el.f49880p.m58785d().mo57093k().mo56312a(this.f50780b);
    }

    /* renamed from: h */
    public final boolean m57745h() {
        return C19821el.f49880p.m58785d().mo57089r().mo57981c();
    }

    public C20179k1(@NotNull IronSource.AD_UNIT adFormat, @NotNull C21205x1.EnumC21207b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f50783e = C19821el.f49880p.m58785d().mo57089r();
        this.f50784f = TimeUnit.HOURS.toMillis(1L);
        this.f50780b = adFormat;
        this.f50782d = new C20257lb(adFormat, level, null, null, 12, null);
        C20220ks.C20222b m57614a = C20220ks.m57614a(adFormat);
        Intrinsics.checkNotNullExpressionValue(m57614a, "createLogFactory(adFormat)");
        this.f50781c = m57614a;
    }

    @NotNull
    /* renamed from: a */
    public final Placement m57760a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        C19588ak mo57983a = this.f50783e.mo57983a();
        if (mo57983a != null) {
            Placement m59436a = mo57983a.m59436a(LevelPlay.AdFormat.BANNER, placementName);
            if (m59436a != null) {
                return m59436a;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    /* renamed from: b */
    public final C20271b m57757b() {
        C20271b m57448d = C20271b.m57448d();
        Intrinsics.checkNotNullExpressionValue(m57448d, "getInstance()");
        return m57448d;
    }

    @NotNull
    /* renamed from: c */
    public final String m57755c() {
        return m57762a(this, (String) null, (String) null, 3, (Object) null);
    }

    @Nullable
    /* renamed from: d */
    public final Placement m57752d(@Nullable String str) {
        C19588ak mo57983a;
        if (str == null || (mo57983a = this.f50783e.mo57983a()) == null) {
            return null;
        }
        return mo57983a.m59436a(LevelPlay.AdFormat.INTERSTITIAL, str);
    }

    @NotNull
    /* renamed from: e */
    public final String m57750e(@Nullable String str) {
        return m57762a(this, str, (String) null, 2, (Object) null);
    }

    @NotNull
    /* renamed from: f */
    public final Placement m57748f(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        C19588ak mo57983a = this.f50783e.mo57983a();
        if (mo57983a != null) {
            Placement m59436a = mo57983a.m59436a(LevelPlay.AdFormat.NATIVE_AD, placementName);
            if (m59436a != null) {
                return m59436a;
            }
            throw new IllegalStateException("Error getting sdk configurations");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @Nullable
    /* renamed from: g */
    public final Placement m57746g(@Nullable String str) {
        C19588ak mo57983a = this.f50783e.mo57983a();
        if (mo57983a != null) {
            return mo57983a.m59436a(LevelPlay.AdFormat.REWARDED, str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* renamed from: a */
    public static /* synthetic */ String m57762a(C20179k1 c20179k1, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return c20179k1.m57759a(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
    }

    @NotNull
    /* renamed from: a */
    public final String m57759a(@Nullable String str, @Nullable String str2) {
        String m57605a = this.f50781c.m57605a(str, str2);
        Intrinsics.checkNotNullExpressionValue(m57605a, "logFactory.createLogMessage(message, suffix)");
        return m57605a;
    }

    /* renamed from: a */
    public final void m57758a(@NotNull Map<String, Object> data, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        C20410l.m56784a(data, size);
    }
}
