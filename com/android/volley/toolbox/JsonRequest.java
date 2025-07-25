package com.android.volley.toolbox;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.l */
/* loaded from: classes2.dex */
public abstract class JsonRequest<T> extends Request<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", "utf-8");
    @Nullable
    @GuardedBy("mLock")
    private Response.InterfaceC3756b<T> mListener;
    private final Object mLock;
    @Nullable
    private final String mRequestBody;

    @Deprecated
    public JsonRequest(String str, String str2, Response.InterfaceC3756b<T> interfaceC3756b, Response.InterfaceC3755a interfaceC3755a) {
        this(-1, str, str2, interfaceC3756b, interfaceC3755a);
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void deliverResponse(T t) {
        Response.InterfaceC3756b<T> interfaceC3756b;
        synchronized (this.mLock) {
            interfaceC3756b = this.mListener;
        }
        if (interfaceC3756b != null) {
            interfaceC3756b.onResponse(t);
        }
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            VolleyLog.m102193f("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, "utf-8");
            return null;
        }
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.Request
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.Request
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public abstract Response<T> parseNetworkResponse(NetworkResponse networkResponse);

    public JsonRequest(int i, String str, @Nullable String str2, Response.InterfaceC3756b<T> interfaceC3756b, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        super(i, str, interfaceC3755a);
        this.mLock = new Object();
        this.mListener = interfaceC3756b;
        this.mRequestBody = str2;
    }
}
