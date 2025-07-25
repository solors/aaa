package p716i9;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p743ja.Variable;

@Metadata
/* renamed from: i9.f */
/* loaded from: classes8.dex */
public class SingleVariableSource implements VariableSource {
    @NotNull

    /* renamed from: b */
    private final Map<String, Variable> f91971b;
    @NotNull

    /* renamed from: c */
    private final Function1<String, Unit> f91972c;
    @NotNull

    /* renamed from: d */
    private final Collection<Function1<Variable, Unit>> f91973d;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleVariableSource(@NotNull Map<String, ? extends Variable> variables, @NotNull Function1<? super String, Unit> requestObserver, @NotNull Collection<Function1<Variable, Unit>> declarationObservers) {
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(requestObserver, "requestObserver");
        Intrinsics.checkNotNullParameter(declarationObservers, "declarationObservers");
        this.f91971b = variables;
        this.f91972c = requestObserver;
        this.f91973d = declarationObservers;
    }

    @Override // p716i9.VariableSource
    @Nullable
    /* renamed from: a */
    public Variable mo23053a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f91972c.invoke(name);
        return this.f91971b.get(name);
    }

    @Override // p716i9.VariableSource
    /* renamed from: b */
    public void mo23052b(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        for (Variable variable : this.f91971b.values()) {
            variable.m18476k(observer);
        }
    }

    @Override // p716i9.VariableSource
    /* renamed from: c */
    public void mo23051c(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        for (Variable variable : this.f91971b.values()) {
            variable.m18485a(observer);
        }
    }

    @Override // p716i9.VariableSource
    /* renamed from: d */
    public void mo23050d(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91973d.add(observer);
    }

    @Override // p716i9.VariableSource
    /* renamed from: e */
    public void mo23049e(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91973d.remove(observer);
    }

    @Override // p716i9.VariableSource
    /* renamed from: f */
    public void mo23048f(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        for (Variable variable : this.f91971b.values()) {
            observer.invoke(variable);
        }
    }
}
