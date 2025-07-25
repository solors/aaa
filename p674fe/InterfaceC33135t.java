package p674fe;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p777le.InterfaceC38169g;

/* compiled from: Channel.kt */
@Metadata
/* renamed from: fe.t */
/* loaded from: classes7.dex */
public interface InterfaceC33135t<E> {
    @Nullable
    /* renamed from: E */
    Object mo24648E(@NotNull Continuation<? super E> continuation);

    void cancel(@Nullable CancellationException cancellationException);

    @NotNull
    InterfaceC33118f<E> iterator();

    @NotNull
    /* renamed from: q */
    InterfaceC38169g<C33120h<E>> mo24647q();

    @NotNull
    /* renamed from: r */
    Object mo24646r();

    @Nullable
    /* renamed from: s */
    Object mo24645s(@NotNull Continuation<? super C33120h<? extends E>> continuation);
}
