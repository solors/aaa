package com.smaato.sdk.core.mvvm.model.csm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.api.ImpressionCountingType;

/* loaded from: classes7.dex */
public class CsmParameters {
    @Nullable
    public final String bundleId;
    @NonNull
    public final ImpressionCountingType impressionCountingType;
    @Nullable
    public final String sci;
    @NonNull
    public final String sessionId;
    @Nullable
    public final Long ttlMs;

    public CsmParameters(@NonNull String str, @Nullable String str2, @NonNull ImpressionCountingType impressionCountingType, @Nullable Long l, @Nullable String str3) {
        this.sessionId = str;
        this.sci = str2;
        this.impressionCountingType = impressionCountingType;
        this.ttlMs = l;
        this.bundleId = str3;
    }
}
