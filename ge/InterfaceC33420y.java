package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@Metadata
/* renamed from: ge.y */
/* loaded from: classes8.dex */
public interface InterfaceC33420y<T> extends SharedFlow<T>, FlowCollector<T> {
    /* renamed from: d */
    void mo23984d();

    /* renamed from: e */
    boolean mo23983e(T t);

    @Nullable
    Object emit(T t, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* renamed from: f */
    StateFlow<Integer> m23982f();
}
