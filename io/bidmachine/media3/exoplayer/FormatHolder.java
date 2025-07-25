package io.bidmachine.media3.exoplayer;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.drm.DrmSession;

@UnstableApi
/* loaded from: classes9.dex */
public final class FormatHolder {
    @Nullable
    public DrmSession drmSession;
    @Nullable
    public Format format;

    public void clear() {
        this.drmSession = null;
        this.format = null;
    }
}
