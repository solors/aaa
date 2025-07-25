package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class TrueHdSampleRechunker {

    /* renamed from: a */
    private final byte[] f32927a = new byte[10];

    /* renamed from: b */
    private boolean f32928b;

    /* renamed from: c */
    private int f32929c;

    /* renamed from: d */
    private long f32930d;

    /* renamed from: e */
    private int f32931e;

    /* renamed from: f */
    private int f32932f;

    /* renamed from: g */
    private int f32933g;

    public void outputPendingSampleMetadata(TrackOutput trackOutput, @Nullable TrackOutput.CryptoData cryptoData) {
        if (this.f32929c > 0) {
            trackOutput.sampleMetadata(this.f32930d, this.f32931e, this.f32932f, this.f32933g, cryptoData);
            this.f32929c = 0;
        }
    }

    public void reset() {
        this.f32928b = false;
        this.f32929c = 0;
    }

    public void sampleMetadata(TrackOutput trackOutput, long j, int i, int i2, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
        boolean z;
        if (this.f32933g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (!this.f32928b) {
            return;
        }
        int i4 = this.f32929c;
        int i5 = i4 + 1;
        this.f32929c = i5;
        if (i4 == 0) {
            this.f32930d = j;
            this.f32931e = i;
            this.f32932f = 0;
        }
        this.f32932f += i2;
        this.f32933g = i3;
        if (i5 >= 16) {
            outputPendingSampleMetadata(trackOutput, cryptoData);
        }
    }

    public void startSample(ExtractorInput extractorInput) throws IOException {
        if (this.f32928b) {
            return;
        }
        extractorInput.peekFully(this.f32927a, 0, 10);
        extractorInput.resetPeekPosition();
        if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.f32927a) == 0) {
            return;
        }
        this.f32928b = true;
    }
}
