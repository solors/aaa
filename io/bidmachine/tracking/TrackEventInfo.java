package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class TrackEventInfo {
    @Nullable
    private Map<String, Object> eventParameters;
    private long finishTimeMs;
    private final long startTimeMs;

    public TrackEventInfo() {
        long currentTimeMillis = System.currentTimeMillis();
        this.startTimeMs = currentTimeMillis;
        this.finishTimeMs = currentTimeMillis;
    }

    @Nullable
    public Map<String, Object> getEventParameters() {
        return this.eventParameters;
    }

    public long getFinishTimeMs() {
        return this.finishTimeMs;
    }

    public long getStartTimeMs() {
        return this.startTimeMs;
    }

    public void setFinishTimeMs(long j) {
        this.finishTimeMs = Math.max(j, this.startTimeMs);
    }

    @NonNull
    public TrackEventInfo withParameter(@NonNull String str, @NonNull Object obj) {
        if (this.eventParameters == null) {
            this.eventParameters = new HashMap();
        }
        this.eventParameters.put(str, obj);
        return this;
    }
}
