package com.applovin.impl;

import android.media.MediaCodec;

/* renamed from: com.applovin.impl.z4 */
/* loaded from: classes2.dex */
public final class C5950z4 {

    /* renamed from: a */
    public byte[] f12482a;

    /* renamed from: b */
    public byte[] f12483b;

    /* renamed from: c */
    public int f12484c;

    /* renamed from: d */
    public int[] f12485d;

    /* renamed from: e */
    public int[] f12486e;

    /* renamed from: f */
    public int f12487f;

    /* renamed from: g */
    public int f12488g;

    /* renamed from: h */
    public int f12489h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f12490i;

    /* renamed from: j */
    private final C5952b f12491j;

    /* renamed from: com.applovin.impl.z4$b */
    /* loaded from: classes2.dex */
    private static final class C5952b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f12492a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f12493b;

        private C5952b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f12492a = cryptoInfo;
            this.f12493b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m92515a(int i, int i2) {
            this.f12493b.set(i, i2);
            this.f12492a.setPattern(this.f12493b);
        }
    }

    public C5950z4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f12490i = cryptoInfo;
        this.f12491j = AbstractC5863xp.f12151a >= 24 ? new C5952b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m92518a() {
        return this.f12490i;
    }

    /* renamed from: a */
    public void m92517a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f12485d == null) {
            int[] iArr = new int[1];
            this.f12485d = iArr;
            this.f12490i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f12485d;
        iArr2[0] = iArr2[0] + i;
    }

    /* renamed from: a */
    public void m92516a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f12487f = i;
        this.f12485d = iArr;
        this.f12486e = iArr2;
        this.f12483b = bArr;
        this.f12482a = bArr2;
        this.f12484c = i2;
        this.f12488g = i3;
        this.f12489h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f12490i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (AbstractC5863xp.f12151a >= 24) {
            ((C5952b) AbstractC4100b1.m100583a(this.f12491j)).m92515a(i3, i4);
        }
    }
}
