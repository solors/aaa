package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaCodec;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import java.nio.ByteBuffer;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.e */
/* loaded from: classes4.dex */
public final class RunnableC13998e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MediaCodec f26092a;

    /* renamed from: b */
    public final /* synthetic */ int f26093b;

    /* renamed from: c */
    public final /* synthetic */ C14001h f26094c;

    public RunnableC13998e(C14001h c14001h, MediaCodec mediaCodec, int i) {
        this.f26094c = c14001h;
        this.f26092a = mediaCodec;
        this.f26093b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26094c.f26103d != 2) {
            return;
        }
        try {
            ByteBuffer inputBuffer = this.f26092a.getInputBuffer(this.f26093b);
            if (inputBuffer == null) {
                return;
            }
            C14001h c14001h = this.f26094c;
            C13994a c13994a = new C13994a(this.f26093b, inputBuffer);
            if (!c14001h.f26100a.mo78159a(c14001h, c13994a)) {
                c14001h.f26101b.postDelayed(new RunnableC13997d(c14001h, c13994a), 100L);
            }
        } catch (Exception e) {
            this.f26094c.m78186a(new C14068s(EnumC14106t.f26494W4, null, e, null));
        }
    }
}
