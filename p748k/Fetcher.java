package p748k;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p644e.InterfaceC32886e;
import p837q.C39310n;

@Metadata
/* renamed from: k.i */
/* loaded from: classes2.dex */
public interface Fetcher {

    /* compiled from: Fetcher.kt */
    @Metadata
    /* renamed from: k.i$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC37366a<T> {
        @Nullable
        /* renamed from: a */
        Fetcher mo18281a(@NotNull T t, @NotNull C39310n c39310n, @NotNull InterfaceC32886e interfaceC32886e);
    }

    @Nullable
    /* renamed from: a */
    Object mo18283a(@NotNull Continuation<? super AbstractC37365h> continuation);
}
