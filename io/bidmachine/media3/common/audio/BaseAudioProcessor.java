package io.bidmachine.media3.common.audio;

import androidx.annotation.CallSuper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {
    private ByteBuffer buffer;
    protected AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    protected AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    @CanIgnoreReturnValue
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = onConfigure(audioFormat);
        if (isActive()) {
            return this.pendingOutputAudioFormat;
        }
        return AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void flush() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
        this.inputAudioFormat = this.pendingInputAudioFormat;
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        onFlush();
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    @CallSuper
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean hasPendingOutput() {
        return this.outputBuffer.hasRemaining();
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public boolean isActive() {
        if (this.pendingOutputAudioFormat != AudioProcessor.AudioFormat.NOT_SET) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    @CallSuper
    public boolean isEnded() {
        if (this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    protected AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        onQueueEndOfStream();
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer replaceOutputBuffer(int i) {
        if (this.buffer.capacity() < i) {
            this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        ByteBuffer byteBuffer = this.buffer;
        this.outputBuffer = byteBuffer;
        return byteBuffer;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.buffer = AudioProcessor.EMPTY_BUFFER;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        onReset();
    }

    protected void onFlush() {
    }

    protected void onQueueEndOfStream() {
    }

    protected void onReset() {
    }
}
