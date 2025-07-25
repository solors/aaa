package com.monetization.ads.quality.base.model.configuration;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerifierAdapterConfiguration {
    @NotNull
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(@NotNull String apiKey, long j, boolean z) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.verificationTimeoutInSec = j;
        this.debug = z;
    }

    public static /* synthetic */ AdQualityVerifierAdapterConfiguration copy$default(AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adQualityVerifierAdapterConfiguration.apiKey;
        }
        if ((i & 2) != 0) {
            j = adQualityVerifierAdapterConfiguration.verificationTimeoutInSec;
        }
        if ((i & 4) != 0) {
            z = adQualityVerifierAdapterConfiguration.debug;
        }
        return adQualityVerifierAdapterConfiguration.copy(str, j, z);
    }

    @NotNull
    public final String component1() {
        return this.apiKey;
    }

    public final long component2() {
        return this.verificationTimeoutInSec;
    }

    public final boolean component3() {
        return this.debug;
    }

    @NotNull
    public final AdQualityVerifierAdapterConfiguration copy(@NotNull String apiKey, long j, boolean z) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        return new AdQualityVerifierAdapterConfiguration(apiKey, j, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) obj;
        if (Intrinsics.m17075f(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.verificationTimeoutInSec);
        return Boolean.hashCode(this.debug) + ((hashCode + (this.apiKey.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.apiKey;
        long j = this.verificationTimeoutInSec;
        boolean z = this.debug;
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + str + ", verificationTimeoutInSec=" + j + ", debug=" + z + ")";
    }

    public /* synthetic */ AdQualityVerifierAdapterConfiguration(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? false : z);
    }
}
