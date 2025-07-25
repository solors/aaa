package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
final class TrimmingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: h */
    private int f32622h;

    /* renamed from: i */
    private int f32623i;

    /* renamed from: j */
    private boolean f32624j;

    /* renamed from: k */
    private int f32625k;

    /* renamed from: l */
    private byte[] f32626l = Util.EMPTY_BYTE_ARRAY;

    /* renamed from: m */
    private int f32627m;

    /* renamed from: n */
    private long f32628n;

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: b */
    protected void mo74897b() {
        if (this.f32624j) {
            this.f32624j = false;
            int i = this.f32623i;
            int i2 = this.f32413a.bytesPerFrame;
            this.f32626l = new byte[i * i2];
            this.f32625k = this.f32622h * i2;
        }
        this.f32627m = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: c */
    protected void mo74896c() {
        int i;
        if (this.f32624j) {
            if (this.f32627m > 0) {
                this.f32628n += i / this.f32413a.bytesPerFrame;
            }
            this.f32627m = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: d */
    protected void mo74895d() {
        this.f32626l = Util.EMPTY_BYTE_ARRAY;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.f32627m) > 0) {
            m75045e(i).put(this.f32626l, 0, this.f32627m).flip();
            this.f32627m = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.f32628n;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.f32627m == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            this.f32624j = true;
            if (this.f32622h == 0 && this.f32623i == 0) {
                return AudioProcessor.AudioFormat.NOT_SET;
            }
            return audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f32625k);
        this.f32628n += min / this.f32413a.bytesPerFrame;
        this.f32625k -= min;
        byteBuffer.position(position + min);
        if (this.f32625k > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f32627m + i2) - this.f32626l.length;
        ByteBuffer m75045e = m75045e(length);
        int constrainValue = Util.constrainValue(length, 0, this.f32627m);
        m75045e.put(this.f32626l, 0, constrainValue);
        int constrainValue2 = Util.constrainValue(length - constrainValue, 0, i2);
        byteBuffer.limit(byteBuffer.position() + constrainValue2);
        m75045e.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - constrainValue2;
        int i4 = this.f32627m - constrainValue;
        this.f32627m = i4;
        byte[] bArr = this.f32626l;
        System.arraycopy(bArr, constrainValue, bArr, 0, i4);
        byteBuffer.get(this.f32626l, this.f32627m, i3);
        this.f32627m += i3;
        m75045e.flip();
    }

    public void resetTrimmedFrameCount() {
        this.f32628n = 0L;
    }

    public void setTrimFrameCount(int i, int i2) {
        this.f32622h = i;
        this.f32623i = i2;
    }
}
