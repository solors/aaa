package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InfiniteAnimationPolicy.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy */
/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends CoroutineContext.Element {
    @NotNull
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: InfiniteAnimationPolicy.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.C37573a.m17118a(infiniteAnimationPolicy, r, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull CoroutineContext.InterfaceC37576b<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.C37573a.m17117b(infiniteAnimationPolicy, key);
        }

        @Deprecated
        @NotNull
        public static CoroutineContext.InterfaceC37576b<?> getKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull CoroutineContext.InterfaceC37576b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.C37573a.m17116c(infiniteAnimationPolicy, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.C37573a.m17115d(infiniteAnimationPolicy, context);
        }
    }

    /* compiled from: InfiniteAnimationPolicy.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$Key */
    /* loaded from: classes.dex */
    public static final class Key implements CoroutineContext.InterfaceC37576b<InfiniteAnimationPolicy> {
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

    @Nullable
    <R> Object onInfiniteOperation(@NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation);

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
