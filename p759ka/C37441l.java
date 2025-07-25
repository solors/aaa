package p759ka;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EvaluableException.kt */
@Metadata
/* renamed from: ka.l */
/* loaded from: classes8.dex */
public final class C37441l extends EvaluableException {
    @NotNull

    /* renamed from: b */
    private final String f98805b;

    public /* synthetic */ C37441l(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    @NotNull
    /* renamed from: a */
    public final String m18052a() {
        return this.f98805b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37441l(@NotNull String variableName, @Nullable Exception exc) {
        super("Variable '" + variableName + "' is missing.", exc);
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f98805b = variableName;
    }
}
