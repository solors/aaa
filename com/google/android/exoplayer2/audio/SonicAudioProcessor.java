package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes4.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    public static final int SAMPLE_RATE_NO_CHANGE = -1;

    /* renamed from: a */
    private int f32597a;

    /* renamed from: b */
    private float f32598b = 1.0f;

    /* renamed from: c */
    private float f32599c = 1.0f;

    /* renamed from: d */
    private AudioProcessor.AudioFormat f32600d;

    /* renamed from: e */
    private AudioProcessor.AudioFormat f32601e;

    /* renamed from: f */
    private AudioProcessor.AudioFormat f32602f;

    /* renamed from: g */
    private AudioProcessor.AudioFormat f32603g;

    /* renamed from: h */
    private boolean f32604h;
    @Nullable

    /* renamed from: i */
    private Sonic f32605i;

    /* renamed from: j */
    private ByteBuffer f32606j;

    /* renamed from: k */
    private ShortBuffer f32607k;

    /* renamed from: l */
    private ByteBuffer f32608l;

    /* renamed from: m */
    private long f32609m;

    /* renamed from: n */
    private long f32610n;

    /* renamed from: o */
    private boolean f32611o;

    public SonicAudioProcessor() {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.f32600d = audioFormat;
        this.f32601e = audioFormat;
        this.f32602f = audioFormat;
        this.f32603g = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.f32606j = byteBuffer;
        this.f32607k = byteBuffer.asShortBuffer();
        this.f32608l = byteBuffer;
        this.f32597a = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            int i = this.f32597a;
            if (i == -1) {
                i = audioFormat.sampleRate;
            }
            this.f32600d = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i, audioFormat.channelCount, 2);
            this.f32601e = audioFormat2;
            this.f32604h = true;
            return audioFormat2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.f32600d;
            this.f32602f = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.f32601e;
            this.f32603g = audioFormat2;
            if (this.f32604h) {
                this.f32605i = new Sonic(audioFormat.sampleRate, audioFormat.channelCount, this.f32598b, this.f32599c, audioFormat2.sampleRate);
            } else {
                Sonic sonic = this.f32605i;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.f32608l = AudioProcessor.EMPTY_BUFFER;
        this.f32609m = 0L;
        this.f32610n = 0L;
        this.f32611o = false;
    }

    public long getMediaDuration(long j) {
        if (this.f32610n >= 1024) {
            long pendingInputBytes = this.f32609m - ((Sonic) Assertions.checkNotNull(this.f32605i)).getPendingInputBytes();
            int i = this.f32603g.sampleRate;
            int i2 = this.f32602f.sampleRate;
            if (i == i2) {
                return Util.scaleLargeTimestamp(j, pendingInputBytes, this.f32610n);
            }
            return Util.scaleLargeTimestamp(j, pendingInputBytes * i, this.f32610n * i2);
        }
        return (long) (this.f32598b * j);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int outputSize;
        Sonic sonic = this.f32605i;
        if (sonic != null && (outputSize = sonic.getOutputSize()) > 0) {
            if (this.f32606j.capacity() < outputSize) {
                ByteBuffer order = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.f32606j = order;
                this.f32607k = order.asShortBuffer();
            } else {
                this.f32606j.clear();
                this.f32607k.clear();
            }
            sonic.getOutput(this.f32607k);
            this.f32610n += outputSize;
            this.f32606j.limit(outputSize);
            this.f32608l = this.f32606j;
        }
        ByteBuffer byteBuffer = this.f32608l;
        this.f32608l = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        if (this.f32601e.sampleRate != -1 && (Math.abs(this.f32598b - 1.0f) >= 1.0E-4f || Math.abs(this.f32599c - 1.0f) >= 1.0E-4f || this.f32601e.sampleRate != this.f32600d.sampleRate)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        Sonic sonic;
        if (this.f32611o && ((sonic = this.f32605i) == null || sonic.getOutputSize() == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        Sonic sonic = this.f32605i;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.f32611o = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f32609m += remaining;
        ((Sonic) Assertions.checkNotNull(this.f32605i)).queueInput(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.f32598b = 1.0f;
        this.f32599c = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.f32600d = audioFormat;
        this.f32601e = audioFormat;
        this.f32602f = audioFormat;
        this.f32603g = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.f32606j = byteBuffer;
        this.f32607k = byteBuffer.asShortBuffer();
        this.f32608l = byteBuffer;
        this.f32597a = -1;
        this.f32604h = false;
        this.f32605i = null;
        this.f32609m = 0L;
        this.f32610n = 0L;
        this.f32611o = false;
    }

    public void setOutputSampleRateHz(int i) {
        this.f32597a = i;
    }

    public void setPitch(float f) {
        if (this.f32599c != f) {
            this.f32599c = f;
            this.f32604h = true;
        }
    }

    public void setSpeed(float f) {
        if (this.f32598b != f) {
            this.f32598b = f;
            this.f32604h = true;
        }
    }
}
