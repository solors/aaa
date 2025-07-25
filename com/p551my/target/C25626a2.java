package com.p551my.target;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: com.my.target.a2 */
/* loaded from: classes7.dex */
public class C25626a2 extends AbstractC25653b2 {
    @Override // com.p551my.target.AbstractC25653b2
    /* renamed from: a */
    public C25674c2 mo42271a(String str, String str2, Map map, Context context) {
        HttpURLConnection httpURLConnection;
        C25674c2 c25674c2 = new C25674c2();
        if (str2 == null) {
            AbstractC25846ja.m43680a("HttpLogRequest: Can't send log request - body is null");
            c25674c2.f66678a = false;
            return c25674c2;
        }
        AbstractC25846ja.m43680a("HttpLogRequest: Send log request");
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
            httpURLConnection.setRequestProperty("connection", "close");
            AbstractC25881l1.m43564a(httpURLConnection);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            httpURLConnection.getInputStream().close();
            httpURLConnection.disconnect();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                c25674c2.f66678a = false;
                c25674c2.f66682e = th.getMessage();
                AbstractC25846ja.m43680a("HttpLogRequest: Log request error - " + c25674c2.f66682e);
                return c25674c2;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
        return c25674c2;
    }

    /* renamed from: a */
    public static C25626a2 m44246a() {
        return new C25626a2();
    }
}
