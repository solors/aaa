package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p777le.InterfaceC38169g;

@Metadata
/* renamed from: kotlinx.coroutines.v0 */
/* loaded from: classes7.dex */
public interface Deferred<T> extends InterfaceC37708b2 {
    @NotNull
    /* renamed from: K */
    InterfaceC38169g<T> mo16074K();

    /* renamed from: e */
    T mo16072e();

    @Nullable
    /* renamed from: h */
    Object mo16071h(@NotNull Continuation<? super T> continuation);
}
