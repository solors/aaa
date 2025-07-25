package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.SetsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class yo0 {
    @NotNull

    /* renamed from: a */
    private final C30064c0 f88309a;

    public /* synthetic */ yo0(jl1 jl1Var) {
        this(jl1Var, new C30064c0(jl1Var));
    }

    /* renamed from: a */
    private static String m26823a(String str, JSONObject jSONObject) throws JSONException, i31 {
        if (jSONObject.has(str)) {
            String m27867a = wn0.m27867a(jSONObject, "jsonAsset", str, "jsonAttribute", str);
            if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
                Intrinsics.m17074g(m27867a);
                return m27867a;
            }
            throw new i31("Native Ad json has not required attributes");
        }
        return null;
    }

    public yo0(@NotNull jl1 reporter, @NotNull C30064c0 actionParserProvider) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(actionParserProvider, "actionParserProvider");
        this.f88309a = actionParserProvider;
    }

    @NotNull
    /* renamed from: a */
    public final xo0 m26822a(@NotNull JSONObject jsonLink) throws JSONException, i31 {
        ArrayList arrayList;
        Set m17129b;
        Set m17130a;
        List m17553Z0;
        List m17177c;
        Object m14549b;
        Intrinsics.checkNotNullParameter(jsonLink, "jsonLink");
        JSONArray optJSONArray = jsonLink.optJSONArray("actions");
        List list = null;
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                C30064c0 c30064c0 = this.f88309a;
                Intrinsics.m17074g(jSONObject);
                InterfaceC29979b0<?> m35394a = c30064c0.m35394a(jSONObject);
                if (m35394a != null) {
                    arrayList2.add(m35394a.mo26293a(jSONObject));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String m26823a = m26823a("falseClickUrl", jsonLink);
        FalseClick falseClick = m26823a != null ? new FalseClick(m26823a, jsonLink.optLong("falseClickInterval", 0L)) : null;
        m17129b = SetsJVM.m17129b();
        String m26823a2 = m26823a("trackingUrl", jsonLink);
        if (m26823a2 != null) {
            m17129b.add(m26823a2);
        }
        JSONArray optJSONArray2 = jsonLink.optJSONArray("trackingUrls");
        if (optJSONArray2 != null) {
            m17177c = CollectionsJVM.m17177c();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                    Result.C38506a c38506a = Result.f101870c;
                    m14549b = Result.m14549b(optJSONArray2.getString(i2));
                } catch (Throwable th) {
                    Result.C38506a c38506a2 = Result.f101870c;
                    m14549b = Result.m14549b(C38508r.m14540a(th));
                }
                if (Result.m14543h(m14549b)) {
                    String str = (String) m14549b;
                    Intrinsics.m17074g(str);
                    m17177c.add(str);
                }
            }
            list = CollectionsJVM.m17179a(m17177c);
        }
        if (list != null) {
            m17129b.addAll(list);
        }
        m17130a = SetsJVM.m17130a(m17129b);
        m17553Z0 = _Collections.m17553Z0(m17130a);
        return new xo0(arrayList, falseClick, m17553Z0, m26823a("url", jsonLink), jsonLink.optLong("clickableDelay", 0L));
    }
}
