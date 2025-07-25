package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.coroutines.e */
/* loaded from: classes7.dex */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    @NotNull

    /* renamed from: Z7 */
    public static final C37584b f99287Z7 = C37584b.f99288b;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.e$a */
    /* loaded from: classes7.dex */
    public static final class C37583a {
        @Nullable
        /* renamed from: a */
        public static <E extends CoroutineContext.Element> E m17105a(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext.InterfaceC37576b<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (key instanceof AbstractC37577b) {
                AbstractC37577b abstractC37577b = (AbstractC37577b) key;
                if (!abstractC37577b.m17112a(continuationInterceptor.getKey())) {
                    return null;
                }
                E e = (E) abstractC37577b.m17111b(continuationInterceptor);
                if (!(e instanceof CoroutineContext.Element)) {
                    return null;
                }
                return e;
            } else if (ContinuationInterceptor.f99287Z7 != key) {
                return null;
            } else {
                Intrinsics.m17073h(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            }
        }

        @NotNull
        /* renamed from: b */
        public static CoroutineContext m17104b(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext.InterfaceC37576b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (key instanceof AbstractC37577b) {
                AbstractC37577b abstractC37577b = (AbstractC37577b) key;
                if (abstractC37577b.m17112a(continuationInterceptor.getKey()) && abstractC37577b.m17111b(continuationInterceptor) != null) {
                    return C37586g.f99289b;
                }
                return continuationInterceptor;
            } else if (ContinuationInterceptor.f99287Z7 == key) {
                return C37586g.f99289b;
            } else {
                return continuationInterceptor;
            }
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.e$b */
    /* loaded from: classes7.dex */
    public static final class C37584b implements CoroutineContext.InterfaceC37576b<ContinuationInterceptor> {

        /* renamed from: b */
        static final /* synthetic */ C37584b f99288b = new C37584b();

        private C37584b() {
        }
    }

    @NotNull
    <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation);

    void releaseInterceptedContinuation(@NotNull Continuation<?> continuation);
}
