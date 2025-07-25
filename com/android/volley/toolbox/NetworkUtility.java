package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.ClientError;
import com.android.volley.Header;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.ironsource.C21320zk;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: com.android.volley.toolbox.m */
/* loaded from: classes2.dex */
final class NetworkUtility {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NetworkUtility.java */
    /* renamed from: com.android.volley.toolbox.m$b */
    /* loaded from: classes2.dex */
    public static class C3766b {

        /* renamed from: a */
        private final String f3546a;

        /* renamed from: b */
        private final VolleyError f3547b;

        private C3766b(String str, VolleyError volleyError) {
            this.f3546a = str;
            this.f3547b = volleyError;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102209a(Request<?> request, C3766b c3766b) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.mo102277b(c3766b.f3547b);
            request.addMarker(String.format("%s-retry [timeout=%s]", c3766b.f3546a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", c3766b.f3546a, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static NetworkResponse m102208b(Request<?> request, long j, List<Header> list) {
        Cache.C3744a cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new NetworkResponse(304, (byte[]) null, true, j, list);
        }
        return new NetworkResponse(304, cacheEntry.f3445a, true, j, HttpHeaderParser.m102239a(list, cacheEntry));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static byte[] m102207c(InputStream inputStream, int i, ByteArrayPool byteArrayPool) throws IOException {
        byte[] bArr;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(byteArrayPool, i);
        try {
            bArr = byteArrayPool.m102269a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            VolleyLog.m102194e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    byteArrayPool.m102268b(bArr);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.m102194e("Error occurred when closing InputStream", new Object[0]);
            }
            byteArrayPool.m102268b(bArr);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m102206d(long j, Request<?> request, byte[] bArr, int i) {
        Object obj;
        if (VolleyLog.f3552b || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().mo102278a());
            VolleyLog.m102197b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C3766b m102205e(Request<?> request, IOException iOException, long j, @Nullable HttpResponse httpResponse, @Nullable byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new C3766b("socket", new TimeoutError());
        }
        if (!(iOException instanceof MalformedURLException)) {
            if (httpResponse != null) {
                int m102226d = httpResponse.m102226d();
                VolleyLog.m102196c("Unexpected response code %d for %s", Integer.valueOf(m102226d), request.getUrl());
                if (bArr != null) {
                    NetworkResponse networkResponse = new NetworkResponse(m102226d, bArr, false, SystemClock.elapsedRealtime() - j, httpResponse.m102227c());
                    if (m102226d != 401 && m102226d != 403) {
                        if (m102226d >= 400 && m102226d <= 499) {
                            throw new ClientError(networkResponse);
                        }
                        if (m102226d >= 500 && m102226d <= 599 && request.shouldRetryServerErrors()) {
                            return new C3766b(C21320zk.f54768a, new ServerError(networkResponse));
                        }
                        throw new ServerError(networkResponse);
                    }
                    return new C3766b("auth", new AuthFailureError(networkResponse));
                }
                return new C3766b("network", new NetworkError());
            } else if (request.shouldRetryConnectionErrors()) {
                return new C3766b("connection", new NoConnectionError());
            } else {
                throw new NoConnectionError(iOException);
            }
        }
        throw new RuntimeException("Bad URL " + request.getUrl(), iOException);
    }
}
