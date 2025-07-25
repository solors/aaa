package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleProcessDataStore.kt */
@DebugMetadata(m17095c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m17094f = "SingleProcessDataStore.kt", m17093l = {402}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class SingleProcessDataStore$transformAndWrite$newData$1<T> extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ T $curData;
    final /* synthetic */ Function2<T, Continuation<? super T>, Object> $transform;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore$transformAndWrite$newData$1(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, T t, Continuation<? super SingleProcessDataStore$transformAndWrite$newData$1> continuation) {
        super(2, continuation);
        this.$transform = function2;
        this.$curData = t;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(CoroutineScope coroutineScope, Object obj) {
        return invoke(coroutineScope, (Continuation) ((Continuation) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            Function2<T, Continuation<? super T>, Object> function2 = this.$transform;
            T t = this.$curData;
            this.label = 1;
            obj = function2.mo105910invoke(t, this);
            if (obj == m6959e) {
                return m6959e;
            }
        }
        return obj;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super T> continuation) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
