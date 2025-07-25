package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@Metadata
/* renamed from: kotlinx.coroutines.s1 */
/* loaded from: classes7.dex */
public final class C37798s1 {
    @NotNull
    /* renamed from: a */
    public static final Executor m16101a(@NotNull CoroutineDispatcher coroutineDispatcher) {
        AbstractC37789q1 abstractC37789q1;
        Executor mo16108r;
        if (coroutineDispatcher instanceof AbstractC37789q1) {
            abstractC37789q1 = (AbstractC37789q1) coroutineDispatcher;
        } else {
            abstractC37789q1 = null;
        }
        if (abstractC37789q1 == null || (mo16108r = abstractC37789q1.mo16108r()) == null) {
            return new ExecutorC37716d1(coroutineDispatcher);
        }
        return mo16108r;
    }

    @NotNull
    /* renamed from: b */
    public static final CoroutineDispatcher m16100b(@NotNull Executor executor) {
        ExecutorC37716d1 executorC37716d1;
        CoroutineDispatcher coroutineDispatcher;
        if (executor instanceof ExecutorC37716d1) {
            executorC37716d1 = (ExecutorC37716d1) executor;
        } else {
            executorC37716d1 = null;
        }
        if (executorC37716d1 == null || (coroutineDispatcher = executorC37716d1.f99529b) == null) {
            return new C37795r1(executor);
        }
        return coroutineDispatcher;
    }

    @NotNull
    /* renamed from: c */
    public static final AbstractC37789q1 m16099c(@NotNull ExecutorService executorService) {
        return new C37795r1(executorService);
    }
}
