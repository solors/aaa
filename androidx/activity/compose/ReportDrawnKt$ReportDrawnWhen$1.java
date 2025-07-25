package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReportDrawn.kt */
@Metadata
/* loaded from: classes.dex */
final class ReportDrawnKt$ReportDrawnWhen$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    final /* synthetic */ Functions<Boolean> $predicate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1(FullyDrawnReporter fullyDrawnReporter, Functions<Boolean> functions) {
        super(1);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$predicate = functions;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (this.$fullyDrawnReporter.isFullyDrawnReported()) {
            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(this.$fullyDrawnReporter, this.$predicate);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                reportDrawnComposition.removeReporter();
            }
        };
    }
}
