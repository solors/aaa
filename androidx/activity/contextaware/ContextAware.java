package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContextAware.kt */
@Metadata
/* loaded from: classes.dex */
public interface ContextAware {
    void addOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener);

    @Nullable
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener);
}
