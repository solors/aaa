package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 150000;
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;

    /* renamed from: h */
    private final long f32563h;

    /* renamed from: i */
    private final long f32564i;

    /* renamed from: j */
    private final short f32565j;

    /* renamed from: k */
    private int f32566k;

    /* renamed from: l */
    private boolean f32567l;

    /* renamed from: m */
    private byte[] f32568m;

    /* renamed from: n */
    private byte[] f32569n;

    /* renamed from: o */
    private int f32570o;

    /* renamed from: p */
    private int f32571p;

    /* renamed from: q */
    private int f32572q;

    /* renamed from: r */
    private boolean f32573r;

    /* renamed from: s */
    private long f32574s;

    public SilenceSkippingAudioProcessor() {
        this(150000L, 20000L, (short) 1024);
    }

    /* renamed from: f */
    private int m74929f(long j) {
        return (int) ((j * this.f32413a.sampleRate) / 1000000);
    }

    /* renamed from: g */
    private int m74928g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.f32565j) {
                    int i = this.f32566k;
                    return ((limit / i) * i) + i;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    /* renamed from: h */
    private int m74927h(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f32565j) {
                int i = this.f32566k;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: i */
    private void m74926i(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m75045e(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f32573r = true;
        }
    }

    /* renamed from: j */
    private void m74925j(byte[] bArr, int i) {
        m75045e(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f32573r = true;
        }
    }

    /* renamed from: k */
    private void m74924k(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m74927h = m74927h(byteBuffer);
        int position = m74927h - byteBuffer.position();
        byte[] bArr = this.f32568m;
        int length = bArr.length;
        int i = this.f32571p;
        int i2 = length - i;
        if (m74927h < limit && position < i2) {
            m74925j(bArr, i);
            this.f32571p = 0;
            this.f32570o = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f32568m, this.f32571p, min);
        int i3 = this.f32571p + min;
        this.f32571p = i3;
        byte[] bArr2 = this.f32568m;
        if (i3 == bArr2.length) {
            if (this.f32573r) {
                m74925j(bArr2, this.f32572q);
                this.f32574s += (this.f32571p - (this.f32572q * 2)) / this.f32566k;
            } else {
                this.f32574s += (i3 - this.f32572q) / this.f32566k;
            }
            m74921n(byteBuffer, this.f32568m, this.f32571p);
            this.f32571p = 0;
            this.f32570o = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: l */
    private void m74923l(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f32568m.length));
        int m74928g = m74928g(byteBuffer);
        if (m74928g == byteBuffer.position()) {
            this.f32570o = 1;
        } else {
            byteBuffer.limit(m74928g);
            m74926i(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: m */
    private void m74922m(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m74927h = m74927h(byteBuffer);
        byteBuffer.limit(m74927h);
        this.f32574s += byteBuffer.remaining() / this.f32566k;
        m74921n(byteBuffer, this.f32569n, this.f32572q);
        if (m74927h < limit) {
            m74925j(this.f32569n, this.f32572q);
            this.f32570o = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: n */
    private void m74921n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f32572q);
        int i2 = this.f32572q - min;
        System.arraycopy(bArr, i - i2, this.f32569n, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f32569n, i2, min);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: b */
    protected void mo74897b() {
        if (this.f32567l) {
            this.f32566k = this.f32413a.bytesPerFrame;
            int m74929f = m74929f(this.f32563h) * this.f32566k;
            if (this.f32568m.length != m74929f) {
                this.f32568m = new byte[m74929f];
            }
            int m74929f2 = m74929f(this.f32564i) * this.f32566k;
            this.f32572q = m74929f2;
            if (this.f32569n.length != m74929f2) {
                this.f32569n = new byte[m74929f2];
            }
        }
        this.f32570o = 0;
        this.f32574s = 0L;
        this.f32571p = 0;
        this.f32573r = false;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: c */
    protected void mo74896c() {
        int i = this.f32571p;
        if (i > 0) {
            m74925j(this.f32568m, i);
        }
        if (!this.f32573r) {
            this.f32574s += this.f32572q / this.f32566k;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: d */
    protected void mo74895d() {
        this.f32567l = false;
        this.f32572q = 0;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.f32568m = bArr;
        this.f32569n = bArr;
    }

    public long getSkippedFrames() {
        return this.f32574s;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f32567l;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            if (!this.f32567l) {
                return AudioProcessor.AudioFormat.NOT_SET;
            }
            return audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m75046a()) {
            int i = this.f32570o;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m74922m(byteBuffer);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    m74924k(byteBuffer);
                }
            } else {
                m74923l(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f32567l = z;
    }

    public SilenceSkippingAudioProcessor(long j, long j2, short s) {
        Assertions.checkArgument(j2 <= j);
        this.f32563h = j;
        this.f32564i = j2;
        this.f32565j = s;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.f32568m = bArr;
        this.f32569n = bArr;
    }
}
