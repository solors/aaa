package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public interface ReleaseMemoryAdapterInterface {
    void releaseMemory(@NotNull IronSource.AD_UNIT ad_unit, @Nullable JSONObject jSONObject);
}
