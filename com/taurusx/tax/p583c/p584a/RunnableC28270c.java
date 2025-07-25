package com.taurusx.tax.p583c.p584a;

/* renamed from: com.taurusx.tax.c.a.c */
/* loaded from: classes7.dex */
public class RunnableC28270c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f73442a;

    /* renamed from: b */
    public final /* synthetic */ String f73443b;

    /* renamed from: c */
    public final /* synthetic */ C28265a f73444c;

    public RunnableC28270c(C28265a c28265a, String str, String str2) {
        this.f73444c = c28265a;
        this.f73442a = str;
        this.f73443b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f73444c.f73433d.m38334a(this.f73442a, this.f73443b);
        } catch (Error | Exception e) {
            e.printStackTrace();
        }
    }
}
