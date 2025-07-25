package com.inmobi.ads.listeners;

import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class NativeAdEventListener extends AdEventListener<InMobiNative> {
    public void onAdClicked(@NonNull InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(@NonNull InMobiNative inMobiNative, @NonNull AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(inMobiNative, adMetaInfo);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdImpression(@NonNull InMobiNative inMobiNative) {
        super.onAdImpression(inMobiNative);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdLoadFailed(@NonNull InMobiNative inMobiNative, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(@NonNull InMobiNative inMobiNative, @NonNull AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(inMobiNative, adMetaInfo);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiNative inMobiNative, Map map) {
        super.onAdClicked(inMobiNative, map);
    }

    public void onAdFullScreenDismissed(@NonNull InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDisplayed(@NonNull InMobiNative inMobiNative) {
    }

    public void onAdFullScreenWillDisplay(@NonNull InMobiNative inMobiNative) {
    }

    @Deprecated
    public void onAdImpressed(@NonNull InMobiNative inMobiNative) {
    }

    public void onAdStatusChanged(@NonNull InMobiNative inMobiNative) {
    }

    public void onUserWillLeaveApplication(@NonNull InMobiNative inMobiNative) {
    }
}
