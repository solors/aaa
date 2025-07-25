package p759ka;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ka.e */
/* loaded from: classes8.dex */
public final class EvaluationContext {
    @NotNull

    /* renamed from: a */
    private final VariableProvider f98781a;
    @NotNull

    /* renamed from: b */
    private final StoredValueProvider f98782b;
    @NotNull

    /* renamed from: c */
    private final FunctionProvider f98783c;
    @NotNull

    /* renamed from: d */
    private final WarningSender f98784d;

    public EvaluationContext(@NotNull VariableProvider variableProvider, @NotNull StoredValueProvider storedValueProvider, @NotNull FunctionProvider functionProvider, @NotNull WarningSender warningSender) {
        Intrinsics.checkNotNullParameter(variableProvider, "variableProvider");
        Intrinsics.checkNotNullParameter(storedValueProvider, "storedValueProvider");
        Intrinsics.checkNotNullParameter(functionProvider, "functionProvider");
        Intrinsics.checkNotNullParameter(warningSender, "warningSender");
        this.f98781a = variableProvider;
        this.f98782b = storedValueProvider;
        this.f98783c = functionProvider;
        this.f98784d = warningSender;
    }

    @NotNull
    /* renamed from: a */
    public final FunctionProvider m18092a() {
        return this.f98783c;
    }

    @NotNull
    /* renamed from: b */
    public final StoredValueProvider m18091b() {
        return this.f98782b;
    }

    @NotNull
    /* renamed from: c */
    public final VariableProvider m18090c() {
        return this.f98781a;
    }

    @NotNull
    /* renamed from: d */
    public final WarningSender m18089d() {
        return this.f98784d;
    }
}
