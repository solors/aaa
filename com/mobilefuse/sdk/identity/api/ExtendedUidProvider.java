package com.mobilefuse.sdk.identity.api;

import com.mobilefuse.sdk.internal.bidding.Partner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExtendedUidProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public enum ExtendedUidProvider {
    LIVERAMP(Partner.LIVERAMP),
    FABRICK(Partner.NEUSTAR);
    
    @NotNull
    private final Partner vendorPartner;

    ExtendedUidProvider(Partner partner) {
        this.vendorPartner = partner;
    }

    @NotNull
    public final Partner getVendorPartner() {
        return this.vendorPartner;
    }
}
