package com.android.volley.toolbox;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.o */
/* loaded from: classes2.dex */
public class StringRequest extends Request<String> {
    @Nullable
    @GuardedBy("mLock")
    private Response.InterfaceC3756b<String> mListener;
    private final Object mLock;

    public StringRequest(int i, String str, Response.InterfaceC3756b<String> interfaceC3756b, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        super(i, str, interfaceC3755a);
        this.mLock = new Object();
        this.mListener = interfaceC3756b;
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
    public Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
        String str;
        try {
            str = new String(networkResponse.f3480b, HttpHeaderParser.m102234f(networkResponse.f3481c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(networkResponse.f3480b);
        }
        return Response.m102282c(str, HttpHeaderParser.m102235e(networkResponse));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void deliverResponse(String str) {
        Response.InterfaceC3756b<String> interfaceC3756b;
        synchronized (this.mLock) {
            interfaceC3756b = this.mListener;
        }
        if (interfaceC3756b != null) {
            interfaceC3756b.onResponse(str);
        }
    }

    public StringRequest(String str, Response.InterfaceC3756b<String> interfaceC3756b, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        this(0, str, interfaceC3756b, interfaceC3755a);
    }
}
