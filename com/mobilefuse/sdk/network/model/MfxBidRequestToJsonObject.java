package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.model.MfxBidRequestToJsonObjectKt */
/* loaded from: classes7.dex */
public final class MfxBidRequestToJsonObject {
    @NotNull
    public static final JSONObject toJsonObject(@NotNull MfxBidRequest toJsonObject) {
        Intrinsics.checkNotNullParameter(toJsonObject, "$this$toJsonObject");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : MfxBidRequestToMap.toMap(toJsonObject, false).entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        if (!toJsonObject.getEidValues().isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry2 : toJsonObject.getEidValues().entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject.put(TelemetryCategory.EID, jSONObject2);
        }
        return jSONObject;
    }
}
