package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.android.volley.Cache;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.android.volley.n */
/* loaded from: classes2.dex */
public abstract class Request<T> implements Comparable<Request<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    @Nullable
    private Cache.C3744a mCacheEntry;
    @GuardedBy("mLock")
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    @Nullable
    @GuardedBy("mLock")
    private Response.InterfaceC3755a mErrorListener;
    private final VolleyLog.C3767a mEventLog;
    private final Object mLock;
    private final int mMethod;
    @GuardedBy("mLock")
    private InterfaceC3749b mRequestCompleteListener;
    private RequestQueue mRequestQueue;
    @GuardedBy("mLock")
    private boolean mResponseDelivered;
    private RetryPolicy mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    /* compiled from: Request.java */
    /* renamed from: com.android.volley.n$a */
    /* loaded from: classes2.dex */
    class RunnableC3748a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f3485b;

        /* renamed from: c */
        final /* synthetic */ long f3486c;

        RunnableC3748a(String str, long j) {
            this.f3485b = str;
            this.f3486c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Request.this.mEventLog.m102192a(this.f3485b, this.f3486c);
            Request.this.mEventLog.m102191b(Request.this.toString());
        }
    }

    /* compiled from: Request.java */
    /* renamed from: com.android.volley.n$b */
    /* loaded from: classes2.dex */
    interface InterfaceC3749b {
        /* renamed from: a */
        void mo102189a(Request<?> request);

        /* renamed from: b */
        void mo102188b(Request<?> request, Response<?> response);
    }

    /* compiled from: Request.java */
    /* renamed from: com.android.volley.n$c */
    /* loaded from: classes2.dex */
    public enum EnumC3750c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public Request(String str, Response.InterfaceC3755a interfaceC3755a) {
        this(-1, str, interfaceC3755a);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(C20517nb.f52173T);
                    sb2.append(URLEncoder.encode(entry.getValue(), str));
                    sb2.append('&');
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    public void addMarker(String str) {
        if (VolleyLog.C3767a.f3554c) {
            this.mEventLog.m102192a(str, Thread.currentThread().getId());
        }
    }

    @CallSuper
    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Request) ((Request) obj));
    }

    public void deliverError(VolleyError volleyError) {
        Response.InterfaceC3755a interfaceC3755a;
        synchronized (this.mLock) {
            interfaceC3755a = this.mErrorListener;
        }
        if (interfaceC3755a != null) {
            interfaceC3755a.onErrorResponse(volleyError);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void deliverResponse(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finish(String str) {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.finish(this);
        }
        if (VolleyLog.C3767a.f3554c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3748a(str, id2));
                return;
            }
            this.mEventLog.m102192a(str, id2);
            this.mEventLog.m102191b(toString());
        }
    }

    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params != null && params.size() > 0) {
            return encodeParameters(params, getParamsEncoding());
        }
        return null;
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    @Nullable
    public Cache.C3744a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method != 0 && method != -1) {
            return Integer.toString(method) + '-' + url;
        }
        return url;
    }

    @Nullable
    public Response.InterfaceC3755a getErrorListener() {
        Response.InterfaceC3755a interfaceC3755a;
        synchronized (this.mLock) {
            interfaceC3755a = this.mErrorListener;
        }
        return interfaceC3755a;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    @Nullable
    protected Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    protected String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map<String, String> postParams = getPostParams();
        if (postParams != null && postParams.size() > 0) {
            return encodeParameters(postParams, getPostParamsEncoding());
        }
        return null;
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Nullable
    @Deprecated
    protected Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public EnumC3750c getPriority() {
        return EnumC3750c.NORMAL;
    }

    public RetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().mo102276c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyListenerResponseNotUsable() {
        InterfaceC3749b interfaceC3749b;
        synchronized (this.mLock) {
            interfaceC3749b = this.mRequestCompleteListener;
        }
        if (interfaceC3749b != null) {
            interfaceC3749b.mo102189a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyListenerResponseReceived(Response<?> response) {
        InterfaceC3749b interfaceC3749b;
        synchronized (this.mLock) {
            interfaceC3749b = this.mRequestCompleteListener;
        }
        if (interfaceC3749b != null) {
            interfaceC3749b.mo102188b(this, response);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Response<T> parseNetworkResponse(NetworkResponse networkResponse);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendEvent(int i) {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.sendRequestEvent(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setCacheEntry(Cache.C3744a c3744a) {
        this.mCacheEntry = c3744a;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNetworkRequestCompleteListener(InterfaceC3749b interfaceC3749b) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = interfaceC3749b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRequestQueue(RequestQueue requestQueue) {
        this.mRequestQueue = requestQueue;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRetryPolicy(RetryPolicy retryPolicy) {
        this.mRetryPolicy = retryPolicy;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        if (isCanceled()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb2.append(str);
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    public Request(int i, String str, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        this.mEventLog = VolleyLog.C3767a.f3554c ? new VolleyLog.C3767a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = interfaceC3755a;
        setRetryPolicy(new DefaultRetryPolicy());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int compareTo(Request<T> request) {
        EnumC3750c priority = getPriority();
        EnumC3750c priority2 = request.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - request.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }
}
