package com.smaato.sdk.richmedia.mraid.dataprovider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class MraidEnvironmentProperties {
    public static final String SDK = "SmaatoSDK Android";
    public static final String VERSION = "3.0";
    @NonNull
    public final String appId;
    @Nullable
    public final Integer coppa;
    @Nullable
    public final String googleAdId;
    @Nullable
    public final Boolean googleDnt;
    @NonNull
    public final String sdkVersion;

    public MraidEnvironmentProperties(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Integer num) {
        this.sdkVersion = str;
        this.appId = str2;
        this.googleAdId = str3;
        this.googleDnt = bool;
        this.coppa = num;
    }
}
