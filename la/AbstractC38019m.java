package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import na.C38480a;
import org.jetbrains.annotations.NotNull;
import p759ka.AbstractC37429h;
import p759ka.Evaluable;
import p759ka.EvaluableType;
import p759ka.EvaluationContext;
import p759ka.FunctionArgument;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.m */
/* loaded from: classes8.dex */
public abstract class AbstractC38019m extends AbstractC37429h {
    @NotNull

    /* renamed from: c */
    private final Function1<C38480a, Integer> f100391c;
    @NotNull

    /* renamed from: d */
    private final List<FunctionArgument> f100392d;
    @NotNull

    /* renamed from: e */
    private final EvaluableType f100393e;

    /* renamed from: f */
    private final boolean f100394f;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC38019m(@NotNull Function1<? super C38480a, Integer> componentGetter) {
        List<FunctionArgument> m17175e;
        Intrinsics.checkNotNullParameter(componentGetter, "componentGetter");
        this.f100391c = componentGetter;
        m17175e = CollectionsJVM.m17175e(new FunctionArgument(EvaluableType.COLOR, false, 2, null));
        this.f100392d = m17175e;
        this.f100393e = EvaluableType.NUMBER;
        this.f100394f = true;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object m17531p0;
        double m15602c;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Function1<C38480a, Integer> function1 = this.f100391c;
        m17531p0 = _Collections.m17531p0(args);
        Intrinsics.m17073h(m17531p0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        m15602c = C38034o.m15602c(function1.invoke((C38480a) m17531p0).intValue());
        return Double.valueOf(m15602c);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: d */
    public List<FunctionArgument> mo15589d() {
        return this.f100392d;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: g */
    public EvaluableType mo15587g() {
        return this.f100393e;
    }

    @Override // p759ka.AbstractC37429h
    /* renamed from: i */
    public boolean mo15586i() {
        return this.f100394f;
    }
}
