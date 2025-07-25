package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.d */
/* loaded from: classes4.dex */
public final class RunnableC13997d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13994a f26090a;

    /* renamed from: b */
    public final /* synthetic */ C14001h f26091b;

    public RunnableC13997d(C14001h c14001h, C13994a c13994a) {
        this.f26091b = c14001h;
        this.f26090a = c13994a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14001h c14001h = this.f26091b;
        if (c14001h.f26103d != 2) {
            return;
        }
        C13994a c13994a = this.f26090a;
        if (!c14001h.f26100a.mo78159a(c14001h, c13994a)) {
            c14001h.f26101b.postDelayed(new RunnableC13997d(c14001h, c13994a), 100L);
        }
    }
}
