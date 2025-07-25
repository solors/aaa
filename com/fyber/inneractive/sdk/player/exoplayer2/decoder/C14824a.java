package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a */
/* loaded from: classes4.dex */
public final class C14824a {

    /* renamed from: a */
    public final MediaCodec.CryptoInfo f28256a;

    /* renamed from: b */
    public final MediaCodec.CryptoInfo.Pattern f28257b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public C14824a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f28256a = cryptoInfo;
    }

    /* renamed from: a */
    public static void m77529a(C14824a c14824a) {
        c14824a.f28257b.set(0, 0);
        c14824a.f28256a.setPattern(c14824a.f28257b);
    }
}
