package io.bidmachine.media3.common.audio;

import android.util.SparseArray;
import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes9.dex */
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    private final SparseArray<ChannelMixingMatrix> matrixByInputChannelCount = new SparseArray<>();

    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor
    protected AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            ChannelMixingMatrix channelMixingMatrix = this.matrixByInputChannelCount.get(audioFormat.channelCount);
            if (channelMixingMatrix != null) {
                if (channelMixingMatrix.isIdentity()) {
                    return AudioProcessor.AudioFormat.NOT_SET;
                }
                return new AudioProcessor.AudioFormat(audioFormat.sampleRate, channelMixingMatrix.getOutputChannelCount(), 2);
            }
            throw new AudioProcessor.UnhandledAudioFormatException("No mixing matrix for input channel count", audioFormat);
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    public void putChannelMixingMatrix(ChannelMixingMatrix channelMixingMatrix) {
        this.matrixByInputChannelCount.put(channelMixingMatrix.getInputChannelCount(), channelMixingMatrix);
    }

    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor, io.bidmachine.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ChannelMixingMatrix channelMixingMatrix = (ChannelMixingMatrix) Assertions.checkStateNotNull(this.matrixByInputChannelCount.get(this.inputAudioFormat.channelCount));
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer((byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[outputChannelCount];
        while (byteBuffer.hasRemaining()) {
            for (int i = 0; i < inputChannelCount; i++) {
                short s = byteBuffer.getShort();
                for (int i2 = 0; i2 < outputChannelCount; i2++) {
                    fArr[i2] = fArr[i2] + (channelMixingMatrix.getMixingCoefficient(i, i2) * s);
                }
            }
            for (int i3 = 0; i3 < outputChannelCount; i3++) {
                short constrainValue = (short) Util.constrainValue(fArr[i3], -32768.0f, 32767.0f);
                replaceOutputBuffer.put((byte) (constrainValue & 255));
                replaceOutputBuffer.put((byte) ((constrainValue >> 8) & 255));
                fArr[i3] = 0.0f;
            }
        }
        replaceOutputBuffer.flip();
    }
}
