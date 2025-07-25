package com.yandex.mobile.ads.impl;

import com.p552ot.pubsub.p559g.C26542f;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class ag1 {
    @NotNull

    /* renamed from: a */
    private final l32 f76784a;
    @NotNull

    /* renamed from: b */
    private final v50 f76785b;

    public /* synthetic */ ag1(l32 l32Var) {
        this(l32Var, new v50());
    }

    @NotNull
    /* renamed from: a */
    public final yf1 m35901a(@NotNull JSONObject jsonObject) throws JSONException, i31 {
        Object m14549b;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", C26542f.C26543a.f69507e, "jsonAttribute", C26542f.C26543a.f69507e);
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            this.f76784a.getClass();
            String m32360a = l32.m32360a("url", jsonObject);
            LinkedHashMap m28529a = this.f76785b.m28529a(jsonObject.optJSONObject("extras"));
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("flags", "name");
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(Integer.valueOf(jsonObject.getInt("flags")));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            return new yf1(m27867a, m32360a, m28529a, (Integer) m14549b);
        }
        throw new i31("Native Ad json has not required attributes");
    }

    public ag1(@NotNull l32 urlJsonParser, @NotNull v50 extrasParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(extrasParser, "extrasParser");
        this.f76784a = urlJsonParser;
        this.f76785b = extrasParser;
    }
}
