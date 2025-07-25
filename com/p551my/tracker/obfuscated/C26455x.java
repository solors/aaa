package com.p551my.tracker.obfuscated;

import com.p551my.tracker.obfuscated.AbstractC26465z;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.my.tracker.obfuscated.x */
/* loaded from: classes7.dex */
public final class C26455x extends AbstractC26465z<String> {
    /* JADX WARN: Type inference failed for: r3v15, types: [T, java.lang.String] */
    @Override // com.p551my.tracker.obfuscated.AbstractC26465z
    /* renamed from: a */
    public AbstractC26465z.C26467b<String> mo41533a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        boolean z;
        BufferedReader bufferedReader;
        AbstractC26465z.C26467b<String> m41530c = AbstractC26465z.C26467b.m41530c();
        try {
            C26468z0.m41528a("HttpGetRequest: send request to " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                C26468z0.m41528a("HttpGetRequest: response received with response code: " + responseCode);
                if (responseCode == 200) {
                    z = true;
                } else {
                    z = false;
                }
                m41530c.f69103a = z;
                C26468z0.m41528a("HttpGetRequest: processing server response");
                if (m41530c.f69103a) {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                }
                BufferedReader bufferedReader2 = bufferedReader;
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                if (sb2.length() > 0) {
                    m41530c.f69104b = sb2.toString();
                } else {
                    C26468z0.m41528a("HttpGetRequest: response data is empty");
                }
                bufferedReader2.close();
            } catch (Throwable th2) {
                th = th2;
                try {
                    C26468z0.m41527a("HttpGetRequest: error", th);
                    m41530c.f69103a = false;
                    m41530c.f69105c = "HttpGetRequest: error while sending data";
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        return m41530c;
    }
}
