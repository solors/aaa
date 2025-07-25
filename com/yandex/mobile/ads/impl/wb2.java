package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class wb2 {
    @NotNull

    /* renamed from: a */
    private final SharedPreferences f87199a;
    @NotNull

    /* renamed from: b */
    private final ub2 f87200b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wb2(@NotNull Context context) {
        this(lt1.m32196a(new lt1(), context, "ViewSizeInfoStorage"), new ub2());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: b */
    private static String m27990b(yb2 yb2Var) {
        String m26970a = yb2Var.m26970a();
        int m26969b = yb2Var.m26969b();
        return m26970a + "-" + m26969b;
    }

    @Nullable
    /* renamed from: a */
    public final String m27992a(@NotNull yb2 viewSizeKey) {
        Intrinsics.checkNotNullParameter(viewSizeKey, "viewSizeKey");
        return this.f87199a.getString(m27990b(viewSizeKey), null);
    }

    /* renamed from: a */
    public final void m27991a(@NotNull yb2 viewSizeKey, @NotNull tb2 viewSizeInfo) {
        Intrinsics.checkNotNullParameter(viewSizeKey, "viewSizeKey");
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        String m27990b = m27990b(viewSizeKey);
        this.f87200b.getClass();
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", viewSizeInfo.m29234d().m29648b());
        jSONObject2.put("height", viewSizeInfo.m29234d().m29649a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", viewSizeInfo.m29236b().m30610b());
        jSONObject3.put("height", viewSizeInfo.m29236b().m30611a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", viewSizeInfo.m29235c().m28684b().m28232b());
        String name = viewSizeInfo.m29235c().m28684b().m28233a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject4.put("mode", lowerCase);
        jSONObject5.put("value", viewSizeInfo.m29235c().m28685a().m28232b());
        String lowerCase2 = viewSizeInfo.m29235c().m28685a().m28233a().name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        jSONObject5.put("mode", lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(viewSizeInfo.m29237a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String jSONObject8 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject8, "toString(...)");
        this.f87199a.edit().putString(m27990b, jSONObject8).apply();
    }

    public wb2(@NotNull SharedPreferences preferences, @NotNull ub2 viewSizeInfoParser) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(viewSizeInfoParser, "viewSizeInfoParser");
        this.f87199a = preferences;
        this.f87200b = viewSizeInfoParser;
    }
}
