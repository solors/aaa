package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BatteryChargingTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public final class BatteryChargingTrackerKt {
    @NotNull
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("BatteryChrgTracker");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"BatteryChrgTracker\")");
        TAG = tagWithPrefix;
    }
}
