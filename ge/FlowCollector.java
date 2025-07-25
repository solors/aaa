package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ge.i */
/* loaded from: classes8.dex */
public interface FlowCollector<T> {
    @Nullable
    Object emit(T t, @NotNull Continuation<? super Unit> continuation);
}
