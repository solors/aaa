package p704he;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: he.l */
/* loaded from: classes8.dex */
public final class SafeCollector implements CoroutineContext {
    @NotNull

    /* renamed from: b */
    public final Throwable f91520b;

    /* renamed from: c */
    private final /* synthetic */ CoroutineContext f91521c;

    public SafeCollector(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        this.f91520b = th;
        this.f91521c = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) this.f91521c.fold(r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) this.f91521c.get(interfaceC37576b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return this.f91521c.minusKey(interfaceC37576b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return this.f91521c.plus(coroutineContext);
    }
}
