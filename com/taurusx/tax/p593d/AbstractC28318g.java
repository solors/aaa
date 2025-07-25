package com.taurusx.tax.p593d;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28530n;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.d.g */
/* loaded from: classes7.dex */
public abstract class AbstractC28318g extends HttpURLConnection {
    /* renamed from: a */
    public static HttpURLConnection m38239a(String str) throws IOException {
        C28530n.m37997a(str);
        if (!m38238b(str)) {
            try {
                str = m38237c(str);
            } catch (Exception unused) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            httpURLConnection.setRequestProperty(stringFogImpl.m23824a(new byte[]{81, -3, 65, -4, 9, -17, 67, -21, 74, -6}, new byte[]{36, -114}), System.getProperty(stringFogImpl.m23824a(new byte[]{17, -13, 13, -9, 87, -26, 30, -30, 23, -13}, new byte[]{121, -121})));
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(20000);
            return httpURLConnection;
        }
        throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{-18, -59, -9, -73, -46, -28, -101, -2, -42, -25, -55, -8, -53, -14, -55, -5, -62, -73, -34, -7, -40, -8, -33, -14, -33, -83, -101}, new byte[]{-69, -105}) + str);
    }

    /* renamed from: b */
    public static boolean m38238b(String str) {
        try {
            URLDecoder.decode(str, C28162a.f73047a.m23824a(new byte[]{-11, -13, -26, -118, -104}, new byte[]{-96, -89}));
            return false;
        } catch (UnsupportedEncodingException unused) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{-98, -19, -97, -2, -97, -1, -110}, new byte[]{-22, -116});
            LogUtil.m37900v(m23824a, stringFogImpl.m23824a(new byte[]{-112, 85, -87, 7, -84, 84, -27, 78, -88, 87, -73, 72, -75, 66, -73, 75, -68, 7, -96, 73, -90, 72, -95, 66, -95, 29, -27}, new byte[]{-59, 39}) + str);
            return true;
        }
    }

    /* renamed from: c */
    public static String m38237c(String str) throws Exception {
        boolean z;
        URI uri;
        C28530n.m37997a(str);
        if (!m38238b(str)) {
            try {
                new URI(str);
                z = false;
            } catch (URISyntaxException unused) {
                z = true;
            }
            if (z) {
                try {
                    URL url = new URL(str);
                    uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
                } catch (Exception e) {
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    String m23824a = stringFogImpl.m23824a(new byte[]{30, -40, 31, -53, 31, -54, 18}, new byte[]{106, -71});
                    LogUtil.m37900v(m23824a, stringFogImpl.m23824a(new byte[]{19, -15, 60, -4, 48, -12, 117, -28, 58, -80, 48, -2, 54, -1, 49, -11, 117, -27, 39, -4, 111, -80}, new byte[]{85, -112}) + str);
                    throw e;
                }
            } else {
                uri = new URI(str);
            }
            return uri.toURL().toString();
        }
        throw new UnsupportedEncodingException(C28162a.f73047a.m23824a(new byte[]{-81, 60, -74, 78, -109, 29, -38, 7, -105, 30, -120, 1, -118, 11, -120, 2, -125, 78, -97, 0, -103, 1, -98, 11, -98, 84, -38}, new byte[]{-6, 110}) + str);
    }
}
