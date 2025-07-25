package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;

/* renamed from: com.mbridge.msdk.foundation.tools.aq */
/* loaded from: classes6.dex */
public final class UriUtil {
    /* renamed from: a */
    public static String m51691a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e) {
            SameLogTool.m51824b("UriUtil", e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static String m51689b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return new URL(str).getPath();
            }
            return str;
        } catch (Exception e) {
            SameLogTool.m51824b("UriUtil", e.getMessage());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r1 != false) goto L15;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m51688c(java.lang.String r3) {
        /*
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L3f
            boolean r1 = android.webkit.URLUtil.isValidUrl(r3)     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L28
            if (r3 == 0) goto L25
            int r1 = r3.length()     // Catch: java.lang.Exception -> L35
            r2 = 5
            if (r1 <= r2) goto L25
            r1 = 6
            java.lang.String r1 = r3.substring(r0, r1)     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = "tcp://"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L3f
        L28:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L35
            java.util.Set r3 = r3.getQueryParameterNames()     // Catch: java.lang.Exception -> L35
            int r3 = r3.size()     // Catch: java.lang.Exception -> L35
            return r3
        L35:
            r3 = move-exception
            java.lang.String r1 = "UriUtil"
            java.lang.String r3 = r3.getMessage()
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r3)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.UriUtil.m51688c(java.lang.String):int");
    }

    /* renamed from: d */
    public static String m51687d(String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme() + "://" + parse.getHost() + parse.getPath();
        } catch (Exception e) {
            SameLogTool.m51824b("UriUtil", e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static String m51690a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e) {
            SameLogTool.m51824b("UriUtil", e.getMessage());
            return "";
        }
    }
}
