package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37609n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p704he.NullSurrogate;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: ge.g */
/* loaded from: classes8.dex */
public final class Distinct<T> implements InterfaceC33327h<T> {
    @NotNull

    /* renamed from: b */
    private final InterfaceC33327h<T> f90939b;
    @NotNull

    /* renamed from: c */
    public final Function1<T, Object> f90940c;
    @NotNull

    /* renamed from: d */
    public final Function2<Object, Object, Boolean> f90941d;

    /* compiled from: Distinct.kt */
    @Metadata
    /* renamed from: ge.g$a */
    /* loaded from: classes8.dex */
    static final class C33324a<T> implements FlowCollector {

        /* renamed from: b */
        final /* synthetic */ Distinct<T> f90942b;

        /* renamed from: c */
        final /* synthetic */ C37609n0<Object> f90943c;

        /* renamed from: d */
        final /* synthetic */ FlowCollector<T> f90944d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Distinct.kt */
        @DebugMetadata(m17095c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m17094f = "Distinct.kt", m17093l = {77}, m17092m = "emit")
        @Metadata
        /* renamed from: ge.g$a$a */
        /* loaded from: classes8.dex */
        public static final class C33325a extends AbstractC37589d {

            /* renamed from: l */
            /* synthetic */ Object f90945l;

            /* renamed from: m */
            final /* synthetic */ C33324a<T> f90946m;

            /* renamed from: n */
            int f90947n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C33325a(C33324a<? super T> c33324a, Continuation<? super C33325a> continuation) {
                super(continuation);
                this.f90946m = c33324a;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f90945l = obj;
                this.f90947n |= Integer.MIN_VALUE;
                return this.f90946m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C33324a(Distinct<T> distinct, C37609n0<Object> c37609n0, FlowCollector<? super T> flowCollector) {
            this.f90942b = distinct;
            this.f90943c = c37609n0;
            this.f90944d = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // ge.FlowCollector
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ge.Distinct.C33324a.C33325a
                if (r0 == 0) goto L13
                r0 = r7
                ge.g$a$a r0 = (ge.Distinct.C33324a.C33325a) r0
                int r1 = r0.f90947n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f90947n = r1
                goto L18
            L13:
                ge.g$a$a r0 = new ge.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f90945l
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.f90947n
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p804nd.C38508r.m14539b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                p804nd.C38508r.m14539b(r7)
                ge.g<T> r7 = r5.f90942b
                kotlin.jvm.functions.Function1<T, java.lang.Object> r7 = r7.f90940c
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.n0<java.lang.Object> r2 = r5.f90943c
                T r2 = r2.f99327b
                ie.h0 r4 = p704he.NullSurrogate.f91530a
                if (r2 == r4) goto L58
                ge.g<T> r4 = r5.f90942b
                kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f90941d
                java.lang.Object r2 = r4.mo105910invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.Unit r6 = kotlin.Unit.f99208a
                return r6
            L58:
                kotlin.jvm.internal.n0<java.lang.Object> r2 = r5.f90943c
                r2.f99327b = r7
                ge.i<T> r7 = r5.f90944d
                r0.f90947n = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.Unit r6 = kotlin.Unit.f99208a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ge.Distinct.C33324a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Distinct(@NotNull InterfaceC33327h<? extends T> interfaceC33327h, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.f90939b = interfaceC33327h;
        this.f90940c = function1;
        this.f90941d = function2;
    }

    @Override // ge.InterfaceC33327h
    @Nullable
    public Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        C37609n0 c37609n0 = new C37609n0();
        c37609n0.f99327b = (T) NullSurrogate.f91530a;
        Object collect = this.f90939b.collect(new C33324a(this, c37609n0, flowCollector), continuation);
        m6959e = C42688d.m6959e();
        if (collect == m6959e) {
            return collect;
        }
        return Unit.f99208a;
    }
}
