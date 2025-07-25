package io.bidmachine.media3.extractor.text;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.Decoder;
import io.bidmachine.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes9.dex */
public interface SubtitleDecoder extends Decoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> {
    @Override // io.bidmachine.media3.decoder.Decoder
    @Nullable
    /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws DecoderException;

    @Override // io.bidmachine.media3.decoder.Decoder
    @Nullable
    /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws DecoderException;

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ void flush();

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ String getName();

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws DecoderException;

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ void release();

    void setPositionUs(long j);
}
