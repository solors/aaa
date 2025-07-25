package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FlingBehavior.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public interface FlingBehavior {
    @Nullable
    Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull Continuation<? super Float> continuation);
}
