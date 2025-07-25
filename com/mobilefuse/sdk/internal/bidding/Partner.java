package com.mobilefuse.sdk.internal.bidding;

import com.mobilefuse.sdk.MobileFuseTargetingData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Partner.kt */
@Metadata
/* loaded from: classes7.dex */
public enum Partner {
    NIMBUS("nimbus"),
    LIVERAMP(MobileFuseTargetingData.LEGACY_VENDOR_LIVERAMP),
    NEUSTAR(MobileFuseTargetingData.LEGACY_VENDOR_FABRICK);
    
    @NotNull
    private final String vendorName;

    Partner(String str) {
        this.vendorName = str;
    }

    @NotNull
    public final String getVendorName() {
        return this.vendorName;
    }
}
