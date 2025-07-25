package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContextAwareHelper.kt */
@Metadata
/* loaded from: classes.dex */
public final class ContextAwareHelper {
    @Nullable
    private volatile Context context;
    @NotNull
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.context;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.listeners.add(listener);
    }

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final void dispatchOnContextAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        for (OnContextAvailableListener onContextAvailableListener : this.listeners) {
            onContextAvailableListener.onContextAvailable(context);
        }
    }

    @Nullable
    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }
}
