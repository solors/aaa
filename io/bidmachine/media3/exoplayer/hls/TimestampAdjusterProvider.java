package io.bidmachine.media3.exoplayer.hls;

import android.util.SparseArray;
import io.bidmachine.media3.common.util.TimestampAdjuster;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class TimestampAdjusterProvider {
    private final SparseArray<TimestampAdjuster> timestampAdjusters = new SparseArray<>();

    public TimestampAdjuster getAdjuster(int i) {
        TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i);
        if (timestampAdjuster == null) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(9223372036854775806L);
            this.timestampAdjusters.put(i, timestampAdjuster2);
            return timestampAdjuster2;
        }
        return timestampAdjuster;
    }

    public void reset() {
        this.timestampAdjusters.clear();
    }
}
