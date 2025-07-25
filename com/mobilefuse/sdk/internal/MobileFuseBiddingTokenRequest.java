package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseBiddingTokenRequest implements IMobileFuseBiddingTokenRequest {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isTestMode;
    @NotNull
    private final MobileFusePrivacyPreferences privacyPreferences;

    /* compiled from: MobileFuseBiddingTokenProvider.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return MobileFuseBiddingTokenRequest_forPartner.createBiddingTokenRequest(partner);
        }
    }

    public MobileFuseBiddingTokenRequest(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        this.privacyPreferences = privacyPreferences;
        this.isTestMode = z;
    }

    public static /* synthetic */ MobileFuseBiddingTokenRequest copy$default(MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileFusePrivacyPreferences = mobileFuseBiddingTokenRequest.getPrivacyPreferences();
        }
        if ((i & 2) != 0) {
            z = mobileFuseBiddingTokenRequest.isTestMode();
        }
        return mobileFuseBiddingTokenRequest.copy(mobileFusePrivacyPreferences, z);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner) {
        return Companion.forPartner(partner);
    }

    @NotNull
    public final MobileFusePrivacyPreferences component1() {
        return getPrivacyPreferences();
    }

    public final boolean component2() {
        return isTestMode();
    }

    @NotNull
    public final MobileFuseBiddingTokenRequest copy(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        return new MobileFuseBiddingTokenRequest(privacyPreferences, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof MobileFuseBiddingTokenRequest) {
                MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest = (MobileFuseBiddingTokenRequest) obj;
                if (!Intrinsics.m17075f(getPrivacyPreferences(), mobileFuseBiddingTokenRequest.getPrivacyPreferences()) || isTestMode() != mobileFuseBiddingTokenRequest.isTestMode()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @NotNull
    public MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    public int hashCode() {
        int i;
        MobileFusePrivacyPreferences privacyPreferences = getPrivacyPreferences();
        if (privacyPreferences != null) {
            i = privacyPreferences.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * 31;
        boolean isTestMode = isTestMode();
        int i3 = isTestMode;
        if (isTestMode) {
            i3 = 1;
        }
        return i2 + i3;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    public boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "MobileFuseBiddingTokenRequest(privacyPreferences=" + getPrivacyPreferences() + ", isTestMode=" + isTestMode() + ")";
    }
}
