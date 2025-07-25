package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ciio2c */
/* loaded from: classes8.dex */
public final class C32464ciio2c {
    private static final String coo2iico = "SProp";

    private C32464ciio2c() {
    }

    public static String coo2iico(String str, String str2) {
        try {
            return (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Get exception", e);
            return str2;
        }
    }

    public static String coo2iico(String str) {
        return coo2iico(str, "");
    }

    public static boolean coo2iico(String str, boolean z) {
        try {
            return ((Boolean) Class.forName(KiwiConstants.f2713ar).getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Get exception", e);
            return z;
        }
    }
}
