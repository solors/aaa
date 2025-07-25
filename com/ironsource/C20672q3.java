package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.q3 */
/* loaded from: classes6.dex */
public final class C20672q3 {
    @NotNull

    /* renamed from: a */
    private final Map<LevelPlay.AdFormat, C20615p> f52506a;

    public C20672q3(@NotNull JSONObject applicationAuctionSettings) {
        int m17292f;
        int m16917e;
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        m17292f = MapsJVM.m17292f(values.length);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = applicationAuctionSettings.optJSONObject(C20220ks.m57610a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C20615p(optJSONObject));
        }
        this.f52506a = linkedHashMap;
    }

    @NotNull
    /* renamed from: a */
    public final Map<LevelPlay.AdFormat, C20615p> m55691a() {
        return this.f52506a;
    }
}
