package io.bidmachine.media3.common.audio;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class AudioProcessingPipeline {
    private final ImmutableList<AudioProcessor> audioProcessors;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final List<AudioProcessor> activeAudioProcessors = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];

    public AudioProcessingPipeline(ImmutableList<AudioProcessor> immutableList) {
        this.audioProcessors = immutableList;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }

    private void processData(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        for (boolean z3 = true; z3; z3 = z) {
            z = false;
            for (int i = 0; i <= getFinalOutputBufferIndex(); i++) {
                if (!this.outputBuffers[i].hasRemaining()) {
                    AudioProcessor audioProcessor = this.activeAudioProcessors.get(i);
                    if (audioProcessor.isEnded()) {
                        if (!this.outputBuffers[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                            this.activeAudioProcessors.get(i + 1).queueEndOfStream();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.outputBuffers[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = AudioProcessor.EMPTY_BUFFER;
                        }
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i] = audioProcessor.getOutput();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.outputBuffers[i].hasRemaining()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z |= z2;
                    }
                }
            }
        }
    }

    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (!audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
            for (int i = 0; i < this.audioProcessors.size(); i++) {
                AudioProcessor audioProcessor = this.audioProcessors.get(i);
                AudioProcessor.AudioFormat configure = audioProcessor.configure(audioFormat);
                if (audioProcessor.isActive()) {
                    Assertions.checkState(!configure.equals(AudioProcessor.AudioFormat.NOT_SET));
                    audioFormat = configure;
                }
            }
            this.pendingOutputAudioFormat = audioFormat;
            return audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            if (this.audioProcessors.get(i) != audioProcessingPipeline.audioProcessors.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void flush() {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new ByteBuffer[this.activeAudioProcessors.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.outputBuffers[i2] = this.activeAudioProcessors.get(i2).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return AudioProcessor.EMPTY_BUFFER;
        }
        ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (!byteBuffer.hasRemaining()) {
            processData(AudioProcessor.EMPTY_BUFFER);
        }
        return byteBuffer;
    }

    public AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public int hashCode() {
        return this.audioProcessors.hashCode();
    }

    public boolean isEnded() {
        if (this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public void queueEndOfStream() {
        if (isOperational() && !this.inputEnded) {
            this.inputEnded = true;
            this.activeAudioProcessors.get(0).queueEndOfStream();
        }
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (isOperational() && !this.inputEnded) {
            processData(byteBuffer);
        }
    }

    public void reset() {
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.outputBuffers = new ByteBuffer[0];
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }
}
