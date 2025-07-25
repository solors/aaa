package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LifecycleEventObserver.kt */
@Metadata
/* loaded from: classes.dex */
public interface LifecycleEventObserver extends LifecycleObserver {
    void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event);
}
