package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenRequest_forPartnerKt */
/* loaded from: classes7.dex */
public final class MobileFuseBiddingTokenRequest_forPartner {
    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest createBiddingTokenRequest(@NotNull Partner partner) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        return new MobileFuseBiddingPartnerTokenRequest(new MobileFusePrivacyPreferences.Builder().build(), false, partner);
    }
}
