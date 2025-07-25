package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class AdTrackingInfo {
    @Nullable
    public final String advId;
    @Nullable
    public final Boolean limitedAdTracking;
    @NonNull
    public final Provider provider;

    /* loaded from: classes9.dex */
    public enum Provider {
        GOOGLE,
        HMS,
        YANDEX
    }

    public AdTrackingInfo(@NonNull Provider provider, @Nullable String str, @Nullable Boolean bool) {
        this.provider = provider;
        this.advId = str;
        this.limitedAdTracking = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.provider + ", advId='" + this.advId + "', limitedAdTracking=" + this.limitedAdTracking + '}';
    }
}
