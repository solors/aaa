package androidx.work.impl.constraints;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WorkConstraintsTrackerKt {
    @NotNull
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = tagWithPrefix;
    }
}
