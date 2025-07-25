package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* loaded from: classes3.dex */
public interface PAGLoadCallback<Ad> {
    @MainThread
    void onAdLoaded(Ad ad2);

    @MainThread
    void onError(@NonNull PAGErrorModel pAGErrorModel);
}
