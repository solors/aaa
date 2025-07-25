package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.ironsource.C21114v8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
public class HttpGetRequest {

    /* renamed from: a */
    private final String f42903a;

    /* renamed from: b */
    private final Map<String, String> f42904b;

    /* renamed from: c */
    private final Map<String, String> f42905c = new HashMap();

    public HttpGetRequest(String str, Map<String, String> map) {
        this.f42903a = str;
        this.f42904b = map;
    }

    /* renamed from: a */
    private String m66952a(Map<String, String> map) throws UnsupportedEncodingException {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb2.append(next.getKey());
        sb2.append("=");
        if (next.getValue() == null) {
            str = "";
        } else {
            str = URLEncoder.encode(next.getValue(), "UTF-8");
        }
        sb2.append(str);
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb2.append(C21114v8.C21123i.f54135c);
            sb2.append(next2.getKey());
            sb2.append("=");
            if (next2.getValue() == null) {
                str2 = "";
            } else {
                str2 = URLEncoder.encode(next2.getValue(), "UTF-8");
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private String m66951b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String m66952a = m66952a(map);
        if (m66952a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith(C21114v8.C21123i.f54135c)) {
                m66952a = C21114v8.C21123i.f54135c + m66952a;
            }
            return str + m66952a;
        }
        return str + "?" + m66952a;
    }

    /* renamed from: c */
    private String m66950c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    public HttpResponse execute() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m66950c = null;
        inputStream = null;
        try {
            String m66951b = m66951b(this.f42903a, this.f42904b);
            Logger.getLogger().m67210v("GET Request URL: " + m66951b);
            httpsURLConnection = (HttpsURLConnection) new URL(m66951b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f42905c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m66950c = m66950c(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, m66950c);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest header(String str, String str2) {
        this.f42905c.put(str, str2);
        return this;
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }
}
