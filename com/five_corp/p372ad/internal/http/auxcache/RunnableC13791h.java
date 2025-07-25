package com.five_corp.p372ad.internal.http.auxcache;

/* renamed from: com.five_corp.ad.internal.http.auxcache.h */
/* loaded from: classes4.dex */
public final class RunnableC13791h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f25671a;

    /* renamed from: b */
    public final /* synthetic */ C13792i f25672b;

    public RunnableC13791h(C13792i c13792i, Object obj) {
        this.f25672b = c13792i;
        this.f25671a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f25671a.equals(this.f25672b.f25679g)) {
            return;
        }
        C13792i c13792i = this.f25672b;
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
