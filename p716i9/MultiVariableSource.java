package p716i9;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p743ja.Variable;

@Metadata
/* renamed from: i9.e */
/* loaded from: classes8.dex */
public class MultiVariableSource implements VariableSource {
    @NotNull

    /* renamed from: b */
    private final DivVariableController f91969b;
    @NotNull

    /* renamed from: c */
    private final Function1<String, Unit> f91970c;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiVariableSource(@NotNull DivVariableController variableController, @NotNull Function1<? super String, Unit> variableRequestObserver) {
        Intrinsics.checkNotNullParameter(variableController, "variableController");
        Intrinsics.checkNotNullParameter(variableRequestObserver, "variableRequestObserver");
        this.f91969b = variableController;
        this.f91970c = variableRequestObserver;
    }

    @Override // p716i9.VariableSource
    @Nullable
    /* renamed from: a */
    public Variable mo23053a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f91970c.invoke(name);
        return this.f91969b.m23091e(name);
    }

    @Override // p716i9.VariableSource
    /* renamed from: b */
    public void mo23052b(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91969b.m23086j(observer);
    }

    @Override // p716i9.VariableSource
    /* renamed from: c */
    public void mo23051c(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91969b.m23093c(observer);
    }

    @Override // p716i9.VariableSource
    /* renamed from: d */
    public void mo23050d(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91969b.m23094b(observer);
    }

    @Override // p716i9.VariableSource
    /* renamed from: e */
    public void mo23049e(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91969b.m23087i(observer);
    }

    @Override // p716i9.VariableSource
    /* renamed from: f */
    public void mo23048f(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91969b.m23088h(observer);
    }
}
