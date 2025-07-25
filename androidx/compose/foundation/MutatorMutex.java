package androidx.compose.foundation;

import androidx.compose.animation.core.C0379a;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.InterfaceC37708b2;
import me.C38289c;
import me.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MutatorMutex.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class MutatorMutex {
    @NotNull
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    @NotNull
    private final Mutex mutex = C38289c.m15157b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MutatorMutex.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Mutator {
        @NotNull
        private final InterfaceC37708b2 job;
        @NotNull
        private final MutatePriority priority;

        public Mutator(@NotNull MutatePriority priority, @NotNull InterfaceC37708b2 job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.priority = priority;
            this.job = job;
        }

        public final boolean canInterrupt(@NotNull Mutator other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (this.priority.compareTo(other.priority) >= 0) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            InterfaceC37708b2.C37709a.m16410a(this.job, null, 1, null);
        }

        @NotNull
        public final InterfaceC37708b2 getJob() {
            return this.job;
        }

        @NotNull
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C0379a.m105461a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    @Nullable
    public final <R> Object mutate(@NotNull MutatePriority mutatePriority, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        return C37785p0.m16125g(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }

    @Nullable
    public final <T, R> Object mutateWith(T t, @NotNull MutatePriority mutatePriority, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return C37785p0.m16125g(new MutatorMutex$mutateWith$2(mutatePriority, this, function2, t, null), continuation);
    }
}
