package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class yn0 {
    @Nullable
    /* renamed from: a */
    public static final String m26827a(@NotNull String name, @NotNull JSONObject jSONObject) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(jSONObject.getString(name));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (String) m14549b;
    }
}
