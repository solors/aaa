package com.mobilefuse.sdk;

import com.mobilefuse.sdk.internal.RtbLossReason;

/* loaded from: classes7.dex */
public interface AdRendererListener {
    void onAdClicked() throws Throwable;

    void onAdClosed() throws Throwable;

    void onAdImpression() throws Throwable;

    void onAdRuntimeError(RtbLossReason rtbLossReason) throws Throwable;

    void onFullscreenChanged(boolean z) throws Throwable;

    void onPreloadStatusChange(boolean z) throws Throwable;
}
