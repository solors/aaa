package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
final class SystemClock implements Clock {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public final HandlerWrapper createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public final long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public final void sleep(long j) {
        android.os.SystemClock.sleep(j);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public final long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
