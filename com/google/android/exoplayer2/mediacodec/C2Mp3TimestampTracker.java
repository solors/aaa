package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
final class C2Mp3TimestampTracker {

    /* renamed from: a */
    private long f33801a;

    /* renamed from: b */
    private long f33802b;

    /* renamed from: c */
    private boolean f33803c;

    /* renamed from: a */
    private long m74226a(long j) {
        return this.f33801a + Math.max(0L, ((this.f33802b - 529) * 1000000) / j);
    }

    public long getLastOutputBufferPresentationTimeUs(Format format) {
        return m74226a(format.sampleRate);
    }

    public void reset() {
        this.f33801a = 0L;
        this.f33802b = 0L;
        this.f33803c = false;
    }

    public long updateAndGetPresentationTimeUs(Format format, DecoderInputBuffer decoderInputBuffer) {
        if (this.f33802b == 0) {
            this.f33801a = decoderInputBuffer.timeUs;
        }
        if (this.f33803c) {
            return decoderInputBuffer.timeUs;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int parseMpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(i);
        if (parseMpegAudioFrameSampleCount == -1) {
            this.f33803c = true;
            this.f33802b = 0L;
            this.f33801a = decoderInputBuffer.timeUs;
            Log.m72602w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return decoderInputBuffer.timeUs;
        }
        long m74226a = m74226a(format.sampleRate);
        this.f33802b += parseMpegAudioFrameSampleCount;
        return m74226a;
    }
}
