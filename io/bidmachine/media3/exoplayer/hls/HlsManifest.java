package io.bidmachine.media3.exoplayer.hls;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;

@UnstableApi
/* loaded from: classes9.dex */
public final class HlsManifest {
    public final HlsMediaPlaylist mediaPlaylist;
    public final HlsMultivariantPlaylist multivariantPlaylist;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HlsManifest(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.mediaPlaylist = hlsMediaPlaylist;
    }
}
