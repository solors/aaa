package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.r2 */
/* loaded from: classes6.dex */
public final class C20736r2 {
    @NotNull

    /* renamed from: b */
    public static final C20737a f52699b = new C20737a(null);
    @NotNull

    /* renamed from: c */
    public static final String f52700c = "adUnits";
    @Nullable

    /* renamed from: a */
    private final JSONObject f52701a;

    @Metadata
    /* renamed from: com.ironsource.r2$a */
    /* loaded from: classes6.dex */
    public static final class C20737a {
        private C20737a() {
        }

        public /* synthetic */ C20737a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20736r2(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f52701a = configurations.optJSONObject(f52700c);
    }

    @NotNull
    /* renamed from: a */
    public final <T> Map<String, T> m55567a(@NotNull Function1<? super JSONObject, ? extends T> valueExtractor) {
        Map<String, T> m17284j;
        Sequence m16841c;
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f52701a;
        if (jSONObject == null) {
            m17284j = C37559r0.m17284j();
            return m17284j;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "adUnits.keys()");
        m16841c = C37653n.m16841c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : m16841c) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
