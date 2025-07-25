package io.bidmachine.media3.decoder;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(@Nullable Throwable th) {
        super(th);
    }

    public DecoderException(String str, @Nullable Throwable th) {
        super(str, th);
    }
}
