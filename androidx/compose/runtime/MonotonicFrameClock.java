package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MonotonicFrameClock.kt */
@Metadata
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends CoroutineContext.Element {
    @NotNull
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MonotonicFrameClock monotonicFrameClock, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.C37573a.m17118a(monotonicFrameClock, r, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext.InterfaceC37576b<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.C37573a.m17117b(monotonicFrameClock, key);
        }

        @Deprecated
        @NotNull
        public static CoroutineContext.InterfaceC37576b<?> getKey(@NotNull MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext.InterfaceC37576b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.C37573a.m17116c(monotonicFrameClock, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.C37573a.m17115d(monotonicFrameClock, context);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Key implements CoroutineContext.InterfaceC37576b<MonotonicFrameClock> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    /* synthetic */ <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    /* synthetic */ <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b);

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.InterfaceC37576b<?> getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b);

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext);

    @Nullable
    <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation);
}
