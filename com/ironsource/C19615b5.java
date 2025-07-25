package com.ironsource;

import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20353a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.b5 */
/* loaded from: classes6.dex */
public final class C19615b5 {
    @NotNull

    /* renamed from: h */
    public static final C19617b f49236h = new C19617b(null);
    @Nullable

    /* renamed from: a */
    private final String f49237a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC20353a f49238b;
    @NotNull

    /* renamed from: c */
    private final C19897f5 f49239c;
    @Nullable

    /* renamed from: d */
    private final JSONObject f49240d;
    @Nullable

    /* renamed from: e */
    private final JSONObject f49241e;
    @Nullable

    /* renamed from: f */
    private final C21110v4 f49242f;
    @Nullable

    /* renamed from: g */
    private final C19954g5 f49243g;

    @Metadata
    /* renamed from: com.ironsource.b5$a */
    /* loaded from: classes6.dex */
    public static final class C19616a {
        @NotNull

        /* renamed from: a */
        private final JSONObject f49244a;
        @NotNull

        /* renamed from: b */
        private final String f49245b;
        @Nullable

        /* renamed from: c */
        private final String f49246c;
        @NotNull

        /* renamed from: d */
        private final InterfaceC20353a f49247d;
        @NotNull

        /* renamed from: e */
        private final C19897f5 f49248e;
        @Nullable

        /* renamed from: f */
        private final JSONObject f49249f;
        @Nullable

        /* renamed from: g */
        private final JSONObject f49250g;
        @Nullable

        /* renamed from: h */
        private final C21110v4 f49251h;
        @Nullable

        /* renamed from: i */
        private final C19954g5 f49252i;

        public C19616a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.f49244a = auctionData;
            this.f49245b = instanceId;
            JSONObject m59362a = m59362a(auctionData);
            this.f49246c = auctionData.optString("auctionId");
            InterfaceC20353a m59361a = m59361a(auctionData, m59362a);
            this.f49247d = m59361a;
            this.f49248e = m59356c(m59362a);
            this.f49249f = m59355d(m59362a);
            this.f49250g = m59358b(m59362a);
            this.f49251h = m59363a(m59361a, instanceId);
            this.f49252i = m59359b(m59361a, instanceId);
        }

        /* renamed from: b */
        private final C19954g5 m59359b(InterfaceC20353a interfaceC20353a, String str) {
            C19897f5 mo56986a = interfaceC20353a.mo56986a(str);
            if (mo56986a != null) {
                String m58643j = mo56986a.m58643j();
                Intrinsics.checkNotNullExpressionValue(m58643j, "it.serverData");
                return new C19954g5(m58643j);
            }
            return null;
        }

        /* renamed from: c */
        private final C19897f5 m59356c(JSONObject jSONObject) {
            return new C19897f5(jSONObject);
        }

        /* renamed from: d */
        private final JSONObject m59355d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        @NotNull
        /* renamed from: a */
        public final C19615b5 m59364a() {
            return new C19615b5(this.f49246c, this.f49247d, this.f49248e, this.f49249f, this.f49250g, this.f49251h, this.f49252i);
        }

        /* renamed from: a */
        private final InterfaceC20353a m59361a(JSONObject jSONObject, JSONObject jSONObject2) {
            PrimitiveRanges m16900v;
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(C20348d.f51318d);
            JSONArray optJSONArray = jSONObject.optJSONArray(C20348d.f51321g);
            if (optJSONArray != null) {
                m16900v = _Ranges.m16900v(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = m16900v.iterator();
                while (it.hasNext()) {
                    int nextInt = ((PrimitiveIterators) it).nextInt();
                    C19897f5 c19897f5 = new C19897f5(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c19897f5.m58641l()) {
                        c19897f5 = null;
                    }
                    if (c19897f5 != null) {
                        arrayList2.add(c19897f5);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new InterfaceC20353a.C20354a(arrayList);
        }

        @NotNull
        /* renamed from: b */
        public final JSONObject m59360b() {
            return this.f49244a;
        }

        @NotNull
        /* renamed from: c */
        public final String m59357c() {
            return this.f49245b;
        }

        /* renamed from: a */
        private final C21110v4 m59363a(InterfaceC20353a interfaceC20353a, String str) {
            C19897f5 mo56986a = interfaceC20353a.mo56986a(str);
            if (mo56986a != null) {
                C21110v4 c21110v4 = new C21110v4();
                c21110v4.m54513a(mo56986a.m58651b());
                c21110v4.m54509c(mo56986a.m58646g());
                c21110v4.m54511b(mo56986a.m58647f());
                return c21110v4;
            }
            return null;
        }

        /* renamed from: b */
        private final JSONObject m59358b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        /* renamed from: a */
        private final JSONObject m59362a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.b5$b */
    /* loaded from: classes6.dex */
    public static final class C19617b {
        private C19617b() {
        }

        public /* synthetic */ C19617b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final Object m59354a(C19615b5 c19615b5, String str) {
            C19815ef c19815ef;
            String m59372b = c19615b5.m59372b();
            boolean z = false;
            if (m59372b == null || m59372b.length() == 0) {
                Result.C38506a c38506a = Result.f101870c;
                c19815ef = new C19815ef(C20040hb.f50441a.m58181i());
            } else if (c19615b5.m59365i()) {
                Result.C38506a c38506a2 = Result.f101870c;
                c19815ef = new C19815ef(C20040hb.f50441a.m58184f());
            } else {
                C19897f5 m59373a = c19615b5.m59373a(str);
                if (m59373a == null) {
                    Result.C38506a c38506a3 = Result.f101870c;
                    c19815ef = new C19815ef(C20040hb.f50441a.m58180j());
                } else {
                    String m58643j = m59373a.m58643j();
                    if (m58643j == null || m58643j.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        return Result.m14549b(c19615b5);
                    }
                    Result.C38506a c38506a4 = Result.f101870c;
                    c19815ef = new C19815ef(C20040hb.f50441a.m58185e());
                }
            }
            return Result.m14549b(C38508r.m14540a(c19815ef));
        }

        @NotNull
        /* renamed from: a */
        public final Object m59353a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return m59354a(new C19616a(auctionData, instanceId).m59364a(), instanceId);
        }
    }

    public C19615b5(@Nullable String str, @NotNull InterfaceC20353a waterfall, @NotNull C19897f5 genericNotifications, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C21110v4 c21110v4, @Nullable C19954g5 c19954g5) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f49237a = str;
        this.f49238b = waterfall;
        this.f49239c = genericNotifications;
        this.f49240d = jSONObject;
        this.f49241e = jSONObject2;
        this.f49242f = c21110v4;
        this.f49243g = c19954g5;
    }

    /* renamed from: a */
    private final C19897f5 m59374a(InterfaceC20353a interfaceC20353a, String str) {
        return interfaceC20353a.mo56986a(str);
    }

    @Nullable
    /* renamed from: b */
    public final String m59372b() {
        return this.f49237a;
    }

    @Nullable
    /* renamed from: c */
    public final C21110v4 m59371c() {
        return this.f49242f;
    }

    @Nullable
    /* renamed from: d */
    public final JSONObject m59370d() {
        return this.f49241e;
    }

    @NotNull
    /* renamed from: e */
    public final C19897f5 m59369e() {
        return this.f49239c;
    }

    @Nullable
    /* renamed from: f */
    public final JSONObject m59368f() {
        return this.f49240d;
    }

    @Nullable
    /* renamed from: g */
    public final C19954g5 m59367g() {
        return this.f49243g;
    }

    @NotNull
    /* renamed from: h */
    public final InterfaceC20353a m59366h() {
        return this.f49238b;
    }

    /* renamed from: i */
    public final boolean m59365i() {
        return this.f49238b.isEmpty();
    }

    @Nullable
    /* renamed from: a */
    public final C19897f5 m59373a(@NotNull String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return m59374a(this.f49238b, providerName);
    }

    @Nullable
    /* renamed from: a */
    public final String m59375a() {
        C19954g5 c19954g5 = this.f49243g;
        if (c19954g5 != null) {
            return c19954g5.m58468d();
        }
        return null;
    }
}
