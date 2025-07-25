package com.mbridge.msdk.p426e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.MBConfiguration;

/* renamed from: com.mbridge.msdk.e.b */
/* loaded from: classes6.dex */
public final class CommonUtils {

    /* renamed from: a */
    private static volatile Boolean f56030a;

    /* renamed from: b */
    private static volatile Boolean f56031b;

    /* renamed from: a */
    public static boolean m52903a() {
        boolean z;
        if (f56030a == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                f56030a = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CommonUtils", "isChina", e);
                }
            }
        }
        if (f56030a != null && f56030a.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m52902b() {
        boolean z;
        if (f56031b == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                f56031b = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CommonUtils", "isOversea", e);
                }
            }
        }
        if (f56031b == null || !f56031b.booleanValue()) {
            return false;
        }
        return true;
    }
}
