package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StorageNotLowTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public final class StorageNotLowTrackerKt {
    @NotNull
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("StorageNotLowTracker");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"StorageNotLowTracker\")");
        TAG = tagWithPrefix;
    }
}
