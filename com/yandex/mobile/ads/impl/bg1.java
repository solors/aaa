package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class bg1 {
    @NotNull

    /* renamed from: a */
    private final ag1 f77287a;

    public /* synthetic */ bg1(l32 l32Var) {
        this(l32Var, new ag1(l32Var));
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m35477a(@Nullable JSONArray jSONArray) throws JSONException, i31 {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(this.f77287a.m35901a(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    public bg1(@NotNull l32 urlJsonParser, @NotNull ag1 preferredPackageParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(preferredPackageParser, "preferredPackageParser");
        this.f77287a = preferredPackageParser;
    }
}
