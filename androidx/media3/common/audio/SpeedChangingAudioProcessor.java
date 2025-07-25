package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    private long bytesRead;
    private boolean endOfStreamQueuedToSonic;
    private final SpeedProvider speedProvider;
    private final SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
    private float currentSpeed = 1.0f;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
    }

    private boolean isUsingSonic() {
        if (this.currentSpeed != 1.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        if (isUsingSonic()) {
            return this.sonicAudioProcessor.getOutput();
        }
        return super.getOutput();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.sonicAudioProcessor.isEnded()) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onFlush() {
        this.sonicAudioProcessor.flush();
        this.endOfStreamQueuedToSonic = false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onQueueEndOfStream() {
        if (!this.endOfStreamQueuedToSonic) {
            this.sonicAudioProcessor.queueEndOfStream();
            this.endOfStreamQueuedToSonic = true;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onReset() {
        this.currentSpeed = 1.0f;
        this.bytesRead = 0L;
        this.sonicAudioProcessor.reset();
        this.endOfStreamQueuedToSonic = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int i;
        long j = this.bytesRead;
        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, audioFormat.sampleRate * audioFormat.bytesPerFrame);
        float speed = this.speedProvider.getSpeed(scaleLargeTimestamp);
        if (speed != this.currentSpeed) {
            this.currentSpeed = speed;
            if (isUsingSonic()) {
                this.sonicAudioProcessor.setSpeed(speed);
                this.sonicAudioProcessor.setPitch(speed);
            }
            flush();
        }
        int limit = byteBuffer.limit();
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(scaleLargeTimestamp);
        if (nextSpeedChangeTimeUs != -9223372036854775807L) {
            long j2 = nextSpeedChangeTimeUs - scaleLargeTimestamp;
            AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
            i = (int) Util.scaleLargeTimestamp(j2, audioFormat2.sampleRate * audioFormat2.bytesPerFrame, 1000000L);
            int i2 = this.inputAudioFormat.bytesPerFrame;
            int i3 = i2 - (i % i2);
            if (i3 != i2) {
                i += i3;
            }
            byteBuffer.limit(Math.min(limit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long position = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (i != -1 && byteBuffer.position() - position == i) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            ByteBuffer replaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                replaceOutputBuffer.put(byteBuffer);
            }
            replaceOutputBuffer.flip();
        }
        this.bytesRead += byteBuffer.position() - position;
        byteBuffer.limit(limit);
    }
}
