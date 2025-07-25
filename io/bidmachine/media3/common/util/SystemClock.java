package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

@UnstableApi
/* loaded from: classes9.dex */
public class SystemClock implements Clock {
    @Override // io.bidmachine.media3.common.util.Clock
    public HandlerWrapper createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public void onThreadBlocked() {
    }
}
