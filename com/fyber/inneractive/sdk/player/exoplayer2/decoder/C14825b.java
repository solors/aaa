package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.b */
/* loaded from: classes4.dex */
public final class C14825b {

    /* renamed from: a */
    public byte[] f28258a;

    /* renamed from: b */
    public int[] f28259b;

    /* renamed from: c */
    public int[] f28260c;

    /* renamed from: d */
    public final MediaCodec.CryptoInfo f28261d;

    /* renamed from: e */
    public final C14824a f28262e;

    public C14825b() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i = AbstractC15133z.f29832a;
        if (i >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.f28261d = cryptoInfo;
        this.f28262e = i >= 24 ? new C14824a(cryptoInfo) : null;
    }

    /* renamed from: a */
    public final void m77528a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f28259b = iArr;
        this.f28260c = iArr2;
        this.f28258a = bArr2;
        int i2 = AbstractC15133z.f29832a;
        if (i2 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f28261d;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i2 >= 24) {
                C14824a.m77529a(this.f28262e);
            }
        }
    }
}
