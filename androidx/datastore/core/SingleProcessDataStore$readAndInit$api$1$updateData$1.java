package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleProcessDataStore.kt */
@DebugMetadata(m17095c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", m17094f = "SingleProcessDataStore.kt", m17093l = {503, 337, 339}, m17092m = "updateData")
@Metadata
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, Continuation<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}
