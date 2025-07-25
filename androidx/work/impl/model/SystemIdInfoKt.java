package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SystemIdInfo.kt */
@Metadata
/* loaded from: classes2.dex */
public final class SystemIdInfoKt {
    @NotNull
    public static final SystemIdInfo systemIdInfo(@NotNull WorkGenerationalId generationalId, int i) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i);
    }
}
