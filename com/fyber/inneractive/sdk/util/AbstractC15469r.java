package com.fyber.inneractive.sdk.util;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.EnumC14718n;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.util.r */
/* loaded from: classes4.dex */
public abstract class AbstractC15469r {
    /* renamed from: a */
    public static boolean m76470a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* renamed from: b */
    public static String m76467b(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 302 && responseCode != 303 && responseCode != 307) {
            return null;
        }
        IAlog.m76529a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
        String headerField = httpURLConnection.getHeaderField(EnumC14718n.LOCATION.m77684a());
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.m76529a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
    }

    /* renamed from: a */
    public static String m76469a(String str, int i, int i2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            FilterInputStream m76468a = m76468a(httpURLConnection);
            String m76467b = m76467b(httpURLConnection);
            if (!TextUtils.isEmpty(m76467b)) {
                httpURLConnection.disconnect();
                return m76469a(m76467b, i2, i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            boolean z = true;
            if (responseCode != 200) {
                IAlog.m76529a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
                z = false;
            }
            String stringBuffer = z ? AbstractC15471s.m76463a((InputStream) m76468a).toString() : null;
            httpURLConnection.disconnect();
            return stringBuffer;
        } catch (Exception e) {
            IAlog.m76530a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.m76530a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static FilterInputStream m76468a(HttpURLConnection httpURLConnection) {
        FilterInputStream bufferedInputStream;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (TextUtils.equals("gzip", httpURLConnection.getContentEncoding())) {
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }
}
