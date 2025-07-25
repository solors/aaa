package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CorruptionHandler.kt */
@Metadata
/* loaded from: classes.dex */
public interface CorruptionHandler<T> {
    @Nullable
    Object handleCorruption(@NotNull CorruptionException corruptionException, @NotNull Continuation<? super T> continuation);
}
