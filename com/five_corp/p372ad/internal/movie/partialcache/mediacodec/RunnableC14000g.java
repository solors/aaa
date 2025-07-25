package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaFormat;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.g */
/* loaded from: classes4.dex */
public final class RunnableC14000g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MediaFormat f26098a;

    /* renamed from: b */
    public final /* synthetic */ C14001h f26099b;

    public RunnableC14000g(C14001h c14001h, MediaFormat mediaFormat) {
        this.f26099b = c14001h;
        this.f26098a = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14001h c14001h = this.f26099b;
        if (c14001h.f26103d != 2) {
            return;
        }
        c14001h.f26100a.mo78160a(c14001h, this.f26098a);
    }
}
