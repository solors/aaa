package io.bidmachine.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

@WorkerThread
@UnstableApi
/* loaded from: classes9.dex */
public interface DownloadIndex {
    @Nullable
    Download getDownload(String str) throws IOException;

    DownloadCursor getDownloads(int... iArr) throws IOException;
}
