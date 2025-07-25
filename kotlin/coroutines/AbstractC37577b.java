package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@Metadata
/* renamed from: kotlin.coroutines.b */
/* loaded from: classes7.dex */
public abstract class AbstractC37577b<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.InterfaceC37576b<E> {
    @NotNull

    /* renamed from: b */
    private final Function1<CoroutineContext.Element, E> f99278b;
    @NotNull

    /* renamed from: c */
    private final CoroutineContext.InterfaceC37576b<?> f99279c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, java.lang.Object, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public AbstractC37577b(@NotNull CoroutineContext.InterfaceC37576b<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f99278b = safeCast;
        this.f99279c = baseKey instanceof AbstractC37577b ? (CoroutineContext.InterfaceC37576b<B>) ((AbstractC37577b) baseKey).f99279c : baseKey;
    }

    /* renamed from: a */
    public final boolean m17112a(@NotNull CoroutineContext.InterfaceC37576b<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key != this && this.f99279c != key) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    @Nullable
    /* renamed from: b */
    public final CoroutineContext.Element m17111b(@NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f99278b.invoke(element);
    }
}
