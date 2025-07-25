package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkConstraintsCallback.kt */
@Metadata
/* loaded from: classes2.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(@NotNull List<WorkSpec> list);

    void onAllConstraintsNotMet(@NotNull List<WorkSpec> list);
}
