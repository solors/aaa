package io.bidmachine.media3.exoplayer.audio;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.common.util.Util;
import java.nio.ByteBuffer;

/* renamed from: io.bidmachine.media3.exoplayer.audio.o */
/* loaded from: classes9.dex */
final class ToFloatPcmAudioProcessor extends io.bidmachine.media3.common.audio.BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (floatToIntBits == FLOAT_NAN_AS_INT) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor
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

    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor, io.bidmachine.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer replaceOutputBuffer;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.inputAudioFormat.encoding;
        if (i2 != 536870912) {
            if (i2 == 805306368) {
                replaceOutputBuffer = replaceOutputBuffer(i);
                while (position < limit) {
                    writePcm32BitFloat((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), replaceOutputBuffer);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            replaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), replaceOutputBuffer);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
    }
}
