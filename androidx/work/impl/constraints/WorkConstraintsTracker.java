package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public interface WorkConstraintsTracker {
    void replace(@NotNull Iterable<WorkSpec> iterable);

    void reset();
}
