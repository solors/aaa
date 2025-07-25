package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr;

/* loaded from: classes3.dex */
public interface IADLoader<R extends PAGRequest, L extends InterfaceC8221ldr> {
    void loadAd(String str, R r, L l);
}
