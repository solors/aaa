package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.rd */
/* loaded from: classes8.dex */
public final class C31276rd {
    @NotNull

    /* renamed from: a */
    private final String f84724a;
    @NotNull

    /* renamed from: b */
    private final String f84725b;

    public C31276rd(@NotNull EnumC31347sd appAdAnalyticsReportType, @NotNull JSONObject payloadJson) {
        Intrinsics.checkNotNullParameter(appAdAnalyticsReportType, "appAdAnalyticsReportType");
        Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
        this.f84724a = appAdAnalyticsReportType.m29644a();
        String jSONObject = payloadJson.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        this.f84725b = jSONObject;
    }

    @NotNull
    /* renamed from: a */
    public final String m30075a() {
        return this.f84724a;
    }

    @NotNull
    /* renamed from: b */
    public final String m30074b() {
        return this.f84725b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31276rd)) {
            return false;
        }
        C31276rd c31276rd = (C31276rd) obj;
        if (Intrinsics.m17075f(c31276rd.f84724a, this.f84724a) && Intrinsics.m17075f(c31276rd.f84725b, this.f84725b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f84725b.hashCode() + (this.f84724a.hashCode() * 31);
    }
}
