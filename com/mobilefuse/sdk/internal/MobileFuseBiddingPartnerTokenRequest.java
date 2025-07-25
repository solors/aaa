package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseBiddingPartnerTokenRequest implements IMobileFuseBiddingTokenRequest {
    private final boolean isTestMode;
    @NotNull
    private final Partner partner;
    @NotNull
    private final MobileFusePrivacyPreferences privacyPreferences;

    public MobileFuseBiddingPartnerTokenRequest(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z, @NotNull Partner partner) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        Intrinsics.checkNotNullParameter(partner, "partner");
        this.privacyPreferences = privacyPreferences;
        this.isTestMode = z;
        this.partner = partner;
    }

    public static /* synthetic */ MobileFuseBiddingPartnerTokenRequest copy$default(MobileFuseBiddingPartnerTokenRequest mobileFuseBiddingPartnerTokenRequest, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, Partner partner, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileFusePrivacyPreferences = mobileFuseBiddingPartnerTokenRequest.getPrivacyPreferences();
        }
        if ((i & 2) != 0) {
            z = mobileFuseBiddingPartnerTokenRequest.isTestMode();
        }
        if ((i & 4) != 0) {
            partner = mobileFuseBiddingPartnerTokenRequest.partner;
        }
        return mobileFuseBiddingPartnerTokenRequest.copy(mobileFusePrivacyPreferences, z, partner);
    }

    @NotNull
    public final MobileFusePrivacyPreferences component1() {
        return getPrivacyPreferences();
    }

    public final boolean component2() {
        return isTestMode();
    }

    @NotNull
    public final Partner component3() {
        return this.partner;
    }

    @NotNull
    public final MobileFuseBiddingPartnerTokenRequest copy(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z, @NotNull Partner partner) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        Intrinsics.checkNotNullParameter(partner, "partner");
        return new MobileFuseBiddingPartnerTokenRequest(privacyPreferences, z, partner);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof MobileFuseBiddingPartnerTokenRequest) {
                MobileFuseBiddingPartnerTokenRequest mobileFuseBiddingPartnerTokenRequest = (MobileFuseBiddingPartnerTokenRequest) obj;
                if (!Intrinsics.m17075f(getPrivacyPreferences(), mobileFuseBiddingPartnerTokenRequest.getPrivacyPreferences()) || isTestMode() != mobileFuseBiddingPartnerTokenRequest.isTestMode() || !Intrinsics.m17075f(this.partner, mobileFuseBiddingPartnerTokenRequest.partner)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final Partner getPartner() {
        return this.partner;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @NotNull
    public MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    public int hashCode() {
        int i;
        MobileFusePrivacyPreferences privacyPreferences = getPrivacyPreferences();
        int i2 = 0;
        if (privacyPreferences != null) {
            i = privacyPreferences.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        boolean isTestMode = isTestMode();
        int i4 = isTestMode;
        if (isTestMode) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        Partner partner = this.partner;
        if (partner != null) {
            i2 = partner.hashCode();
        }
        return i5 + i2;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    public boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "MobileFuseBiddingPartnerTokenRequest(privacyPreferences=" + getPrivacyPreferences() + ", isTestMode=" + isTestMode() + ", partner=" + this.partner + ")";
    }
}
