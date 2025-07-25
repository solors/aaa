package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
final class FloatResamplingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: h */
    private static final int f32540h = Float.floatToIntBits(Float.NaN);

    /* renamed from: f */
    private static void m74954f(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == f32540h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i)) {
            if (i != 4) {
                return new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4);
            }
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer m75045e;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f32413a.encoding;
        if (i2 != 536870912) {
            if (i2 == 805306368) {
                m75045e = m75045e(i);
                while (position < limit) {
                    m74954f((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m75045e);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            m75045e = m75045e((i / 3) * 4);
            while (position < limit) {
                m74954f(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m75045e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m75045e.flip();
    }
}
