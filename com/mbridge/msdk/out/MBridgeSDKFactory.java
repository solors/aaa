package com.mbridge.msdk.out;

import android.annotation.SuppressLint;
import com.mbridge.msdk.system.MBridgeSDKImpl;

/* loaded from: classes6.dex */
public class MBridgeSDKFactory {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile MBridgeSDKImpl instance;

    private MBridgeSDKFactory() {
    }

    public static MBridgeSDKImpl getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                if (instance == null) {
                    instance = new MBridgeSDKImpl();
                }
            }
        }
        return instance;
    }
}
