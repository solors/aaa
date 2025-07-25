package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p777le.InterfaceC38167e;

/* compiled from: Job.kt */
@Metadata
/* renamed from: kotlinx.coroutines.b2 */
/* loaded from: classes7.dex */
public interface InterfaceC37708b2 extends CoroutineContext.Element {
    @NotNull

    /* renamed from: b8 */
    public static final C37710b f99515b8 = C37710b.f99516b;

    /* compiled from: Job.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.b2$a */
    /* loaded from: classes7.dex */
    public static final class C37709a {
        /* renamed from: a */
        public static /* synthetic */ void m16410a(InterfaceC37708b2 interfaceC37708b2, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC37708b2.cancel(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m16409b(@NotNull InterfaceC37708b2 interfaceC37708b2, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.C37573a.m17118a(interfaceC37708b2, r, function2);
        }

        @Nullable
        /* renamed from: c */
        public static <E extends CoroutineContext.Element> E m16408c(@NotNull InterfaceC37708b2 interfaceC37708b2, @NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
            return (E) CoroutineContext.Element.C37573a.m17117b(interfaceC37708b2, interfaceC37576b);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC37731g1 m16407d(InterfaceC37708b2 interfaceC37708b2, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return interfaceC37708b2.mo16116x(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @NotNull
        /* renamed from: e */
        public static CoroutineContext m16406e(@NotNull InterfaceC37708b2 interfaceC37708b2, @NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
            return CoroutineContext.Element.C37573a.m17116c(interfaceC37708b2, interfaceC37576b);
        }

        @NotNull
        /* renamed from: f */
        public static CoroutineContext m16405f(@NotNull InterfaceC37708b2 interfaceC37708b2, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.C37573a.m17115d(interfaceC37708b2, coroutineContext);
        }
    }

    /* compiled from: Job.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.b2$b */
    /* loaded from: classes7.dex */
    public static final class C37710b implements CoroutineContext.InterfaceC37576b<InterfaceC37708b2> {

        /* renamed from: b */
        static final /* synthetic */ C37710b f99516b = new C37710b();

        private C37710b() {
        }
    }

    @Nullable
    /* renamed from: M */
    Object mo16120M(@NotNull Continuation<? super Unit> continuation);

    void cancel(@Nullable CancellationException cancellationException);

    @NotNull
    Sequence<InterfaceC37708b2> getChildren();

    @Nullable
    InterfaceC37708b2 getParent();

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @NotNull
    /* renamed from: k */
    InterfaceC37731g1 mo16119k(@NotNull Function1<? super Throwable, Unit> function1);

    boolean start();

    @NotNull
    /* renamed from: t */
    InterfaceC38167e mo16118t();

    @NotNull
    /* renamed from: v */
    InterfaceC37803u mo16117v(@NotNull InterfaceC37810w interfaceC37810w);

    @NotNull
    /* renamed from: x */
    InterfaceC37731g1 mo16116x(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1);

    @NotNull
    /* renamed from: y */
    CancellationException mo16115y();
}
