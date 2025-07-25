package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaCodec;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.p */
/* loaded from: classes4.dex */
public final class C14009p {

    /* renamed from: a */
    public final int f26123a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f26124b;

    public C14009p(int i, MediaCodec.BufferInfo bufferInfo) {
        this.f26123a = i;
        this.f26124b = bufferInfo;
    }

    /* renamed from: a */
    public final long m78178a() {
        return this.f26124b.presentationTimeUs;
    }

    /* renamed from: b */
    public final boolean m78177b() {
        if (this.f26124b.size == 0) {
            return true;
        }
        return false;
    }
}
