package p866rc;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: rc.e */
/* loaded from: classes9.dex */
public abstract class PipelineContext<TSubject, TContext> implements CoroutineScope {
    @NotNull

    /* renamed from: b */
    private final TContext f103781b;

    public PipelineContext(@NotNull TContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f103781b = context;
    }

    @Nullable
    /* renamed from: b */
    public abstract Object mo12537b(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation);

    @NotNull
    /* renamed from: c */
    public final TContext m12545c() {
        return this.f103781b;
    }

    @Nullable
    /* renamed from: d */
    public abstract Object mo12536d(@NotNull Continuation<? super TSubject> continuation);

    @Nullable
    /* renamed from: e */
    public abstract Object mo12535e(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation);
}
