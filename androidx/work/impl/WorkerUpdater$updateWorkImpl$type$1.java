package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkerUpdater.kt */
@Metadata
/* loaded from: classes2.dex */
final class WorkerUpdater$updateWorkImpl$type$1 extends Lambda implements Function1<WorkSpec, String> {
    public static final WorkerUpdater$updateWorkImpl$type$1 INSTANCE = new WorkerUpdater$updateWorkImpl$type$1();

    WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return spec.isPeriodic() ? "Periodic" : "OneTime";
    }
}
