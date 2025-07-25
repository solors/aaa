package com.monetization.ads.quality.base.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerifierAdapterInfo {
    @Nullable
    private final String adapterVersion;
    @Nullable
    private final String verifierName;
    @Nullable
    private final String verifierSdkVersion;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private String f66563a;
        @Nullable

        /* renamed from: b */
        private String f66564b;
        @Nullable

        /* renamed from: c */
        private String f66565c;

        @NotNull
        public final AdQualityVerifierAdapterInfo build() {
            return new AdQualityVerifierAdapterInfo(this.f66563a, this.f66564b, this.f66565c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@Nullable String str) {
            this.f66563a = str;
            return this;
        }

        @NotNull
        public final Builder setVerifierName(@Nullable String str) {
            this.f66564b = str;
            return this;
        }

        @NotNull
        public final Builder setVerifierSdkVersion(@Nullable String str) {
            this.f66565c = str;
            return this;
        }
    }

    public /* synthetic */ AdQualityVerifierAdapterInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @Nullable
    public final String getVerifierName() {
        return this.verifierName;
    }

    @Nullable
    public final String getVerifierSdkVersion() {
        return this.verifierSdkVersion;
    }

    private AdQualityVerifierAdapterInfo(String str, String str2, String str3) {
        this.adapterVersion = str;
        this.verifierName = str2;
        this.verifierSdkVersion = str3;
    }
}
