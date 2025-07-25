package com.pubmatic.sdk.common.base;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;

@MainThread
/* loaded from: classes7.dex */
public interface POBAdRendererListener {
    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdReadyToRefresh(int i);

    void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onAdUnload();

    void onLeavingApplication();

    void onRenderAdClick();

    void onRenderProcessGone();
}
