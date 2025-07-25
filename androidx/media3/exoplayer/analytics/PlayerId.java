package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class PlayerId {
    public static final PlayerId UNSET;
    @Nullable
    private final LogSessionIdApi31 logSessionIdApi31;

    @RequiresApi(31)
    /* loaded from: classes2.dex */
    private static final class LogSessionIdApi31 {
        public static final LogSessionIdApi31 UNSET;
        public final LogSessionId logSessionId;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            UNSET = new LogSessionIdApi31(logSessionId);
        }

        public LogSessionIdApi31(LogSessionId logSessionId) {
            this.logSessionId = logSessionId;
        }
    }

    static {
        PlayerId playerId;
        if (Util.SDK_INT < 31) {
            playerId = new PlayerId();
        } else {
            playerId = new PlayerId(LogSessionIdApi31.UNSET);
        }
        UNSET = playerId;
    }

    public PlayerId() {
        Assertions.checkState(Util.SDK_INT < 31);
        this.logSessionIdApi31 = null;
    }

    @RequiresApi(31)
    public LogSessionId getLogSessionId() {
        return ((LogSessionIdApi31) Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    @RequiresApi(31)
    public PlayerId(LogSessionId logSessionId) {
        this(new LogSessionIdApi31(logSessionId));
    }

    private PlayerId(LogSessionIdApi31 logSessionIdApi31) {
        this.logSessionIdApi31 = logSessionIdApi31;
    }
}
