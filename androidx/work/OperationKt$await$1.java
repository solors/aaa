package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Operation.kt */
@DebugMetadata(m17095c = "androidx.work.OperationKt", m17094f = "Operation.kt", m17093l = {39}, m17092m = "await")
@Metadata
/* loaded from: classes2.dex */
public final class OperationKt$await$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OperationKt$await$1(Continuation<? super OperationKt$await$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OperationKt.await(null, this);
    }
}
