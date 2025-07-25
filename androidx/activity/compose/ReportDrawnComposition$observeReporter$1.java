package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: ReportDrawn.kt */
@Metadata
/* loaded from: classes.dex */
final class ReportDrawnComposition$observeReporter$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Functions<Boolean> $predicate;
    final /* synthetic */ Ref $reporterPassed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(Ref ref, Functions<Boolean> functions) {
        super(0);
        this.$reporterPassed = ref;
        this.$predicate = functions;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reporterPassed.f99319b = this.$predicate.invoke().booleanValue();
    }
}
