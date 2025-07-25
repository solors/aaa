package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;
import com.mbridge.msdk.foundation.controller.MBSDKContext;

/* renamed from: com.mbridge.msdk.foundation.tools.w */
/* loaded from: classes6.dex */
public final class NetManager {

    /* renamed from: a */
    private static ConnectivityManager f57031a;

    /* renamed from: a */
    public static synchronized ConnectivityManager m51607a() {
        ConnectivityManager connectivityManager;
        synchronized (NetManager.class) {
            try {
                if (f57031a == null && MBSDKContext.m52746m().m52792c() != null) {
                    f57031a = (ConnectivityManager) MBSDKContext.m52746m().m52792c().getSystemService("connectivity");
                }
            } catch (Exception e) {
                SameLogTool.m51824b("NetManager", e.getMessage());
            }
            connectivityManager = f57031a;
        }
        return connectivityManager;
    }
}
