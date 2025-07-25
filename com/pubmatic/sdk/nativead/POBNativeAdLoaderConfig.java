package com.pubmatic.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextSubType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativePlacementType;

/* loaded from: classes7.dex */
public class POBNativeAdLoaderConfig {
    @Nullable

    /* renamed from: a */
    private POBNativeContextType f70416a = null;
    @Nullable

    /* renamed from: b */
    private POBNativeContextSubType f70417b = null;
    @Nullable

    /* renamed from: c */
    private POBNativePlacementType f70418c = null;

    @Nullable
    public POBNativeContextSubType getContextSubType() {
        return this.f70417b;
    }

    @Nullable
    public POBNativeContextType getContextType() {
        return this.f70416a;
    }

    @Nullable
    public POBNativePlacementType getPlacementType() {
        return this.f70418c;
    }

    public void setContextSubType(@NonNull POBNativeContextSubType pOBNativeContextSubType) {
        this.f70417b = pOBNativeContextSubType;
    }

    public void setContextType(@NonNull POBNativeContextType pOBNativeContextType) {
        this.f70416a = pOBNativeContextType;
    }

    public void setPlacementType(@NonNull POBNativePlacementType pOBNativePlacementType) {
        this.f70418c = pOBNativePlacementType;
    }
}
