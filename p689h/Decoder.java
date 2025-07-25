package p689h;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p644e.InterfaceC32886e;
import p748k.C37374m;
import p837q.C39310n;

@Metadata
/* renamed from: h.i */
/* loaded from: classes2.dex */
public interface Decoder {

    /* compiled from: Decoder.kt */
    @Metadata
    /* renamed from: h.i$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC33439a {
        @Nullable
        /* renamed from: a */
        Decoder mo23940a(@NotNull C37374m c37374m, @NotNull C39310n c39310n, @NotNull InterfaceC32886e interfaceC32886e);
    }

    @Nullable
    /* renamed from: a */
    Object mo23941a(@NotNull Continuation<? super DecodeResult> continuation);
}
