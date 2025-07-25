package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes7.dex */
public class POBNativeAdLinkResponse {
    @NonNull

    /* renamed from: a */
    private final String f70491a;
    @Nullable

    /* renamed from: b */
    private final List<String> f70492b;
    @Nullable

    /* renamed from: c */
    private final String f70493c;

    public POBNativeAdLinkResponse(@NonNull String str, @Nullable List<String> list, @Nullable String str2) {
        this.f70491a = str;
        this.f70492b = list;
        this.f70493c = str2;
    }

    @Nullable
    public List<String> getClickTrackers() {
        return this.f70492b;
    }

    @Nullable
    public String getFallbackURL() {
        return this.f70493c;
    }

    @NonNull
    public String getUrl() {
        return this.f70491a;
    }

    @NonNull
    public String toString() {
        return "Url: " + this.f70491a + "\nClick Trackers: " + getClickTrackers() + "\nFallback Url: " + this.f70493c;
    }
}
