package com.mobilefuse.sdk.telemetry;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryLogger.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TimedStampedLog {
    @NotNull
    private final String log;
    @NotNull
    private final Date timeStamp;

    public TimedStampedLog(@NotNull Date timeStamp, @NotNull String log) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(log, "log");
        this.timeStamp = timeStamp;
        this.log = log;
    }

    public static /* synthetic */ TimedStampedLog copy$default(TimedStampedLog timedStampedLog, Date date, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = timedStampedLog.timeStamp;
        }
        if ((i & 2) != 0) {
            str = timedStampedLog.log;
        }
        return timedStampedLog.copy(date, str);
    }

    @NotNull
    public final Date component1() {
        return this.timeStamp;
    }

    @NotNull
    public final String component2() {
        return this.log;
    }

    @NotNull
    public final TimedStampedLog copy(@NotNull Date timeStamp, @NotNull String log) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(log, "log");
        return new TimedStampedLog(timeStamp, log);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TimedStampedLog) {
                TimedStampedLog timedStampedLog = (TimedStampedLog) obj;
                if (!Intrinsics.m17075f(this.timeStamp, timedStampedLog.timeStamp) || !Intrinsics.m17075f(this.log, timedStampedLog.log)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getLog() {
        return this.log;
    }

    @NotNull
    public final Date getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int i;
        Date date = this.timeStamp;
        int i2 = 0;
        if (date != null) {
            i = date.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.log;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "TimedStampedLog(timeStamp=" + this.timeStamp + ", log=" + this.log + ")";
    }
}
