package com.android.volley;

/* renamed from: com.android.volley.e */
/* loaded from: classes2.dex */
public class DefaultRetryPolicy implements RetryPolicy {

    /* renamed from: a */
    private int f3462a;

    /* renamed from: b */
    private int f3463b;

    /* renamed from: c */
    private final int f3464c;

    /* renamed from: d */
    private final float f3465d;

    public DefaultRetryPolicy() {
        this(2500, 1, 1.0f);
    }

    @Override // com.android.volley.RetryPolicy
    /* renamed from: a */
    public int mo102278a() {
        return this.f3463b;
    }

    @Override // com.android.volley.RetryPolicy
    /* renamed from: b */
    public void mo102277b(VolleyError volleyError) throws VolleyError {
        this.f3463b++;
        int i = this.f3462a;
        this.f3462a = i + ((int) (i * this.f3465d));
        if (m102296d()) {
            return;
        }
        throw volleyError;
    }

    @Override // com.android.volley.RetryPolicy
    /* renamed from: c */
    public int mo102276c() {
        return this.f3462a;
    }

    /* renamed from: d */
    protected boolean m102296d() {
        if (this.f3463b <= this.f3464c) {
            return true;
        }
        return false;
    }

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.f3462a = i;
        this.f3464c = i2;
        this.f3465d = f;
    }
}
