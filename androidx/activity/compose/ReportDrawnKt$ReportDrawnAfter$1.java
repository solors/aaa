package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: ReportDrawn.kt */
@DebugMetadata(m17095c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", m17094f = "ReportDrawn.kt", m17093l = {182}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class ReportDrawnKt$ReportDrawnAfter$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReportDrawnKt$ReportDrawnAfter$1(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super ReportDrawnKt$ReportDrawnAfter$1> continuation) {
        super(2, continuation);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ReportDrawnKt$ReportDrawnAfter$1(this.$fullyDrawnReporter, this.$block, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
                try {
                    C38508r.m14539b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            Function1<Continuation<? super Unit>, Object> function1 = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (function1.invoke(this) == m6959e) {
                        return m6959e;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (Throwable th3) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return Unit.f99208a;
        }
        fullyDrawnReporter.removeReporter();
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ReportDrawnKt$ReportDrawnAfter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
