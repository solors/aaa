package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.yandex.mobile.ads.impl.wt */
/* loaded from: classes8.dex */
public final class C31767wt {
    @Nullable

    /* renamed from: a */
    public byte[] f87389a;
    @Nullable

    /* renamed from: b */
    public byte[] f87390b;

    /* renamed from: c */
    public int f87391c;
    @Nullable

    /* renamed from: d */
    public int[] f87392d;
    @Nullable

    /* renamed from: e */
    public int[] f87393e;

    /* renamed from: f */
    public int f87394f;

    /* renamed from: g */
    public int f87395g;

    /* renamed from: h */
    public int f87396h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f87397i;
    @Nullable

    /* renamed from: j */
    private final C31768a f87398j;

    @RequiresApi(24)
    /* renamed from: com.yandex.mobile.ads.impl.wt$a */
    /* loaded from: classes8.dex */
    private static final class C31768a {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f87399a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f87400b;

        private C31768a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f87399a = cryptoInfo;
            this.f87400b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m27793a(int i, int i2) {
            this.f87400b.set(i, i2);
            this.f87399a.setPattern(this.f87400b);
        }
    }

    public C31767wt() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f87397i = cryptoInfo;
        this.f87398j = y32.f88010a >= 24 ? new C31768a(cryptoInfo) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo m27796a() {
        return this.f87397i;
    }

    /* renamed from: a */
    public final void m27795a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f87392d == null) {
            int[] iArr = new int[1];
            this.f87392d = iArr;
            this.f87397i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f87392d;
        iArr2[0] = iArr2[0] + i;
    }

    /* renamed from: a */
    public final void m27794a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f87394f = i;
        this.f87392d = iArr;
        this.f87393e = iArr2;
        this.f87390b = bArr;
        this.f87389a = bArr2;
        this.f87391c = i2;
        this.f87395g = i3;
        this.f87396h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f87397i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (y32.f88010a >= 24) {
            C31768a c31768a = this.f87398j;
            c31768a.getClass();
            c31768a.m27793a(i3, i4);
        }
    }
}
