package io.bidmachine.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

@UnstableApi
/* loaded from: classes9.dex */
public final class PlayerId {
    public static final PlayerId UNSET;
    @Nullable
    private final C36006a logSessionIdApi31;

    @RequiresApi(31)
    /* renamed from: io.bidmachine.media3.exoplayer.analytics.PlayerId$a */
    /* loaded from: classes9.dex */
    private static final class C36006a {
        public static final C36006a UNSET;
        public final LogSessionId logSessionId;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            UNSET = new C36006a(logSessionId);
        }

        public C36006a(LogSessionId logSessionId) {
            this.logSessionId = logSessionId;
        }
    }

    static {
        PlayerId playerId;
        if (Util.SDK_INT < 31) {
            playerId = new PlayerId();
        } else {
            playerId = new PlayerId(C36006a.UNSET);
        }
        UNSET = playerId;
    }

    public PlayerId() {
        this((C36006a) null);
        Assertions.checkState(Util.SDK_INT < 31);
    }

    @RequiresApi(31)
    public LogSessionId getLogSessionId() {
        return ((C36006a) Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    @RequiresApi(31)
    public PlayerId(LogSessionId logSessionId) {
        this(new C36006a(logSessionId));
    }

    private PlayerId(@Nullable C36006a c36006a) {
        this.logSessionIdApi31 = c36006a;
    }
}
