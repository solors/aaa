package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarHost.kt */
@DebugMetadata(m17095c = "androidx.compose.material.SnackbarHostState", m17094f = "SnackbarHost.kt", m17093l = {379, 382}, m17092m = "showSnackbar")
@Metadata
/* loaded from: classes.dex */
public final class SnackbarHostState$showSnackbar$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnackbarHostState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, Continuation<? super SnackbarHostState$showSnackbar$1> continuation) {
        super(continuation);
        this.this$0 = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showSnackbar(null, null, null, this);
    }
}
