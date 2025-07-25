package com.fyber.inneractive.sdk.util;

import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.A */
/* loaded from: classes4.dex */
public abstract class AbstractC15410A {
    /* renamed from: a */
    public static String m76539a(int i) {
        if (i <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
    }
}
