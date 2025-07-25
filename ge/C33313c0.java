package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata
/* renamed from: ge.c0 */
/* loaded from: classes8.dex */
public final class C33313c0<T> extends AbstractC33307a<T> {
    @NotNull

    /* renamed from: b */
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f90909b;

    /* JADX WARN: Multi-variable type inference failed */
    public C33313c0(@NotNull Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f90909b = function2;
    }

    @Override // ge.AbstractC33307a
    @Nullable
    /* renamed from: c */
    public Object mo24168c(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object mo105910invoke = this.f90909b.mo105910invoke(flowCollector, continuation);
        m6959e = C42688d.m6959e();
        if (mo105910invoke == m6959e) {
            return mo105910invoke;
        }
        return Unit.f99208a;
    }
}
