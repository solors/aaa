package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* renamed from: com.bytedance.sdk.openadsdk.common.zx */
/* loaded from: classes3.dex */
public class C8237zx {

    /* renamed from: bg */
    private static boolean f18027bg;

    /* renamed from: bg */
    public static void m86728bg(boolean z) {
        f18027bg = z;
    }

    /* renamed from: bg */
    public static ISDKTypeFactory m86729bg(PAGLoadListener pAGLoadListener) {
        if (f18027bg) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory == null) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(5000, PAGErrorCode.LOAD_FACTORY_NULL_MSG);
            }
            return null;
        }
        return sdkTypeFactory;
    }

    /* renamed from: bg */
    public static boolean m86730bg() {
        return f18027bg;
    }
}
