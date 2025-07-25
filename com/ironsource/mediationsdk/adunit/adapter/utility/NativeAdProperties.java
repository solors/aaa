package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C20086i9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public final class NativeAdProperties {
    @NotNull
    private final AdOptionsPosition adOptionsPosition;
    @NotNull
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    @NotNull
    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            Intrinsics.checkNotNullExpressionValue(position, "position");
            return AdOptionsPosition.valueOf(position);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return this.defaultAdOptionPosition;
        }
    }
}
