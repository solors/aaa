package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaCodec;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.m */
/* loaded from: classes4.dex */
public final class RunnableC14006m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26111a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodec.BufferInfo f26112b;

    /* renamed from: c */
    public final /* synthetic */ C14008o f26113c;

    public RunnableC14006m(C14008o c14008o, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f26113c = c14008o;
        this.f26111a = i;
        this.f26112b = bufferInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14008o c14008o = this.f26113c;
        if (c14008o.f26122g != 2) {
            return;
        }
        c14008o.f26118c.mo78158a(c14008o, new C14009p(this.f26111a, this.f26112b));
    }
}
