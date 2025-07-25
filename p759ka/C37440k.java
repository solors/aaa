package p759ka;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EvaluableException.kt */
@Metadata
/* renamed from: ka.k */
/* loaded from: classes8.dex */
public final class C37440k extends EvaluableException {
    @NotNull

    /* renamed from: b */
    private final String f98804b;

    public /* synthetic */ C37440k(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37440k(@NotNull String expression, @Nullable Exception exc) {
        super("Failed to evaluate [" + expression + "]. Integer overflow.", exc);
        Intrinsics.checkNotNullParameter(expression, "expression");
        this.f98804b = expression;
    }
}
