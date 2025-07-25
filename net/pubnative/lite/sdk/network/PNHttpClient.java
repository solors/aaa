package net.pubnative.lite.sdk.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class PNHttpClient {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final int MAX_RETRIES = 5;
    private static final int READ_TIMEOUT = 10000;
    private static final int RETRY_MULTIPLIER = 2;
    private static final String TAG = "PNHttpClient";
    private static final Handler sUiHandler = new Handler(Looper.getMainLooper());
    private static final Queue<PendingRequest> sPendingRequests = new ArrayDeque();
    private static final Queue<PendingRequest> sCurrentRequests = new ArrayDeque();

    /* loaded from: classes10.dex */
    public static class Response {
        private Exception exception;
        private Map<String, List<String>> headers;
        private String response;
        private int responseCode;

        public Exception getException() {
            return this.exception;
        }

        public String getResponse() {
            return this.response;
        }

        public int getResponseCode() {
            return this.responseCode;
        }

        private Response() {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m14274a(PendingRequest pendingRequest) {
        lambda$makePendingRequest$3(pendingRequest);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14273b(Listener listener, Response response) {
        lambda$makeRequest$1(listener, response);
    }

    /* renamed from: c */
    public static /* synthetic */ void m14272c(String str, Map map, String str2, boolean z, boolean z2, Listener listener, Context context) {
        lambda$makeRequest$2(str, map, str2, z, z2, listener, context);
    }

    /* renamed from: d */
    public static /* synthetic */ void m14271d(Listener listener, Response response) {
        lambda$makeRequest$0(listener, response);
    }

    private static NetworkInfo getActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private static String getStringFromStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString("UTF-8");
            }
        }
    }

    private static boolean isHttpSuccess(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$makePendingRequest$3(PendingRequest pendingRequest) {
        pendingRequest.countRetry();
        if (sendRequest(pendingRequest.getUrl(), pendingRequest.getHeaders(), pendingRequest.getPostBody()).exception != null && !pendingRequest.isLimitReached() && !TextUtils.isEmpty(pendingRequest.getUrl())) {
            sPendingRequests.add(pendingRequest);
        }
    }

    public static /* synthetic */ void lambda$makeRequest$0(Listener listener, Response response) {
        if (listener != null) {
            listener.onFailure(response.exception);
        }
    }

    public static /* synthetic */ void lambda$makeRequest$1(Listener listener, Response response) {
        if (listener != null) {
            listener.onSuccess(response.response, response.headers);
        }
    }

    public static /* synthetic */ void lambda$makeRequest$2(String str, Map map, String str2, boolean z, boolean z2, final Listener listener, Context context) {
        final Response sendRequest = sendRequest(str, map, str2);
        if (sendRequest.exception != null) {
            if (z && !TextUtils.isEmpty(str)) {
                sPendingRequests.add(new PendingRequest(str, str2, map, 5, 2));
            }
            if (z2) {
                sUiHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.network.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        PNHttpClient.m14271d(PNHttpClient.Listener.this, sendRequest);
                    }
                });
            } else if (listener != null) {
                listener.onFailure(sendRequest.exception);
            }
        } else if (z2) {
            sUiHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.network.d
                @Override // java.lang.Runnable
                public final void run() {
                    PNHttpClient.m14273b(PNHttpClient.Listener.this, sendRequest);
                }
            });
        } else if (listener != null) {
            listener.onSuccess(sendRequest.response, sendRequest.headers);
        }
        if (listener != null) {
            listener.onFinally(str, sendRequest.responseCode);
        }
        performPendingRequests(context);
    }

    public static synchronized void makePendingRequest(Context context, final PendingRequest pendingRequest) {
        synchronized (PNHttpClient.class) {
            if (pendingRequest != null) {
                if (pendingRequest.shouldRetry()) {
                    NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0)) {
                        try {
                            ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.network.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    PNHttpClient.m14274a(PendingRequest.this);
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            Logger.m14226e(TAG, pendingRequest.getUrl(), e);
                        }
                    }
                } else {
                    pendingRequest.countAttempt();
                    sPendingRequests.add(pendingRequest);
                }
            }
        }
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, Listener listener) {
        makeRequest(context, str, map, str2, true, listener);
    }

    private static void performPendingRequests(Context context) {
        Queue<PendingRequest> queue = sCurrentRequests;
        if (queue.isEmpty()) {
            Queue<PendingRequest> queue2 = sPendingRequests;
            if (!queue2.isEmpty()) {
                queue.addAll(queue2);
                queue2.clear();
            }
        }
        if (!queue.isEmpty()) {
            for (PendingRequest pendingRequest : queue) {
                makePendingRequest(context, pendingRequest);
            }
            sCurrentRequests.clear();
        }
    }

    private static Response sendRequest(String str, Map<String, String> map, String str2) {
        HttpURLConnection httpURLConnection = null;
        Response response = new Response();
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setInstanceFollowRedirects(true);
                    httpURLConnection2.setRequestMethod("GET");
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpURLConnection2.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestMethod("POST");
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        dataOutputStream.writeBytes(str2);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    response.responseCode = responseCode;
                    Log.d("Response Code: ", String.valueOf(response.getResponseCode()));
                    if (!isHttpSuccess(responseCode)) {
                        response.exception = new Exception(String.format(Locale.ENGLISH, "Network request failed with code: %s", Integer.valueOf(responseCode)));
                    } else {
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        response.response = getStringFromStream(inputStream);
                        inputStream.close();
                        Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                        if (headerFields != null && !headerFields.isEmpty()) {
                            response.headers = new HashMap(headerFields);
                        }
                    }
                    httpURLConnection2.disconnect();
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    response.exception = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return response;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return response;
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, boolean z, Listener listener) {
        makeRequest(context, str, map, str2, z, false, listener);
    }

    public static void makeRequest(final Context context, final String str, final Map<String, String> map, final String str2, final boolean z, final boolean z2, final Listener listener) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 0)) {
            if (listener != null) {
                listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. No network connection.\"}"));
                return;
            }
            return;
        }
        try {
            ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.network.b
                @Override // java.lang.Runnable
                public final void run() {
                    PNHttpClient.m14272c(str, map, str2, z2, z, listener, context);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.m14226e(TAG, str, e);
            listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. Too many requests.\"}"));
        }
    }

    /* loaded from: classes10.dex */
    public interface Listener {
        void onFailure(Throwable th);

        void onSuccess(String str, Map<String, List<String>> map);

        default void onFinally(String str, int i) {
        }
    }
}
