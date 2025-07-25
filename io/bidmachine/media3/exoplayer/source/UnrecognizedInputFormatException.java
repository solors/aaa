package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str, null, false, 1);
        this.uri = uri;
    }
}
