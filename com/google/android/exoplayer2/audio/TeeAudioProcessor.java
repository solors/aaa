package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class TeeAudioProcessor extends BaseAudioProcessor {

    /* renamed from: h */
    private final AudioBufferSink f32612h;

    /* loaded from: classes4.dex */
    public interface AudioBufferSink {
        void flush(int i, int i2, int i3);

        void handleBuffer(ByteBuffer byteBuffer);
    }

    /* loaded from: classes4.dex */
    public static final class WavFileAudioBufferSink implements AudioBufferSink {

        /* renamed from: a */
        private final String f32613a;

        /* renamed from: b */
        private final byte[] f32614b;

        /* renamed from: c */
        private final ByteBuffer f32615c;

        /* renamed from: d */
        private int f32616d;

        /* renamed from: e */
        private int f32617e;

        /* renamed from: f */
        private int f32618f;
        @Nullable

        /* renamed from: g */
        private RandomAccessFile f32619g;

        /* renamed from: h */
        private int f32620h;

        /* renamed from: i */
        private int f32621i;

        public WavFileAudioBufferSink(String str) {
            this.f32613a = str;
            byte[] bArr = new byte[1024];
            this.f32614b = bArr;
            this.f32615c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        /* renamed from: a */
        private String m74902a() {
            int i = this.f32620h;
            this.f32620h = i + 1;
            return Util.formatInvariant("%s-%04d.wav", this.f32613a, Integer.valueOf(i));
        }

        /* renamed from: b */
        private void m74901b() throws IOException {
            if (this.f32619g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(m74902a(), "rw");
            m74898e(randomAccessFile);
            this.f32619g = randomAccessFile;
            this.f32621i = 44;
        }

        /* renamed from: c */
        private void m74900c() throws IOException {
            RandomAccessFile randomAccessFile = this.f32619g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f32615c.clear();
                this.f32615c.putInt(this.f32621i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f32614b, 0, 4);
                this.f32615c.clear();
                this.f32615c.putInt(this.f32621i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f32614b, 0, 4);
            } catch (IOException e) {
                Log.m72601w("WaveFileAudioBufferSink", "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.f32619g = null;
            }
        }

        /* renamed from: d */
        private void m74899d(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) Assertions.checkNotNull(this.f32619g);
            while (byteBuffer.hasRemaining()) {
                int min = Math.min(byteBuffer.remaining(), this.f32614b.length);
                byteBuffer.get(this.f32614b, 0, min);
                randomAccessFile.write(this.f32614b, 0, min);
                this.f32621i += min;
            }
        }

        /* renamed from: e */
        private void m74898e(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(1463899717);
            randomAccessFile.writeInt(1718449184);
            this.f32615c.clear();
            this.f32615c.putInt(16);
            this.f32615c.putShort((short) WavUtil.getTypeForPcmEncoding(this.f32618f));
            this.f32615c.putShort((short) this.f32617e);
            this.f32615c.putInt(this.f32616d);
            int pcmFrameSize = Util.getPcmFrameSize(this.f32618f, this.f32617e);
            this.f32615c.putInt(this.f32616d * pcmFrameSize);
            this.f32615c.putShort((short) pcmFrameSize);
            this.f32615c.putShort((short) ((pcmFrameSize * 8) / this.f32617e));
            randomAccessFile.write(this.f32614b, 0, this.f32615c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
        public void flush(int i, int i2, int i3) {
            try {
                m74900c();
            } catch (IOException e) {
                Log.m72605e("WaveFileAudioBufferSink", "Error resetting", e);
            }
            this.f32616d = i;
            this.f32617e = i2;
            this.f32618f = i3;
        }

        @Override // com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
        public void handleBuffer(ByteBuffer byteBuffer) {
            try {
                m74901b();
                m74899d(byteBuffer);
            } catch (IOException e) {
                Log.m72605e("WaveFileAudioBufferSink", "Error writing data", e);
            }
        }
    }

    public TeeAudioProcessor(AudioBufferSink audioBufferSink) {
        this.f32612h = (AudioBufferSink) Assertions.checkNotNull(audioBufferSink);
    }

    /* renamed from: f */
    private void m74903f() {
        if (isActive()) {
            AudioBufferSink audioBufferSink = this.f32612h;
            AudioProcessor.AudioFormat audioFormat = this.f32413a;
            audioBufferSink.flush(audioFormat.sampleRate, audioFormat.channelCount, audioFormat.encoding);
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: b */
    protected void mo74897b() {
        m74903f();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: c */
    protected void mo74896c() {
        m74903f();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: d */
    protected void mo74895d() {
        m74903f();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        this.f32612h.handleBuffer(byteBuffer.asReadOnlyBuffer());
        m75045e(remaining).put(byteBuffer).flip();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }
}
