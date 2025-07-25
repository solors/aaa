package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.d4 */
/* loaded from: classes6.dex */
public final class C19749d4 {
    @NotNull

    /* renamed from: a */
    private final JSONObject f49711a;

    /* renamed from: b */
    private final boolean f49712b;
    @NotNull

    /* renamed from: c */
    private final String f49713c;

    /* renamed from: d */
    private final boolean f49714d;

    /* renamed from: e */
    private final boolean f49715e;

    /* renamed from: f */
    private final int f49716f;

    /* renamed from: g */
    private final boolean f49717g;

    /* renamed from: h */
    private final boolean f49718h;

    /* renamed from: i */
    private final int f49719i;

    /* renamed from: j */
    private final boolean f49720j;

    /* renamed from: k */
    private final boolean f49721k;
    @Nullable

    /* renamed from: l */
    private final JSONObject f49722l;

    public C19749d4(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f49711a = config;
        this.f49712b = config.optBoolean("isExternalArmEventsEnabled", true);
        String optString = config.optString("externalArmEventsUrl", C19576ac.f49039j);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f49713c = optString;
        this.f49714d = config.optBoolean("sid", true);
        this.f49715e = config.optBoolean("radvid", false);
        this.f49716f = config.optInt("uaeh", 0);
        this.f49717g = config.optBoolean("sharedThreadPool", false);
        this.f49718h = config.optBoolean("sharedThreadPoolADP", true);
        this.f49719i = config.optInt(C19577ad.f49043B0, -1);
        this.f49720j = config.optBoolean("axal", false);
        this.f49721k = config.optBoolean("psrt", false);
        this.f49722l = config.optJSONObject("epConfig");
    }

    /* renamed from: a */
    public static /* synthetic */ C19749d4 m58978a(C19749d4 c19749d4, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = c19749d4.f49711a;
        }
        return c19749d4.m58977a(jSONObject);
    }

    /* renamed from: b */
    public final int m58976b() {
        return this.f49719i;
    }

    @Nullable
    /* renamed from: c */
    public final JSONObject m58975c() {
        return this.f49722l;
    }

    @NotNull
    /* renamed from: d */
    public final String m58974d() {
        return this.f49713c;
    }

    /* renamed from: e */
    public final boolean m58973e() {
        return this.f49721k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19749d4) && Intrinsics.m17075f(this.f49711a, ((C19749d4) obj).f49711a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m58972f() {
        return this.f49715e;
    }

    /* renamed from: g */
    public final boolean m58971g() {
        return this.f49714d;
    }

    /* renamed from: h */
    public final boolean m58970h() {
        return this.f49717g;
    }

    public int hashCode() {
        return this.f49711a.hashCode();
    }

    /* renamed from: i */
    public final boolean m58969i() {
        return this.f49718h;
    }

    /* renamed from: j */
    public final int m58968j() {
        return this.f49716f;
    }

    /* renamed from: k */
    public final boolean m58967k() {
        return this.f49720j;
    }

    /* renamed from: l */
    public final boolean m58966l() {
        return this.f49712b;
    }

    @NotNull
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f49711a + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19749d4 m58977a(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new C19749d4(config);
    }

    /* renamed from: a */
    private final JSONObject m58979a() {
        return this.f49711a;
    }
}
