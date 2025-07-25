package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@Metadata
/* loaded from: classes7.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Element extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        @Metadata
        /* renamed from: kotlin.coroutines.CoroutineContext$Element$a */
        /* loaded from: classes7.dex */
        public static final class C37573a {
            /* renamed from: a */
            public static <R> R m17118a(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.mo105910invoke(r, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            /* renamed from: b */
            public static <E extends Element> E m17117b(@NotNull Element element, @NotNull InterfaceC37576b<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (Intrinsics.m17075f(element.getKey(), key)) {
                    Intrinsics.m17073h(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return element;
                }
                return null;
            }

            @NotNull
            /* renamed from: c */
            public static CoroutineContext m17116c(@NotNull Element element, @NotNull InterfaceC37576b<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (Intrinsics.m17075f(element.getKey(), key)) {
                    return C37586g.f99289b;
                }
                return element;
            }

            @NotNull
            /* renamed from: d */
            public static CoroutineContext m17115d(@NotNull Element element, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return C37574a.m17114a(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull InterfaceC37576b<E> interfaceC37576b);

        @NotNull
        InterfaceC37576b<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        CoroutineContext minusKey(@NotNull InterfaceC37576b<?> interfaceC37576b);
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    /* loaded from: classes7.dex */
    public static final class C37574a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        @Metadata
        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        /* loaded from: classes7.dex */
        public static final class C37575a extends Lambda implements Function2<CoroutineContext, Element, CoroutineContext> {

            /* renamed from: g */
            public static final C37575a f99277g = new C37575a();

            C37575a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* renamed from: a */
            public final CoroutineContext mo105910invoke(@NotNull CoroutineContext acc, @NotNull Element element) {
                C37578c c37578c;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                CoroutineContext minusKey = acc.minusKey(element.getKey());
                C37586g c37586g = C37586g.f99289b;
                if (minusKey != c37586g) {
                    ContinuationInterceptor.C37584b c37584b = ContinuationInterceptor.f99287Z7;
                    ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(c37584b);
                    if (continuationInterceptor == null) {
                        c37578c = new C37578c(minusKey, element);
                    } else {
                        CoroutineContext minusKey2 = minusKey.minusKey(c37584b);
                        if (minusKey2 == c37586g) {
                            return new C37578c(element, continuationInterceptor);
                        }
                        c37578c = new C37578c(new C37578c(minusKey2, element), continuationInterceptor);
                    }
                    return c37578c;
                }
                return element;
            }
        }

        @NotNull
        /* renamed from: a */
        public static CoroutineContext m17114a(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (context != C37586g.f99289b) {
                return (CoroutineContext) context.fold(coroutineContext, C37575a.f99277g);
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC37576b<E extends Element> {
    }

    <R> R fold(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    @Nullable
    <E extends Element> E get(@NotNull InterfaceC37576b<E> interfaceC37576b);

    @NotNull
    CoroutineContext minusKey(@NotNull InterfaceC37576b<?> interfaceC37576b);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
