package com.facebook.appevents;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FlushStatistics.kt */
@Metadata
/* loaded from: classes2.dex */
public final class FlushStatistics {
    private int numEvents;
    @NotNull
    private FlushResult result = FlushResult.SUCCESS;

    public final int getNumEvents() {
        return this.numEvents;
    }

    @NotNull
    public final FlushResult getResult() {
        return this.result;
    }

    public final void setNumEvents(int i) {
        this.numEvents = i;
    }

    public final void setResult(@NotNull FlushResult flushResult) {
        Intrinsics.checkNotNullParameter(flushResult, "<set-?>");
        this.result = flushResult;
    }
}
