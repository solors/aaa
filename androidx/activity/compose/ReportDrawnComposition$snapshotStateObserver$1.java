package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReportDrawn.kt */
@Metadata
/* loaded from: classes.dex */
final class ReportDrawnComposition$snapshotStateObserver$1 extends Lambda implements Function1<Functions<? extends Unit>, Unit> {
    public static final ReportDrawnComposition$snapshotStateObserver$1 INSTANCE = new ReportDrawnComposition$snapshotStateObserver$1();

    ReportDrawnComposition$snapshotStateObserver$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Functions<Unit> command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.invoke();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Functions<? extends Unit> functions) {
        invoke2((Functions<Unit>) functions);
        return Unit.f99208a;
    }
}
