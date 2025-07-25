package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public interface SetAPSInterface {
    void setAPSData(@NotNull IronSource.AD_UNIT ad_unit, @NotNull JSONObject jSONObject);
}
