package com.zeus.gmc.sdk.mobileads.msa.analytics.util;

import android.util.Log;
import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.util.atnaaata */
/* loaded from: classes8.dex */
public final class C32818atnaaata {
    private static final String atnntnannta = "SProp";

    private C32818atnaaata() {
    }

    public static String atnntnannta(String str, String str2) {
        try {
            return (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            Log.e(atnntnannta, "Get exception", e);
            return str2;
        }
    }

    public static String atnntnannta(String str) {
        return atnntnannta(str, "");
    }
}
