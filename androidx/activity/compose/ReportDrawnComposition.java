package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReportDrawn.kt */
@Metadata
/* loaded from: classes.dex */
final class ReportDrawnComposition implements Functions<Unit> {
    @NotNull
    private final Function1<Functions<Boolean>, Unit> checkReporter;
    @NotNull
    private final FullyDrawnReporter fullyDrawnReporter;
    @NotNull
    private final Functions<Boolean> predicate;
    @NotNull
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(@NotNull FullyDrawnReporter fullyDrawnReporter, @NotNull Functions<Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fullyDrawnReporter, "fullyDrawnReporter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = predicate;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.INSTANCE);
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (!fullyDrawnReporter.isFullyDrawnReported()) {
            fullyDrawnReporter.addReporter();
            observeReporter(predicate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(Functions<Boolean> functions) {
        Ref ref = new Ref();
        this.snapshotStateObserver.observeReads(functions, this.checkReporter, new ReportDrawnComposition$observeReporter$1(ref, functions));
        if (ref.f99319b) {
            removeReporter();
        }
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        invoke2();
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
