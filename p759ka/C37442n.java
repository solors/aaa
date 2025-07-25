package p759ka;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EvaluableException.kt */
@Metadata
/* renamed from: ka.n */
/* loaded from: classes8.dex */
public final class C37442n extends EvaluableException {
    public /* synthetic */ C37442n(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37442n(@NotNull String message, @Nullable Exception exc) {
        super(message, exc);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
