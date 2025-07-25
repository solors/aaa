package io.bidmachine.media3.exoplayer.offline;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface DownloaderFactory {
    Downloader createDownloader(DownloadRequest downloadRequest);
}
