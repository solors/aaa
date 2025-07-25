package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* loaded from: classes3.dex */
public class SDKTypeConfig {

    /* renamed from: bg */
    private static ISDKTypeFactory f17696bg;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return f17696bg;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        f17696bg = iSDKTypeFactory;
    }
}
