package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: com.ironsource.rm */
/* loaded from: classes6.dex */
public final class C20767rm {
    @NotNull

    /* renamed from: a */
    private final String f52781a;
    @NotNull

    /* renamed from: b */
    private final String f52782b;
    @NotNull

    /* renamed from: c */
    private final String f52783c;
    @NotNull

    /* renamed from: d */
    private final String f52784d;
    @Nullable

    /* renamed from: e */
    private final String f52785e;
    @Nullable

    /* renamed from: f */
    private final JSONObject f52786f;
    @NotNull

    /* renamed from: g */
    private final Map<String, JSONObject> f52787g;
    @NotNull

    /* renamed from: h */
    private final String f52788h;
    @NotNull

    /* renamed from: i */
    private final String f52789i;

    /* renamed from: j */
    private final boolean f52790j;
    @Nullable

    /* renamed from: k */
    private C20767rm f52791k;
    @NotNull

    /* renamed from: l */
    private final InterfaceC38501j f52792l;

    @Metadata
    /* renamed from: com.ironsource.rm$a */
    /* loaded from: classes6.dex */
    static final class C20768a extends Lambda implements Functions<NetworkSettings> {
        C20768a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final NetworkSettings invoke() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            String m55456j = C20767rm.this.m55456j();
            String m55454l = C20767rm.this.m55454l();
            String m55458h = C20767rm.this.m55458h();
            String m55455k = C20767rm.this.m55455k();
            JSONObject m55463c = C20767rm.this.m55463c();
            C20767rm c20767rm = C20767rm.this.f52791k;
            JSONObject jSONObject5 = null;
            if (c20767rm != null) {
                jSONObject = c20767rm.m55463c();
            } else {
                jSONObject = null;
            }
            JSONObject mergeJsons = IronSourceUtils.mergeJsons(m55463c, jSONObject);
            JSONObject m55453m = C20767rm.this.m55453m();
            C20767rm c20767rm2 = C20767rm.this.f52791k;
            if (c20767rm2 != null) {
                jSONObject2 = c20767rm2.m55453m();
            } else {
                jSONObject2 = null;
            }
            JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(m55453m, jSONObject2);
            JSONObject m55461e = C20767rm.this.m55461e();
            C20767rm c20767rm3 = C20767rm.this.f52791k;
            if (c20767rm3 != null) {
                jSONObject3 = c20767rm3.m55461e();
            } else {
                jSONObject3 = null;
            }
            JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(m55461e, jSONObject3);
            JSONObject m55462d = C20767rm.this.m55462d();
            C20767rm c20767rm4 = C20767rm.this.f52791k;
            if (c20767rm4 != null) {
                jSONObject4 = c20767rm4.m55462d();
            } else {
                jSONObject4 = null;
            }
            JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(m55462d, jSONObject4);
            JSONObject m55459g = C20767rm.this.m55459g();
            C20767rm c20767rm5 = C20767rm.this.f52791k;
            if (c20767rm5 != null) {
                jSONObject5 = c20767rm5.m55459g();
            }
            NetworkSettings networkSettings = new NetworkSettings(m55456j, m55454l, m55458h, m55455k, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4, IronSourceUtils.mergeJsons(m55459g, jSONObject5));
            networkSettings.setIsMultipleInstances(C20767rm.this.m55451o());
            networkSettings.setSubProviderId(C20767rm.this.m55452n());
            networkSettings.setAdSourceNameForEvents(C20767rm.this.m55465b());
            return networkSettings;
        }
    }

    public C20767rm(@NotNull String providerName, @NotNull JSONObject networkSettings) {
        String str;
        int m17154x;
        int m17292f;
        int m16917e;
        InterfaceC38501j m14554a;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.f52781a = providerName;
        this.f52782b = providerName;
        String optString = networkSettings.optString(C20977sm.f53484d, providerName);
        Intrinsics.checkNotNullExpressionValue(optString, "networkSettings.optStrin…,\n          providerName)");
        this.f52783c = optString;
        String optString2 = networkSettings.optString(C20977sm.f53485e, optString);
        Intrinsics.checkNotNullExpressionValue(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f52784d = optString2;
        Object opt = networkSettings.opt(C20977sm.f53486f);
        if (opt instanceof String) {
            str = (String) opt;
        } else {
            str = null;
        }
        this.f52785e = str;
        this.f52786f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(C20220ks.m57610a(adFormat));
        }
        m17154x = C37566w.m17154x(arrayList, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            if (optJSONObject != null) {
                jSONObject = optJSONObject.optJSONObject(str2);
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObject);
        }
        this.f52787g = linkedHashMap;
        String optString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f52788h = optString3;
        String optString4 = networkSettings.optString(C20977sm.f53481a);
        Intrinsics.checkNotNullExpressionValue(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f52789i = optString4;
        this.f52790j = networkSettings.optBoolean(C20977sm.f53483c, false);
        m14554a = LazyJVM.m14554a(new C20768a());
        this.f52792l = m14554a;
    }

    @NotNull
    /* renamed from: b */
    public final String m55465b() {
        return this.f52789i;
    }

    @Nullable
    /* renamed from: c */
    public final JSONObject m55463c() {
        return this.f52786f;
    }

    @NotNull
    /* renamed from: d */
    public final JSONObject m55462d() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f52787g.get("banner"), this.f52786f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    /* renamed from: e */
    public final JSONObject m55461e() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f52787g.get("interstitial"), this.f52786f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    /* renamed from: f */
    public final NetworkSettings m55460f() {
        return (NetworkSettings) this.f52792l.getValue();
    }

    @NotNull
    /* renamed from: g */
    public final JSONObject m55459g() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f52787g.get("nativeAd"), this.f52786f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    /* renamed from: h */
    public final String m55458h() {
        return this.f52784d;
    }

    @NotNull
    /* renamed from: i */
    public final String m55457i() {
        return this.f52782b;
    }

    @NotNull
    /* renamed from: j */
    public final String m55456j() {
        return this.f52781a;
    }

    @Nullable
    /* renamed from: k */
    public final String m55455k() {
        return this.f52785e;
    }

    @NotNull
    /* renamed from: l */
    public final String m55454l() {
        return this.f52783c;
    }

    @NotNull
    /* renamed from: m */
    public final JSONObject m55453m() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f52787g.get("rewarded"), this.f52786f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …     applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    /* renamed from: n */
    public final String m55452n() {
        return this.f52788h;
    }

    /* renamed from: o */
    public final boolean m55451o() {
        return this.f52790j;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, JSONObject> m55467a() {
        return this.f52787g;
    }

    /* renamed from: b */
    public final void m55464b(@Nullable C20767rm c20767rm) {
        this.f52791k = c20767rm;
    }
}
