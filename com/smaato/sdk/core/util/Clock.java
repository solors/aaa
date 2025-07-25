package com.smaato.sdk.core.util;

import android.os.SystemClock;

/* loaded from: classes7.dex */
public final class Clock {
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
