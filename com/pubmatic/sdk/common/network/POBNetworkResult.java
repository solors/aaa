package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBNetworkResult {
    @NonNull

    /* renamed from: a */
    private Map<String, String> f70244a;

    /* renamed from: b */
    private long f70245b;

    public POBNetworkResult(@NonNull Map<String, String> map, long j) {
        this.f70244a = map;
        this.f70245b = j;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f70244a;
    }

    public long getNetworkTimeMs() {
        return this.f70245b;
    }

    @NonNull
    public String toString() {
        return "POBNetworkResult{ networkTimeMs=" + this.f70245b + '}';
    }
}
