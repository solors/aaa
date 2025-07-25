package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface DownloaderFactory {
    Downloader createDownloader(DownloadRequest downloadRequest);
}
