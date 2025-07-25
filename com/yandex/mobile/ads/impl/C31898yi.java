package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.yi */
/* loaded from: classes8.dex */
public final class C31898yi {
    @NotNull

    /* renamed from: a */
    private final C31753wi f88222a;

    public /* synthetic */ C31898yi() {
        this(new C31753wi());
    }

    @NotNull
    /* renamed from: a */
    public final String m26899a(@NotNull String key, @NotNull JSONObject jsonObject) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            this.f88222a.getClass();
            String m27895b = C31753wi.m27895b(m27867a);
            if (m27895b != null && m27895b.length() != 0) {
                return m27895b;
            }
            throw new i31("Native Ad json has attribute with broken base64 encoding");
        }
        throw new i31("Native Ad json has not required attributes");
    }

    public C31898yi(@NotNull C31753wi base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f88222a = base64Decoder;
    }
}
