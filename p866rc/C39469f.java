package p866rc;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: PipelineContext.kt */
@Metadata
/* renamed from: rc.f */
/* loaded from: classes9.dex */
public final class C39469f {
    @NotNull
    /* renamed from: a */
    public static final <TSubject, TContext> PipelineContext<TSubject, TContext> m12544a(@NotNull TContext context, @NotNull List<? extends InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> interceptors, @NotNull TSubject subject, @NotNull CoroutineContext coroutineContext, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (!C39470g.m12543a() && !z) {
            return new SuspendFunctionGun(subject, context, interceptors);
        }
        return new DebugPipelineContext(context, interceptors, subject, coroutineContext);
    }
}
