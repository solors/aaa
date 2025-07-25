package com.inmobi.ads;

import com.inmobi.media.C19223c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public final class AdMetaInfo {

    /* renamed from: a */
    public final String f46996a;

    /* renamed from: b */
    public final JSONObject f46997b;

    public AdMetaInfo(@NotNull String creativeID, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(creativeID, "creativeID");
        this.f46996a = creativeID;
        this.f46997b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f46997b;
        if (jSONObject != null) {
            return jSONObject.optDouble(C19223c0.BUYER_PRICE);
        }
        return 0.0d;
    }

    @NotNull
    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f46997b;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    @Nullable
    public final String getBidKeyword() {
        JSONObject jSONObject = this.f46997b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    @NotNull
    public final String getCreativeID() {
        return this.f46996a;
    }
}
