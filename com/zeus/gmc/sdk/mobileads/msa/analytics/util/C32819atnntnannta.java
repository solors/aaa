package com.zeus.gmc.sdk.mobileads.msa.analytics.util;

import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.util.Locale;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.util.atnntnannta */
/* loaded from: classes8.dex */
public class C32819atnntnannta {
    private static final String atnntnannta = "AndroidUtils";

    private C32819atnntnannta() {
    }

    public static String atnntnannta() {
        String atnntnannta2 = C32818atnaaata.atnntnannta("persist.sys.language", "");
        if (TextUtils.isEmpty(atnntnannta2)) {
            return Locale.getDefault().getLanguage();
        }
        return atnntnannta2;
    }

    public static String atntaanaa() {
        String atnntnannta2 = C32818atnaaata.atnntnannta("ro.miui.region", "");
        try {
            if (TextUtils.isEmpty(atnntnannta2)) {
                Object invoke = Class.forName("android.os.LocaleList").getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Object invoke2 = invoke.getClass().getMethod("size", new Class[0]).invoke(invoke, new Object[0]);
                if ((invoke2 instanceof Integer) && ((Integer) invoke2).intValue() > 0) {
                    Object invoke3 = invoke.getClass().getMethod(KiwiConstants.f2714as, Integer.TYPE).invoke(invoke, 0);
                    Object invoke4 = invoke3.getClass().getMethod("getCountry", new Class[0]).invoke(invoke3, new Object[0]);
                    if (invoke4 instanceof String) {
                        atnntnannta2 = (String) invoke4;
                    }
                }
                if (TextUtils.isEmpty(atnntnannta2)) {
                    atnntnannta2 = C32818atnaaata.atnntnannta("persist.sys.country", "");
                }
                if (TextUtils.isEmpty(atnntnannta2)) {
                    return Locale.getDefault().getCountry();
                }
                return atnntnannta2;
            }
            return atnntnannta2;
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "getRegion e : ", e);
            return atnntnannta2;
        }
    }

    public static String atntntntanaan() {
        if (Locale.getDefault() != null) {
            return Locale.getDefault().toString();
        }
        return "";
    }
}
