package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Saver.kt */
@Metadata
/* loaded from: classes.dex */
public interface Saver<Original, Saveable> {
    @Nullable
    Original restore(@NotNull Saveable saveable);

    @Nullable
    Saveable save(@NotNull SaverScope saverScope, Original original);
}
