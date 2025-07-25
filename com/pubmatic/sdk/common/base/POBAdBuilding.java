package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;

/* loaded from: classes7.dex */
public interface POBAdBuilding<T extends POBAdDescriptor> {

    /* loaded from: classes7.dex */
    public interface POBAdBuilderListener<T extends POBAdDescriptor> {
        void adBuilderOnSuccess(@NonNull POBAdResponse<T> pOBAdResponse);
    }

    void build(@NonNull POBAdResponse<T> pOBAdResponse);

    void setListener(POBAdBuilderListener<T> pOBAdBuilderListener);
}
