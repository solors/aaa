package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: ge.h */
/* loaded from: classes8.dex */
public interface InterfaceC33327h<T> {
    @Nullable
    Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation);
}
