package androidx.window.layout;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInfoTracker.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface WindowInfoTrackerDecorator {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    WindowInfoTracker decorate(@NotNull WindowInfoTracker windowInfoTracker);
}
