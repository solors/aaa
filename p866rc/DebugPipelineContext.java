package p866rc;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

@Metadata
/* renamed from: rc.a */
/* loaded from: classes9.dex */
public final class DebugPipelineContext<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    @NotNull

    /* renamed from: c */
    private final List<InterfaceC45268n<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> f103761c;
    @NotNull

    /* renamed from: d */
    private final CoroutineContext f103762d;
    @NotNull

    /* renamed from: f */
    private TSubject f103763f;

    /* renamed from: g */
    private int f103764g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugPipelineContext.kt */
    @DebugMetadata(m17095c = "io.ktor.util.pipeline.DebugPipelineContext", m17094f = "DebugPipelineContext.kt", m17093l = {80}, m17092m = "proceedLoop")
    @Metadata
    /* renamed from: rc.a$a */
    /* loaded from: classes9.dex */
    public static final class C39467a extends AbstractC37589d {

        /* renamed from: l */
        Object f103765l;

        /* renamed from: m */
        /* synthetic */ Object f103766m;

        /* renamed from: n */
        final /* synthetic */ DebugPipelineContext<TSubject, TContext> f103767n;

        /* renamed from: o */
        int f103768o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39467a(DebugPipelineContext<TSubject, TContext> debugPipelineContext, Continuation<? super C39467a> continuation) {
            super(continuation);
            this.f103767n = debugPipelineContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f103766m = obj;
            this.f103768o |= Integer.MIN_VALUE;
            return this.f103767n.m12574j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(@NotNull TContext context, @NotNull List<? extends InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> interceptors, @NotNull TSubject subject, @NotNull CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f103761c = interceptors;
        this.f103762d = coroutineContext;
        this.f103763f = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m12574j(kotlin.coroutines.Continuation<? super TSubject> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p866rc.DebugPipelineContext.C39467a
            if (r0 == 0) goto L13
            r0 = r7
            rc.a$a r0 = (p866rc.DebugPipelineContext.C39467a) r0
            int r1 = r0.f103768o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103768o = r1
            goto L18
        L13:
            rc.a$a r0 = new rc.a$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f103766m
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f103768o
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f103765l
            rc.a r2 = (p866rc.DebugPipelineContext) r2
            p804nd.C38508r.m14539b(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            p804nd.C38508r.m14539b(r7)
            r2 = r6
        L39:
            int r7 = r2.f103764g
            r4 = -1
            if (r7 != r4) goto L3f
            goto L4a
        L3f:
            java.util.List<zd.n<rc.e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object>> r4 = r2.f103761c
            int r5 = r4.size()
            if (r7 < r5) goto L4f
            r2.m12576h()
        L4a:
            java.lang.Object r7 = r2.m12575i()
            return r7
        L4f:
            java.lang.Object r4 = r4.get(r7)
            zd.n r4 = (p1076zd.InterfaceC45268n) r4
            int r7 = r7 + 1
            r2.f103764g = r7
            java.lang.String r7 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }"
            kotlin.jvm.internal.Intrinsics.m17073h(r4, r7)
            java.lang.Object r7 = r2.m12575i()
            r0.f103765l = r2
            r0.f103768o = r3
            java.lang.Object r7 = r4.invoke(r2, r7, r0)
            if (r7 != r1) goto L39
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p866rc.DebugPipelineContext.m12574j(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // p866rc.PipelineContext
    @Nullable
    /* renamed from: b */
    public Object mo12537b(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        this.f103764g = 0;
        m12573k(tsubject);
        return mo12536d(continuation);
    }

    @Override // p866rc.PipelineContext
    @Nullable
    /* renamed from: d */
    public Object mo12536d(@NotNull Continuation<? super TSubject> continuation) {
        int i = this.f103764g;
        if (i < 0) {
            return m12575i();
        }
        if (i >= this.f103761c.size()) {
            m12576h();
            return m12575i();
        }
        return m12574j(continuation);
    }

    @Override // p866rc.PipelineContext
    @Nullable
    /* renamed from: e */
    public Object mo12535e(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        m12573k(tsubject);
        return mo12536d(continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f103762d;
    }

    /* renamed from: h */
    public void m12576h() {
        this.f103764g = -1;
    }

    @NotNull
    /* renamed from: i */
    public TSubject m12575i() {
        return this.f103763f;
    }

    /* renamed from: k */
    public void m12573k(@NotNull TSubject tsubject) {
        Intrinsics.checkNotNullParameter(tsubject, "<set-?>");
        this.f103763f = tsubject;
    }
}
