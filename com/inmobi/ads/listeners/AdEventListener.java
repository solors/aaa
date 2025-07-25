package com.inmobi.ads.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

@Keep
/* loaded from: classes6.dex */
abstract class AdEventListener<T> {
    public void onAdImpression(@NonNull T t) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdClicked(@NonNull T t, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(@NonNull T t, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(@NonNull T t, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(@NonNull T t, @NonNull AdMetaInfo adMetaInfo) {
    }
}
