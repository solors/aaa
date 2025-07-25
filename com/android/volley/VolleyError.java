package com.android.volley;

/* renamed from: com.android.volley.u */
/* loaded from: classes2.dex */
public class VolleyError extends Exception {

    /* renamed from: b */
    public final NetworkResponse f3549b;

    /* renamed from: c */
    private long f3550c;

    public VolleyError() {
        this.f3549b = null;
    }

    /* renamed from: a */
    public long m102200a() {
        return this.f3550c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m102199b(long j) {
        this.f3550c = j;
    }

    public VolleyError(NetworkResponse networkResponse) {
        this.f3549b = networkResponse;
    }

    public VolleyError(String str) {
        super(str);
        this.f3549b = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f3549b = null;
    }
}
