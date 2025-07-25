package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public interface AdapterNetworkData {
    @NotNull
    JSONObject allData();

    @Nullable
    <T> T dataByKeyIgnoreCase(@NotNull String str, @NotNull Class<T> cls);

    @NotNull
    JSONObject networkDataByAdUnit(@NotNull IronSource.AD_UNIT ad_unit);
}
