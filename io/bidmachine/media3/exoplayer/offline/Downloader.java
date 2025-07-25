package io.bidmachine.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public interface Downloader {

    /* loaded from: classes9.dex */
    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(@Nullable ProgressListener progressListener) throws IOException, InterruptedException;

    void remove();
}
