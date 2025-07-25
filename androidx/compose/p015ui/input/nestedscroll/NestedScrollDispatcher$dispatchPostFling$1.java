package androidx.compose.p015ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollModifier.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m17094f = "NestedScrollModifier.kt", m17093l = {217}, m17092m = "dispatchPostFling-RZ2iAVY")
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 */
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, Continuation<? super NestedScrollDispatcher$dispatchPostFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m108782dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}
