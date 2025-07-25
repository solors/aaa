package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
final class ChannelMappingAudioProcessor extends BaseAudioProcessor {
    @Nullable

    /* renamed from: h */
    private int[] f32420h;
    @Nullable

    /* renamed from: i */
    private int[] f32421i;

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: b */
    protected void mo74897b() {
        this.f32421i = this.f32420h;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: d */
    protected void mo74895d() {
        this.f32421i = null;
        this.f32420h = null;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        boolean z;
        boolean z2;
        int[] iArr = this.f32420h;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (audioFormat.encoding == 2) {
            if (audioFormat.channelCount != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < audioFormat.channelCount) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
                }
            }
            if (z) {
                return new AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, 2);
            }
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) Assertions.checkNotNull(this.f32421i);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m75045e = m75045e(((limit - position) / this.f32413a.bytesPerFrame) * this.f32414b.bytesPerFrame);
        while (position < limit) {
            for (int i : iArr) {
                m75045e.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f32413a.bytesPerFrame;
        }
        byteBuffer.position(limit);
        m75045e.flip();
    }

    public void setChannelMap(@Nullable int[] iArr) {
        this.f32420h = iArr;
    }
}
