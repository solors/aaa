package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes6.dex */
public final class ProgressiveDownloadHelper extends DownloadHelper {
    @Nullable
    private final String customCacheKey;
    private final Uri uri;

    public ProgressiveDownloadHelper(Uri uri) {
        this(uri, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final DownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list) {
        return new ProgressiveDownloadAction(this.uri, false, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final int getPeriodCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final DownloadAction getRemoveAction(@Nullable byte[] bArr) {
        return new ProgressiveDownloadAction(this.uri, true, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final TrackGroupArray getTrackGroups(int i) {
        return TrackGroupArray.EMPTY;
    }

    public ProgressiveDownloadHelper(Uri uri, @Nullable String str) {
        this.uri = uri;
        this.customCacheKey = str;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    protected final void prepareInternal() {
    }
}
