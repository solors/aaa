package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.MediaItem;

/* loaded from: classes4.dex */
public interface DrmSessionManagerProvider {
    DrmSessionManager get(MediaItem mediaItem);
}
