package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.adjump.FailError;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32794puujujuupp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes8.dex */
public class jpjjjjp {
    private static final int jjuuju = 3;
    private static final String jujujpjjp = "UrlHttpUrlConnectionParser";
    private static final int uppjpjj = 2;

    public static String jujujpjjp(Context context, C32786jujujpjjp c32786jujujpjjp, C32794puujujuupp c32794puujujuupp) {
        if (c32794puujujuupp == null) {
            MLog.m25879e(jujujpjjp, "jumpControlInfo is null");
            return null;
        } else if (TextUtils.isEmpty(c32794puujujuupp.jjuuju())) {
            MLog.m25879e(jujujpjjp, "getClickTrackUrl() is empty");
            return null;
        } else {
            try {
                return jujujpjjp(context, c32794puujujuupp.jjuuju(), c32786jujujpjjp, c32794puujujuupp);
            } catch (Exception e) {
                MLog.m25879e(jujujpjjp, "fail error, exception:" + e.getMessage());
                return null;
            }
        }
    }

    public static String uppjpjj(Context context, C32786jujujpjjp c32786jujujpjjp, C32794puujujuupp c32794puujujuupp) {
        if (c32786jujujpjjp == null) {
            MLog.m25879e(jujujpjjp, "request is null");
            return "Error:request is null";
        } else if (c32786jujujpjjp.jpjjjjp() == null) {
            MLog.m25879e(jujujpjjp, "request.getAdInfo() is null");
            return "Error:request.getAdInfo() is null";
        } else if (TextUtils.isEmpty(c32786jujujpjjp.jpjjjjp().getLandingPageUrl())) {
            MLog.m25879e(jujujpjjp, "getLandingPageUrl is empty");
            return "Error:getLandingPageUrl is empty";
        } else {
            try {
                return jujujpjjp(context, c32786jujujpjjp.jpjjjjp().getLandingPageUrl(), c32786jujujpjjp, c32794puujujuupp);
            } catch (Exception e) {
                MLog.m25879e(jujujpjjp, "fail error, exception:" + e.getMessage());
                return "Error:" + e.getMessage();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String jujujpjjp(android.content.Context r10, java.lang.String r11, com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.C32786jujujpjjp r12, com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32794puujujuupp r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jpjjjjp.jujujpjjp(android.content.Context, java.lang.String, com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jujujpjjp, com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.puujujuupp):java.lang.String");
    }

    private static HttpURLConnection jujujpjjp(C32786jujujpjjp c32786jujujpjjp, String str) throws IOException {
        MLog.m25877i(jujujpjjp, "createConnection report url:" + str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(c32786jujujpjjp.uppjpjj());
        httpURLConnection.setReadTimeout(c32786jujujpjjp.jjuuju());
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void jujujpjjp(C32786jujujpjjp c32786jujujpjjp, FailError failError) throws FailError {
        MLog.m25877i(jujujpjjp, "request fail begin retry");
        c32786jujujpjjp.jujujpjjp(failError);
    }
}
