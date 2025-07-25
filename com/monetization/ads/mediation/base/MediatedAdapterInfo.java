package com.monetization.ads.mediation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedAdapterInfo {
    @Nullable

    /* renamed from: a */
    private final String f66480a;
    @Nullable

    /* renamed from: b */
    private final String f66481b;
    @Nullable

    /* renamed from: c */
    private final String f66482c;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private String f66483a;
        @Nullable

        /* renamed from: b */
        private String f66484b;
        @Nullable

        /* renamed from: c */
        private String f66485c;

        @NotNull
        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.f66483a, this.f66484b, this.f66485c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@NotNull String adapterVersion) {
            Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
            this.f66483a = adapterVersion;
            return this;
        }

        @NotNull
        public final Builder setNetworkName(@NotNull String networkName) {
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            this.f66484b = networkName;
            return this;
        }

        @NotNull
        public final Builder setNetworkSdkVersion(@NotNull String networkSdkVersion) {
            Intrinsics.checkNotNullParameter(networkSdkVersion, "networkSdkVersion");
            this.f66485c = networkSdkVersion;
            return this;
        }
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.f66480a;
    }

    @Nullable
    public final String getNetworkName() {
        return this.f66481b;
    }

    @Nullable
    public final String getNetworkSdkVersion() {
        return this.f66482c;
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.f66480a = str;
        this.f66481b = str2;
        this.f66482c = str3;
    }
}
