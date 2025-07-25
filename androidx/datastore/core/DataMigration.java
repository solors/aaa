package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataMigration.kt */
@Metadata
/* loaded from: classes.dex */
public interface DataMigration<T> {
    @Nullable
    Object cleanUp(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object migrate(T t, @NotNull Continuation<? super T> continuation);

    @Nullable
    Object shouldMigrate(T t, @NotNull Continuation<? super Boolean> continuation);
}
