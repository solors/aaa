package com.ironsource.adapters.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public final class LoadAdData {
    @NotNull
    private final JSONObject localAdData;

    public LoadAdData() {
        this(null, 1, null);
    }

    @Nullable
    public final String adUnitId() {
        boolean z;
        String it = this.localAdData.optString("adUnitId");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return it;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(@Nullable JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
