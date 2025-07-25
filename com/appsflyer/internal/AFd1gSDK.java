package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44986p;

@Metadata
/* loaded from: classes2.dex */
public abstract class AFd1gSDK {
    @NotNull
    public byte[] AFInAppEventParameterName;
    public int AFKeystoreWrapper;
    private final boolean valueOf;
    @Nullable
    public Map<String, String> values;

    public AFd1gSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventParameterName = bArr;
        this.values = map;
        this.AFKeystoreWrapper = i;
        this.valueOf = true;
    }

    private final boolean valueOf(HttpURLConnection httpURLConnection, long j) {
        BufferedOutputStream bufferedOutputStream;
        InputStream errorStream;
        String m17521z0;
        String str = "";
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(httpURLConnection.getRequestMethod());
        sb2.append(':');
        sb2.append(httpURLConnection.getURL());
        StringBuilder sb3 = new StringBuilder(sb2.toString());
        sb3.append("\n length: ");
        sb3.append(new String(this.AFInAppEventParameterName, Charsets.UTF_8).length());
        Map<String, String> map = this.values;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
        }
        StringBuilder sb4 = new StringBuilder("HTTP: [");
        sb4.append(httpURLConnection.hashCode());
        sb4.append("] ");
        sb4.append((Object) sb3);
        String AFInAppEventType = AFInAppEventType(sb4.toString());
        if (AFInAppEventParameterName()) {
            AFLogger.afRDLog(AFInAppEventType);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFKeystoreWrapper);
        httpURLConnection.setConnectTimeout(this.AFKeystoreWrapper);
        httpURLConnection.addRequestProperty("Content-Type", AFInAppEventType().values);
        Map<String, String> map2 = this.values;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventParameterName.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        if (outputStream instanceof BufferedOutputStream) {
            bufferedOutputStream = (BufferedOutputStream) outputStream;
        } else {
            bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        }
        bufferedOutputStream.write(this.AFInAppEventParameterName);
        bufferedOutputStream.close();
        if (AFe1zSDK.AFInAppEventType(httpURLConnection)) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream != null) {
            Intrinsics.checkNotNullExpressionValue(errorStream, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
            m17521z0 = _Collections.m17521z0(C44986p.m1164f(bufferedReader), null, null, null, 0, null, null, 63, null);
            bufferedReader.close();
            if (m17521z0 != null) {
                str = m17521z0;
            }
        }
        StringBuilder sb5 = new StringBuilder("response code:");
        sb5.append(httpURLConnection.getResponseCode());
        sb5.append(' ');
        sb5.append(httpURLConnection.getResponseMessage());
        sb5.append("\n\tbody:");
        sb5.append(str);
        sb5.append("\n\ttook ");
        sb5.append(System.currentTimeMillis() - j);
        sb5.append("ms");
        String obj = sb5.toString();
        StringBuilder sb6 = new StringBuilder("HTTP: [");
        sb6.append(httpURLConnection.hashCode());
        sb6.append("] ");
        sb6.append(obj);
        String AFInAppEventType2 = AFInAppEventType(sb6.toString());
        if (AFInAppEventParameterName()) {
            AFLogger.afRDLog(AFInAppEventType2);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType2);
        }
        return AFe1zSDK.AFInAppEventType(httpURLConnection);
    }

    public boolean AFInAppEventParameterName() {
        return this.valueOf;
    }

    @NotNull
    public abstract AFe1sSDK AFInAppEventType();

    @NotNull
    public abstract String AFInAppEventType(@NotNull String str);

    @NotNull
    public abstract String AFKeystoreWrapper();

    @WorkerThread
    public final boolean values() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String AFKeystoreWrapper = AFKeystoreWrapper();
            Intrinsics.checkNotNullParameter(AFKeystoreWrapper, "");
            URLConnection openConnection = new URL(AFKeystoreWrapper).openConnection();
            if (openConnection != null) {
                httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    boolean valueOf = valueOf(httpURLConnection, currentTimeMillis);
                    httpURLConnection.disconnect();
                    return valueOf;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb2 = new StringBuilder("error: ");
                        sb2.append(th);
                        sb2.append("\n\ttook ");
                        sb2.append(currentTimeMillis2);
                        sb2.append("ms\n\t");
                        sb2.append(th.getMessage());
                        String obj = sb2.toString();
                        StringBuilder sb3 = new StringBuilder("HTTP: [");
                        if (httpURLConnection != null) {
                            i = httpURLConnection.hashCode();
                        } else {
                            i = 0;
                        }
                        sb3.append(i);
                        sb3.append("] ");
                        sb3.append(obj);
                        String AFInAppEventType = AFInAppEventType(sb3.toString());
                        if (AFInAppEventParameterName()) {
                            AFLogger.afRDLog(AFInAppEventType);
                        } else {
                            AFLogger.afVerboseLog(AFInAppEventType);
                        }
                        return false;
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }
}
