package ge;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ge.d0 */
/* loaded from: classes8.dex */
public interface SharedFlow<T> extends InterfaceC33327h<T> {
    @Override // ge.InterfaceC33327h
    @Nullable
    Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<?> continuation);
}
