package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr;

/* loaded from: classes3.dex */
public interface PAGLoadListener<Ad> extends InterfaceC8221ldr {
    @MainThread
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    @MainThread
    void onError(int i, String str);
}
