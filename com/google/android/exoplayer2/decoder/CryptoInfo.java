package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class CryptoInfo {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f32683a;
    @Nullable

    /* renamed from: b */
    private final PatternHolderV24 f32684b;
    public int clearBlocks;
    public int encryptedBlocks;
    @Nullable

    /* renamed from: iv */
    public byte[] f32685iv;
    @Nullable
    public byte[] key;
    public int mode;
    @Nullable
    public int[] numBytesOfClearData;
    @Nullable
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    /* loaded from: classes4.dex */
    public static final class PatternHolderV24 {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f32686a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f32687b;

        /* renamed from: b */
        public void m74890b(int i, int i2) {
            this.f32687b.set(i, i2);
            this.f32686a.setPattern(this.f32687b);
        }

        private PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.f32686a = cryptoInfo;
            this.f32687b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f32683a = cryptoInfo;
        this.f32684b = Util.SDK_INT >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.f32683a;
    }

    public void increaseClearDataFirstSubSampleBy(int i) {
        if (i == 0) {
            return;
        }
        if (this.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            this.numBytesOfClearData = iArr;
            this.f32683a.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.numBytesOfClearData;
        iArr2[0] = iArr2[0] + i;
    }

    public void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.f32685iv = bArr2;
        this.mode = i2;
        this.encryptedBlocks = i3;
        this.clearBlocks = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f32683a;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Util.SDK_INT >= 24) {
            ((PatternHolderV24) Assertions.checkNotNull(this.f32684b)).m74890b(i3, i4);
        }
    }
}
