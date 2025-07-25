package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: SequenceBuilder.kt */
@Metadata
/* renamed from: kotlin.sequences.j */
/* loaded from: classes7.dex */
public abstract class AbstractC37648j<T> {
    @Nullable
    /* renamed from: a */
    public abstract Object mo16877a(T t, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* renamed from: b */
    public abstract Object mo16876b(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* renamed from: d */
    public final Object m16875d(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object mo16876b = mo16876b(sequence.iterator(), continuation);
        m6959e = C42688d.m6959e();
        if (mo16876b == m6959e) {
            return mo16876b;
        }
        return Unit.f99208a;
    }
}
