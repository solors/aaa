package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata
/* renamed from: kotlinx.coroutines.l0 */
/* loaded from: classes7.dex */
public interface InterfaceC37764l0 extends CoroutineContext.Element {
    @NotNull

    /* renamed from: a8 */
    public static final C37766b f99607a8 = C37766b.f99608b;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.l0$a */
    /* loaded from: classes7.dex */
    public static final class C37765a {
        /* renamed from: a */
        public static <R> R m16200a(@NotNull InterfaceC37764l0 interfaceC37764l0, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.C37573a.m17118a(interfaceC37764l0, r, function2);
        }

        @Nullable
        /* renamed from: b */
        public static <E extends CoroutineContext.Element> E m16199b(@NotNull InterfaceC37764l0 interfaceC37764l0, @NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
            return (E) CoroutineContext.Element.C37573a.m17117b(interfaceC37764l0, interfaceC37576b);
        }

        @NotNull
        /* renamed from: c */
        public static CoroutineContext m16198c(@NotNull InterfaceC37764l0 interfaceC37764l0, @NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
            return CoroutineContext.Element.C37573a.m17116c(interfaceC37764l0, interfaceC37576b);
        }

        @NotNull
        /* renamed from: d */
        public static CoroutineContext m16197d(@NotNull InterfaceC37764l0 interfaceC37764l0, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.C37573a.m17115d(interfaceC37764l0, coroutineContext);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.l0$b */
    /* loaded from: classes7.dex */
    public static final class C37766b implements CoroutineContext.InterfaceC37576b<InterfaceC37764l0> {

        /* renamed from: b */
        static final /* synthetic */ C37766b f99608b = new C37766b();

        private C37766b() {
        }
    }

    void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th);
}
