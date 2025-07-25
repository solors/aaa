package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Functions;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.runtime.ProduceStateScope */
/* loaded from: classes.dex */
public interface ProduceState<T> extends SnapshotState<T>, CoroutineScope {
    @Nullable
    Object awaitDispose(@NotNull Functions<Unit> functions, @NotNull Continuation<?> continuation);

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* synthetic */ CoroutineContext getCoroutineContext();
}
