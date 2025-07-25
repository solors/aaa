package com.mobilefuse.sdk.telemetry.implementations.sentry;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SentryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SentryStackTrace {
    @NotNull
    private final List<SentryStackFrame> frames;

    public SentryStackTrace(@NotNull List<SentryStackFrame> frames) {
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.frames = frames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SentryStackTrace copy$default(SentryStackTrace sentryStackTrace, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sentryStackTrace.frames;
        }
        return sentryStackTrace.copy(list);
    }

    @NotNull
    public final List<SentryStackFrame> component1() {
        return this.frames;
    }

    @NotNull
    public final SentryStackTrace copy(@NotNull List<SentryStackFrame> frames) {
        Intrinsics.checkNotNullParameter(frames, "frames");
        return new SentryStackTrace(frames);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof SentryStackTrace) || !Intrinsics.m17075f(this.frames, ((SentryStackTrace) obj).frames)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    public int hashCode() {
        List<SentryStackFrame> list = this.frames;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "SentryStackTrace(frames=" + this.frames + ")";
    }
}
