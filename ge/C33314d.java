package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Context.kt */
@Metadata
/* renamed from: ge.d */
/* loaded from: classes8.dex */
public final class C33314d<T> implements InterfaceC33312c<T> {
    @NotNull

    /* renamed from: b */
    private final InterfaceC33327h<T> f90910b;

    /* compiled from: Context.kt */
    @Metadata
    /* renamed from: ge.d$a */
    /* loaded from: classes8.dex */
    static final class C33315a<T> implements FlowCollector {

        /* renamed from: b */
        final /* synthetic */ FlowCollector<T> f90911b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Context.kt */
        @DebugMetadata(m17095c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m17094f = "Context.kt", m17093l = {275}, m17092m = "emit")
        @Metadata
        /* renamed from: ge.d$a$a */
        /* loaded from: classes8.dex */
        public static final class C33316a extends AbstractC37589d {

            /* renamed from: l */
            /* synthetic */ Object f90912l;

            /* renamed from: m */
            final /* synthetic */ C33315a<T> f90913m;

            /* renamed from: n */
            int f90914n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C33316a(C33315a<? super T> c33315a, Continuation<? super C33316a> continuation) {
                super(continuation);
                this.f90913m = c33315a;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f90912l = obj;
                this.f90914n |= Integer.MIN_VALUE;
                return this.f90913m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C33315a(FlowCollector<? super T> flowCollector) {
            this.f90911b = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // ge.FlowCollector
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof ge.C33314d.C33315a.C33316a
                if (r0 == 0) goto L13
                r0 = r6
                ge.d$a$a r0 = (ge.C33314d.C33315a.C33316a) r0
                int r1 = r0.f90914n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f90914n = r1
                goto L18
            L13:
                ge.d$a$a r0 = new ge.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f90912l
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.f90914n
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p804nd.C38508r.m14539b(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p804nd.C38508r.m14539b(r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                kotlinx.coroutines.C37726f2.m16358l(r6)
                ge.i<T> r6 = r4.f90911b
                r0.f90914n = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.Unit r5 = kotlin.Unit.f99208a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ge.C33314d.C33315a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33314d(@NotNull InterfaceC33327h<? extends T> interfaceC33327h) {
        this.f90910b = interfaceC33327h;
    }

    @Override // ge.InterfaceC33327h
    @Nullable
    public Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object collect = this.f90910b.collect(new C33315a(flowCollector), continuation);
        m6959e = C42688d.m6959e();
        if (collect == m6959e) {
            return collect;
        }
        return Unit.f99208a;
    }
}
