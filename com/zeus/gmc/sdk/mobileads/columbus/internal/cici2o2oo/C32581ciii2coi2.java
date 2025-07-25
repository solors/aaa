package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.ciii2coi2 */
/* loaded from: classes8.dex */
public class C32581ciii2coi2 {
    private static boolean c2oc2i = false;
    @NonNull
    private static final String coi222o222;
    private static final String coo2iico = "Networking";

    static {
        String str = "";
        try {
            str = System.getProperty("http.agent", "");
        } catch (SecurityException unused) {
            MLog.m25889e(coo2iico, "Unable to get system user agent.");
        }
        coi222o222 = str;
        c2oc2i = false;
    }

    private C32581ciii2coi2() {
    }

    public static boolean coi222o222() {
        return c2oc2i;
    }

    public static String coo2iico() {
        if (coi222o222()) {
            return "https";
        }
        return "http";
    }
}
