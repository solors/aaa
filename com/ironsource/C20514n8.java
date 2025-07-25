package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.n8 */
/* loaded from: classes6.dex */
public final class C20514n8 {
    @NotNull

    /* renamed from: a */
    private final C20600op f52148a;
    @NotNull

    /* renamed from: b */
    private final C19992gi f52149b;
    @NotNull

    /* renamed from: c */
    private final C20322m6 f52150c;
    @NotNull

    /* renamed from: d */
    private final C20212kl f52151d;
    @NotNull

    /* renamed from: e */
    private final C20788s3 f52152e;

    public C20514n8(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f52148a = new C20600op(m56175a(configurations, "rewarded"));
        this.f52149b = new C19992gi(m56175a(configurations, "interstitial"));
        this.f52150c = new C20322m6(m56175a(configurations, "banner"));
        this.f52151d = new C20212kl(m56175a(configurations, "nativeAd"));
        JSONObject optJSONObject = configurations.optJSONObject("application");
        this.f52152e = new C20788s3(optJSONObject == null ? new JSONObject() : optJSONObject);
    }

    @NotNull
    /* renamed from: a */
    public final C20788s3 m56176a() {
        return this.f52152e;
    }

    @NotNull
    /* renamed from: b */
    public final C20322m6 m56174b() {
        return this.f52150c;
    }

    @NotNull
    /* renamed from: c */
    public final C19992gi m56173c() {
        return this.f52149b;
    }

    @NotNull
    /* renamed from: d */
    public final C20212kl m56172d() {
        return this.f52151d;
    }

    @NotNull
    /* renamed from: e */
    public final C20600op m56171e() {
        return this.f52148a;
    }

    /* renamed from: a */
    private final JSONObject m56175a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new JSONObject() : optJSONObject2;
    }
}
