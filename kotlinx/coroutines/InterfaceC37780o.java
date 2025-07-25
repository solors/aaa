package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuation.kt */
@Metadata
/* renamed from: kotlinx.coroutines.o */
/* loaded from: classes7.dex */
public interface InterfaceC37780o<T> extends Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.o$a */
    /* loaded from: classes7.dex */
    public static final class C37781a {
        /* renamed from: a */
        public static /* synthetic */ boolean m16169a(InterfaceC37780o interfaceC37780o, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC37780o.mo15166c(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    @Nullable
    /* renamed from: B */
    Object mo15171B(@NotNull Throwable th);

    @Nullable
    /* renamed from: C */
    Object mo15170C(T t, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1);

    /* renamed from: D */
    void mo15169D(@NotNull CoroutineDispatcher coroutineDispatcher, T t);

    /* renamed from: c */
    boolean mo15166c(@Nullable Throwable th);

    boolean isActive();

    boolean isCompleted();

    /* renamed from: j */
    void mo15163j(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th);

    /* renamed from: m */
    void mo15162m(T t, @Nullable Function1<? super Throwable, Unit> function1);

    /* renamed from: w */
    void mo15161w(@NotNull Object obj);

    /* renamed from: z */
    void mo15160z(@NotNull Function1<? super Throwable, Unit> function1);
}
