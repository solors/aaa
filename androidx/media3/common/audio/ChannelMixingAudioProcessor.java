package androidx.media3.common.audio;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    private final SparseArray<ChannelMixingMatrix> matrixByInputChannelCount = new SparseArray<>();

    @Override // androidx.media3.common.audio.BaseAudioProcessor
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

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ChannelMixingMatrix channelMixingMatrix = (ChannelMixingMatrix) Assertions.checkStateNotNull(this.matrixByInputChannelCount.get(this.inputAudioFormat.channelCount));
        int remaining = byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(this.outputAudioFormat.bytesPerFrame * remaining);
        AudioMixingUtil.mix(byteBuffer, this.inputAudioFormat, replaceOutputBuffer, this.outputAudioFormat, channelMixingMatrix, remaining, false);
        replaceOutputBuffer.flip();
    }
}
