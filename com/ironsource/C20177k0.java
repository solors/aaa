package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.k0 */
/* loaded from: classes6.dex */
public final class C20177k0 {
    @NotNull

    /* renamed from: f */
    public static final C20178a f50769f = new C20178a(null);
    @NotNull

    /* renamed from: g */
    public static final String f50770g = "0";
    @NotNull

    /* renamed from: h */
    public static final String f50771h = "0";
    @NotNull

    /* renamed from: i */
    public static final String f50772i = "0";
    @NotNull

    /* renamed from: j */
    public static final String f50773j = "0";
    @NotNull

    /* renamed from: a */
    private final C20473mi f50774a;
    @NotNull

    /* renamed from: b */
    private EnumC21177we f50775b;
    @NotNull

    /* renamed from: c */
    private String f50776c;
    @NotNull

    /* renamed from: d */
    private EnumC20126j1 f50777d;

    /* renamed from: e */
    private double f50778e;

    @Metadata
    /* renamed from: com.ironsource.k0$a */
    /* loaded from: classes6.dex */
    public static final class C20178a {
        private C20178a() {
        }

        public /* synthetic */ C20178a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20177k0(@NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f50774a = adInstance;
        this.f50775b = EnumC21177we.UnknownProvider;
        this.f50776c = "0";
        this.f50777d = EnumC20126j1.LOAD_REQUEST;
        this.f50778e = new Date().getTime() / 1000.0d;
    }

    /* renamed from: a */
    public static /* synthetic */ C20177k0 m57775a(C20177k0 c20177k0, C20473mi c20473mi, int i, Object obj) {
        if ((i & 1) != 0) {
            c20473mi = c20177k0.f50774a;
        }
        return c20177k0.m57774a(c20473mi);
    }

    @NotNull
    /* renamed from: b */
    public final IronSource.AD_UNIT m57771b() {
        if (this.f50774a.m56298i()) {
            return IronSource.AD_UNIT.BANNER;
        }
        if (this.f50774a.m56293n()) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    @NotNull
    /* renamed from: c */
    public final String m57770c() {
        String m56302e = this.f50774a.m56302e();
        Intrinsics.checkNotNullExpressionValue(m56302e, "adInstance.id");
        return m56302e;
    }

    @NotNull
    /* renamed from: d */
    public final C20473mi m57769d() {
        return this.f50774a;
    }

    @NotNull
    /* renamed from: e */
    public final EnumC21177we m57768e() {
        return this.f50775b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20177k0)) {
            return false;
        }
        C20177k0 c20177k0 = (C20177k0) obj;
        if (Intrinsics.m17075f(m57770c(), c20177k0.m57770c()) && Intrinsics.m17075f(m57766g(), c20177k0.m57766g()) && m57771b() == c20177k0.m57771b() && Intrinsics.m17075f(m57764i(), c20177k0.m57764i()) && this.f50775b == c20177k0.f50775b && Intrinsics.m17075f(this.f50776c, c20177k0.f50776c) && this.f50777d == c20177k0.f50777d) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final EnumC20126j1 m57767f() {
        return this.f50777d;
    }

    @NotNull
    /* renamed from: g */
    public final String m57766g() {
        String m56304c = this.f50774a.m56304c();
        if (m56304c == null) {
            return "0";
        }
        return m56304c;
    }

    @NotNull
    /* renamed from: h */
    public final String m57765h() {
        return this.f50776c;
    }

    public int hashCode() {
        return Objects.hash(m57770c(), m57766g(), m57771b(), m57764i(), this.f50775b, this.f50776c, this.f50777d, Double.valueOf(this.f50778e));
    }

    @NotNull
    /* renamed from: i */
    public final String m57764i() {
        String m56300g = this.f50774a.m56300g();
        Intrinsics.checkNotNullExpressionValue(m56300g, "adInstance.name");
        return m56300g;
    }

    /* renamed from: j */
    public final double m57763j() {
        return this.f50778e;
    }

    @NotNull
    public String toString() {
        String jSONObject = new JSONObject().put("adId", m57770c()).put("advertiserBundleId", this.f50776c).put("adProvider", this.f50775b.ordinal()).put("adStatus", this.f50777d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f50778e).put("adUnitId", m57766g()).put(ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, m57771b().toString()).put("instanceId", m57764i()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return jSONObject;
    }

    @NotNull
    /* renamed from: a */
    public final C20177k0 m57774a(@NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new C20177k0(adInstance);
    }

    @NotNull
    /* renamed from: a */
    public final C20473mi m57778a() {
        return this.f50774a;
    }

    /* renamed from: a */
    public final void m57777a(double d) {
        this.f50778e = d;
    }

    /* renamed from: a */
    public final void m57776a(@NotNull EnumC20126j1 enumC20126j1) {
        Intrinsics.checkNotNullParameter(enumC20126j1, "<set-?>");
        this.f50777d = enumC20126j1;
    }

    /* renamed from: a */
    public final void m57773a(@NotNull EnumC21177we enumC21177we) {
        Intrinsics.checkNotNullParameter(enumC21177we, "<set-?>");
        this.f50775b = enumC21177we;
    }

    /* renamed from: a */
    public final void m57772a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f50776c = str;
    }
}
