package io.bidmachine.media3.extractor.text;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes9.dex */
public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String str) {
        super(str);
    }

    public SubtitleDecoderException(@Nullable Throwable th) {
        super(th);
    }

    public SubtitleDecoderException(String str, @Nullable Throwable th) {
        super(str, th);
    }
}
