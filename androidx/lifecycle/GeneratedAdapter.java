package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GeneratedAdapter.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface GeneratedAdapter {
    void callMethods(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event, boolean z, @Nullable MethodCallsLogger methodCallsLogger);
}
