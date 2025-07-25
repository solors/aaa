package sd;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.AbstractC37594j;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: sd.c */
/* loaded from: classes7.dex */
public class IntrinsicsJvm {

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata
    /* renamed from: sd.c$a */
    /* loaded from: classes7.dex */
    public static final class C42684a extends AbstractC37594j {

        /* renamed from: l */
        private int f111784l;

        /* renamed from: m */
        final /* synthetic */ Function2 f111785m;

        /* renamed from: n */
        final /* synthetic */ Object f111786n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42684a(Continuation continuation, Function2 function2, Object obj) {
            super(continuation);
            this.f111785m = function2;
            this.f111786n = obj;
            Intrinsics.m17073h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        protected Object invokeSuspend(@NotNull Object obj) {
            int i = this.f111784l;
            if (i != 0) {
                if (i == 1) {
                    this.f111784l = 2;
                    C38508r.m14539b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f111784l = 1;
            C38508r.m14539b(obj);
            Intrinsics.m17073h(this.f111785m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((Function2) TypeIntrinsics.m17006e(this.f111785m, 2)).mo105910invoke(this.f111786n, this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata
    /* renamed from: sd.c$b */
    /* loaded from: classes7.dex */
    public static final class C42685b extends AbstractC37589d {

        /* renamed from: l */
        private int f111787l;

        /* renamed from: m */
        final /* synthetic */ Function2 f111788m;

        /* renamed from: n */
        final /* synthetic */ Object f111789n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42685b(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(continuation, coroutineContext);
            this.f111788m = function2;
            this.f111789n = obj;
            Intrinsics.m17073h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        protected Object invokeSuspend(@NotNull Object obj) {
            int i = this.f111787l;
            if (i != 0) {
                if (i == 1) {
                    this.f111787l = 2;
                    C38508r.m14539b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f111787l = 1;
            C38508r.m14539b(obj);
            Intrinsics.m17073h(this.f111788m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((Function2) TypeIntrinsics.m17006e(this.f111788m, 2)).mo105910invoke(this.f111789n, this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata
    /* renamed from: sd.c$c */
    /* loaded from: classes7.dex */
    public static final class C42686c extends AbstractC37594j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42686c(Continuation<? super T> continuation) {
            super(continuation);
            Intrinsics.m17073h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        protected Object invokeSuspend(@NotNull Object obj) {
            C38508r.m14539b(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata
    /* renamed from: sd.c$d */
    /* loaded from: classes7.dex */
    public static final class C42687d extends AbstractC37589d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42687d(Continuation<? super T> continuation, CoroutineContext coroutineContext) {
            super(continuation, coroutineContext);
            Intrinsics.m17073h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        protected Object invokeSuspend(@NotNull Object obj) {
            C38508r.m14539b(obj);
            return obj;
        }
    }

    @NotNull
    /* renamed from: a */
    public static <R, T> Continuation<Unit> m6963a(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation<?> m17086a = C37591h.m17086a(completion);
        if (function2 instanceof ContinuationImpl) {
            return ((ContinuationImpl) function2).create(r, m17086a);
        }
        CoroutineContext context = m17086a.getContext();
        if (context == C37586g.f99289b) {
            return new C42684a(m17086a, function2, r);
        }
        return new C42685b(m17086a, context, function2, r);
    }

    /* renamed from: b */
    private static final <T> Continuation<T> m6962b(Continuation<? super T> continuation) {
        CoroutineContext context = continuation.getContext();
        if (context == C37586g.f99289b) {
            return new C42686c(continuation);
        }
        return new C42687d(continuation, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: c */
    public static <T> Continuation<T> m6961c(@NotNull Continuation<? super T> continuation) {
        AbstractC37589d abstractC37589d;
        Continuation<T> continuation2;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        if (continuation instanceof AbstractC37589d) {
            abstractC37589d = (AbstractC37589d) continuation;
        } else {
            abstractC37589d = null;
        }
        if (abstractC37589d != null && (continuation2 = (Continuation<T>) abstractC37589d.intercepted()) != null) {
            return continuation2;
        }
        return continuation;
    }

    @Nullable
    /* renamed from: d */
    public static <R, P, T> Object m6960d(@NotNull InterfaceC45268n<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> interfaceC45268n, R r, P p, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(interfaceC45268n, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((InterfaceC45268n) TypeIntrinsics.m17006e(interfaceC45268n, 3)).invoke(r, p, m6962b(C37591h.m17086a(completion)));
    }
}
