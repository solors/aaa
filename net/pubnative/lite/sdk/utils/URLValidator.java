package net.pubnative.lite.sdk.utils;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.ironsource.C21114v8;

/* loaded from: classes10.dex */
public class URLValidator {
    public static boolean isValidURL(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        String replace = str.replace(C21114v8.C21123i.f54137d, "%5B").replace(C21114v8.C21123i.f54139e, "%5D");
        if (!URLUtil.isValidUrl(replace) || !Patterns.WEB_URL.matcher(replace).matches()) {
            return false;
        }
        return true;
    }
}
