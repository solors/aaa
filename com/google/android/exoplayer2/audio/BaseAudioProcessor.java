package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* renamed from: a */
    protected AudioProcessor.AudioFormat f32413a;

    /* renamed from: b */
    protected AudioProcessor.AudioFormat f32414b;

    /* renamed from: c */
    private AudioProcessor.AudioFormat f32415c;

    /* renamed from: d */
    private AudioProcessor.AudioFormat f32416d;

    /* renamed from: e */
    private ByteBuffer f32417e;

    /* renamed from: f */
    private ByteBuffer f32418f;

    /* renamed from: g */
    private boolean f32419g;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.f32417e = byteBuffer;
        this.f32418f = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.f32415c = audioFormat;
        this.f32416d = audioFormat;
        this.f32413a = audioFormat;
        this.f32414b = audioFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m75046a() {
        return this.f32418f.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CanIgnoreReturnValue
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        this.f32415c = audioFormat;
        this.f32416d = onConfigure(audioFormat);
        if (isActive()) {
            return this.f32416d;
        }
        return AudioProcessor.AudioFormat.NOT_SET;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final ByteBuffer m75045e(int i) {
        if (this.f32417e.capacity() < i) {
            this.f32417e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f32417e.clear();
        }
        ByteBuffer byteBuffer = this.f32417e;
        this.f32418f = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f32418f = AudioProcessor.EMPTY_BUFFER;
        this.f32419g = false;
        this.f32413a = this.f32415c;
        this.f32414b = this.f32416d;
        mo74897b();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f32418f;
        this.f32418f = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        if (this.f32416d != AudioProcessor.AudioFormat.NOT_SET) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public boolean isEnded() {
        if (this.f32419g && this.f32418f == AudioProcessor.EMPTY_BUFFER) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    protected AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f32419g = true;
        mo74896c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f32417e = AudioProcessor.EMPTY_BUFFER;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.f32415c = audioFormat;
        this.f32416d = audioFormat;
        this.f32413a = audioFormat;
        this.f32414b = audioFormat;
        mo74895d();
    }

    /* renamed from: b */
    protected void mo74897b() {
    }

    /* renamed from: c */
    protected void mo74896c() {
    }

    /* renamed from: d */
    protected void mo74895d() {
    }
}
