package com.android.volley;

import android.content.Intent;

/* renamed from: com.android.volley.a */
/* loaded from: classes2.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: d */
    private Intent f3444d;

    public AuthFailureError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f3444d != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
