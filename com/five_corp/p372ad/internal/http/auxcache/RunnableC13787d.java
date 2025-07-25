package com.five_corp.p372ad.internal.http.auxcache;

/* renamed from: com.five_corp.ad.internal.http.auxcache.d */
/* loaded from: classes4.dex */
public final class RunnableC13787d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13792i f25663a;

    public RunnableC13787d(C13792i c13792i) {
        this.f25663a = c13792i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13792i c13792i = this.f25663a;
        c13792i.f25679g = null;
        if (!c13792i.f25680h) {
            c13792i.f25680h = true;
            c13792i.f25682j.m78363e();
            c13792i.f25683k.m78363e();
            c13792i.f25684l.m78363e();
            c13792i.m78371a((C13793j) null);
        }
    }
}
