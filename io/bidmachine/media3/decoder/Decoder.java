package io.bidmachine.media3.decoder;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes9.dex */
public interface Decoder<I, O, E extends DecoderException> {
    @Nullable
    I dequeueInputBuffer() throws DecoderException;

    @Nullable
    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    String getName();

    void queueInputBuffer(I i) throws DecoderException;

    void release();
}
