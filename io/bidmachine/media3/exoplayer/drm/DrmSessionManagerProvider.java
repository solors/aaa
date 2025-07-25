package io.bidmachine.media3.exoplayer.drm;

import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface DrmSessionManagerProvider {
    DrmSessionManager get(MediaItem mediaItem);
}
