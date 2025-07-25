package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC37731g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineLiveData.kt */
@Metadata
/* loaded from: classes.dex */
public interface LiveDataScope<T> {
    @Nullable
    Object emit(T t, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object emitSource(@NotNull LiveData<T> liveData, @NotNull Continuation<? super InterfaceC37731g1> continuation);

    @Nullable
    T getLatestValue();
}
