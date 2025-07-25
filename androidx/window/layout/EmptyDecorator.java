package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInfoTracker.kt */
@Metadata
/* loaded from: classes2.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    @NotNull
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    @NotNull
    public WindowInfoTracker decorate(@NotNull WindowInfoTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
