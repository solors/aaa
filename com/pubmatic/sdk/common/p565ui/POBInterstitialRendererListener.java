package com.pubmatic.sdk.common.p565ui;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

@MainThread
/* renamed from: com.pubmatic.sdk.common.ui.POBInterstitialRendererListener */
/* loaded from: classes7.dex */
public interface POBInterstitialRendererListener {
    void onAdClicked();

    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdRender(POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onAdUnload();

    void onLeavingApplication();

    void onRenderProcessGone();
}
