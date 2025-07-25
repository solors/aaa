package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class hh0 {
    @NotNull

    /* renamed from: a */
    private final tg0 f80069a;

    public /* synthetic */ hh0() {
        this(new tg0());
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m33552a(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            tg0 tg0Var = this.f80069a;
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(tg0Var.m29173b(jSONObject));
        }
        return arrayList;
    }

    public hh0(@NotNull tg0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f80069a = imageParser;
    }
}
