package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.rt */
/* loaded from: classes6.dex */
public final class C20776rt {
    @NotNull

    /* renamed from: a */
    private final String[] f52807a = C20723qt.f52673a.m55585a();
    @NotNull

    /* renamed from: b */
    private final C19696cd f52808b = new C19696cd();

    @NotNull
    /* renamed from: a */
    public final JSONObject m55436a() {
        JSONObject m59162a = this.f52808b.m59162a(this.f52807a);
        Intrinsics.checkNotNullExpressionValue(m59162a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return m55434a(m59162a);
    }

    @NotNull
    /* renamed from: a */
    public final JSONObject m55435a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject m59167a = this.f52808b.m59167a(context, this.f52807a);
        Intrinsics.checkNotNullExpressionValue(m59167a, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return m55434a(m59167a);
    }

    /* renamed from: a */
    private final JSONObject m55434a(JSONObject jSONObject) {
        JSONObject m58947b = C19765dd.m58947b(jSONObject.optJSONObject("md"));
        if (m58947b != null) {
            jSONObject.put("md", m58947b);
        }
        return jSONObject;
    }
}
