package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaCodec;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.f */
/* loaded from: classes4.dex */
public final class RunnableC13999f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26095a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodec.BufferInfo f26096b;

    /* renamed from: c */
    public final /* synthetic */ C14001h f26097c;

    public RunnableC13999f(C14001h c14001h, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f26097c = c14001h;
        this.f26095a = i;
        this.f26096b = bufferInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14001h c14001h = this.f26097c;
        if (c14001h.f26103d != 2) {
            return;
        }
        c14001h.f26100a.mo78158a(c14001h, new C14009p(this.f26095a, this.f26096b));
    }
}
