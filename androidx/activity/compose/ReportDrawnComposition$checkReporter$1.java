package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportDrawn.kt */
@Metadata
/* loaded from: classes.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements Function1<Functions<? extends Boolean>, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Functions<? extends Boolean> functions) {
        invoke2((Functions<Boolean>) functions);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Functions<Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ReportDrawnComposition) this.receiver).observeReporter(p0);
    }
}
