package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.jo */
/* loaded from: classes6.dex */
public final class C20161jo {
    @NotNull

    /* renamed from: b */
    public static final C20162a f50742b = new C20162a(null);
    @NotNull

    /* renamed from: c */
    public static final String f50743c = "placements";
    @NotNull

    /* renamed from: d */
    public static final String f50744d = "placementName";
    @Nullable

    /* renamed from: a */
    private final JSONArray f50745a;

    @Metadata
    /* renamed from: com.ironsource.jo$a */
    /* loaded from: classes6.dex */
    public static final class C20162a {
        private C20162a() {
        }

        public /* synthetic */ C20162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20161jo(@NotNull JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f50745a = configuration.optJSONArray(f50743c);
    }

    @NotNull
    /* renamed from: a */
    public final <T> Map<String, T> m57798a(@NotNull Function1<? super JSONObject, ? extends T> valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f50745a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i);
                String key = jsonObject.optString(f50744d);
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T invoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }
}
