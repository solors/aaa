package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NoOpCorruptionHandler.kt */
@Metadata
/* loaded from: classes.dex */
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.datastore.core.CorruptionHandler
    @Nullable
    public Object handleCorruption(@NotNull CorruptionException corruptionException, @NotNull Continuation<? super T> continuation) throws CorruptionException {
        throw corruptionException;
    }
}
