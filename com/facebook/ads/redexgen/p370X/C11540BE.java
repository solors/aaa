package com.facebook.ads.redexgen.p370X;

import android.media.MediaCodec;

/* renamed from: com.facebook.ads.redexgen.X.BE */
/* loaded from: assets/audience_network.dex */
public final class C11540BE {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C11540BE(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i, int i2) {
        this.A00.set(i, i2);
        this.A01.setPattern(this.A00);
    }
}
