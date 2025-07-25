package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import na.C38480a;
import org.jetbrains.annotations.NotNull;
import p759ka.AbstractC37429h;
import p759ka.C37422c;
import p759ka.Evaluable;
import p759ka.EvaluableType;
import p759ka.EvaluationContext;
import p759ka.FunctionArgument;
import p804nd.ExceptionsH;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.z */
/* loaded from: classes8.dex */
public abstract class AbstractC38124z extends AbstractC37429h {
    @NotNull

    /* renamed from: c */
    private final AbstractC38026n f100820c;
    @NotNull

    /* renamed from: d */
    private final List<FunctionArgument> f100821d;
    @NotNull

    /* renamed from: e */
    private final EvaluableType f100822e;

    /* renamed from: f */
    private final boolean f100823f;

    public AbstractC38124z(@NotNull AbstractC38026n componentSetter) {
        List<FunctionArgument> m17163p;
        Intrinsics.checkNotNullParameter(componentSetter, "componentSetter");
        this.f100820c = componentSetter;
        m17163p = C37563v.m17163p(new FunctionArgument(EvaluableType.STRING, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
        this.f100821d = m17163p;
        this.f100822e = EvaluableType.COLOR;
        this.f100823f = true;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        List<? extends Object> m17163p;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(0);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.String");
        try {
            int m14641b = C38480a.f101823b.m14641b((String) obj);
            AbstractC38026n abstractC38026n = this.f100820c;
            m17163p = C37563v.m17163p(C38480a.m14651c(m14641b), args.get(1));
            return abstractC38026n.m18064h(evaluationContext, expressionContext, m17163p);
        } catch (IllegalArgumentException e) {
            C37422c.m18101f(mo15588f(), args, "Unable to convert value to Color, expected format #AARRGGBB.", e);
            throw new ExceptionsH();
        }
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: d */
    public List<FunctionArgument> mo15589d() {
        return this.f100821d;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: g */
    public EvaluableType mo15587g() {
        return this.f100822e;
    }

    @Override // p759ka.AbstractC37429h
    /* renamed from: i */
    public boolean mo15586i() {
        return this.f100823f;
    }
}
