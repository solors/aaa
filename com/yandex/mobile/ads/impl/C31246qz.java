package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qz */
/* loaded from: classes8.dex */
public final class C31246qz {
    @NotNull

    /* renamed from: a */
    private final hh0 f84591a;

    public /* synthetic */ C31246qz() {
        this(new hh0());
    }

    @Nullable
    /* renamed from: a */
    public final C30815lz m30183a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String optString = jsonObject.optString("type");
        String optString2 = jsonObject.optString("target");
        String optString3 = jsonObject.optString("layout");
        ArrayList arrayList = null;
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0 || optString3 == null || optString3.length() == 0) {
            return null;
        }
        JSONArray optJSONArray = jsonObject.optJSONArray("images");
        if (optJSONArray != null) {
            arrayList = this.f84591a.m33552a(optJSONArray);
        }
        Intrinsics.m17074g(optString);
        Intrinsics.m17074g(optString2);
        Intrinsics.m17074g(optString3);
        return new C30815lz(optString, optString2, optString3, arrayList);
    }

    public C31246qz(@NotNull hh0 imageValuesParser) {
        Intrinsics.checkNotNullParameter(imageValuesParser, "imageValuesParser");
        this.f84591a = imageValuesParser;
    }
}
