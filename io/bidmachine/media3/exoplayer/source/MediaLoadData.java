package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;
    @Nullable
    public final Format trackFormat;
    @Nullable
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int i) {
        this(i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public MediaLoadData(int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
        this.dataType = i;
        this.trackType = i2;
        this.trackFormat = format;
        this.trackSelectionReason = i3;
        this.trackSelectionData = obj;
        this.mediaStartTimeMs = j;
        this.mediaEndTimeMs = j2;
    }
}
