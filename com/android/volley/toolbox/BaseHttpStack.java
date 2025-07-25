package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.android.volley.toolbox.a */
/* loaded from: classes2.dex */
public abstract class BaseHttpStack implements HttpStack {
    /* renamed from: a */
    public abstract HttpResponse mo102225a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;
}
