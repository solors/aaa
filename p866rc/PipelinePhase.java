package p866rc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: rc.b */
/* loaded from: classes9.dex */
public final class PipelinePhase extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipelinePhase(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
