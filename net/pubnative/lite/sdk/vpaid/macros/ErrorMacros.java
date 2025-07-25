package net.pubnative.lite.sdk.vpaid.macros;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public class ErrorMacros {
    private static final String MACRO_ERROR_CODE = "[ERRORCODE]";

    public String processUrl(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(MACRO_ERROR_CODE, str2);
    }
}
