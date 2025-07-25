package com.pubmatic.sdk.common.utility;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p552ot.pubsub.p559g.C26542f;
import com.pubmatic.sdk.common.log.POBLog;

/* loaded from: classes7.dex */
public class POBDeepLinkUtil {
    /* renamed from: a */
    private static boolean m40556a(Context context, Uri uri) {
        boolean z;
        if (triggerDeepLink(context, uri.toString(), false)) {
            POBLog.debug("PMDeepLinkUtil", "uri based deep link success!", "URL - " + uri);
            return true;
        }
        String[] split = uri.toString().split(";");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String m40555a = m40555a(split[i]);
            if (m40555a != null && triggerDeepLink(context, m40555a, false)) {
                POBLog.debug("PMDeepLinkUtil", "fallback based deep link success!", "Fallback URL - " + m40555a);
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            for (String str : split) {
                String m40554b = m40554b(str);
                if (m40554b != null && triggerDeepLink(context, m40554b, false)) {
                    POBLog.debug("PMDeepLinkUtil", "package based deep link success!", "Package URL - " + m40554b);
                    return true;
                }
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: b */
    private static String m40554b(String str) {
        try {
            if (str.contains(C26542f.C26543a.f69507e)) {
                String[] split = str.split("=");
                return "https://play.google.com/store/apps/details?id=" + split[1];
            }
        } catch (Exception e) {
            POBLog.error("PMDeepLinkUtil", e.getLocalizedMessage(), new Object[0]);
        }
        return null;
    }

    public static boolean triggerDeepLink(@NonNull Context context, @NonNull String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (z) {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(str));
            POBUtils.startActivity(context, intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            POBLog.warn("PMDeepLinkUtil", "Activity not found for the uri: " + str, new Object[0]);
            return false;
        } catch (Exception e) {
            POBLog.warn("PMDeepLinkUtil", "Error while starting the activity for the uri: %s. Error: %s", str, e.getMessage());
            return false;
        }
    }

    public static boolean validateAndRedirect(Context context, String str) {
        if (str != null && context != null) {
            if (POBUtils.isValidPlayStoreUrl(str) || !URLUtil.isValidUrl(str)) {
                return m40556a(context, Uri.parse(str));
            }
            return false;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    private static String m40555a(String str) {
        String str2 = null;
        try {
            if (str.contains("browser_fallback_url")) {
                str2 = str.split("=")[1];
                POBLog.debug("PMDeepLinkUtil", "Fall back url :" + str2, new Object[0]);
                return str2;
            }
            return null;
        } catch (Exception e) {
            POBLog.error("PMDeepLinkUtil", e.getLocalizedMessage(), new Object[0]);
            return str2;
        }
    }
}
