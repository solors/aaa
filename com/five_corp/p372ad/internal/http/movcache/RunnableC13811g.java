package com.five_corp.p372ad.internal.http.movcache;

/* renamed from: com.five_corp.ad.internal.http.movcache.g */
/* loaded from: classes4.dex */
public final class RunnableC13811g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f25735a;

    /* renamed from: b */
    public final /* synthetic */ C13812h f25736b;

    public RunnableC13811g(C13812h c13812h, Object obj) {
        this.f25736b = c13812h;
        this.f25735a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f25735a.equals(this.f25736b.f25745i)) {
            return;
        }
        C13812h.m78340a(this.f25736b);
    }
}
