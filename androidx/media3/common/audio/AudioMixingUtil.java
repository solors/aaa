package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class AudioMixingUtil {
    private static final float FLOAT_PCM_MAX_VALUE = 1.0f;
    private static final float FLOAT_PCM_MIN_VALUE = -1.0f;

    private AudioMixingUtil() {
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        int i = audioFormat.encoding;
        return i == 2 || i == 4;
    }

    private static float floatSampleToInt16Pcm(float f) {
        int i;
        if (f < 0.0f) {
            i = 32768;
        } else {
            i = 32767;
        }
        return Util.constrainValue(f * i, -32768.0f, 32767.0f);
    }

    private static float getPcmSample(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            return floatSampleToInt16Pcm(byteBuffer.getFloat());
        } else if (z) {
            return int16SampleToFloatPcm(byteBuffer.getShort());
        } else {
            return byteBuffer.getFloat();
        }
    }

    private static float int16SampleToFloatPcm(short s) {
        int i;
        float f = s;
        if (s < 0) {
            i = 32768;
        } else {
            i = 32767;
        }
        return f / i;
    }

    public static ByteBuffer mix(ByteBuffer byteBuffer, AudioProcessor.AudioFormat audioFormat, ByteBuffer byteBuffer2, AudioProcessor.AudioFormat audioFormat2, ChannelMixingMatrix channelMixingMatrix, int i, boolean z) {
        AudioProcessor.AudioFormat audioFormat3;
        boolean z2;
        boolean z3 = true;
        if (audioFormat.encoding == 2) {
            audioFormat3 = audioFormat2;
            z2 = true;
        } else {
            audioFormat3 = audioFormat2;
            z2 = false;
        }
        if (audioFormat3.encoding != 2) {
            z3 = false;
        }
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i2 = 0; i2 < i; i2++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i3 = 0; i3 < outputChannelCount; i3++) {
                    fArr2[i3] = getPcmSample(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(position);
            }
            for (int i4 = 0; i4 < inputChannelCount; i4++) {
                fArr[i4] = getPcmSample(byteBuffer, z2, z3);
            }
            for (int i5 = 0; i5 < outputChannelCount; i5++) {
                for (int i6 = 0; i6 < inputChannelCount; i6++) {
                    fArr2[i5] = fArr2[i5] + (fArr[i6] * channelMixingMatrix.getMixingCoefficient(i6, i5));
                }
                if (z3) {
                    byteBuffer2.putShort((short) Util.constrainValue(fArr2[i5], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(Util.constrainValue(fArr2[i5], -1.0f, 1.0f));
                }
                fArr2[i5] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat, AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }
}
