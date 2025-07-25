package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {

    /* renamed from: n */
    private final String f34759n;

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.f34759n = str;
        m74878n(1024);
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return this.f34759n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: p */
    public final SubtitleInputBuffer mo73573c() {
        return new SubtitleInputBuffer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: q */
    public final SubtitleOutputBuffer mo73572d() {
        return new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.SimpleSubtitleDecoder.1
            @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
            public void release() {
                SimpleSubtitleDecoder.this.m74881k(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: r */
    public final SubtitleDecoderException mo73571e(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    /* renamed from: s */
    protected abstract Subtitle mo73353s(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    @Nullable
    /* renamed from: t */
    public final SubtitleDecoderException mo73570f(SubtitleInputBuffer subtitleInputBuffer, SubtitleOutputBuffer subtitleOutputBuffer, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
            subtitleOutputBuffer.setContent(subtitleInputBuffer.timeUs, mo73353s(byteBuffer.array(), byteBuffer.limit(), z), subtitleInputBuffer.subsampleOffsetUs);
            subtitleOutputBuffer.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }
}
