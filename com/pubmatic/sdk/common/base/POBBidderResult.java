package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBNetworkResult;

/* loaded from: classes7.dex */
public class POBBidderResult<T extends POBAdDescriptor> {
    @Nullable

    /* renamed from: a */
    private POBAdResponse<T> f70045a;
    @Nullable

    /* renamed from: b */
    private POBError f70046b;
    @Nullable

    /* renamed from: c */
    private POBNetworkResult f70047c;

    @Nullable
    public POBAdResponse<T> getAdResponse() {
        return this.f70045a;
    }

    @Nullable
    public POBError getError() {
        return this.f70046b;
    }

    @Nullable
    public POBNetworkResult getNetworkResult() {
        return this.f70047c;
    }

    public void setAdResponse(@Nullable POBAdResponse<T> pOBAdResponse) {
        this.f70045a = pOBAdResponse;
    }

    public void setError(@Nullable POBError pOBError) {
        this.f70046b = pOBError;
    }

    public void setNetworkResult(@Nullable POBNetworkResult pOBNetworkResult) {
        this.f70047c = pOBNetworkResult;
    }

    @NonNull
    public String toString() {
        return "POBBidderResult{adResponse=" + this.f70045a + ", error=" + this.f70046b + ", networkResult=" + this.f70047c + '}';
    }
}
