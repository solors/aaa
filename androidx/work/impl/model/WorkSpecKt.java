package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkSpec.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WorkSpecKt {
    @NotNull
    public static final WorkGenerationalId generationalId(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.f1521id, workSpec.getGeneration());
    }
}
