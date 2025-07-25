package io.bidmachine;

import androidx.annotation.NonNull;

/* renamed from: io.bidmachine.f4 */
/* loaded from: classes9.dex */
class NetworkAssetParams {
    @NonNull
    private final String adapterVersion;
    @NonNull
    private final String classpath;
    @NonNull
    private final String name;
    @NonNull
    private final String sdkVersion;

    public NetworkAssetParams(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.name = str;
        this.adapterVersion = str2;
        this.classpath = str3;
        this.sdkVersion = str4;
    }

    @NonNull
    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NonNull
    public String getClasspath() {
        return this.classpath;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getSdkVersion() {
        return this.sdkVersion;
    }
}
