package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.z3 */
/* loaded from: classes6.dex */
public final class C21292z3 {

    /* renamed from: a */
    private final boolean f54698a;

    /* renamed from: b */
    private final boolean f54699b;

    /* renamed from: c */
    private final boolean f54700c;

    /* renamed from: d */
    private final int f54701d;
    @NotNull

    /* renamed from: e */
    private final String f54702e;
    @NotNull

    /* renamed from: f */
    private final String f54703f;

    /* renamed from: g */
    private final int f54704g;

    /* renamed from: h */
    private final int f54705h;

    /* renamed from: i */
    private final int f54706i;
    @NotNull

    /* renamed from: j */
    private final List<Integer> f54707j;
    @NotNull

    /* renamed from: k */
    private final List<Integer> f54708k;
    @NotNull

    /* renamed from: l */
    private final List<Integer> f54709l;
    @NotNull

    /* renamed from: m */
    private final List<Integer> f54710m;

    public C21292z3(@NotNull JSONObject applicationEvents) {
        Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        this.f54698a = applicationEvents.optBoolean(C19614b4.f49221a, false);
        this.f54699b = applicationEvents.optBoolean(C19614b4.f49222b, false);
        this.f54700c = applicationEvents.optBoolean(C19614b4.f49223c, false);
        this.f54701d = applicationEvents.optInt(C19614b4.f49224d, -1);
        String optString = applicationEvents.optString(C19614b4.f49225e);
        Intrinsics.checkNotNullExpressionValue(optString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f54702e = optString;
        String optString2 = applicationEvents.optString(C19614b4.f49226f);
        Intrinsics.checkNotNullExpressionValue(optString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f54703f = optString2;
        this.f54704g = applicationEvents.optInt(C19614b4.f49227g, -1);
        this.f54705h = applicationEvents.optInt(C19614b4.f49228h, -1);
        this.f54706i = applicationEvents.optInt(C19614b4.f49229i, 5000);
        this.f54707j = m53921a(applicationEvents, C19614b4.f49230j);
        this.f54708k = m53921a(applicationEvents, C19614b4.f49231k);
        this.f54709l = m53921a(applicationEvents, C19614b4.f49232l);
        this.f54710m = m53921a(applicationEvents, C19614b4.f49233m);
    }

    /* renamed from: a */
    public final int m53922a() {
        return this.f54704g;
    }

    /* renamed from: b */
    public final boolean m53920b() {
        return this.f54700c;
    }

    /* renamed from: c */
    public final int m53919c() {
        return this.f54701d;
    }

    @NotNull
    /* renamed from: d */
    public final String m53918d() {
        return this.f54703f;
    }

    /* renamed from: e */
    public final int m53917e() {
        return this.f54706i;
    }

    /* renamed from: f */
    public final int m53916f() {
        return this.f54705h;
    }

    @NotNull
    /* renamed from: g */
    public final List<Integer> m53915g() {
        return this.f54710m;
    }

    @NotNull
    /* renamed from: h */
    public final List<Integer> m53914h() {
        return this.f54708k;
    }

    @NotNull
    /* renamed from: i */
    public final List<Integer> m53913i() {
        return this.f54707j;
    }

    /* renamed from: j */
    public final boolean m53912j() {
        return this.f54699b;
    }

    /* renamed from: k */
    public final boolean m53911k() {
        return this.f54698a;
    }

    @NotNull
    /* renamed from: l */
    public final String m53910l() {
        return this.f54702e;
    }

    @NotNull
    /* renamed from: m */
    public final List<Integer> m53909m() {
        return this.f54709l;
    }

    /* renamed from: a */
    private final List<Integer> m53921a(JSONObject jSONObject, String str) {
        List<Integer> m17166m;
        PrimitiveRanges m16900v;
        int m17154x;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            m16900v = _Ranges.m16900v(0, optJSONArray.length());
            m17154x = C37566w.m17154x(m16900v, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            Iterator<Integer> it = m16900v.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(optJSONArray.getInt(((PrimitiveIterators) it).nextInt())));
            }
            return arrayList;
        }
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
