package p759ka;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ka.b */
/* loaded from: classes8.dex */
public class EvaluableException extends RuntimeException {
    public /* synthetic */ EvaluableException(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluableException(@NotNull String message, @Nullable Exception exc) {
        super(message, exc);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
