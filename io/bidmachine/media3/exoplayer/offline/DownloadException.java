package io.bidmachine.media3.exoplayer.offline;

import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public final class DownloadException extends IOException {
    public DownloadException(String str) {
        super(str);
    }

    public DownloadException(Throwable th) {
        super(th);
    }
}
