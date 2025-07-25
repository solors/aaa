package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata
/* renamed from: ge.r0 */
/* loaded from: classes8.dex */
public final class C33373r0<T> implements FlowCollector<T> {
    @NotNull

    /* renamed from: b */
    private final FlowCollector<T> f91067b;
    @NotNull

    /* renamed from: c */
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f91068c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @DebugMetadata(m17095c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m17094f = "Share.kt", m17093l = {419, 423}, m17092m = "onSubscription")
    @Metadata
    /* renamed from: ge.r0$a */
    /* loaded from: classes8.dex */
    public static final class C33374a extends AbstractC37589d {

        /* renamed from: l */
        Object f91069l;

        /* renamed from: m */
        Object f91070m;

        /* renamed from: n */
        /* synthetic */ Object f91071n;

        /* renamed from: o */
        final /* synthetic */ C33373r0<T> f91072o;

        /* renamed from: p */
        int f91073p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33374a(C33373r0<T> c33373r0, Continuation<? super C33374a> continuation) {
            super(continuation);
            this.f91072o = c33373r0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f91071n = obj;
            this.f91073p |= Integer.MIN_VALUE;
            return this.f91072o.m24014b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33373r0(@NotNull FlowCollector<? super T> flowCollector, @NotNull Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f91067b = flowCollector;
        this.f91068c = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [he.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m24014b(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ge.C33373r0.C33374a
            if (r0 == 0) goto L13
            r0 = r7
            ge.r0$a r0 = (ge.C33373r0.C33374a) r0
            int r1 = r0.f91073p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91073p = r1
            goto L18
        L13:
            ge.r0$a r0 = new ge.r0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f91071n
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f91073p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p804nd.C38508r.m14539b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f91070m
            he.t r2 = (p704he.C33531t) r2
            java.lang.Object r4 = r0.f91069l
            ge.r0 r4 = (ge.C33373r0) r4
            p804nd.C38508r.m14539b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            p804nd.C38508r.m14539b(r7)
            he.t r2 = new he.t
            ge.i<T> r7 = r6.f91067b
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<ge.i<? super T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r7 = r6.f91068c     // Catch: java.lang.Throwable -> L7d
            r0.f91069l = r6     // Catch: java.lang.Throwable -> L7d
            r0.f91070m = r2     // Catch: java.lang.Throwable -> L7d
            r0.f91073p = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.mo105910invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            ge.i<T> r7 = r4.f91067b
            boolean r2 = r7 instanceof ge.C33373r0
            if (r2 == 0) goto L7a
            ge.r0 r7 = (ge.C33373r0) r7
            r2 = 0
            r0.f91069l = r2
            r0.f91070m = r2
            r0.f91073p = r3
            java.lang.Object r7 = r7.m24014b(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.Unit r7 = kotlin.Unit.f99208a
            return r7
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f99208a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.C33373r0.m24014b(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // ge.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        return this.f91067b.emit(t, continuation);
    }
}
