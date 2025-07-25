package androidx.compose.p015ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollModifierLocal.kt */
@DebugMetadata(m17095c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", m17094f = "NestedScrollModifierLocal.kt", m17093l = {88, 89}, m17092m = "onPreFling-QWom1Mo")
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 */
/* loaded from: classes.dex */
public final class NestedScrollModifierLocal$onPreFling$1 extends AbstractC37589d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollModifierLocal this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, Continuation<? super NestedScrollModifierLocal$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo106381onPreFlingQWom1Mo(0L, this);
    }
}
